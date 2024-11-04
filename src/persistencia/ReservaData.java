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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservaData {
    private Connection connection;
    private MesaData mesaData = new MesaData();

    public ReservaData() {
        this.connection = Conexion.getConnection();
    }

    public void guardarReserva(Reserva reserva) {
        String sql = "INSERT INTO reservas (id_mesa, nombre_cliente, dni_cliente, fecha_reserva, estado) VALUES (?, ?, ?, ?, 1)";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, reserva.getMesa().getId_mesa());
            stmt.setString(2, reserva.getNombre_cliente());
            stmt.setInt(3, reserva.getDni_cliente());
            stmt.setObject(4, reserva.getFecha_reserva());
            stmt.executeUpdate();
            
            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                reserva.setId_reserva(generatedKeys.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Reserva buscarReserva(int id_reserva) {
        Reserva reserva = null;
        String sql = "SELECT * FROM reservas WHERE id_reserva = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id_reserva);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                Mesa mesa = mesaData.obtenerMesaActivaPorId(rs.getInt("id_mesa"));
                
                String nombre_cliente = rs.getString("nombre_cliente");
                int dni_cliente = rs.getInt("dni_cliente");
                LocalDate fecha_reserva = rs.getDate("fecha_reserva").toLocalDate();
                boolean estado = rs.getBoolean("estado");
                
                reserva = new Reserva(id_reserva, mesa, nombre_cliente, dni_cliente, fecha_reserva, estado);
                
                reserva.setMesa(mesa);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error en reservaData (Metodo 'buscarReserva')");
        }
        
        return reserva;
    }

    public List<Reserva> obtenerReservas() {
        List<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT * FROM reservas";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                int id_reserva = rs.getInt("id_reserva");
                Mesa mesa = mesaData.obtenerMesaActivaPorId(rs.getInt("id_mesa"));
                String nombre_cliente = rs.getString("nombre_cliente");
                int dni_cliente = rs.getInt("dni_cliente");
                 LocalDate fecha_reserva = rs.getDate("fecha_reserva").toLocalDate();
                boolean estado = rs.getBoolean("estado");
                
                Reserva reserva = new Reserva(id_reserva, mesa, nombre_cliente, dni_cliente, fecha_reserva, estado);
                reserva.setMesa(mesa);
                reservas.add(reserva);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return reservas;
    }

    public void actualizarReserva(String nombre ,int dni,LocalDate fecha, int id_reserva) {
        String sql = "UPDATE reservas SET nombre_cliente = ?, dni_cliente = ?, fecha_reserva = ? WHERE id_reserva = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setInt(2, dni);
            stmt.setObject(3, fecha);
            stmt.setInt(4, id_reserva);
            stmt.executeUpdate();
            System.out.println("dwadwa");
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error en reservaData (Metodo 'actualizarReserva')");
        }
    }

    public void eliminarReserva(int id) {
        String sql = "DELETE FROM reservas WHERE id_reserva = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error en reservaData (Metodo 'eliminarReserva')");
        }
    }
    public void bajaLogicaReserva(int id_reserva) {
        String sql = "UPDATE reservas SET estado = 0 WHERE id_reserva = ?";
        
        try {
            
            PreparedStatement ps;
            ps = connection.prepareStatement(sql);
                   
            ps.setInt(1, id_reserva);
            
            ps.executeUpdate();
           
            System.out.println("Se dio de baja la mesa ID:"+id_reserva );

        ps.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar reserva: " + e.getMessage());
        }
    }
    
    
  public void altaLogicaReserva(int id_reserva) {
        String sql = "UPDATE mesas SET estado = 1 WHERE id_reserva = ?";
        
        try {
            
           PreparedStatement ps;
           ps = connection.prepareStatement(sql);
                   
           ps.setInt(1, id_reserva);
            
           ps.executeUpdate();
           
           System.out.println("Se dio de alta la mesa ID:"+id_reserva );
           
        ps.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar reserva: " + e.getMessage());
        }
    }
}
