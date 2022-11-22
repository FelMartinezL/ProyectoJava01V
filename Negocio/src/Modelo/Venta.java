package Modelo;

import java.util.Date;

/**
 *
 * @author Javier
 */

public class Venta {
    private int id_venta, sub_total, descuento, total, cliente_id_cli, id_trabajador; 
    private Date fecha_ventas;

    public Venta() {
    }

    public Venta(int id_venta, int fecha_venta, int sub_total, int descuento, int total, int cliente_id_cli, int id_trabajador, Date fecha_ventas) {
        this.id_venta = id_venta;
        this.sub_total = sub_total;
        this.descuento = descuento;
        this.total = total;
        this.cliente_id_cli = cliente_id_cli;
        this.id_trabajador = id_trabajador;
        this.fecha_ventas = fecha_ventas;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getSub_total() {
        return sub_total;
    }

    public void setSub_total(int sub_total) {
        this.sub_total = sub_total;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCliente_id_cli() {
        return cliente_id_cli;
    }

    public void setCliente_id_cli(int cliente_id_cli) {
        this.cliente_id_cli = cliente_id_cli;
    }

    public int getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(int id_trabajador) {
        this.id_trabajador = id_trabajador;
    }

    public Date getFecha_ventas() {
        return fecha_ventas;
    }

    public void setFecha_ventas(Date fecha_ventas) {
        this.fecha_ventas = fecha_ventas;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", sub_total=" + sub_total + ", descuento=" + descuento + ", total=" + total + ", cliente_id_cli=" + cliente_id_cli + ", id_trabajador=" + id_trabajador + ", fecha_ventas=" + fecha_ventas + '}';
    }
    
}
