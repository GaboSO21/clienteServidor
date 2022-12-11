package Archivos;

import java.io.*;
import java.util.*;

import Automovil.Automovil;

public class ManejoArchivos {

    public void EscribirEnArchivo(Automovil carro) {
        try {
            ArrayList<Automovil> carros = LeerDatosDeArchivo();
            carros.add(carro);
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("carros.txt"));
            for (Automovil car : carros) {
                os.writeObject(car);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Automovil> LeerDatosDeArchivo() {
        ArrayList<Automovil> datos = new ArrayList<>();
        try {
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("carros.txt"));
            Automovil carro = null;
            carro = (Automovil) s.readObject();
            while (carro != null) {
                datos.add(carro);
                carro = (Automovil) s.readObject();
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
            FileWriter fw = new FileWriter("carros.txt", false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception exception) {
            System.out.println("Exception have been caught");
        }
    }
}
