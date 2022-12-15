package main;

import ModuloEnvio.*;

public class clienteMain {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        cliente.run();
    }
}
