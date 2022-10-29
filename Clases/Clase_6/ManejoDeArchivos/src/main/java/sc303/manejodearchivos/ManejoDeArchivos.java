package sc303.manejodearchivos;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ManejoDeArchivos {

    public static void main(String[] args) throws IOException {

        ManejoArchivos ma = new ManejoArchivos();
        ArrayList<Persona> personas = new ArrayList<>();
        String cedula;
        boolean band = true;
        while (band) {
            String opcion = JOptionPane.showInputDialog("--------------Menú----------------------\n1. Agregar usuario.\n2.Obtener lista de usuarios.\n3.Salir");
            switch (Integer.parseInt(opcion)) {
                case 1:
                    cedula = JOptionPane.showInputDialog("Digite el numero de cedula:");
                    String nombre = JOptionPane.showInputDialog("Digite el nombre:");
                    String provincia = JOptionPane.showInputDialog("Digite la provincia:");
                    personas.add(new Persona(Integer.parseInt(cedula), nombre, provincia));
                    ma.EscribirEnArchivo(personas);
                    break;
                case 2:
                    String menu = "-----------------Lista de personas-----------------\nCedula             Nombre         Provincia ";
                    ArrayList<Persona> personasLectura = ma.LeerDatosDeArchivo();
                    for (Persona persona : personasLectura) {
                        menu = menu + "\n" + persona.getCed() + "         " + persona.getNombre() + "         " + persona.getProvincia();
                    }
                    JOptionPane.showMessageDialog(null, menu);
                    break;
                case 3:
                    band = false;
                    break;
            }
        }
    }
}
