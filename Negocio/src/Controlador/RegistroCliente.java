package Controlador;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import BD.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javier
 */

public class RegistroCliente {
    
    PreparedStatement stmt;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    ///Cliente cliente = new Cliente();
    
    public int agregarCliente(Cliente cliente){
        
     int r = 0;
     String sql = "INSERT INTO cliente (cliente_id_cli, rut_cli, nombre_cli, appaterno_cli, apmaterno_cli, tipo_cliente_id) VALUES (?,?,?,?,?,?)";
     
        try {
            con = conectar.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cliente.getCliente_id_cli());
            stmt.setString(2, cliente.getRut_cli());
            stmt.setString(3, cliente.getNombre_cli());
            stmt.setString(4, cliente.getAppaterno_cli());
            stmt.setString(5, cliente.getApmaterno_cli());
            stmt.setInt(6, cliente.getTipo_cliente_id());  
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
    
    public int borrarCliente(String rut_cli){
        int r=0;
        String sql = "DELETE FROM cliente WHERE rut_cli="+rut_cli;
        try {
            con=conectar.getConnection();
            stmt=con.prepareStatement(sql);
            r = stmt.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }
    
    public int ActualizarCliente(Cliente cliente) {  
        int r = 0;
        String sql="UPDATE cliente SET cliente_id_cli=?, rut_cli=?, nombre_cli=?, appaterno_cli=?, apmaterno_cli=?, tipo_cliente_id=? WHERE rut_cli=?";        
        try {
             con = conectar.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cliente.getCliente_id_cli());
            stmt.setString(2, cliente.getRut_cli());
            stmt.setString(3, cliente.getNombre_cli());
            stmt.setString(4, cliente.getAppaterno_cli());
            stmt.setString(5, cliente.getApmaterno_cli());
            stmt.setInt(6, cliente.getTipo_cliente_id());  
            r = stmt.executeUpdate();
            if(r ==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (SQLException e) {
        }  
        return r;
    }
    
    public List listarCliente() {
        List<Cliente> datoscliente = new ArrayList<>();
        try {
            con = conectar.getConnection();
            stmt = con.prepareStatement("select * from cliente");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCliente_id_cli(rs.getInt(1));
                cliente.setRut_cli(rs.getString(2));
                cliente.setNombre_cli(rs.getString(3));
                cliente.setAppaterno_cli(rs.getString(4));
                cliente.setApmaterno_cli(rs.getString(5));
                cliente.setTipo_cliente_id(rs.getInt(6));
            }
        } catch (SQLException e) {
        }
        return datoscliente;
    }
}
