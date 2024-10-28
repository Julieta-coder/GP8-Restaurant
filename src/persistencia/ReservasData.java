/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Entidades.Reserva;
import Entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservasData {
    private Connection connection;

    public ReservasData(Connection connection) {
        this.connection = connection;
    }

    public void guardarReserva(Reserva reserva) {
        String sql = "INSERT INTO reserva (id_mesa, nombre_cliente, dni_cliente, fecha_reserva, estado) VALUES (?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, reserva.getId_mesa());
            stmt.setString(2, reserva.getNombre_cliente());
            stmt.setString(3, reserva.getDni_cliente());
            stmt.setObject(4, reserva.getFecha_reserva());
            stmt.setBoolean(5, reserva.isEstado());
            stmt.executeUpdate();
            
            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                reserva.setId_reserva(generatedKeys.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Reserva buscarReserva(int id) {
        Reserva reserva = null;
        String sql = "SELECT * FROM reserva WHERE id_reserva = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                int id_mesa = rs.getInt("id_mesa");
                String nombre_cliente = rs.getString("nombre_cliente");
                String dni_cliente = rs.getString("dni_cliente");
                LocalDateTime fecha_reserva = rs.getTimestamp("fecha_reserva").toLocalDateTime();
                boolean estado = rs.getBoolean("estado");
                
                Mesa mesa = new Mesa(); 
                mesa.setId_mesa(id_mesa);
                
                reserva = new Reserva(id, id_mesa, nombre_cliente, dni_cliente, fecha_reserva, estado);
                reserva.setMesa(mesa);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return reserva;
    }

    public List<Reserva> obtenerReservas() {
        List<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT * FROM reserva";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                int id_reserva = rs.getInt("id_reserva");
                int id_mesa = rs.getInt("id_mesa");
                String nombre_cliente = rs.getString("nombre_cliente");
                String dni_cliente = rs.getString("dni_cliente");
                LocalDateTime fecha_reserva = rs.getTimestamp("fecha_reserva").toLocalDateTime();
                boolean estado = rs.getBoolean("estado");

                Mesa mesa = new Mesa(); 
                mesa.setId_mesa(id_mesa);
                
                Reserva reserva = new Reserva(id_reserva, id_mesa, nombre_cliente, dni_cliente, fecha_reserva, estado);
                reserva.setMesa(mesa);
                reservas.add(reserva);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return reservas;
    }

    public void actualizarReserva(Reserva reserva) {
        String sql = "UPDATE reserva SET id_mesa = ?, nombre_cliente = ?, dni_cliente = ?, fecha_reserva = ?, estado = ? WHERE id_reserva = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, reserva.getId_mesa());
            stmt.setString(2, reserva.getNombre_cliente());
            stmt.setString(3, reserva.getDni_cliente());
            stmt.setObject(4, reserva.getFecha_reserva());
            stmt.setBoolean(5, reserva.isEstado());
            stmt.setInt(6, reserva.getId_reserva());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void eliminarReserva(int id) {
        String sql = "DELETE FROM reserva WHERE id_reserva = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
