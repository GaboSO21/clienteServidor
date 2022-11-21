package Archivos;

import java.io.*;
import java.util.*;

import Almuerzos.Almuerzos;
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
            ex.printStackTrace();
        }
    }

    public void EscribirEnArchivo(Almuerzos almuerzo) {
        try {
            ArrayList<Almuerzos> almuerzos = LeerAlmuerzos();
            almuerzos.add(almuerzo);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("almuerzos.txt"));
            for (Almuerzos al : almuerzos) {
                os.writeObject(al);
            }
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Almuerzos> LeerAlmuerzos() {
        ArrayList<Almuerzos> datos = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("almuerzos.txt"));
            Almuerzos almuerzo = null;
            almuerzo = (Almuerzos) s.readObject();
            while (almuerzo != null) {
                datos.add(almuerzo);
                almuerzo = (Almuerzos) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println(datos);
        }
        return datos;
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
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
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
            exception.printStackTrace();
        }
    }

    public void clearAlmuerzos() {
        try {
            FileWriter fw = new FileWriter("almuerzos.txt", false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
