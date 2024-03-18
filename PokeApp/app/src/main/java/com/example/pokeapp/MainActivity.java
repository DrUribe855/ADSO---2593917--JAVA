package com.example.pokeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Integer suma = 0;
    Integer contador = 0;
    String siguiente;

    Button volver;
    List<Pokemon> listaPokemons;


    RecyclerView recycler;

    AdaptadorPokemon adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaPokemons = new ArrayList<>();
        recycler = findViewById(R.id.recycler_pokemons);
        volver = findViewById(R.id.btn_volver);
        getPokemons();
        validarEstadoBoton();
    }

    public void getPokemons(){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "https://pokeapi.co/api/v2/pokemon?offset=" + suma  + "&limit=20";

        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("El servidor responde OK");
                System.out.println(response.toString());
                savePokemonObject(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);
    }

    public void savePokemonObject(JSONObject data){
        try {

            JSONArray array = data.getJSONArray("results");
            this.siguiente = data.getString("next");
            for (int i = 0; i < array.length(); i++) {
                JSONObject pokemon = array.getJSONObject(i);
                String name = pokemon.getString("name").toUpperCase();
                String url = pokemon.getString("url");

                System.out.println("Nombre: " + name);
                System.out.println("url: " + url);
                this.contador++;
                Pokemon temporal = new Pokemon((this.contador < 10 ? "000" : (this.contador < 100 ? "00" : "")) + String.valueOf(this.contador ), name, url);
                listaPokemons.add(temporal);
            }

            adaptador = new AdaptadorPokemon(listaPokemons);
            recycler.setAdapter(adaptador);
            recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        }catch(JSONException e){
            throw new RuntimeException(e);
        }
    }

    public void avanzar(View view){
        suma = suma + 20;
        adaptador.clear();
        getPokemons();
        validarEstadoBoton();
    }

    public void retroceder(View view){
        if(suma >= 20){
            if(this.siguiente.equalsIgnoreCase("null")){
                this.contador = contador - 22;
            }else{
                this.contador = contador - 40;
            }
            suma = suma - 20;
            adaptador.clear();
            getPokemons();
            validarEstadoBoton();
        }
    }

    public void validarEstadoBoton(){
        if(this.suma <= 0){
            this.volver.setEnabled(false);
        }else{
            this.volver.setEnabled(true);
        }

        if(this.siguiente.equalsIgnoreCase("null")){
            this.volver.setEnabled(false);
        }else{
            this.volver.setEnabled(true);
        }
    }
}