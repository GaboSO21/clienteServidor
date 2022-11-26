package main;

import java.sql.Connection;
import java.sql.SQLException;



public class TestManejoPersonas {
    public static void main(String[] args) {
        // Connection conexion = null;
        // try {
        //     conexion = Conexion.getConnection();
        //     // Para evitar que se haga autocommit automaticamente
        //     if (conexion.getAutoCommit()) {
        //         conexion.setAutoCommit(false);
        //     }

        //     // Transaccion, se ejecutan varias sentencias y luego se realiza el commit.
        //     PersonaDAO personaDao = new PersonaDAO(conexion);

        //     Persona updatePersona = new Persona();
        //     updatePersona.setIdPersona(2);
        //     updatePersona.setNombre("Gabriel");
        //     updatePersona.setApellido("Sanchez Olveira");
        //     updatePersona.setEmail("gso2090@gmail.com");
        //     personaDao.actualizar(updatePersona);

        //     Persona nuevaPersona = new Persona();
        //     nuevaPersona.setNombre("Juanito Luis");
        //     nuevaPersona.setApellido("Penegildollllllll");
        //     personaDao.insertar(nuevaPersona);

        //     conexion.commit();
        //     System.out.println("Commit succesfull.");
        // } catch (SQLException e) {
        //     e.printStackTrace();
        //     System.out.println("Rollback.");
        //     try {
        //         conexion.rollback();
        //     } catch (SQLException e1) {
        //         e1.printStackTrace();
        //     }
        // }

    }
}
