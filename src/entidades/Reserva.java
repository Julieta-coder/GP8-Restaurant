/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDateTime;

public class Reserva {
    private int id_reserva;
    private int id_mesa;
    private Mesa mesa;
    private String nombre_cliente;
    private String dni_cliente;
    private LocalDateTime fecha_reserva;
    private boolean estado;

    
      
    public Reserva(int id_reserva, int id_mesa, String nombre_cliente, String dni_cliente, LocalDateTime fecha_reserva, boolean estado) {
        this.id_reserva = id_reserva;
        this.id_mesa = id_mesa;
        this.mesa = mesa; 
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

    public LocalDateTime getFecha_reserva() { return fecha_reserva; }
    public void setFecha_reserva(LocalDateTime fecha_reserva) { this.fecha_reserva = fecha_reserva; }

    public boolean isEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }

   
    @Override
    public String toString() {
        return "Reservas{" +
                "id_reserva=" + id_reserva +
                ", id_mesa=" + id_mesa +
                ", mesa=" + mesa +
                ", nombre_cliente='" + nombre_cliente + '\'' +
                ", dni_cliente='" + dni_cliente + '\'' +
                ", fecha_reserva=" + fecha_reserva +
                ", estado=" + estado +
                '}';
    }

   
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reserva reservas = (Reserva) o;

        if (id_reserva != reservas.id_reserva) return false;
        if (id_mesa != reservas.id_mesa) return false;
        if (estado != reservas.estado) return false;
        if (!nombre_cliente.equals(reservas.nombre_cliente)) return false;
        if (!dni_cliente.equals(reservas.dni_cliente)) return false;
        return fecha_reserva.equals(reservas.fecha_reserva);
    }

    @Override
    public int hashCode() {
        int result = id_reserva;
        result = 31 * result + id_mesa;
        result = 31 * result + nombre_cliente.hashCode();
        result = 31 * result + dni_cliente.hashCode();
        result = 31 * result + fecha_reserva.hashCode();
        result = 31 * result + (estado ? 1 : 0);
        return result;
    }

    public void setMesa(Mesa mesa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
