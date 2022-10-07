package Figuras;

public class Cuadrado extends figurasGeometricas {

    public Cuadrado(int lado) {
        super(lado);
    }

    @Override
    public int calcularArea() {
        return (super.getLado() * super.getLado());
    }

    @Override
    public int calcularPerimetro() {
        return (super.getLado() * 4);
    }

}
