
package Entidades;


public class Producto {
    private int id_producto;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    private boolean estado;

    public Producto() {
    }

    public Producto(String nombre, String categoria, double precio, int stock, boolean estado) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto(int id_producto, String nombre, String categoria, double precio, int stock, boolean estado) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    
  

    public int getId_producto() { 
        return id_producto; }
    public void setId_producto(int id_producto) { 
        this.id_producto = id_producto; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public boolean isEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }



    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
