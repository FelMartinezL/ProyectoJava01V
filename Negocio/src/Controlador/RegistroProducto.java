package Controlador;

import BD.Conexion;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javier
 */

public class RegistroProducto {
    
    PreparedStatement stmt;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    
    
    public int agregarProducto(Producto producto){
        
     int r = 0;
     String sql = "INSERT INTO producto (id_producto, nombre_producto, stock_producto, precio) VALUES (?,?,?,?)";
     
        try {
            con = conectar.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, producto.getId_producto());
            stmt.setString(2, producto.getNombre_producto());    
            stmt.setInt(3, producto.getStock_producto());
            stmt.setInt(4, producto.getPrecio());
            r = stmt.executeUpdate();
            if (r == 1) {
                return 1;
            } 
            else {
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Error SQL");
        }
        return r;
    }
    
    public int borrarProducto(String nombre_producto){
        int r=0;
        String sql = "DELETE FROM producto WHERE nombre_producto="+nombre_producto;
        try {
            con=conectar.getConnection();
            stmt=con.prepareStatement(sql);
            r = stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error SQL");
        }
        return r;
    }
    
    public int ActualizarProducto(Producto producto) {  
        int r = 0;
        String sql ="UPDATE producto SET id_producto =?, nombre_producto =?, stock_producto =?, precio =? WHERE nombre_producto =?";        
        try {
             con = conectar.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, producto.getId_producto());
            stmt.setString(2, producto.getNombre_producto());    
            stmt.setInt(3, producto.getStock_producto());
            stmt.setInt(4, producto.getPrecio());
            r = stmt.executeUpdate();
            if(r ==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Error SQL");
        }  
        return r;
    }
    
    public List listarProducto() {
        List<Producto> datosproducto = new ArrayList<>();
        try {
            con = conectar.getConnection();
            stmt = con.prepareStatement("SELECT * FROM producto");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setId_producto(rs.getInt(1));
                producto.setNombre_producto(rs.getString(2));
                producto.setStock_producto(rs.getInt(3));
                producto.setPrecio(rs.getInt(4));
            }
        } 
        catch (SQLException e) {
            System.out.println("Error SQL");
        }
        return datosproducto;
    }
    
}