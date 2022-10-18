package Productos;

public final class Abarrote extends Productos {

    private int precio;

    public Abarrote() {
    }

    public Abarrote(int precio) {
        this.precio = precio;
    }

    public Abarrote(String nombre, String marca, int precio) {
        super(nombre, "Abarrote", marca);
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int calcularPrecio(int unidad) {

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
