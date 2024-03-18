package com.example.pokeapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdaptadorImagenes extends RecyclerView.Adapter<AdaptadorImagenes.ViewHolder>{

    List<Imagen> listaImagenes;

    public AdaptadorImagenes(List<Imagen> lista){
        this.listaImagenes = lista;
    }

    @NonNull
    @Override
    public AdaptadorImagenes.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_imagen, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorImagenes.ViewHolder holder, int position) {
        Imagen temporal = listaImagenes.get(position);
        holder.mostrarImagenes(temporal);
    }

    @Override
    public int getItemCount() {
        return listaImagenes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        Context contexto;
        ImageView imagen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contexto = itemView.getContext();
            imagen = itemView.findViewById(R.id.imagenPokemon);
        }

        public void mostrarImagenes(Imagen datos){
            System.out.println("URL imagen: " + datos.getUrl());

            ImageRequest solicitud = new ImageRequest(datos.getUrl(),

                    new Response.Listener<Bitmap>() {
                        @Override
                        public void onResponse(Bitmap bitmap) {
                            imagen.setImageBitmap(bitmap);
                        }
                    },
                    0,0,null,
                    new Response.ErrorListener(){
                        @Override
                        public void onErrorResponse(VolleyError error){
                            System.out.println("Error imagen: "+error.getMessage());
                            System.out.println(error.toString());
                        }
                    }
            );

            RequestQueue queue = Volley.newRequestQueue(contexto);
            queue.add(solicitud);
        }
    }
}
