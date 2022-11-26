/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import datos.Conexion;
import datos.PersonaDAO;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;

/**
 *
 * @author melis-macbook
 */
public class CapasJDBC {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            // Para evitar que se haga autocommit automaticamente
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDAO personaDAO = new PersonaDaoJDBC(conexion);

            List<PersonaDTO> personas = personaDAO.select();
            for (PersonaDTO personaDTO : personas) {
                System.out.println("Persona DTO: " + personaDTO.toString());
            }

            conexion.commit();
            System.out.println("Commit succesfull.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Rollback.");
            try {
                conexion.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }

    }
}
