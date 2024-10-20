/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

public class Meseros {
    private int id_mesero;
    private String nombre;
    private String apellido;
    private String dni;
    private LocalDate fecha_registro;  // Usamos LocalDate en lugar de Date

    // Constructor con todos los parámetros
    public Meseros(int id_mesero, String nombre, String apellido, String dni, LocalDate fecha_registro) {
        this.id_mesero = id_mesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_registro = fecha_registro;  // Asignamos LocalDate
    }

    // Getters y setters
    public int getId_mesero() { return id_mesero; }
    public void setId_mesero(int id_mesero) { this.id_mesero = id_mesero; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public LocalDate getFecha_registro() { return fecha_registro; }
    public void setFecha_registro(LocalDate fecha_registro) { this.fecha_registro = fecha_registro; }

    // Método para obtener la fecha de registro
    public LocalDate getFechaRegistro() {
        return fecha_registro;
    }
}
