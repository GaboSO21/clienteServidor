package clase9.redes;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(6431); //Registrar el puerto 5432
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        while (true)//Ejecutar el ciclo listen/accept constantemente
        {
            try {
                System.out.println("\nEsperando conexiones...");
                Socket s1 = server.accept();//Espera y se mantiene a la escucha de una conexión
                System.out.println("Cliente " + s1 + " conectado.");
                DataOutputStream salida = new DataOutputStream(s1.getOutputStream());
                salida.writeUTF("Hello"); //enviar un string
                salida.close();
                s1.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
