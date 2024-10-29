/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

/**
 *
 * @author Adriana
 */
import Entidades.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PedidosData {
    private final Connection connection;
    
   private MesaData mesaData= new MesaData();
    private MeserosData meseroData=new MeserosData();
    
    

    public PedidosData() {
        this.connection = Conexion.getConnection();
    }
    
    public PedidosData(Conexion conexion) {
                this.connection = Conexion.getConnection();

    }
    
    public PedidosData(Conexion conexion, MesaData mesaData ,MeserosData meseroData) {
                this.connection = Conexion.getConnection();
                this.mesaData=mesaData;
                this.meseroData=meseroData;
    }
    
    
    
      // Método para cargar un Pedido en la base de datos
    public void cargarPedido(Pedido pedido) {
        String sql = "INSERT INTO pedidos (id_mesa, id_mesero, fecha_pedido, hora_pedido, estado, monto_total) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            try (
                 PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
               // statement.setInt(1, insc.getAlumno().getIdAlumno());
                statement.setInt(1, pedido.getId_mesa());
                statement.setInt(2, pedido.getId_mesero());
                statement.setDate(3,  java.sql.Date.valueOf(pedido.getFecha_pedido()));      
                statement.setTime(4, java.sql.Time.valueOf(pedido.getHora_pedido()));
                statement.setBoolean(5, pedido.isEstado());
                statement.setDouble(6, pedido.getMonto_total());
                
                statement.executeUpdate();
                ResultSet rs = statement.getGeneratedKeys();
                if (rs.next()) {
                    pedido.setId_pedido(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar el Pedido: " + e.getMessage());
        }
    }
//    
////revisar esto
//    public void agregarPedido(Pedido pedido) {
//        String sql = "INSERT INTO pedidos (id_mesa, id_mesero, fecha_pedido, hora_pedido, estado, monto_total) VALUES (?, ?, ?, ?, ?, ?)";
//        try {
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setInt(1, pedido.getId_mesa());
//            ps.setInt(2, pedido.getId_mesero());
////            ps.setDate(3, new java.sql.Date(pedido.getFecha_pedido().getTime()));
//            ps.setDate(3,  java.sql.Date.valueOf(pedido.getFecha_pedido()));
//
//            ps.setTime(4, java.sql.Time.valueOf(pedido.getHora_pedido()));
//            ps.setBoolean(5, pedido.isEstado());
//            ps.setDouble(6, pedido.getMonto_total());
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println("Error al agregar pedido: " + e.getMessage());
//        }
//    }

    
   // Método para obtener todos los Pedidos activos de las mesas (Attentidas)
    public List<Pedido> obtenerPedidos() {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedidos";
        try {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Pedido pedido = new Pedido();
//                    inscripcion.setIdInscripcion(resultSet.getInt("idInscripcion"));
                    pedido.setId_pedido(resultSet.getInt("id_pedido"));
//                    Alumno alumno = aluData.buscarAlumnoPorId(resultSet.getInt("idAlumno"));
                    Mesa mesa = mesaData.obtenerMesaActivaPorId(resultSet.getInt("id_mesa"));
//                    Materia materia = matData.buscarMateria(resultSet.getInt("idMateria"));
                    Mesero mesero=meseroData.buscarMozoPorId(resultSet.getInt("id_mesero"));
                    pedido.setMesa(mesa);
                    pedido.setMesero(mesero);
                    pedido.setFecha_pedido(resultSet.getDate("fecha_pedido").toLocalDate());
                    pedido.setHora_pedido(resultSet.getTime("hora_pedido").toLocalTime());
                    pedido.setEstado(resultSet.getBoolean("estado"));
                    pedido.setMonto_total(resultSet.getDouble("monto_total"));


                   pedidos.add(pedido);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener pedidos: " + e.getMessage());
        }
        return pedidos;
    }  
    
    // Método para obtener todos los Pedidos activos de las mesas (Attentidas) del dia de hoy desde la query
    public List<Pedido> obtenerPedidosDelDia() {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedidos WHERE estado=1 AND fecha_pedido=CURDATE()";
        try {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Pedido pedido = new Pedido();
//                    inscripcion.setIdInscripcion(resultSet.getInt("idInscripcion"));
                    pedido.setId_pedido(resultSet.getInt("id_pedido"));
//                    Alumno alumno = aluData.buscarAlumnoPorId(resultSet.getInt("idAlumno"));
                    Mesa mesa = mesaData.obtenerMesaActivaPorId(resultSet.getInt("id_mesa"));
//                    Materia materia = matData.buscarMateria(resultSet.getInt("idMateria"));
                    Mesero mesero=meseroData.buscarMozoPorId(resultSet.getInt("id_mesero"));
                    pedido.setMesa(mesa);
                    pedido.setMesero(mesero);
                    pedido.setFecha_pedido(resultSet.getDate("fecha_pedido").toLocalDate());
                    pedido.setHora_pedido(resultSet.getTime("hora_pedido").toLocalTime());
                    pedido.setEstado(resultSet.getBoolean("estado"));
                    pedido.setMonto_total(resultSet.getDouble("monto_total"));


                   pedidos.add(pedido);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener pedidos: " + e.getMessage());
        }
        return pedidos;
    }  
    
    // Listar ingresos sumando totales de pedidos para una fecha en particular. REVISAR
    public Double listarIngresosParaUnaFecha(LocalDate fecha_pedido) {
        Double resultadoMontoTotal=0.0;
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedidos WHERE estado=1 AND fecha_pedido=?";
        try {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                
                statement.setDate(1,  java.sql.Date.valueOf(fecha_pedido));      

                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Pedido pedido = new Pedido();
                    pedido.setId_pedido(resultSet.getInt("id_pedido"));
                    Mesa mesa = mesaData.obtenerMesaActivaPorId(resultSet.getInt("id_mesa"));
                    Mesero mesero=meseroData.buscarMozoPorId(resultSet.getInt("id_mesero"));
                    pedido.setMesa(mesa);
                    pedido.setMesero(mesero);
                    pedido.setFecha_pedido(resultSet.getDate("fecha_pedido").toLocalDate());
                    pedido.setHora_pedido(resultSet.getTime("hora_pedido").toLocalTime());
                    pedido.setEstado(resultSet.getBoolean("estado"));
                    pedido.setMonto_total(resultSet.getDouble("monto_total"));


                   pedidos.add(pedido);
                }
                
                for (Pedido pedido : pedidos) {
                    
                    resultadoMontoTotal+=   pedido.getMonto_total();        
                }
                
            
                
                
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener pedidos: " + e.getMessage());
        }
        return resultadoMontoTotal;
    }  
    
    // Listar los pedidos que cobro un mesero en particular en el día.. REVISAR
    public  List<Pedido> listarPedidosDelMozo(int id_mesero) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedidos WHERE id_mesero=? AND estado=1 AND fecha_pedido=CURDATE()";
        try {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                
                statement.setInt(1,  id_mesero);      

                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Pedido pedido = new Pedido();
                    pedido.setId_pedido(resultSet.getInt("id_pedido"));
                    Mesa mesa = mesaData.obtenerMesaActivaPorId(resultSet.getInt("id_mesa"));
                    Mesero mesero=meseroData.buscarMozoPorId(resultSet.getInt("id_mesero"));
                    pedido.setMesa(mesa);
                    pedido.setMesero(mesero);
                    pedido.setFecha_pedido(resultSet.getDate("fecha_pedido").toLocalDate());
                    pedido.setHora_pedido(resultSet.getTime("hora_pedido").toLocalTime());
                    pedido.setEstado(resultSet.getBoolean("estado"));
                    pedido.setMonto_total(resultSet.getDouble("monto_total"));


                   pedidos.add(pedido);
                }
                
                
            
                
                
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener pedidos: " + e.getMessage());
        }
        return pedidos;
    }
    
    
    
    // Listar los pedidos que ha hecho una mesa en una fecha entre horas.. REVISAR
    public  List<Pedido> listarPedidosMesaParaUnaFecha(LocalDate fecha_pedido, int id_mesa) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedidos WHERE estado=1 AND fecha_pedido=? AND id_mesa=?";
        try {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                
                statement.setDate(1,  java.sql.Date.valueOf(fecha_pedido));  
                statement.setInt(1, id_mesa);


                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Pedido pedido = new Pedido();
                    pedido.setId_pedido(resultSet.getInt("id_pedido"));
                    Mesa mesa = mesaData.obtenerMesaActivaPorId(resultSet.getInt("id_mesa"));
                    Mesero mesero=meseroData.buscarMozoPorId(resultSet.getInt("id_mesero"));
                    pedido.setMesa(mesa);
                    pedido.setMesero(mesero);
                    pedido.setFecha_pedido(resultSet.getDate("fecha_pedido").toLocalDate());
                    pedido.setHora_pedido(resultSet.getTime("hora_pedido").toLocalTime());
                    pedido.setEstado(resultSet.getBoolean("estado"));
                    pedido.setMonto_total(resultSet.getDouble("monto_total"));


                   pedidos.add(pedido);
                }
                
              
                
            
                
                
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener pedidos: " + e.getMessage());
        }
        return pedidos;
    }  
    
//  
//    //revisar esto
//    public List<Pedido> listarPedidos() {
//        List<Pedido> pedidos = new ArrayList<>();
//        String sql = "SELECT * FROM pedidos";
//        try {
//            Statement st = connection.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                Pedido pedido = new Pedido ();
//                    pedido.setId_pedido( rs.getInt("id_pedido"));
//                    pedido.setId_mesa(rs.getInt("id_mesa"));
//                pedidos.add(pedido);
//            }
//        } catch (SQLException e) {
//            System.out.println("Error al listar pedidos: " + e.getMessage());
//        }
//        return pedidos;
//    }

      // Método para actualizar el estado pendientes (0) o entregado/pagado de un Pedido tambien sirve como para baja logica o anular pedido por que no?
    public void actualizarEstado(int id_mesa, int id_mesero, boolean estado) {
        String sql = "UPDATE inscripcion SET estado = ? WHERE id_mesa = ? AND id_mesero = ?";
        try {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setBoolean(1, estado);
                statement.setInt(2, id_mesa);
                statement.setInt(3, id_mesero);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar su estado: " + e.getMessage());
        }
    }
    
    public void actualizarMontoTotal(int id_mesa, int id_mesero, Double monto_total) {
        String sql = "UPDATE inscripcion SET monto_total = ? WHERE id_mesa = ? AND id_mesero = ?";
        try {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setDouble(1, monto_total);
                statement.setInt(2, id_mesa);
                statement.setInt(3, id_mesero);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar monto Total: " + e.getMessage());
        }
    }
    
//    public void actualizarPedido(Pedido pedido) {
//        String sql = "UPDATE pedidos SET id_mesa = ?, id_mesero = ?, fecha_pedido = ?, hora_pedido = ?, estado = ?, monto_total = ? WHERE id_pedido = ?";
//        try {
//            PreparedStatement ps = connection.prepareStatement(sql);
//            //ps.setInt(1, pedido.getId_mesa());
//            ps.setInt(1, pedido.getMesa().getId_mesa());
//
//            ps.setInt(2, pedido.getId_mesero());
////            ps.setDate(3, new java.sql.Date(pedido.getFecha_pedido().getTime()));
//                        ps.setDate(3,  java.sql.Date.valueOf(pedido.getFecha_pedido()));
//
//            ps.setTime(4, java.sql.Time.valueOf(pedido.getHora_pedido()));
//            ps.setBoolean(5, pedido.isEstado());
//            ps.setDouble(6, pedido.getMonto_total());
//            ps.setInt(7, pedido.getId_pedido());
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println("Error al actualizar pedido: " + e.getMessage());
//        }
//    }

//    public void eliminarPedido(int id_pedido) { //Hacer baja logica tambien
//        String sql = "DELETE FROM pedidos WHERE id_pedido = ?";
//        try {
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setInt(1, id_pedido);
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println("Error al eliminar pedido: " + e.getMessage());
//        }
//    }

//    public Pedido buscarPedidoPorId(int id_pedido) {
//        Pedido pedido = null;
//        String sql = "SELECT * FROM pedidos WHERE id_pedido = ?";//Ver si hay que aclarar el estado del pedido
//        try {
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setInt(1, id_pedido);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                pedido = new Pedido(
//                        
//                    rs.getInt("id_pedido"),
//                    rs.getInt("id_mesa"),
//                    rs.getInt("id_mesero"),
//                    rs.getDate("fecha_pedido"),
//                    rs.getTime("hora_pedido").toLocalTime(),
//                    rs.getBoolean("estado"),
//                    rs.getDouble("monto_total")
//                );
//            }
//        } catch (SQLException e) {
//            System.out.println("Error al buscar pedido: " + e.getMessage());
//        }
//        return pedido;
//    }
    
      // Método para buscar un pedido por ID Maty
//    public Pedido buscarPedido(int id_pedido) {
//        Pedido pedido = null;
//        String sql = "SELECT * FROM pedidos WHERE id_pedido = ?";
//
//        try (PreparedStatement ps = connection.prepareStatement(sql)) {
//            ps.setInt(1, id_pedido);
//
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                Mesa mesa = new Mesa(rs.getInt("id_mesa"));
//                Mesero mesero = new Mesero(rs.getInt("id_mesero"));
//                LocalDate fecha_pedido = rs.getDate("fecha_pedido").toLocalDate();
//                LocalTime hora_pedido = rs.getTime("hora_pedido").toLocalTime();
//                boolean estado = rs.getBoolean("estado");
//                double monto_total = rs.getDouble("monto_total");
//
//                pedido = new Pedido(id_pedido, mesa, mesero, fecha_pedido, hora_pedido, estado, monto_total);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return pedido;
//    }
}
