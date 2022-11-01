package Archivos;

import java.io.*;
import java.util.*;
import java.util.logging.*;

import Persona.Persona;

public class ManejoDeArchivos {
    public void EscribirEnArchivo(Persona persona) {
        try {
            ArrayList<Persona> personas = LeerDatosDeArchivo();
            personas.add(persona);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("datos.txt"));
            for (Persona per : personas) {
                os.writeObject(per);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Persona> LeerDatosDeArchivo() {
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
            Logger.getLogger(ManejoDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(datos);
        }
        return datos;
    }

    public void clearFile() {
        try {
            FileWriter fw = new FileWriter("datos.txt", false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception exception) {
            System.out.println("Exception have been caught");
        }
    }

}
