package sc303.manejodearchivos;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {

    public void EscribirEnArchivo(ArrayList<Persona> personas) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("datos.txt"));
            for (Persona persona : personas) {
                os.writeObject(persona);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Persona> LeerDatosDeArchivo() throws IOException {
        ArrayList<Persona> datos = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("datos.txt"));

            Persona persona = null;
            persona = (Persona) s.readObject();
            while (persona != null) {
                datos.add(persona);
                persona = (Persona) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(datos);
        }
        return datos;
    }
}
