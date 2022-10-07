package Figuras;

public class Circulo extends figurasGeometricas {

    public Circulo(int radio) {
        super(radio);
    }

    @Override
    public int calcularArea() {
        return (int) ((super.getLado() * super.getLado()) * 3.14);
    }

    @Override
    public int calcularPerimetro() {
        return (int) (2 * 3.14 * super.getLado());
    }

}
