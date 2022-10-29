package Persona;

public class Profesor extends Persona {

    private String correo;
    private double salario;

    public Profesor(String nombre, String apellido, String cedula, boolean actividad, String correo, double salario) {
        super(nombre, apellido, cedula, actividad);
        this.correo = correo;
        this.salario = salario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
