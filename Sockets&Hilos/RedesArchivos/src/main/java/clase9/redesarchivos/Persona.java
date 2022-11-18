
package clase9.redesarchivos;

import java.io.Serializable;

public class Persona implements Serializable {
    private int ced;
    private String nombre;
    private String provincia;

    public Persona() {
    }

    public Persona(int ced, String nombre, String provincia) {
        this.ced = ced;
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Persona{" + "ced=" + ced + ", nombre=" + nombre + ", provincia=" + provincia + '}';
    }
}
