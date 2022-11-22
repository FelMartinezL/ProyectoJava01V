package Modelo;

/**
 *
 * @author Javier
 */

public class Cliente {
    private int cliente_id_cli, tipo_cliente_id;
    private String rut_cli, nombre_cli, appaterno_cli, apmaterno_cli;

    public Cliente() {
    }

    public Cliente(int cliente_id_cli, int tipo_cliente_id, String rut_cli, String nombre_cli, String appaterno_cli, String apmaterno_cli) {
        this.cliente_id_cli = cliente_id_cli;
        this.tipo_cliente_id = tipo_cliente_id;
        this.rut_cli = rut_cli;
        this.nombre_cli = nombre_cli;
        this.appaterno_cli = appaterno_cli;
        this.apmaterno_cli = apmaterno_cli;
    }

    public int getCliente_id_cli() {
        return cliente_id_cli;
    }

    public void setCliente_id_cli(int cliente_id_cli) {
        this.cliente_id_cli = cliente_id_cli;
    }

    public int getTipo_cliente_id() {
        return tipo_cliente_id;
    }

    public void setTipo_cliente_id(int tipo_cliente_id) {
        this.tipo_cliente_id = tipo_cliente_id;
    }

    public String getRut_cli() {
        return rut_cli;
    }

    public void setRut_cli(String rut_cli) {
        this.rut_cli = rut_cli;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getAppaterno_cli() {
        return appaterno_cli;
    }

    public void setAppaterno_cli(String appaterno_cli) {
        this.appaterno_cli = appaterno_cli;
    }

    public String getApmaterno_cli() {
        return apmaterno_cli;
    }

    public void setApmaterno_cli(String apmaterno_cli) {
        this.apmaterno_cli = apmaterno_cli;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cliente_id_cli=" + cliente_id_cli + ", tipo_cliente_id=" + tipo_cliente_id + ", rut_cli=" + rut_cli + ", nombre_cli=" + nombre_cli + ", appaterno_cli=" + appaterno_cli + ", apmaterno_cli=" + apmaterno_cli + '}';
    }
    
    
}