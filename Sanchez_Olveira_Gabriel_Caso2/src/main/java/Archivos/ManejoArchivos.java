package Archivos;

import java.io.*;
import java.util.*;

import Libros.Libro;

public class ManejoArchivos {

    public void EscribirEnArchivo(Libro libro) {
        try {
            ArrayList<Libro> libros = LeerDatosDeArchivo();
            libros.add(libro);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("libros.txt"));
            for (Libro lib : libros) {
                os.writeObject(lib);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Libro> LeerDatosDeArchivo() {
        ArrayList<Libro> datos = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("libros.txt"));
            Libro libro = null;
            libro = (Libro) s.readObject();
            while (libro != null) {
                datos.add(libro);
                libro = (Libro) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println(datos);
        }
        return datos;
    }

    public void BorrarDatos() {
        try {
            FileWriter fw = new FileWriter("libros.txt", false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception exception) {
            System.out.println("Exception have been caught");
        }
    }
}
