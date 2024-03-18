package com.example.pokeapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.List;

public class AdaptadorPokemon extends RecyclerView.Adapter<AdaptadorPokemon.ViewHolder>{

    List<Pokemon> listaPokemons;

    public AdaptadorPokemon(List<Pokemon> lista){
        this.listaPokemons = lista;
    }

    @NonNull
    @Override
    public AdaptadorPokemon.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPokemon.ViewHolder holder, int position) {
        Pokemon temporal = listaPokemons.get(position);
        holder.asignarDatos(temporal);
    }

    @Override
    public int getItemCount() {
        return listaPokemons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        Context contexto;
        TextView idPokemon;
        TextView nombrePokemon;
        ImageView urlPokemon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contexto = itemView.getContext();
            idPokemon = itemView.findViewById(R.id.idPokemon);
            nombrePokemon = itemView.findViewById(R.id.nombrePokemon);
            urlPokemon = itemView.findViewById(R.id.boton_detalle_pokemon);


        }

        public void asignarDatos(Pokemon datos){
            idPokemon.setText(datos.getId());
            nombrePokemon.setText(datos.getNombre());
            urlPokemon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intention = new Intent(contexto, InformacionPokemon.class);
                    intention.putExtra("url", datos.getUrl());
                    intention.putExtra("nombre", datos.getNombre());
                    contexto.startActivity(intention);

                }
            });

        }


    }

    public void clear(){
        listaPokemons.clear();
    }





}
