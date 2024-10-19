/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.security.Timestamp;

/**
 *
 * @author Adriana
 */
public class Reservas {
    private int id_reserva;
    private int id_mesa;
    private String nombre_cliente;
    private String dni_cliente;
    private Timestamp fecha_reserva;
    private boolean estado;

    public Reservas(int id_reserva, int id_mesa, String nombre_cliente, String dni_cliente, Timestamp fecha_reserva, boolean estado) {
        this.id_reserva = id_reserva;
        this.id_mesa = id_mesa;
        this.nombre_cliente = nombre_cliente;
        this.dni_cliente = dni_cliente;
        this.fecha_reserva = fecha_reserva;
        this.estado = estado;
    }

    public int getId_reserva() { return id_reserva; }
    public void setId_reserva(int id_reserva) { this.id_reserva = id_reserva; }

    public int getId_mesa() { return id_mesa; }
    public void setId_mesa(int id_mesa) { this.id_mesa = id_mesa; }

    public String getNombre_cliente() { return nombre_cliente; }
    public void setNombre_cliente(String nombre_cliente) { this.nombre_cliente = nombre_cliente; }

    public String getDni_cliente() { return dni_cliente; }
    public void setDni_cliente(String dni_cliente) { this.dni_cliente = dni_cliente; }

    public Timestamp getFecha_reserva() { return fecha_reserva; }
    public void setFecha_reserva(Timestamp fecha_reserva) { this.fecha_reserva = fecha_reserva; }

    public boolean isEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }
}
