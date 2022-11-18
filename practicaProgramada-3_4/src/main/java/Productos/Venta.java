package Productos;

import java.io.Serializable;
import java.util.List;

public class Venta implements Serializable{

    private List<Productos> productos;
    private String cedula;
    private double total;

    public Venta() {
    }

    public Venta(List<Productos> productos, String cedula, double total) {
        this.productos = productos;
        this.cedula = cedula;
        this.total = total;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
