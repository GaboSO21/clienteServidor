package chat;

import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class hiloservidor extends Thread {

    private DataInputStream entrada;
    private DataOutputStream salida;
    private Servidor server;
    private Socket Cliente;
    public static ArrayList<hiloservidor> usuarioActivo = new ArrayList<>(); //atributo que almacena objetos de tipo hilo
    private String nombre;
    private ObjectOutputStream salidaObjeto;

    public hiloservidor(Socket socketcliente, String nombre, Servidor serv) throws Exception {
        this.Cliente = socketcliente;
        this.server = serv;
        this.nombre = nombre;
        usuarioActivo.add(this);
        for (int i = 0; i < usuarioActivo.size(); i++) {  //cuantos usuarios se encuentran activos
            usuarioActivo.get(i).envioMensaje(nombre + "Se a conectado. ");
        }
    }

    public void run() {
        String mensaje = " ";
        while (true) {
            try {
                entrada = new DataInputStream(Cliente.getInputStream());
                mensaje = entrada.readUTF();
                for (int i = 0; i < usuarioActivo.size(); i++) {
                    usuarioActivo.get(i).envioMensaje(mensaje);
                    server.mensajeria("Mensaje enviado");
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        usuarioActivo.remove(this);  //se define cuando el usuario se desconecto
        server.mensajeria("El usuario se ha desconectado");
        try {
            Cliente.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private void envioMensaje(String msg) throws Exception {
        salida = new DataOutputStream(Cliente.getOutputStream());
        salida.writeUTF(msg);  //envio mensaje
        DefaultListModel modelo = new DefaultListModel();

        for (int i = 0; i < usuarioActivo.size(); i++) {
            modelo.addElement(usuarioActivo.get(i).nombre);
        }
        salidaObjeto = new ObjectOutputStream(Cliente.getOutputStream());
        salidaObjeto.writeObject(modelo);
    }

}
