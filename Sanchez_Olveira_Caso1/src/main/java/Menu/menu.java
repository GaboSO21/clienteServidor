package Menu;

import Dialogo.Dialogo;
import Parqueo.Parqueo;

public class menu {

    private int op;
    private Parqueo parqueo = new Parqueo();

    public void mostrar() {

        op = Integer.parseInt(Dialogo.Capturar("-[Parqueo publico San Jose]-\n" +
                "[1].Ingresar datos de un vehiculo\n" +
                "[2].Registrar salida de un vehiculo\n" +
                "[3].Salir del sistema", "Menu", 1));
        switch (op) {
            case 1:
                parqueo.ingresarDatos();
                mostrar();
                break;
            case 2:
                parqueo.registrarSalida();
                mostrar();
                break;
            case 3:
                break;
        }
    }
}
