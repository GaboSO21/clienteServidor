package Figuras;

public class Triangulo extends figurasGeometricas {

    private int altura;

    public Triangulo(int base, int altura) {
        super(base);
        this.altura = altura;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return ((super.getLado() * getAltura()) / 2);
    }

    @Override
    public int calcularPerimetro() {
        return super.getLado() * 3;
    }

}
