package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Javier
 */

public class Conexion {
    String url="jdbc:mysql://localhost:3306/BDproyecto"; //hay que anexar la base de datos del proyecto
    String user="root",pass="";    
    Connection con;
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } 
        catch (ClassNotFoundException | SQLException e) {   
            
            System.out.println("Error al conectarse a la base de datos");
        }
        return con;
        
    }
}
