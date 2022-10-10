

package main;

import accesodatos.*;

public class Interfaces {

    public static void main(String[] args) {
        IaccesoDatos datos = new implementacionMySql();
        datos.actualizar();
    }
}
