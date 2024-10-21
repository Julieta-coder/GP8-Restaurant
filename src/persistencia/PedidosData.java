/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Entidades.Mesas;
import Entidades.Meseros;
import Entidades.Pedidos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidosData {
    private Connection connection;

    public PedidosData() {
        this.connection = Conexion.getConnection();
    }

    
    public void agregarPedido(Pedidos pedido) {
        String sql = "INSERT INTO pedidos (id_mesa, id_mesero, fecha_pedido, hora_pedido, estado, monto_total) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, pedido.getId_mesa());
            ps.setInt(2, pedido.getId_mesero());
            ps.setDate(3, Date.valueOf(pedido.getFecha_pedido()));
            ps.setTime(4, Time.valueOf(pedido.getHora_pedido()));
            ps.setBoolean(5, pedido.isEstado());
            ps.setDouble(6, pedido.getMonto_total());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar pedido: " + e.getMessage());
        }
    }

    
    public List<Pedidos> listarPedidos() {
    List<Pedidos> pedidos = new ArrayList<>();
    String sql = "SELECT * FROM pedidos";
    try {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            // Crear instancias de Mesas y Meseros utilizando los IDs extraídos
            Mesas mesa = new Mesas(rs.getInt("id_mesa"));
            Meseros mesero = new Meseros(rs.getInt("id_mesero"));

            // Pasar los objetos mesa y mesero en lugar de los IDs a la clase Pedidos
            Pedidos pedido = new Pedidos(
                rs.getInt("id_pedido"),
                mesa,  // Pasas el objeto Mesas aquí
                mesero,  // Pasas el objeto Meseros aquí
                rs.getDate("fecha_pedido").toLocalDate(),
                rs.getTime("hora_pedido").toLocalTime(),
                rs.getBoolean("estado"),
                rs.getDouble("monto_total")
            );
            pedidos.add(pedido);
        }
    } catch (SQLException e) {
        System.out.println("Error al listar pedidos: " + e.getMessage());
    }
    return pedidos;
}

    
    public void actualizarPedido(Pedidos pedido) {
        String sql = "UPDATE pedidos SET id_mesa = ?, id_mesero = ?, fecha_pedido = ?, hora_pedido = ?, estado = ?, monto_total = ? WHERE id_pedido = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, pedido.getId_mesa());
            ps.setInt(2, pedido.getId_mesero());
            ps.setDate(3, Date.valueOf(pedido.getFecha_pedido()));
            ps.setTime(4, Time.valueOf(pedido.getHora_pedido()));
            ps.setBoolean(5, pedido.isEstado());
            ps.setDouble(6, pedido.getMonto_total());
            ps.setInt(7, pedido.getId_pedido());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar pedido: " + e.getMessage());
        }
    }

    
    public void eliminarPedido(int id_pedido) {
        String sql = "DELETE FROM pedidos WHERE id_pedido = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id_pedido);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar pedido: " + e.getMessage());
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
}
