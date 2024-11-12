
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
   
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "gp8_restaurant";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    static Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
    public Conexion() {}

   
    public static Connection getConnection() {
        if (connection == null) {
            try {
                
                Class.forName("org.mariadb.jdbc.Driver");
               
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
                //JOptionPane.showMessageDialog(null, "Conexión establecida correctamente.");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el driver de MariaDB: " + ex.getMessage());
                ex.printStackTrace();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + ex.getMessage());
            }
        }
        return connection;
    }
}
