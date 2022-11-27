package Persona;

import java.io.Serializable;

public abstract class Persona implements Serializable {

    protected String nombre, apellido, cedula;
    protected boolean actividad;
    protected int idPersona;

    public Persona() {

    }

    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(String nombre, String apellido, String cedula, boolean actividad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.actividad = actividad;
    }

    public Persona(String nombre, String apellido, String cedula, boolean actividad, int idPersona) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.actividad = actividad;
        this.idPersona = idPersona;
    }

    public Persona(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public Persona(String nombre, String apellido, String cedula, int idPersona) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.idPersona = idPersona;
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

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

}
