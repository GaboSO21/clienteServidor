/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.net.Socket;
import java.io.DataInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;

public class hilocliente extends Thread {

    private Socket SocketCliente;
    private DataInputStream entrada;
    private Cliente cliente;
    private ObjectInputStream entradaobjeto;

    public hilocliente(Socket SocketCliente, Cliente cliente) {
        this.SocketCliente = SocketCliente;
        this.cliente = cliente;
    }

    public void run() {
        while (true) {
            try {
                entrada = new DataInputStream(SocketCliente.getInputStream());
                cliente.mensajeria(entrada.readUTF());
                entradaobjeto = new ObjectInputStream(SocketCliente.getInputStream());
                cliente.actualizarLista((DefaultListModel) entradaobjeto.readObject());
            } catch (ClassNotFoundException | IOException ex) {
                Logger.getLogger(hilocliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
