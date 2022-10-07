package com.clase_2;

public class Toyota extends Carro {

    private String version;
    private int caballoFuerza;

    public Toyota(int puertas, String color, String modelo, String version, int caballoFuerza) {
        super(puertas, color, modelo);
        this.version = version;
        this.caballoFuerza = caballoFuerza;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getCaballoFuerza() {
        return this.caballoFuerza;
    }

    public void setCaballoFuerza(int caballoFuerza) {
        this.caballoFuerza = caballoFuerza;
    }

    // Polimorfismo, metodos de la clase padre se sobrescriben para darles otra
    // forma.
    @Override
    public String traccion(boolean traccion) {
        if (traccion) {
            return "Es 4x4";
        } else {
            return "NO es 4x4";
        }
    }

    @Override
    public String toString() {
        return "Toyota [version=" + version + super.toString() + ", caballoFuerza=" + caballoFuerza + "]";
    }

}
