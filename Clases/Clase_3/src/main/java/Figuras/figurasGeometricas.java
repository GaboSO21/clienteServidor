package Figuras;

public abstract class figurasGeometricas {

    protected int lado;

    public figurasGeometricas(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public abstract int calcularArea();

    public abstract int calcularPerimetro();

}
