/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ana Pèrez
 */
public class Conectar {
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="Rey";
    private static final String pass="rey1234";
    private static final String url="jdbc:mysql://localhost:3306/rdb";
        
    public static Connection conectarse(String user, String pass, String url) throws SQLException {
        Connection con = null;
        try {
            String urlWithCharset = url + "?useUnicode=true&characterEncoding=UTF-8";
            con = (Connection) DriverManager.getConnection(urlWithCharset, user, pass);
        } catch (SQLException e) {
            throw new SQLException("Error de conexión: " + e.getMessage(), e.getSQLState(), e.getErrorCode());
        }
        return con;
    }
}