package Persona;

public class Cocinero extends Persona {

    private double salario;

    public Cocinero(String nombre, String apellido, String cedula, boolean actividad, double salario) {
        super(nombre, apellido, cedula, actividad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
