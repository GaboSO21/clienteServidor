package SQL;

import java.util.ArrayList;
import java.util.List;

import Admin.Administrador;

public class Prueba {
    
    public static void main(String[] args) {
        SQLAdmin admins = new SQLAdmin();
        List<Administrador> administradores = admins.seleccionar();

        admins.insertar(new Administrador(null, null));



    }

}
