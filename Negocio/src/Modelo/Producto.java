package Modelo;

/**
 *
 * @author Javier
 */

public class Producto {
    private int id_producto, stock_producto, precio;
    private String nombre_producto;

    public Producto() {
    }

    public Producto(int id_producto, int stock_producto, int precio, String nombre_producto) {
        this.id_producto = id_producto;
        this.stock_producto = stock_producto;
        this.precio = precio;
        this.nombre_producto = nombre_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getStock_producto() {
        return stock_producto;
    }

    public void setStock_producto(int stock_producto) {
        this.stock_producto = stock_producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", stock_producto=" + stock_producto + ", precio=" + precio + ", nombre_producto=" + nombre_producto + '}';
    }
    
}