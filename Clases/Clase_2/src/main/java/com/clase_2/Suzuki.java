package com.clase_2;

public class Suzuki extends Carro {

    private int ventanas;

    public Suzuki(int puertas, String color, String modelo, int ventanas) {
        super(puertas, color, modelo);
        this.ventanas = ventanas;
    }

    public int getVentanas() {
        return this.ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    @Override
    public String traccion(boolean traccion) {
        if (traccion) {
            return "Es bueno";
        } else {
            return "Es malo";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Suzuki{");
        sb.append("ventanas=").append(ventanas);
        sb.append('}');
        return sb.toString();
    }

}
