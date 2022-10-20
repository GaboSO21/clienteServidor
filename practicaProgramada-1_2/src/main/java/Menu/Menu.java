package Menu;

import Dialogo.Dialogo;
import losPollitos.Mercado;

public class Menu {

    private int op;
    private Mercado mercado = new Mercado();

    public void mostrar() {
        try {
            op = Integer.parseInt(Dialogo.Capturar("-[Los Pollitos]-\n" +
                    "[1].Registro\n" +
                    "[2].Registrar una venta\n" +
                    "[3].Salir del sistema", "Menu", 1));
            switch (op) {
                case 1:
                    mercado.registro();
                    mostrar();
                    break;
                case 2:
                    mercado.registrarVenta();
                    mostrar();
                    break;
                case 3:
                    break;
            
            }
        } catch (NumberFormatException e) {
            Dialogo.Mostrar("Ingrese una opcion valida.", "Marca", 0);
            mostrar();
        }
            
    }
}


