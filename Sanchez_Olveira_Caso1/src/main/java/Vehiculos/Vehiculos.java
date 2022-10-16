package Vehiculos;

public class Vehiculos {

    protected String numPlaca;
    protected String color;
    protected String marca;
    protected String cedulaEncargado;

    // Constructor vacio
    public Vehiculos() {

    }

    // Constructor con todos los atributos
    public Vehiculos(String numPlaca, String color, String marca, String cedulaEncargado) {
        this.numPlaca = numPlaca;
        this.color = color;
        this.marca = marca;
        this.cedulaEncargado = cedulaEncargado;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCedulaEncargado() {
        return cedulaEncargado;
    }

    public void setCedulaEncargado(String cedulaEncargado) {
        this.cedulaEncargado = cedulaEncargado;
    }

    // Sobrecarga de metodos
    public int cobroParqueo(int horas, String tamanno) {

        return 0;
    }

    public int cobroParqueo(int horas, int cilindraje) {

        return 0;
    }

    public int cobroParqueo(int horas, double tonelaje) {

        return 0;
    }

}
