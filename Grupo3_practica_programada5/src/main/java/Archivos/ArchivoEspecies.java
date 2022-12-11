package Archivos;

import java.io.*;
import java.util.*;

import Especie.Especies;


public class ArchivoEspecies {
    
    public void EscribirEnArchivo(Especies pez) {
        try {
            ArrayList<Especies> peces = LeerDatosDeArchivo();
            peces.add(pez);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("especies.txt"));
            for (Especies p : peces) {
                os.writeObject(p);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Especies> LeerDatosDeArchivo() {
        ArrayList<Especies> datos = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("especies.txt"));
            Especies pez = null;
            pez = (Especies) s.readObject();
            while (pez != null) {
                datos.add(pez);
                pez = (Especies) s.readObject();
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
            FileWriter fw = new FileWriter("especies.txt", false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception exception) {
            System.out.println("Exception have been caught");
        }
    }

}
