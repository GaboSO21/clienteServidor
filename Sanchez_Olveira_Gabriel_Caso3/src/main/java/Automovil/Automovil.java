package Automovil;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class Automovil implements Serializable {

    private String marca, combustible, transmision, color, placa;
    private int modelo, velocidadMax, velocidadActual;

    public Automovil(String marca, String combustible, String transmision, String color, int modelo, int velocidadMax,
            String placa) {
        this.marca = marca;
        this.combustible = combustible;
        this.transmision = transmision;
        this.color = color;
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void acelerar() {
        if ((velocidadActual + 10) <= velocidadMax) {
            this.velocidadActual += 10;
        } else {
            JOptionPane.showMessageDialog(null, "Velocidad maxima alcanzada.", "Limite", 0);
            return;
        }
    }

    public void desacelerar() {
        if ((velocidadActual - 10) >= 0) {
            this.velocidadActual -= 10;
        } else {
            JOptionPane.showMessageDialog(null, "Velocidad minima alcanzada.", "Limite", 0);
            return;
        }
    }

    public void frenar() {
        this.velocidadActual = 0;
    }

    public int calculaTiempo(int km) {
        return km / velocidadActual;
    }

    @Override
    public String toString() {
        return "Automovil [marca=" + marca + ", combustible=" + combustible + ", transmision=" + transmision
                + ", color=" + color + ", placa=" + placa + ", modelo=" + modelo + ", velocidadMax=" + velocidadMax
                + ", velocidadActual=" + velocidadActual + "]";
    }

}
