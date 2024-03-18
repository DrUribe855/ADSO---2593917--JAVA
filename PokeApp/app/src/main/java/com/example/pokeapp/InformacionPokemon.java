package com.example.pokeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

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

public class InformacionPokemon extends AppCompatActivity {

    TextView peso;
    TextView altura;
    TextView etqnombre;

    Integer pesoDato;

    Integer alturaDato;
    List<Detalle> listaHabilidades;
    List<Imagen> listaImagen;

    RecyclerView recycler;
    RecyclerView recyclerImagen;

    AdaptadorHabilidades adaptador;
    AdaptadorImagenes adaptadorImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_pokemon);

        Bundle datos = getIntent().getExtras();
        String url = datos.getString("url");
        String nombre = datos.getString("nombre");

        etqnombre = findViewById(R.id.etq_nombre);
        peso = findViewById(R.id.etqPeso);
        altura = findViewById(R.id.etqAltura);
        recycler = findViewById(R.id.recycler_habilidades);
        recyclerImagen = findViewById(R.id.recycler_imagenes);
        listaHabilidades = new ArrayList<>();
        listaImagen = new ArrayList<>();

        etqnombre.setText(nombre);

        getInfoPokemon(url);
        getImagenes(url);

    }

    public void getInfoPokemon(String endpoint){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = endpoint;

        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("El servidor responde OK");
                System.out.println(response.toString());
                savePokemonInfo(response);
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

    public void getImagenes(String endpoint){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = endpoint;

        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("El servidor responde OK");
                System.out.println(response.toString());
                renderizarFotos(response);
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

    public void renderizarFotos(JSONObject data){
        try {
            JSONObject sprites = data.getJSONObject("sprites");
            this.listaImagen.add(new Imagen(sprites.getString("back_default")));
            this.listaImagen.add(new Imagen(sprites.getString("back_shiny")));
            this.listaImagen.add(new Imagen(sprites.getString("front_default")));
            this.listaImagen.add(new Imagen(sprites.getString("front_shiny")));
            System.out.println(listaImagen);

            adaptadorImagen = new AdaptadorImagenes(this.listaImagen);
                recyclerImagen.setAdapter(adaptadorImagen);
                recyclerImagen.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
                recyclerImagen.setLayoutManager(layoutManager);


        }catch(JSONException e){
            throw new RuntimeException(e);
        }
    }



    public void savePokemonInfo(JSONObject data){
        try {
            JSONArray array = data.getJSONArray("abilities");
            alturaDato = data.getInt("height");
            pesoDato = data.getInt("weight");
            peso.setText(String.valueOf(pesoDato));
            altura.setText(String.valueOf(alturaDato));

            for (int i = 0; i < array.length(); i++) {
                JSONObject habilidad = array.getJSONObject(i);
                JSONObject ability = habilidad.getJSONObject("ability");
                String name = ability.getString("name");
                Detalle temporal = new Detalle(name);
                System.out.println(temporal.getHabilidad());
                listaHabilidades.add(temporal);

            }



            adaptador = new AdaptadorHabilidades(listaHabilidades);
            recycler.setAdapter(adaptador);
            recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


        }catch(JSONException e){
            throw new RuntimeException(e);
        }
    }


}