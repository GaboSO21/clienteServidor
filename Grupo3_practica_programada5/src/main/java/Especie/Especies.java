package Especie;

import java.io.Serializable;

public class Especies implements Serializable, Comparable<Especies>{

    private String nombre;
    private int cantidad;
    private String categoria;
    private double precio;

    public Especies(String nombre, int cantidad, String categoria, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Especies [nombre=" + nombre + ", cantidad=" + cantidad + ", categoria=" + categoria + ", precio="
                + precio + "]";
    }

    @Override
    public int compareTo(Especies o) {
        if ((int) this.nombre.charAt(0) == (int) o.getNombre().charAt(0)) {
            return 0;
        } else if ((int) this.nombre.charAt(0) < (int) o.getNombre().charAt(0)) {
            return -1;
        } else {
            return 1;
        }
    }

}
