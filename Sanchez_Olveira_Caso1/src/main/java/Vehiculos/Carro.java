package Vehiculos;

public class Carro extends Vehiculos {

    private String tamanno;

    public Carro(){}

    public Carro(String numPlaca, String color, String marca, String cedulaEncargado, String tamanno) {
        super(numPlaca, color, marca, cedulaEncargado);
        this.tamanno = tamanno;
    }

    public String getTamanno() {
        return tamanno;
    }

    public void setTamanno(String tamanno) {
        this.tamanno = tamanno;
    }

    @Override
    public int cobroParqueo(int horas, String tamanno) {
        int total = 0;
        switch (tamanno) {
            case "Pequenno":
                total = horas * 500;
                break;
            case "Mediano":
                total = horas * 650;
                break;
            case "Grande":
                total = horas * 900;
                break;
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append(", Tipo=").append("Carro");
        sb.append(", Tamanno=").append(tamanno);
        sb.append(", numPlaca=").append(numPlaca);
        sb.append(", color=").append(color);
        sb.append(", marca=").append(marca);
        sb.append(", cedulaEncargado=").append(cedulaEncargado);
        sb.append('}');
        return sb.toString();
    }

}
