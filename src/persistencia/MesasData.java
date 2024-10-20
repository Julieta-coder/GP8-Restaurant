/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

/**
 *
 * @author Adriana
 */
import Entidades.Mesas;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MesasData {
    private Connection connection;

    public MesasData() {
        this.connection = Conexion.getConnection();
    }

    public void agregarMesa(Mesas mesa) {
        String sql = "INSERT INTO mesas (numero, capacidad, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, mesa.getNumero());
            ps.setInt(2, mesa.getCapacidad());
            ps.setString(3, mesa.getEstado());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar mesa: " + e.getMessage());
        }
    }

    public List<Mesas> listarMesas() {
        List<Mesas> mesas = new ArrayList<>();
        String sql = "SELECT * FROM mesas";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Mesas mesa = new Mesas(
                    rs.getInt("id_mesa"),
                    rs.getInt("numero"),
                    rs.getInt("capacidad"),
                    rs.getString("estado")
                );
                mesas.add(mesa);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar mesas: " + e.getMessage());
        }
        return mesas;
    }

   public void actualizarMesa(Mesas mesa) {
        String sql = "UPDATE mesas SET numero = ?, capacidad = ?, estado = ? WHERE id_mesa = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, mesa.getNumero());
            ps.setInt(2, mesa.getCapacidad());
            ps.setString(3, mesa.getEstado());
            ps.setInt(4, mesa.getId_mesa());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar mesa: " + e.getMessage());
        }
    }

    public void eliminarMesa(int id_mesa) {
        String sql = "DELETE FROM mesas WHERE id_mesa = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id_mesa);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar mesa: " + e.getMessage());
        }
    }
}

