package Persona;

public class Estudiante extends Persona {

    private boolean beca;
    private int grupo, edad;

    public Estudiante(String nombre, String apellido, String cedula, boolean actividad, boolean beca, int grupo, int edad) {
        super(nombre, apellido, cedula, actividad);
        this.beca = beca;
        this.grupo = grupo;
        this.edad = edad;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
