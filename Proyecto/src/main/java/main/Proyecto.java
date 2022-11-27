package main;

import Menu.MenuPrincipal;
import ModuloEnvio.Cliente;


public class Proyecto { 
    public static void main(String[] args) {
        MenuPrincipal programa = new MenuPrincipal();
        programa.setVisible(true);  
        programa.setLocationRelativeTo(null);  

        // Connection conexion = null;
        // try {
        //     conexion = Conexion.getConnection();
        //     // Para evitar que se haga autocommit automaticamente
        //     if (conexion.getAutoCommit()) {
        //         conexion.setAutoCommit(false);
        //     }
        //     SQLColaborador conexionSQL = new SQLColaborador(conexion);

        //     // List<Colaborador> personas = conexionSQL.select();
        //     // for (Colaborador colaborador : personas) {
        //     //     System.out.println("Persona DTO: " + colaborador.toString());
        //     // }
        //     conexionSQL.insert(new Colaborador("Pedro", "Sanchez", "3031", 21, Date.valueOf("2022-10-01") ));

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