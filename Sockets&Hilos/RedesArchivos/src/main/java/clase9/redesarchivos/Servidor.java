package clase9.redesarchivos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor {

    public static void main(String[] args) throws ClassNotFoundException {
        ServerSocket s = null;
        ArrayList<Persona> datosDesdeCliente = new ArrayList<>();
        try {
            s = new ServerSocket(5432); // Registrar el puerto 5432
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        while (true)// Ejecutar el ciclo listen/accept constantemente
        {
            System.out.println("Servidor esperando conexiones...");
            try {
                Socket s1 = s.accept();// Espera y se mantiene a la escucha de una conexión
                System.out.println("Coneccion desde" + s1 + "!");
                ObjectInputStream dis = new ObjectInputStream(
                        s1.getInputStream());
                // Crear el ObjectInputStream y enviarle como parametro el InputStream desdde
                // El socket conectado para leer los datos del mismo
                datosDesdeCliente = (ArrayList<Persona>) dis.readObject();
                // Leyendo los objetos recibidos
                System.out.println("Datos obtenidos desde el cliente");
                System.out.println(datosDesdeCliente);
                dis.close();
                s1.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
