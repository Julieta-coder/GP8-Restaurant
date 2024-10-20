
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    // Parámetros de conexión
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "gp8-restauran";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    // Constructor vacío
    public Conexion() {}

    // Método para obtener la conexión
    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Cargar el driver de MariaDB
                Class.forName("org.mariadb.jdbc.Driver");
                // Establecer la conexión
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
                JOptionPane.showMessageDialog(null, "Conexión establecida correctamente.");
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
