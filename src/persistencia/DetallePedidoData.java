/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Entidades.DetallePedido;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedido;
import Entidades.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DetallePedidoData {
    private Connection connection;
    private PedidoData pedidosData = new PedidoData();
    private ProductoData productoData = new ProductoData();

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
                Pedido pedido = pedidosData.buscarPedidoPorId(rs.getInt("id_pedido"));
                Producto producto = productoData.buscarProductoPorId(rs.getInt("id_producto"));
                DetallePedido detallePedido = new DetallePedido();
                detallePedido.setId_detalle(rs.getInt("id_detalle"));
                detallePedido.setPedido(pedido);
                detallePedido.setProducto(producto);
                detallePedido.setCantidad(rs.getInt("cantidad"));
                detallePedido.setPrecio_unitario(rs.getDouble("precio_unitario"));
                detallePedido.setSub_total(rs.getDouble("sub_total"));
                detalles.add(detallePedido);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar detalles de pedido: " + e.getMessage());
        }
        return detalles;
    }
       public List<DetallePedido> listarDetallesPorProducto(int id_producto) {
        List<DetallePedido> detalles = new ArrayList<>();
        String sql = "SELECT * FROM detalle_pedido WHERE id_producto = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id_producto);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Pedido pedido = pedidosData.buscarPedidoPorId(rs.getInt("id_pedido"));
                Producto producto = productoData.buscarProductoPorId(rs.getInt("id_producto"));
                DetallePedido detallePedido = new DetallePedido();
                detallePedido.setId_detalle(rs.getInt("id_detalle"));
                detallePedido.setPedido(pedido);
                detallePedido.setProducto(producto);
                detallePedido.setCantidad(rs.getInt("cantidad"));
                detallePedido.setPrecio_unitario(rs.getDouble("precio_unitario"));
                detallePedido.setSub_total(rs.getDouble("sub_total"));
                detalles.add(detallePedido);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar detalles de pedido: " + e.getMessage());
        }
        return detalles;
    }

    
    public void actualizarDetallePedido(int id_pedido, DetallePedido detallePedido) {
        String sql = "UPDATE detalle_pedido SET cantidad = ?, precio_unitario = ?, sub_total = ? WHERE id_pedido = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, detallePedido.getCantidad());
            ps.setDouble(2, detallePedido.getPrecio_unitario());
            ps.setDouble(3, detallePedido.getSub_total());
            ps.setInt(4, id_pedido);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar detalle de pedido: " + e.getMessage());
        }
    }
    
    
    public void actualizarDetallePedidoCantidad(int id_pedido, int cantidad, int cantidadOriginal, int id_producto) {
        String sql = "UPDATE detalle_pedido SET cantidad = ? WHERE id_pedido = ? AND id_producto = ?";
        
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, cantidad+cantidadOriginal);
            ps.setDouble(2, id_pedido);
            ps.setInt(3, id_producto);
           
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar detalle de pedido: " + e.getMessage());
        }
    }
    
    
    
     public void actualizarDetallePedidoSubTotal(int id_pedido, double precio, int cantidad, int id_producto) {
        String sql = "UPDATE detalle_pedido SET sub_total = ? WHERE id_pedido = ? AND id_producto = ?";
        
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDouble(1, precio*cantidad);
            ps.setDouble(2, id_pedido);
            ps.setInt(3, id_producto);
           
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
            int filasAfectadas = ps.executeUpdate();  // Ejecuta la eliminación
            
            if (filasAfectadas > 0) {
                System.out.println("Detalle eliminado.");
            } else {
                System.out.println("No se encontró un detalle con ese ID.");
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar detalle de pedido: " + e.getMessage());
        }
    }   

}
