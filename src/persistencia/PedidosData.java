/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

/**
 *
 * @author Adriana
 */
import Entidades.Pedido;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidosData {
    private Connection connection;

    public PedidosData() {
        this.connection = Conexion.getConnection();
    }

    public void agregarPedido(Pedido pedido) {
        String sql = "INSERT INTO pedidos (id_mesa, id_mesero, fecha_pedido, hora_pedido, estado, monto_total) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, pedido.getId_mesa());
            ps.setInt(2, pedido.getId_mesero());
            ps.setDate(3, new java.sql.Date(pedido.getFecha_pedido().getTime()));
            ps.setTime(4, java.sql.Time.valueOf(pedido.getHora_pedido()));
            ps.setBoolean(5, pedido.isEstado());
            ps.setDouble(6, pedido.getMonto_total());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar pedido: " + e.getMessage());
        }
    }

    public List<Pedido> listarPedidos() {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedidos";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Pedido pedido = new Pedido ();
                    pedido.setId_pedido( rs.getInt("id_pedido"));
                    pedido.setId_mesa(rs.getInt("id_mesa"));
                pedidos.add(pedido);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar pedidos: " + e.getMessage());
        }
        return pedidos;
    }

    public void actualizarPedido(Pedido pedido) {
        String sql = "UPDATE pedidos SET id_mesa = ?, id_mesero = ?, fecha_pedido = ?, hora_pedido = ?, estado = ?, monto_total = ? WHERE id_pedido = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, pedido.getId_mesa());
            ps.setInt(2, pedido.getId_mesero());
            ps.setDate(3, new java.sql.Date(pedido.getFecha_pedido().getTime()));
            ps.setTime(4, java.sql.Time.valueOf(pedido.getHora_pedido()));
            ps.setBoolean(5, pedido.isEstado());
            ps.setDouble(6, pedido.getMonto_total());
            ps.setInt(7, pedido.getId_pedido());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar pedido: " + e.getMessage());
        }
    }

    public void eliminarPedido(int id_pedido) { //Hacer baja logica tambien
        String sql = "DELETE FROM pedidos WHERE id_pedido = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id_pedido);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar pedido: " + e.getMessage());
        }
    }

    public Pedido buscarPedidoPorId(int id_pedido) {
        Pedido pedido = null;
        String sql = "SELECT * FROM pedidos WHERE id_pedido = ?";//Ver si hay que aclarar el estado del pedido
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id_pedido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pedido = new Pedido(
                    rs.getInt("id_pedido"),
                    rs.getInt("id_mesa"),
                    rs.getInt("id_mesero"),
                    rs.getDate("fecha_pedido"),
                    rs.getTime("hora_pedido").toLocalTime(),
                    rs.getBoolean("estado"),
                    rs.getDouble("monto_total")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar pedido: " + e.getMessage());
        }
        return pedido;
    }
}
