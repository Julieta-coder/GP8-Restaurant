/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

/**
 *
 * @author Adriana
 */
import Entidades.Mesa;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MesaData {

    public static Mesa buscarMesa(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    private Connection connection;

    public MesaData() {
        this.connection = Conexion.getConnection();
    }

    public void agregarMesa(Mesa mesa) {
        String sql = "INSERT INTO mesas (numero, capacidad, disposicion, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            /*ESTE METODO VERIFICA LA EXISTENCIA DE UNA MESA CON EL MISMO NUMERO. LO HICIMOS PARA NO UTILIZAR CLAVE PRIMARIA EN 'NUMERO'*/
            if(numeroExiste(mesa.getNumero()) == true){
                 ps.setInt(1, mesa.getNumero());
                 ps.setInt(2, mesa.getCapacidad());
                 ps.setString(3, mesa.getDisposicion());
                 ps.setBoolean(4, mesa.getEstado());
                 ps.executeUpdate();
            }else{
                System.out.println("Numero mesa ya existe");
                
            }
        } catch (SQLException e) {
            System.out.println("Error al agregar mesa: " + e.getMessage());
        }
    }
    
   
    public List<Mesa> listarMesas(){
        
        List<Mesa> mesas = new ArrayList<>();
        String sql = "SELECT * FROM mesas WHERE estado = 1 "; //Añadir estado 
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setDisposicion(rs.getString("disposicion"));
                mesa.setEstado(rs.getBoolean("estado"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setId_mesa(rs.getInt("id_mesa"));
                mesas.add(mesa);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar mesas: " + e.getMessage());
        }
        return mesas;
    }

   public void actualizarDisposicionMesa(Mesa mesa) {
        String sql = "UPDATE mesas SET disposicion = ? WHERE id_mesa = ?";
        
        try {
            
            PreparedStatement ps;
            ps = connection.prepareStatement(sql);
            
            ps.setString(1, mesa.getDisposicion());
            
            ps.setInt(2, mesa.getId_mesa());
            
           ps.executeUpdate();
           int filasAfectadas = ps.executeUpdate();
           if (filasAfectadas > 0) {
                System.out.println("Mesa modifica. "+mesa.getDisposicion());
            } else {
                System.out.println("No se encontró mesa con esa identificacion.");
            }
        ps.close();
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
            
            int filasAfectadas = ps.executeUpdate();  // Ejecuta la eliminación
            
            if (filasAfectadas > 0) {
                System.out.println("Mesa eliminada con exito.");
            } else {
                System.out.println("No se encontró un mesa con ese ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar mesa: " + e.getMessage());
        }
    }
    
    public void bajaLogica(int id_mesa) {
        String sql = "UPDATE mesas SET estado = 0 WHERE id_mesa = ?";
        
        try {
            
            PreparedStatement ps;
            ps = connection.prepareStatement(sql);
                   
            ps.setInt(1, id_mesa);
            
            ps.executeUpdate();
           
            System.out.println("Se dio de baja la mesa ID:"+id_mesa );

        ps.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar mesa: " + e.getMessage());
        }
    }
    
    
  public void altaLogica(int id_mesa) {
        String sql = "UPDATE mesas SET estado = 1 WHERE id_mesa = ?";
        
        try {
            
           PreparedStatement ps;
           ps = connection.prepareStatement(sql);
                   
           ps.setInt(1, id_mesa);
            
           ps.executeUpdate();
           
           System.out.println("Se dio de alta la mesa ID:"+id_mesa );
           
        ps.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar mesa: " + e.getMessage());
        }
    }
  
  /*OBTENER MESA POR ID QUE ESTEN ACTIVAS */
  public Mesa obtenerMesaActivaPorId(int id_mesa) {
        String sql = "SELECT * FROM mesas WHERE id_mesa = ? AND estado = 1";
        Mesa mesa = null;
        
        try {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1, id_mesa);
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    mesa = new Mesa();
                    mesa.setId_mesa(rs.getInt("id_mesa"));
                    mesa.setNumero(rs.getInt("numero"));
                    mesa.setCapacidad(rs.getInt("capacidad"));
                    mesa.setDisposicion(rs.getString("disposicion"));
                    mesa.setEstado(rs.getBoolean("estado"));
                    
                }else{
                    
                    System.out.println("La mesa está en el deposito.");/*EL METODO SERA NULO CUANDO EL ESTADO ES CERO*/
                }
            }
            
        } catch (SQLException ex) {
            
            System.out.println("Error al obtener la mesa: " + ex.getMessage());
        }
        
        return mesa;
    }
  
   public Mesa obtenerMesaActivaPorNumero(int numero) {
        String sql = "SELECT * FROM mesas WHERE numero = ? AND estado = 1";
        Mesa mesa = null;
        
        try {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1, numero);
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    mesa = new Mesa();
                    mesa.setId_mesa(rs.getInt("id_mesa"));
                    mesa.setNumero(rs.getInt("numero"));
                    mesa.setCapacidad(rs.getInt("capacidad"));
                    mesa.setDisposicion(rs.getString("disposicion"));
                    mesa.setEstado(rs.getBoolean("estado"));
                    
                }else{
                    
                    System.out.println("La mesa está en el deposito.");/*EL METODO SERA NULO CUANDO EL ESTADO ES CERO*/
                }
            }
            
        } catch (SQLException ex) {
            
            System.out.println("Error al obtener la mesa: " + ex.getMessage());
        }
        
        return mesa;
    }
  
  
  
  public Mesa obtenerMesaInactivaPorId(int id_mesa) {
        String sql = "SELECT * FROM mesas WHERE id_mesa = ? AND estado = 0";
        Mesa mesa = null;
        
        try {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1, id_mesa);
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    mesa = new Mesa();
                    mesa.setId_mesa(rs.getInt("id_mesa"));
                    mesa.setNumero(rs.getInt("numero"));
                    mesa.setCapacidad(rs.getInt("capacidad"));
                    mesa.setDisposicion(rs.getString("disposicion"));
                    mesa.setEstado(rs.getBoolean("estado"));
                }else{
                    
                    System.out.println("La mesa que busca esta activa"); /*EL METODO SERA NULO CUANDO EL ESTADO ES UNO*/
                }
            }
            
        } catch (SQLException ex) {
            
            System.out.println("Error al obtener la mesa: " + ex.getMessage());
        }
        
        return mesa;
    }
  public Mesa buscarMesaPorId(int id_mesa) {
        String sql = "SELECT * FROM mesas WHERE id_mesa = ?";
        Mesa mesa = null;

        try {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1, id_mesa);
                
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    int numero = rs.getInt("numero");
                    int capacidad = rs.getInt("capacidad");
                    String disposicion = rs.getString("disposicion");
                    boolean estado = rs.getBoolean("estado");
                    
                    mesa = new Mesa(id_mesa, numero, capacidad, disposicion, estado);
                } else {
                    System.out.println("No se encontró una mesa con ID: " + id_mesa);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar mesa por ID: " + e.getMessage());
        }

        return mesa;
    }

  
  public List<Mesa> listarMesasPorEstado(boolean estado) {
    List<Mesa> mesas = new ArrayList<>();
    String sql = "SELECT * FROM mesas WHERE estado = ?";

    try {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setBoolean(1, estado);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Mesa mesa = new Mesa();
            mesa.setId_mesa(rs.getInt("id_mesa"));
            mesa.setNumero(rs.getInt("numero"));
            mesa.setCapacidad(rs.getInt("capacidad"));
            mesa.setDisposicion(rs.getString("disposicion"));
            mesa.setEstado(rs.getBoolean("estado"));
            mesas.add(mesa);
        }
        
    } catch (SQLException e) {
        System.out.println("Error al listar mesas por estado: " + e.getMessage());
    }

    return mesas;
}

  
  
  
   public void actualizarMesa(Mesa mesa) {
        String sql = "UPDATE mesas SET numero = ?, capacidad = ?, disposicion = ? WHERE id_mesa = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, mesa.getNumero());
            ps.setInt(2, mesa.getCapacidad());
            ps.setString(3, mesa.getDisposicion());
            ps.setInt(4, mesa.getId_mesa());   
            
            int exito = ps.executeUpdate(); 
            
            if(exito ==1){
            
                JOptionPane.showMessageDialog(null, "Mesa modificado");
            }         
            
        } catch (SQLException e) {
            
            System.out.println("Error al actualizar mesa: " + e.getMessage());
        }
    }
   
    public boolean numeroExiste(int numero){
        boolean existencia=true;
        
        String sql ="SELECT numero FROM mesas;";
        try{
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    
                    if(rs.getInt("numero")==(numero)){
                        existencia=false;
                    }
                }
            }
        
        }catch (SQLException ex) {
            System.out.println(" Error al acceder a la tabla Mesas " + ex.getMessage());
        }
        return existencia;
    }

    public void actualizarMesa(int idMesa, Mesa me) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}

