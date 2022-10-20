package losPollitos;

import Dialogo.Dialogo;
import Productos.*;

public class Mercado {

    private static Productos[] productos = new Productos[15];
    private static String[] marcas = new String[5];

    public void registro() {
        try {

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
        } catch (NumberFormatException e) {
            Dialogo.Mostrar("Opcion invalida.", "Error", 0);
            registro();
        }

    }

    public void registrarVenta() {
        int op = Integer.parseInt(Dialogo.Capturar("Tipos:\n[1].Verduras\n[2].Abarrotes", "Venta", 1));
        switch (op) {
            case 1:
                String tipo = "Verdura", marca = seleccionarMarca(), info = "Seleccione un producto:\n",
                        factura = "Productos seleccionados:\n";
                int cont = 0;
                double precioFinal = 0;
                for (int i = 0; i < 15; i++) {
                    Productos[] compras = new Productos[15];
                    for (int j = 0; j < productos.length; j++) {
                        if (productos[j] != null && productos[j].getTipo() == tipo
                                && productos[j].getMarca() == marca) {
                            info += "[" + (cont + 1) + "]."
                                    + productos[j].getNombre() + " - marca: " + productos[j].getMarca() + "- tipo: "
                                    + productos[j].getTipo() + " - precioXkg: " + productos[j].getPrecio() + "\n";
                            compras[cont] = productos[j];
                            cont++;
                        }
                    }

                    op = Integer.parseInt(Dialogo.Capturar(info + "\n[0].Finalizar compra", "Seleccion", 3));
                    if (op == 0) {
                        break;
                    } else {
                        if (compras[op - 1] != null) {
                            Verdura verdura = new Verdura();
                            verdura = (Verdura) compras[op - 1];
                            double gramos = Double
                                    .parseDouble(Dialogo.Capturar("Cuantos gramos desea: ", "Seleccion", 3));
                            double total = verdura.calcularPrecio(gramos);
                            factura += "[" + (i + 1) + "]" + "Nombre: " + compras[op - 1].getNombre() + " - marca: "
                                    + compras[op - 1].getMarca() + "- tipo: "
                                    + compras[op - 1].getTipo() + " - precioXkg: "
                                    + compras[op - 1].getPrecio() + "- gramos: "
                                    + gramos + "- precio final: " + total + "\n";
                            info = "Seleccione un producto:\n";
                            cont = 0;
                            precioFinal += verdura.calcularPrecio(gramos);
                        }
                    }
                }
                Dialogo.Mostrar(factura + "\n----------------\nPrecio final: " + precioFinal, "Factura", 1);
                break;
            case 2:
                tipo = "Abarrote";
                marca = seleccionarMarca();
                info = "Seleccione un producto:\n";
                factura = "Productos seleccionados:\n";
                cont = 0;
                precioFinal = 0;
                for (int i = 0; i < 15; i++) {
                    Productos[] compras = new Productos[15];
                    for (int j = 0; j < productos.length; j++) {
                        if (productos[j] != null && productos[j].getTipo() == tipo
                                && productos[j].getMarca() == marca) {
                            info += "[" + (cont + 1) + "]."
                                    + productos[j].getNombre() + " - marca: " + productos[j].getMarca() + "- tipo: "
                                    + productos[j].getTipo() + " - precioXunidad: " + productos[j].getPrecio() + "\n";
                            compras[cont] = productos[j];
                            cont++;
                        }
                    }

                    op = Integer.parseInt(Dialogo.Capturar(info + "\n[0].Finalizar compra", "Seleccion", 3));
                    if (op == 0) {
                        break;
                    } else {
                        if (compras[op - 1] != null) {
                            Abarrote verdura = new Abarrote();
                            verdura = (Abarrote) compras[op - 1];
                            double gramos = Double
                                    .parseDouble(Dialogo.Capturar("Cuantas unidades desea: ", "Seleccion", 3));
                            double total = verdura.calcularPrecio(gramos);
                            factura += "[" + (i + 1) + "]" + "Nombre: " + compras[op - 1].getNombre() + " - marca: "
                                    + compras[op - 1].getMarca() + "- tipo: "
                                    + compras[op - 1].getTipo() + " - precioXunidad: "
                                    + compras[op - 1].getPrecio() + "- gramos: "
                                    + gramos + "- precio final: " + total + "\n";
                            info = "Seleccione un producto:\n";
                            cont = 0;
                            precioFinal += verdura.calcularPrecio(gramos);
                        }
                    }
                }
                Dialogo.Mostrar(factura + "\n----------------\nPrecio final: " + precioFinal, "Factura", 1);
                break;
            default:
                Dialogo.Mostrar("Opcion invalida.", "Error", 0);
        }
    }

    public void registrarProducto() {
        int op = Integer.parseInt(Dialogo.Capturar("Tipos:\n[1].Verduras\n[2].Abarrotes", "Productos", 1));
        switch (op) {
            case 1:
                Productos verdura = new Verdura(Dialogo.Capturar("Ingrese el nombre de la verdura:", "Verdura", 3),
                        seleccionarMarca(),
                        Integer.parseInt(Dialogo.Capturar("Ingrese el precio de la verdura: ", "Verduras", 3)));
                boolean agregado = false;
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i] == null) {
                        Dialogo.Mostrar("Producto registrado.", "Error", 1);
                        productos[i] = verdura;
                        agregado = true;
                        break;
                    }
                }
                if (!agregado) {
                    Dialogo.Mostrar("Capacidad maxima de productos alcanzada.", "Marca", 0);
                }
                break;
            case 2:
                Productos abarrote = new Abarrote(Dialogo.Capturar("Ingrese el nombre del abarrote:", "Abarrote", 3),
                        seleccionarMarca(),
                        Integer.parseInt(Dialogo.Capturar("Ingrese el precio del abarrote: ", "Abarrote", 3)));
                agregado = false;
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i] == null) {
                        productos[i] = abarrote;
                        agregado = true;
                        break;
                    }
                }
                if (!agregado) {
                    Dialogo.Mostrar("Capacidad maxima de productos alcanzada.", "Marca", 0);
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
        boolean agregado = false;
        for (int i = 0; i < marcas.length; i++) {
            agregado = false;
            if (marcas[i] == null) {
                String op = Dialogo.Capturar("Ingrese una marca a registrar: ", "Marcas", 3);
                if (buscarMarca(op)) {
                    Dialogo.Mostrar("La marca ya se encuentra registrada.", "Marca", 0);
                    break;
                } else {
                    marcas[i] = op;
                    agregado = true;
                    Dialogo.Mostrar("Marca registrada con exito.", "Marca", 1);
                    break;
                }

            }
        }
        if (!agregado) {
            Dialogo.Mostrar("Capacidad maxima de marcas alcanzada.", "Marca", 0);
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

}
