/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

/**
 *
 * @author Adriana
 */
import Entidades.DetallePedido;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DetallePedidoData {
    private Connection connection;

    public DetallePedidoData() {
        this.connection = Conexion.getConnection();
    }

    public void agregarDetallePedido(DetallePedido detallePedido) {
        String sql = "INSERT INTO detalle_pedido (id_pedido, id_producto, cantidad, precio_unitario, sub_total) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, detallePedido.getId_pedido());
            ps.setInt(2, detallePedido.getId_producto());
            ps.setInt(3, detallePedido.getCantidad());
            ps.setDouble(4, detallePedido.getPrecio_unitario());
            ps.setDouble(5, detallePedido.getSub_total());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar detalle de pedido: " + e.getMessage());
        }
    }

    public List<DetallePedido> listarDetallesPorPedido(int id_pedido) {
        List<DetallePedido> detalles = new ArrayList<>();
        String sql = "SELECT * FROM detalle_pedido WHERE id_pedido = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id_pedido);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetallePedido detallePedido = new DetallePedido(
                    rs.getInt("id_detalle"),
                    rs.getInt("id_pedido"),
                    rs.getInt("id_producto"),
                    rs.getInt("cantidad"),
                    rs.getDouble("precio_unitario"),
                    rs.getDouble("sub_total")
                );
                detalles.add(detallePedido);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar detalles de pedido: " + e.getMessage());
        }
        return detalles;
    }

    public void actualizarDetallePedido(DetallePedido detallePedido) {
        String sql = "UPDATE detalle_pedido SET cantidad = ?, precio_unitario = ?, sub_total = ? WHERE id_detalle = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, detallePedido.getCantidad());
            ps.setDouble(2, detallePedido.getPrecio_unitario());
            ps.setDouble(3, detallePedido.getSub_total());
            ps.setInt(4, detallePedido.getId_detalle());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar detalle de pedido: " + e.getMessage());
        }
    }

    public void eliminarDetallePedido(int id_detalle) {
        String sql = "DELETE FROM detalle_pedido WHERE id_detalle = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id_detalle);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar detalle de pedido: " + e.getMessage());
        }
    }
}
