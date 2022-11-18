package clase9.redes;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket s1 = null;
        try {
            s1 = new Socket("127.0.0.1", 6431);// Abrir la conexion con el servidor y el pueto 5432
            System.out.println("Conectando con el servidor...");
            DataInputStream entrada = new DataInputStream(s1.getInputStream());
            System.out.println("Mensaje recibido desde el servidor: "+entrada.readUTF());
            entrada.close();
            s1.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
