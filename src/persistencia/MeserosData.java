/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Entidades.Mesero;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MeserosData {
    private Connection connection;

    public MeserosData() {
        this.connection = Conexion.getConnection();
    }

   
    public void agregarMesero(Mesero mesero) {
        String sql = "INSERT INTO meseros (nombre, apellido, dni, fecha_registro) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getApellido());
            ps.setString(3, mesero.getDni());

            
            ps.setDate(4, java.sql.Date.valueOf(mesero.getFechaRegistro()));

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
                Mesero mesero = new Mesero(
                    rs.getInt("id_mesero"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("dni"),

                    // Convertir java.sql.Date a LocalDate
                    rs.getDate("fecha_registro").toLocalDate()
                );
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
                    mesero.setDni(resultSet.getString("dni"));
                    mesero.setFechaRegistro(resultSet.getDate("fechaNacimiento").toLocalDate());
                } else {
                    System.out.println("No se encontró  Moz@ con ese ID.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar Moz@ : " + e.getMessage());
        }

        return mesero;
    }
    
}
