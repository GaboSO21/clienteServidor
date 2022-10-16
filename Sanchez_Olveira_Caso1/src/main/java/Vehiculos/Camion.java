package Vehiculos;

public class Camion extends Vehiculos {

    private double tonelaje;

    public Camion(){}

    public Camion(String numPlaca, String color, String marca, String cedulaEncargado, double tonelaje) {
        super(numPlaca, color, marca, cedulaEncargado);
        this.tonelaje = tonelaje;
    }

    public double getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(double tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public int cobroParqueo(int horas, double tonelaje) {
        return (horas * (150 * (int) tonelaje));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append(", Tipo=").append("Camion");
        sb.append(", Tonelaje=").append(tonelaje);
        sb.append(", numPlaca=").append(numPlaca);
        sb.append(", color=").append(color);
        sb.append(", marca=").append(marca);
        sb.append(", cedulaEncargado=").append(cedulaEncargado);
        sb.append('}');
        return sb.toString();
    }

}
