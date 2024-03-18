package com.example.pokeapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorHabilidades extends RecyclerView.Adapter<AdaptadorHabilidades.ViewHolder>{

    List<Detalle> listaDatos;

    public AdaptadorHabilidades(List<Detalle> lista){
        this.listaDatos = lista;
    }


    @NonNull
    @Override
    public AdaptadorHabilidades.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.detalle_pokemon, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHabilidades.ViewHolder holder, int position) {
        Detalle temporal = listaDatos.get(position);
        holder.asignarDatos(temporal);

    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        Context contexto;

        TextView habilidad;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contexto = itemView.getContext();

            habilidad = itemView.findViewById(R.id.habilidad);


        }

        public void asignarDatos(Detalle datos){

            habilidad.setText(datos.getHabilidad());

        }
    }
}
