package com.example.pokeapp;

public class Pokemon {

    String id;
    String nombre;
    String url;

    public Pokemon(String id, String nombre, String url) {
        this.id = id;
        this.nombre = nombre;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
