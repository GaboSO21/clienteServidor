package Archivos;

import java.io.*;
import java.util.*;
import java.util.logging.*;


public class ArchivoMarcas {
    public void EscribirEnArchivo(String marca) {
        try {
            ArrayList<String> marcas = LeerDatosDeArchivo();
            marcas.add(marca);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("marcas.txt"));
            for (String marc : marcas) {
                os.writeObject(marc);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<String> LeerDatosDeArchivo() {
        ArrayList<String> datos = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("marcas.txt"));
            String marca = null;
            marca = (String) s.readObject();
            while (marca != null) {
                datos.add(marca);
                marca = (String) s.readObject();
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
            FileWriter fw = new FileWriter("marcas.txt", false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception exception) {
            System.out.println("Exception have been caught");
        }
    }

}
