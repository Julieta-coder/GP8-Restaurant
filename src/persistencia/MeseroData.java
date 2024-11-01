/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Entidades.Mesero;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MeseroData {
    private Connection connection;

    public MeseroData() {
        this.connection = Conexion.getConnection();
    }

   
    public void agregarMesero(Mesero mesero) {
        String sql = "INSERT INTO meseros (nombre, apellido, dni, fecha_registro, contraseña, estado) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getApellido());
            ps.setInt(3, mesero.getDni());

            
            ps.setDate(4, java.sql.Date.valueOf(mesero.getFecha_registro()));
            ps.setString(5, mesero.getContraseña());
            ps.setBoolean(6, mesero.isEstado());

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar mesero: " + e.getMessage());
        }
    }

    
    public List<Mesero> listarMeseros() {
        List<Mesero> meseros = new ArrayList<>();
        String sql = "SELECT * FROM meseros";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Mesero mesero = new Mesero();//Construir
                meseros.add(mesero);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar meseros: " + e.getMessage());
        }
        return meseros;
    }
    
    //Maty se mando un metodo que le hacia falta
    public Mesero buscarMozoPorId(int id_mesero) {
        Mesero mesero = null;
        String sql = "SELECT * FROM meseros WHERE id_mesero = ?"; 
        try {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id_mesero);
                ResultSet resultSet = statement.executeQuery();
                
                if (resultSet.next()) {
                    mesero = new Mesero();
                    mesero.setId_mesero(resultSet.getInt("id_mesero"));
                    mesero.setNombre(resultSet.getString("nombre"));
                    mesero.setApellido(resultSet.getString("apellido"));
                    mesero.setDni(resultSet.getInt("dni"));
                    mesero.setFecha_registro(resultSet.getDate("fecha_registro").toLocalDate());
                    mesero.setContraseña(resultSet.getString("contraseña"));
                    mesero.setEstado(resultSet.getBoolean("estado"));
                } else {
                    System.out.println("No se encontró  Moz@ con ese ID.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar Moz@ : " + e.getMessage());
        }

        return mesero;
    }
//    
//    public void eliminarMesero(int idMesero) {
//    String sql = "DELETE FROM meseros WHERE id_mesero = ?";
//    try {
//        PreparedStatement ps = connection.prepareStatement(sql);
//        ps.setInt(1, idMesero); // Establece el ID del mesero a eliminar
//        int filasAfectadas = ps.executeUpdate();
//        
//        if (filasAfectadas > 0) {
//            System.out.println("Mesero eliminado exitosamente.");
//        } else {
//            System.out.println("No se encontró un mesero con el ID especificado.");
//        }
//    } catch (SQLException e) {
//        System.out.println("Error al eliminar mesero: " + e.getMessage());
//    }
//}
    
    public boolean eliminarMesero(int idMesero) {
    String sql = "DELETE FROM meseros WHERE id_mesero = ?";
    try {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, idMesero); // Establece el ID del mesero a eliminar
        int filasAfectadas = ps.executeUpdate();
        
        if (filasAfectadas > 0) {
            System.out.println("Mesero eliminado exitosamente.");
            return true; // Retorna true si se eliminó exitosamente
        } else {
            System.out.println("No se encontró un mesero con el ID especificado.");
            return false; // Retorna false si no se encontró el mesero
        }
    } catch (SQLException e) {
        System.out.println("Error al eliminar mesero: " + e.getMessage());
        return false; // Retorna false en caso de error
    }
}


    
}
