package Almuerzos;

import java.io.Serializable;
import java.text.*;
import java.util.*;

import Persona.*;

public class Almuerzos implements Serializable{

    private ArrayList<Persona> estudiantes;
    private Date fecha;

    public Almuerzos() {

    }

    public Almuerzos(String fecha) {
        estudiantes = new ArrayList<>();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.fecha = formatoFecha.parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Almuerzos(ArrayList<Persona> estudiantes, String fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        this.estudiantes = estudiantes;
        try {
            this.fecha = formatoFecha.parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Persona> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Persona> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Almuerzos [estudiantes=" + estudiantes + ", fecha=" + fecha + "]";
    }

}
