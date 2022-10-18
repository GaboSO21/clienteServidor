package Productos;

public final class Verdura extends Productos {

    private int precio;

    public Verdura() {
    }

    public Verdura(int precio) {
        this.precio = precio;
    }

    public Verdura(String nombre, String marca, int precio) {
        super(nombre, "Verdura", marca);
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int calcularPrecio(int kilos) {
        
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("nombre=").append(nombre);
        sb.append(", tipo=").append(tipo);
        sb.append(", marca=").append(marca);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

}
