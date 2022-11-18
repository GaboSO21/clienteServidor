package Archivos;

import java.io.*;
import java.util.*;
import java.util.logging.*;

import Productos.Venta;

public class ArchivoVentas {
    public void EscribirEnArchivo(Venta venta) {
        try {
            ArrayList<Venta> ventas = LeerDatosDeArchivo();
            ventas.add(venta);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("ventas.txt"));
            for (Venta v : ventas) {
                os.writeObject(v);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Venta> LeerDatosDeArchivo() {
        ArrayList<Venta> datos = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("ventas.txt"));
            Venta venta = null;
            venta = (Venta) s.readObject();
            while (venta != null) {
                datos.add(venta);
                venta = (Venta) s.readObject();
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
            FileWriter fw = new FileWriter("ventas.txt", false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception exception) {
            System.out.println("Exception have been caught");
        }
    }

}
