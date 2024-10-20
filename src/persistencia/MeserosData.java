/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Entidades.Meseros;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MeserosData {
    private Connection connection;

    public MeserosData() {
        this.connection = Conexion.getConnection();
    }

    // Método para agregar mesero
    public void agregarMesero(Meseros mesero) {
        String sql = "INSERT INTO meseros (nombre, apellido, dni, fecha_registro) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getApellido());
            ps.setString(3, mesero.getDni());
            ps.setDate(4, java.sql.Date.valueOf(mesero.getFecha_registro())); // Convertir LocalDate a java.sql.Date
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar mesero: " + e.getMessage());
        }
    }

    // Método para listar meseros
    public List<Meseros> listarMeseros() {
        List<Meseros> meseros = new ArrayList<>();
        String sql = "SELECT * FROM meseros";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Meseros mesero = new Meseros(
                    rs.getInt("id_mesero"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("dni"),
                    rs.getDate("fecha_registro").toLocalDate()  // Convertir java.sql.Date a LocalDate
                );
                meseros.add(mesero);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar meseros: " + e.getMessage());
        }
        return meseros;
    }
}
