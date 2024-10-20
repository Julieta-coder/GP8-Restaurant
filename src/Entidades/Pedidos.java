/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Adriana
 */
public class Pedidos {
    private int id_pedido;
    private int id_mesa;
    private int id_mesero;
    private Date fecha_pedido;
    private LocalTime hora_pedido;  
    private boolean estado;
    private double monto_total;

   public Pedidos(int id_pedido, int id_mesa, int id_mesero, Date fecha_pedido, LocalTime hora_pedido, boolean estado, double monto_total) {
        this.id_pedido = id_pedido;
        this.id_mesa = id_mesa;
        this.id_mesero = id_mesero;
        this.fecha_pedido = fecha_pedido;
        this.hora_pedido = hora_pedido;
        this.estado = estado;
        this.monto_total = monto_total;
    }

    public int getId_pedido() { return id_pedido; }
    public void setId_pedido(int id_pedido) { this.id_pedido = id_pedido; }

    public int getId_mesa() { return id_mesa; }
    public void setId_mesa(int id_mesa) { this.id_mesa = id_mesa; }

    public int getId_mesero() { return id_mesero; }
    public void setId_mesero(int id_mesero) { this.id_mesero = id_mesero; }

    public Date getFecha_pedido() { return fecha_pedido; }
    public void setFecha_pedido(Date fecha_pedido) { this.fecha_pedido = fecha_pedido; }

    public LocalTime getHora_pedido() { return hora_pedido; }  // LocalTime para manejar la hora
    public void setHora_pedido(LocalTime hora_pedido) { this.hora_pedido = hora_pedido; }

    public boolean isEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }

    public double getMonto_total() { return monto_total; }
    public void setMonto_total(double monto_total) { this.monto_total = monto_total; }
}
