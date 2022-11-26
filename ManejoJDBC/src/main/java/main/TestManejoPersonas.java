package main;

import java.util.List;

import datos.PersonaDAO;
import domain.Persona;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        List<Persona> personas =  personaDao.seleccionar();
        // System.out.println(personas);

        // Persona persona = new Persona("Juan", "Aguilar", "pa123@gmail.com", "88090909");
        // personaDao.insertar(persona);

        // personas =  personaDao.seleccionar();
        // System.out.println(personas);

        // Persona personaNueva = new Persona(3, "Gabriel", "Sanchez", "fabianlolastor@gmail.com", "87097070");
        // personaDao.actualizar(personaNueva);

        Persona persona2 = new Persona(12);
        personaDao.eliminar(persona2);




    }
}
