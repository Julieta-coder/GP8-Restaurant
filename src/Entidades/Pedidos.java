/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedidos {
    private int id_pedido;
    private Mesas mesa;  // Relación con Mesas
    private Meseros mesero;  // Relación con Meseros
    private LocalDate fecha_pedido;
    private LocalTime hora_pedido;
    private boolean estado;
    private double monto_total;
    private int id_mesa;
    private int id_mesero;

    public Pedidos(int id_pedido, Mesas mesa, Meseros mesero, LocalDate fecha_pedido, LocalTime hora_pedido, boolean estado, double monto_total) {
        this.id_pedido = id_pedido;
        this.mesa = mesa;  // Relación con Mesas
        this.mesero = mesero;  // Relación con Meseros
        this.fecha_pedido = fecha_pedido;
        this.hora_pedido = hora_pedido;
        this.estado = estado;
        this.monto_total = monto_total;
    }
  

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getId_mesero() {
        return id_mesero;
    }

    public void setId_mesero(int id_mesero) {
        this.id_mesero = id_mesero;
    }

    public LocalDate getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(LocalDate fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public LocalTime getHora_pedido() {
        return hora_pedido;
    }

    public void setHora_pedido(LocalTime hora_pedido) {
        this.hora_pedido = hora_pedido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(double monto_total) {
        this.monto_total = monto_total;
    }

    public Object getMesa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getMesero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
