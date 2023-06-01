package Clases;

public class Producto {
    
    private String id;
    private String nombre;
    private int cantidad;
    private int precio;
    
    public Producto(String id, String nombre, int cantidad, int precio){
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }
}
