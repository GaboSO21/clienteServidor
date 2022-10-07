package com.clase_2;

public class Carro {
    
    protected int puertas;
    protected String color;
    protected String modelo;

    public Carro(){

    }

    public Carro(int puertas, String color, String modelo) {
        this.puertas = puertas;
        this.color = color;
        this.modelo = modelo;
    }

    public int getPuertas() {
        return this.puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Sobre carga de metodos, metodos de igual nombre, diferentes parametros.

    public String traccion(boolean traccion){
        return "traccion";
    }

    public String traccion(String opcion){
        return "traccion";
    }

    @Override
    public String toString() {
        return "Carro [puertas=" + puertas + ", color=" + color + ", modelo=" + modelo + "]";
    }

}
