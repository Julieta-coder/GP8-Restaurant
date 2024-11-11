/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.List;

/**
 *
 * @author Adriana
 */
    public class Mesa {
        
        private int id_mesa;
        private int numero; 
        private int capacidad;
        private String disposicion;
        private boolean estado;
        private List<Reserva> reservas; //OPCIONAL

    
    
    public Mesa() {
    }
    
    
    public Mesa(int numero, int capacidad, String disposicion, boolean estado) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.disposicion = disposicion;
        this.estado = estado;
    }

    
    
    public Mesa(int id_mesa, int numero, int capacidad, String disposicion, boolean estado) {
        this.id_mesa = id_mesa;
        this.numero = numero;
        this.capacidad = capacidad;
        this.disposicion = disposicion;
        this.estado = estado;
    }

  

    public int getId_mesa() { 
        return id_mesa; 
    }
    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa; 
    }

    public int getNumero() { 
        return numero; 
    }
    public void setNumero(int numero) {
        this.numero = numero; 
    }

    public int getCapacidad() {
        return capacidad; 
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad; 
    }

    public boolean getEstado() {
        return estado; }
    
    public void setEstado(boolean estado) { 
        this.estado = estado; 
        
    }

    public String getDisposicion() {
        return disposicion;
    }

    public void setDisposicion(String disposicion) {
        this.disposicion = disposicion;
    }
    

    @Override
    public String toString() {
        return "Mesa{" + "id_mesa=" + id_mesa + ", numero=" + numero + ", capacidad=" + capacidad + ", disposicion=" + disposicion + ", estado=" + estado + ", reservas=" + reservas + '}';
    }

    
}

