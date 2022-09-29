package misClases;

public class Carro {
  
    private int numPuertas;
    private String color;
    private double kilometraje;
    private boolean cuatroXcuatro;

    public Carro(){

    }

    public Carro(int numPuertas, String color, double kilometraje, boolean cuatroXcuatro) {
        this.numPuertas = numPuertas;
        this.color = color;
        this.kilometraje = kilometraje;
        this.cuatroXcuatro = cuatroXcuatro;
    }

    public Carro(int numPuertas, String color, double kilometraje) {
        this.numPuertas = numPuertas;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public Carro(int numPuertas, boolean cuatroXcuatro) {
        this.numPuertas = numPuertas;
        this.cuatroXcuatro = cuatroXcuatro;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isCuatroXcuatro() {
        return cuatroXcuatro;
    }

    public void setCuatroXcuatro(boolean cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }
}



/*
 * Atributos:
 * -public
 * -protected
 * -private
 * 
 * Nota: siempre usar atributos privados, para que solo la clase acceda a ellos.
 * 
 */