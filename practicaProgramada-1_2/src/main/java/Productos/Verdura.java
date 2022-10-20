package Productos;

public final class Verdura extends Productos {

    public Verdura() {
    }

    public Verdura(int precio) {
        this.precio = precio;
    }

    public Verdura(String nombre, String marca, int precio) {
        super(nombre, "Verdura", marca);
        this.precio = precio;
    }

    @Override
    public double calcularPrecio(Double gramos) {
        return (precio / 1000) * gramos;
    }

}
 