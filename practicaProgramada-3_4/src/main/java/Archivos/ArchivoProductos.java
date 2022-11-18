package Archivos;

import java.io.*;
import java.util.*;
import java.util.logging.*;

import Productos.*;

public class ArchivoProductos {
    public void EscribirEnArchivo(Productos producto) {
        try {
            ArrayList<Productos> productos = LeerDatosDeArchivo();
            productos.add(producto);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("productos.txt"));
            for (Productos prod : productos) {
                os.writeObject(prod);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Productos> LeerDatosDeArchivo() {
        ArrayList<Productos> datos = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("productos.txt"));
            Productos producto = null;
            producto = (Productos) s.readObject();
            while (producto != null) {
                datos.add(producto);
                producto = (Productos) s.readObject();
            }
            s.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ArchivoMarcas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return datos;
    }

    public void clearFile() {
        try {
            FileWriter fw = new FileWriter("productos.txt", false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception exception) {
            System.out.println("Exception have been caught");
        }
    }
}
