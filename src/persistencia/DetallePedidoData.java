/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Entidades.DetallePedido;
import Entidades.Mesas;
import Entidades.Meseros;
import Entidades.Pedidos;
import Entidades.Productos;
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
            ps.setInt(1, detallePedido.getPedido().getId_pedido()); 
            ps.setInt(2, detallePedido.getProducto().getId_producto()); 
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
                Pedidos pedido = buscarPedidoPorId(rs.getInt("id_pedido"));
                Productos producto = buscarProductoPorId(rs.getInt("id_producto"));
                DetallePedido detallePedido = new DetallePedido(
                    rs.getInt("id_detalle"),
                    pedido,
                    producto,
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

    public Pedidos buscarPedidoPorId(int id_pedido) {
    Pedidos pedido = null;
    String sql = "SELECT * FROM pedidos WHERE id_pedido = ?";
    try {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id_pedido);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            // Crear una instancia de Mesas utilizando el id_mesa
            Mesas mesa = new Mesas(rs.getInt("id_mesa"));  // Esto crea un objeto Mesas con el id_mesa
            Meseros mesero = new Meseros(rs.getInt("id_mesero"));  // Similar con mesero si es necesario

            // Ahora puedes usar el objeto mesa en tu pedido
            pedido = new Pedidos(
                rs.getInt("id_pedido"),
                mesa,  // Pasas el objeto Mesas en lugar del int id_mesa
                mesero,  // Pasas el objeto Mesero en lugar del int id_mesero
                rs.getDate("fecha_pedido").toLocalDate(),
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


    private Productos buscarProductoPorId(int id_producto) {
        Productos producto = null;
        String sql = "SELECT * FROM productos WHERE id_producto = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id_producto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                producto = new Productos(
                    rs.getInt("id_producto"),
                    rs.getString("nombre"),
                    rs.getString("categoria"),
                    rs.getDouble("precio"),
                    rs.getInt("stock"),
                    rs.getBoolean("estado")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar producto: " + e.getMessage());
        }
        return producto;
    }
}
