package Menu;

import Dialogo.Dialogo;

public class Menu {

    private int op;

    public void mostrar() {

        op = Integer.parseInt(Dialogo.Capturar("-[Los Pollitos]-\n" +
                "[1].Registro\n" +
                "[2].Registrar una venta\n" +
                "[3].Salir del sistema", "Menu", 1));
        switch (op) {
            case 1:
                
                mostrar();
                break;
            case 2:
                
                mostrar();
                break;
            case 3:
                break;
        }
    }

}
