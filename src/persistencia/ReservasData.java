/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Entidades.Reserva;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservasData {
    private Connection connection;

    public ReservasData() {
        this.connection = Conexion.getConnection();
        if (this.connection == null) {
            System.out.println("Error: No se pudo establecer la conexión con la base de datos.");
        }
    }

    public void agregarReserva(Reserva reserva) {
        String sql = "INSERT INTO reservas (id_mesa, nombre_cliente, dni_cliente, fecha_reserva, estado) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, reserva.getId_mesa());
            ps.setString(2, reserva.getNombre_cliente());
            ps.setString(3, reserva.getDni_cliente());

            
            if (reserva.getFecha_reserva() != null) {
                ps.setTimestamp(4, Timestamp.valueOf(reserva.getFecha_reserva()));
            } else {
                ps.setNull(4, Types.TIMESTAMP); 
            }

            ps.setBoolean(5, reserva.isEstado());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar reserva: " + e.getMessage());
        }
    }

    
    public List<Reserva> listarReservas() {
        List<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT * FROM reservas";
        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Reserva reserva = new Reserva(
                    rs.getInt("id_reserva"),
                    rs.getInt("id_mesa"),
                    rs.getString("nombre_cliente"),
                    rs.getString("dni_cliente"),
                    rs.getTimestamp("fecha_reserva").toLocalDateTime(),
                    rs.getBoolean("estado")
                );
                reservas.add(reserva);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar reservas: " + e.getMessage());
        }
        return reservas;
    }

    
    public void actualizarReserva(Reserva reserva) {
        String sql = "UPDATE reservas SET id_mesa = ?, nombre_cliente = ?, dni_cliente = ?, fecha_reserva = ?, estado = ? WHERE id_reserva = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, reserva.getId_mesa());
            ps.setString(2, reserva.getNombre_cliente());
            ps.setString(3, reserva.getDni_cliente());
            ps.setTimestamp(4, Timestamp.valueOf(reserva.getFecha_reserva()));
            ps.setBoolean(5, reserva.isEstado());
            ps.setInt(6, reserva.getId_reserva());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar reserva: " + e.getMessage());
        }
    }

    
    public void eliminarReserva(int id_reserva) {
        String sql = "DELETE FROM reservas WHERE id_reserva = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id_reserva);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar reserva: " + e.getMessage());
        }
    }

    
    public Reserva buscarReservaPorId(int id_reserva) {
        Reserva reserva = null;
        String sql = "SELECT * FROM reservas WHERE id_reserva = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id_reserva);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reserva = new Reserva(
                    rs.getInt("id_reserva"),
                    rs.getInt("id_mesa"),
                    rs.getString("nombre_cliente"),
                    rs.getString("dni_cliente"),
                    rs.getTimestamp("fecha_reserva").toLocalDateTime(),
                    rs.getBoolean("estado")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar reserva: " + e.getMessage());
        }
        return reserva;
    }
}

