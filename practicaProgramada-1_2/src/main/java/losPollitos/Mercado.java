package losPollitos;

import Dialogo.Dialogo;
import Productos.*;

public class Mercado {

    private static Productos[] productos = new Productos[15];
    private static String[] marcas = new String[5];

    public void registro() {
        int op = Integer
                .parseInt(Dialogo.Capturar(
                        "Registro sub-menu:\n[1].Registrar nuevos productos\n[2].Registrar una marca\n[3].Volver",
                        "Sub-menu", 1));

        switch (op) {
            case 1:
                registrarProducto();
                break;
            case 2:
                registrarMarca();
                break;
            case 3:
                break;
            default:
                Dialogo.Mostrar("Opcion invalida.", "Error", 0);
        }

    }

    public void registrarVenta() {
        int op = Integer.parseInt(Dialogo.Capturar("Tipos:\n[1].Verduras\n[2].Abarrotes", "Venta", 1));
        switch (op) {
            case 1:
                String tipo = "Verdura", marca = seleccionarMarca(), info = "Seleccione un producto:\n",
                        factura = "Productos seleccionados:\n";
                int cont = 0;
                for (int i = 0; i < 15; i++) {
                    Productos[] compras = new Productos[15];
                    for (int j = 0; j < productos.length; j++) {
                        if (productos[j] != null && productos[j].getTipo() == tipo
                                && productos[j].getMarca() == marca) {
                            info += productos[j].getMarca() + ":\n[" + (cont + 1) + "]."
                                    + productos[j].getNombre() + " - marca: " + productos[j].getMarca() + "- tipo"
                                    + productos[j].getTipo() + " - precioXkg: " + productos[j].getPrecio() + "\n";
                            compras[cont] = productos[j];
                            cont++;
                        }
                    }
                    System.out.println(cont);
                    op = Integer.parseInt(Dialogo.Capturar(info + "\n[0].Finalizar compra", "Seleccion", 3));
                    if (op == 0) {
                        break;
                    } else {
                        if (compras[op - 1] != null) {
                            int gramos = Integer.parseInt(Dialogo.Capturar("Cuantos gramos desea: ", "Seleccion", 3));
                            System.out.println(cont);
                            factura += "[" + i + "]" + "Nombre: " + compras[op - 1].getNombre() + " - marca: "
                                    + compras[op - 1].getMarca() + "- tipo"
                                    + compras[op - 1].getTipo() + " - precioXkg: "
                                    + compras[op - 1].getPrecio() + "- gramos:"
                                    + op + "- precio final: " + compras[op - 1].calcularPrecio(gramos) + "\n";
                            info = "";
                        }
                    }
                }
                Dialogo.Mostrar(factura, "Factura", 1);
                break;
            case 2:
                seleccionProducto("Abarrote");
                break;
            default:
                Dialogo.Mostrar("Opcion invalida.", "Error", 0);
        }
    }

    public String seleccionProducto(String tipo) {
        int j = 0, op = 1;
        String factura = "Productos seleccionados:\n", marca = seleccionarMarca();
        Productos[] compras = new Productos[15];
        while (op != 0 || j != 15) {
            String info = "";
            for (int i = 0; i < productos.length; i++) {
                if (productos[i] != null) {
                    if (productos[i].getMarca() == marca && productos[i].getTipo() == tipo) {
                        if (i == 0) {
                            info += "Seleccione producto marca " + productos[i].getMarca() + ":\n[" + (i + 1) + "]."
                                    + productos[i].getNombre() + " - marca: " + productos[i].getMarca() + "- tipo"
                                    + productos[i].getTipo() + " - precioXkg: " + productos[i].getPrecio() + "\n";
                            compras[i] = productos[i];
                        } else {
                            info += ":\n[" + (i + 1) + "]." + productos[i].getNombre() + " - marca: "
                                    + productos[i].getMarca() + "- tipo" + productos[i].getTipo() + " - precioXkg: "
                                    + productos[i].getPrecio() + "\n";
                            compras[i] = productos[i];
                        }
                    }
                }
            }
            op = Integer.parseInt(Dialogo.Capturar(info + "\n[0].Finalizar compra", "Seleccion", 3));
            if (op != 0) {
                if (compras[op - 1] instanceof Verdura && compras[op - 1] != null) {
                    op = Integer.parseInt(Dialogo.Capturar("Cuantos gramos desea: ", "Seleccion", 3));
                    factura += "[" + j + "]" + "Nombre: " + compras[op - 1].getNombre() + " - marca: "
                            + compras[op - 1].getMarca() + "- tipo"
                            + compras[op - 1].getTipo() + " - precioXkg: "
                            + compras[op - 1].getPrecio() + "- gramos:"
                            + op + "- precio final: " + compras[op - 1].calcularPrecio(op) + "\n";
                    j++;

                } else {
                    if (compras[op - 1] != null) {
                        op = Integer.parseInt(Dialogo.Capturar("Cuantas unidades desea: ", "Seleccion", 3));
                        factura += "[" + j + "]" + "Nombre: " + compras[op - 1].getNombre() + " - marca: "
                                + compras[op - 1].getMarca() + "- tipo"
                                + compras[op - 1].getTipo() + " - precioXunidad: "
                                + compras[op - 1].getPrecio() + "- unidades:"
                                + op + "- precio final: " + compras[op - 1].calcularPrecio(op) + "\n";
                        j++;
                    }
                }
            } else {
                break;
            }
        }
        return factura;
    }

    public void registrarProducto() {
        int op = Integer.parseInt(Dialogo.Capturar("Tipos:\n[1].Verduras\n[2].Abarrotes", "Productos", 1));
        switch (op) {
            case 1:
                Productos verdura = new Verdura(Dialogo.Capturar("Ingrese el nombre de la verdura:", "Verdura", 3),
                        seleccionarMarca(),
                        Integer.parseInt(Dialogo.Capturar("Ingrese el precio de la verdura: ", "Verduras", 3)));
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i] == null) {
                        Dialogo.Mostrar("Producto registrado.", "Error", 1);
                        productos[i] = verdura;
                        break;
                    }
                }
                break;
            case 2:
                Productos abarrote = new Abarrote(Dialogo.Capturar("Ingrese el nombre del abarrote:", "Abarrote", 3),
                        seleccionarMarca(),
                        Integer.parseInt(Dialogo.Capturar("Ingrese el precio del abarrote: ", "Abarrote", 3)));
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i] == null) {
                        productos[i] = abarrote;
                        break;
                    }
                }
                break;
            default:
                Dialogo.Mostrar("Opcion invalida.", "Error", 0);
        }

    }

    public String seleccionarMarca() {
        String info = "Marcas disponibles:\n";
        for (int i = 0; i < marcas.length; i++) {
            if (marcas[i] != null) {
                info += "[" + (i + 1) + "]." + marcas[i] + "\n";
            }
        }
        int op = Integer.parseInt(Dialogo.Capturar(info, "Marcas", 1));
        switch (op) {
            case 1:
                return marcas[0];
            case 2:
                return marcas[1];
            case 3:
                return marcas[2];
            case 4:
                return marcas[3];
            case 5:
                return marcas[4];
        }

        return null;
    }

    public void registrarMarca() {
        for (int i = 0; i < marcas.length; i++) {
            if (marcas[i] == null) {
                String op = Dialogo.Capturar("Ingrese una marca a registrar: ", "Marcas", 3);
                if (buscarMarca(op)) {
                    Dialogo.Mostrar("La marca ya se encuentra registrada.", "Marca", 0);
                    break;
                } else {
                    marcas[i] = op;
                    Dialogo.Mostrar("Marca registrada con exito.", "Marca", 1);
                    break;
                }
            }
        }
    }

    public boolean buscarMarca(String marca) {
        for (int i = 0; i < marcas.length; i++) {
            if (marcas[i] != null) {
                if (marcas[i].trim().toLowerCase().equals(marca.trim().toLowerCase())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void imprimir() {
        for (int i = 0; i < marcas.length; i++) {
            System.out.println(marcas[i]);
        }
    }

    public void imprimir2() {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                System.out.println(productos[i].getNombre() + " - " + productos[i].getMarca());
            }
        }
    }

}
