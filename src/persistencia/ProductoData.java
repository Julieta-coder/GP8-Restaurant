
package persistencia;


import Entidades.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoData {
    private Connection connection;
    private String nombre;

    public ProductoData() {
        this.connection = Conexion.getConnection();
    }

    public void agregarProducto(Producto producto) {
        String sql = "INSERT INTO productos (nombre, categoria, precio, stock, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getCategoria());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.executeUpdate();
            
            
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }
    }

    public List<Producto> listarProductos() {
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        String sql = "SELECT id_producto,nombre,categoria,precio, stock FROM productos WHERE estado = 1";
        
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Producto p = new Producto();

                    p.setId_producto(rs.getInt("id_producto"));
                    p.setNombre(rs.getString("nombre"));
                    p.setCategoria(rs.getString("categoria"));
                    p.setPrecio(rs.getDouble("precio"));
                    p.setStock(rs.getInt("stock"));
                    p.setEstado(true);
                    productos.add(p);
                    
            }
            ps.close();
            
        } catch (SQLException e) {
            System.out.println("Error al listar productos: " + e.getMessage());
        }
        return productos;
    }

    public void actualizarProducto(Producto producto) {
        String sql = "UPDATE productos SET nombre = ?, categoria = ?, precio = ?, stock = ?, estado = ? WHERE id_producto = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getCategoria());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getId_producto());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e.getMessage());
        }
    }
     public boolean actualizarStock(int id_producto, int cantidadPedida) {
        String sql = "UPDATE productos SET stock = ? WHERE id_producto = ?";
        
        try {
            
           int stockRecuperado = buscarProductoPorId(id_producto).getStock();
            
            PreparedStatement ps = connection.prepareStatement(sql);
            
            if(stockRecuperado>=cantidadPedida){
                
                ps.setInt(1, stockRecuperado-cantidadPedida);
                
            }else{
                
                return false;
            }
            ps.setInt(2, id_producto);
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error al actualizar cantidad: " + e.getMessage());
        }
        return true;
    }

    public void eliminarProducto(int id_producto) {
        String sql = "DELETE FROM productos WHERE id_producto = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id_producto);
            int fila = ps.executeUpdate();
            
            if(fila>0){
            
                JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
            }
            ps.close();
            
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e.getMessage());
        }
    }

    public Producto buscarProductoPorId(int id_producto) {
        
        Producto producto = null;
        String sql = "SELECT * FROM productos WHERE id_producto = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id_producto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                producto = new Producto();
                producto.setId_producto(rs.getInt("id_producto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCategoria(rs.getString("categoria"));
                 producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));               
                producto.setEstado(rs.getBoolean("estado"));
                
               
              
            }
            
        } catch (SQLException e) {
            System.out.println("Error al buscar producto: " + e.getMessage());
        }
        return producto;
    }
    
    //eliminado logico
    
    public void cambiarEstado(int id){
    String sql = "UPDATE productos SET estado = 0 WHERE id_producto = ?";
    
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            
            int agregado = ps.executeUpdate();
            if(agregado ==1){
                
                JOptionPane.showMessageDialog(null, "Producto dado de baja");           
            }         
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se encontro la tabla");
        }
     
        
    }
    
    @Override
    public String toString() {
    return this.nombre;  // Asegúrate de usar el atributo correcto para el nombre
}
    
}
