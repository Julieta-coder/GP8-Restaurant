/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva {
    private int id_reserva;
    private Mesa mesa;
    private String nombre_cliente;
    private int dni_cliente;
    private LocalDate fecha_reserva;
    private boolean estado;

    public Reserva(int id_reserva, Mesa mesa, String nombre_cliente, int dni_cliente, LocalDate fecha_reserva, boolean estado) {
        this.id_reserva = id_reserva;
        this.mesa = mesa;
        this.nombre_cliente = nombre_cliente;
        this.dni_cliente = dni_cliente;
        this.fecha_reserva = fecha_reserva;
        this.estado = estado;
    }

    public Reserva(Mesa mesa, String nombre_cliente, int dni_cliente, LocalDate fecha_reserva, boolean estado) {
        this.mesa = mesa;
        this.nombre_cliente = nombre_cliente;
        this.dni_cliente = dni_cliente;
        this.fecha_reserva = fecha_reserva;
        this.estado = estado;
    }

    public Reserva() {
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(int dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public LocalDate getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(LocalDate fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return ""+ id_reserva;
    }
    
    
  
}
