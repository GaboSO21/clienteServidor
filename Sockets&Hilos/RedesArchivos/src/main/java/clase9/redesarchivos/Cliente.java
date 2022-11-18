package clase9.redesarchivos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Cliente {

    public static void main(String[] args) throws IOException {
        Socket s1 = null;

        // Llenamos el objeto a enviar
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(305140178, "A1", "Prueba"));
        personas.add(new Persona(303510295, "A2", "Prueba"));
        personas.add(new Persona(303860950, "A3", "Prueba"));
        System.out.println("Datos a enviar= " + personas);

        try {
            s1 = new Socket("127.0.0.1", 5432);// Abrir la conexion con el servidor y el pueto 5432
            System.out.println("Conectado!");
            ObjectOutputStream dos = new ObjectOutputStream(s1.getOutputStream());
            // Crera un ObjectOutputStream y le envia como parametro el OutputStream del
            // socket
            // de esta manera podemos enviar un objeto a traves del mismo

            dos.writeObject(personas);
            System.out.println("Enviando objeto al servidor...");

            dos.close();
            s1.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
