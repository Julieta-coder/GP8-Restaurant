/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

public class Mesero {
    private int id_mesero;
    private String nombre;
    private String apellido;
    private String dni;
    private LocalDate fecha_registro;

    public Mesero() {
    }

    public Mesero(String nombre, String apellido, String dni, LocalDate fecha_registro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_registro = fecha_registro;
    }

    public Mesero(int id_mesero, String nombre, String apellido, String dni, LocalDate fecha_registro) {
        this.id_mesero = id_mesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_registro = fecha_registro;
    }
    

    public int getId_mesero() { return id_mesero; }
    public void setId_mesero(int id_mesero) { this.id_mesero = id_mesero; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public LocalDate getFechaRegistro() {  
        return fecha_registro;
    }

    public void setFechaRegistro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "Mesero{" + "id_mesero=" + id_mesero + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fecha_registro=" + fecha_registro + '}';
    }
    
}
