package Productos;

public abstract class Productos {

    protected String nombre;
    protected String tipo;
    protected String marca;

    public Productos() {
    }

    public Productos(String nombre, String tipo, String marca) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract int calcularPrecio(int unidad);

}
