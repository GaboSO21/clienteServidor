package Persona;

import java.io.Serializable;

public abstract class Persona implements Serializable {

    protected String nombre, apellido, cedula;
    protected boolean actividad;

    public Persona(String nombre, String apellido, String cedula, boolean actividad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.actividad = actividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isActividad() {
        return actividad;
    }

    public void setActividad(boolean actividad) {
        this.actividad = actividad;
    }

}
