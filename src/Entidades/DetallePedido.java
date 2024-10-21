/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class DetallePedido {
    private int id_detalle;
    private Pedidos pedido;  
    private Productos producto;  
    private int cantidad;
    private double precio_unitario;
    private double sub_total;

    public DetallePedido(int id_detalle, Pedidos pedido, Productos producto, int cantidad, double precio_unitario, double sub_total) {
        this.id_detalle = id_detalle;
        this.pedido = pedido;  
        this.producto = producto;  
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.sub_total = sub_total;
    }

    public int getId_detalle() { return id_detalle; }
    public void setId_detalle(int id_detalle) { this.id_detalle = id_detalle; }

    public Pedidos getPedido() { return pedido; }
    public void setPedido(Pedidos pedido) { this.pedido = pedido; }

    public Productos getProducto() { return producto; }
    public void setProducto(Productos producto) { this.producto = producto; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecio_unitario() { return precio_unitario; }
    public void setPrecio_unitario(double precio_unitario) { this.precio_unitario = precio_unitario; }

    public double getSub_total() { return sub_total; }
    public void setSub_total(double sub_total) { this.sub_total = sub_total; }
}
