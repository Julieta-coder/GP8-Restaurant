/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    private int id_pedido;
    private Mesa mesa;  // Relación con Mesas
    private Mesero mesero;  // Relación con Meseros
    private LocalDate fecha_pedido;
    private LocalTime hora_pedido;
    private boolean estado;
    private double monto_total;

    public Pedido() {
        
    }

    public Pedido(Mesa mesa, Mesero mesero, LocalDate fecha_pedido, LocalTime hora_pedido, boolean estado, double monto_total) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.fecha_pedido = fecha_pedido;
        this.hora_pedido = hora_pedido;
        this.estado = estado;
        this.monto_total = monto_total;
    }
    public Pedido(int id_mesa, int id_mesero, LocalDate fecha_pedido, LocalTime hora_pedido, boolean estado, double monto_total) {
        this.mesa = new Mesa();
        this.mesa.setId_mesa(id_mesa);
        this.mesero = new Mesero();
        this.mesero.setId_mesero(id_mesero);
        
        
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

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
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
    
    
}
