package Persona;

public class Estudiante extends Persona {

    private boolean beca;
    private int grupo;

    public Estudiante(String nombre, String apellido, String cedula, boolean actividad, boolean beca, int grupo) {
        super(nombre, apellido, cedula, actividad);
        this.beca = beca;
        this.grupo = grupo;
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

}
