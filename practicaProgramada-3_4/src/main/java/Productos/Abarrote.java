package Productos;

public final class Abarrote extends Productos {

    public Abarrote() {
    }

    public Abarrote(int precio) {
        this.precio = precio;
    }

    public Abarrote(String nombre, String marca, int precio) {
        super(nombre, "Abarrote", marca);
        this.precio = precio;
    }

    @Override
    public double calcularPrecio(Double unidad) {
        return unidad * precio;
    }

}
