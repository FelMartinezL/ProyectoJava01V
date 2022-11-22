package Controlador;

import BD.Conexion;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javier
 */
public class RegistroVenta {
    
    PreparedStatement stmt;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    SimpleDateFormat s = new SimpleDateFormat("dd-mm-yyyy"); 
    String Date = s.format("dd-mm-yyyy");
    
    
    public int agregarVenta(Venta venta){
        
     int r = 0;
     String sql = "INSERT INTO venta (id_venta, fecha_venta, subtotal, descuento, total, cliente_id_cli, id_trabajador) VALUES (?,?,?,?,?,?,?)";
     
        try {
            con = conectar.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, venta.getId_venta());
            stmt.setDate(2, (Date) venta.getFecha_ventas());
            stmt.setInt(3, venta.getSub_total());
            stmt.setInt(4, venta.getDescuento());
            stmt.setInt(5, venta.getTotal());
            stmt.setInt(6, venta.getCliente_id_cli());
            stmt.setInt(7, venta.getId_trabajador());
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
    
    public int borrarVenta(String id_venta){
        int r=0;
        String sql = "DELETE FROM venta WHERE id_venta="+id_venta;
        try {
            con=conectar.getConnection();
            stmt=con.prepareStatement(sql);
            r = stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error SQL");
        }
        return r;
    }
    
    public int ActualizarVenta(Venta venta) {  
        int r = 0;
        String sql="UPDATE venta SET id_venta =?, fecha_venta =?, subtotal =?, descuento =?, total =?, cliente_id_cli =?, id_trabajador =? WHERE id_venta=?";        
        try {
             con = conectar.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, venta.getId_venta());
            stmt.setDate(2, (Date) venta.getFecha_ventas());
            stmt.setInt(3, venta.getSub_total());
            stmt.setInt(4, venta.getDescuento());
            stmt.setInt(5, venta.getTotal());
            stmt.setInt(6, venta.getCliente_id_cli());
            stmt.setInt(7, venta.getId_trabajador());
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
    
    public List listarVenta() {
        List<Venta> datosventa = new ArrayList<>();
        try {
            con = conectar.getConnection();
            stmt = con.prepareStatement("SELECT * FROM venta");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Venta venta = new Venta();
                venta.setId_venta(rs.getInt(1));                               
                //trabajador.setFecha_contrato(rs.getDate(2));
                venta.setSub_total(rs.getInt(3));
                venta.setDescuento(rs.getInt(4));
                venta.setTotal(rs.getInt(5));
                venta.setCliente_id_cli(rs.getInt(6));
                venta.setId_trabajador(rs.getInt(7));
                                                 
            }
        } catch (SQLException e) {
            System.out.println("Error SQL");
        }
        return datosventa;
    }
    
    
    
}
