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
    private int dni;
    private LocalDate fecha_registro;
    private String contraseña;
    private boolean estado;

    public Mesero() {
    }

    public Mesero(String nombre, String apellido, int dni, LocalDate fecha_registro, String contraseña, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_registro = fecha_registro;
        this.contraseña = contraseña;
        this.estado = estado;
    }

    public Mesero(int id_mesero, String nombre, String apellido, int dni, LocalDate fecha_registro, String contraseña, boolean estado) {
        this.id_mesero = id_mesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_registro = fecha_registro;
        this.contraseña = contraseña;
        this.estado = estado;
    }
    
    
    
    
    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

 
    

    public int getId_mesero() { return id_mesero; }
    public void setId_mesero(int id_mesero) { this.id_mesero = id_mesero; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }


    @Override
    public String toString() {
        return "ID " +id_mesero+" "+ apellido;
    }
    
}
