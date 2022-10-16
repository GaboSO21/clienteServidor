package Vehiculos;

public class Moto extends Vehiculos {

    private int cilindraje;

    public Moto(){}

    public Moto(String numPlaca, String color, String marca, String cedulaEncargado, int cilindraje) {
        super(numPlaca, color, marca, cedulaEncargado);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public int cobroParqueo(int horas, int cilindraje) {
        int total = 0;
        switch (cilindraje) {
            case 125:
                total = horas * 500 + 300;
                break;
            case 250:
                total = horas * 600 + 300;
                break;
            case 500:
                total = horas * 750 + 300;
                break;
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append(", Tipo=").append("Moto");
        sb.append(", Cilindraje=").append(cilindraje);
        sb.append(", numPlaca=").append(numPlaca);
        sb.append(", color=").append(color);
        sb.append(", marca=").append(marca);
        sb.append(", cedulaEncargado=").append(cedulaEncargado);
        sb.append('}');
        return sb.toString();
    }

}
