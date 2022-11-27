package Persona;

import java.sql.Date;

public class Colaborador extends Persona {

    private int horasTrabajadas;
    private Date fecha;

    public Colaborador() {

    }

    public Colaborador(String nombre, String apellido, String cedula, int horasTrabajadas, Date fecha) {
        super(nombre, apellido, cedula);
        this.horasTrabajadas = horasTrabajadas;
        this.fecha = fecha;
    }

    public Colaborador(String nombre, String apellido, String cedula, int idPersona,
            int horasTrabajadas, Date fecha) {
        super(nombre, apellido, cedula, idPersona);
        this.horasTrabajadas = horasTrabajadas;
        this.fecha = fecha;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = Date.valueOf(fecha);
    }

    @Override
    public String toString() {
        return "Colaborador [horasTrabajadas=" + horasTrabajadas + ", cedula=" + getCedula() + ", nombre= "
                + getNombre() + ", apellidos= " + getApellido() + ", id_Colaborador= " + getIdPersona() + "]";
    }

}
