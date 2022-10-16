package Parqueo;

import Vehiculos.*;
import Dialogo.Dialogo;

public class Parqueo {

    public static Vehiculos[] vehiculos = new Vehiculos[10];

    public void ingresarDatos() {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] == null) {
                int op = Integer.parseInt(
                        Dialogo.Capturar("Tipo de vehiculo:" + "\n[1].Carro \n[2].Moto \n[3].Camion", "Parqueo", 1));
                switch (op) {
                    case 1:
                        Vehiculos carro = new Carro(Dialogo
                                .Capturar("Ingrese el numero de placa del vehiculo: ", "Numero de placa", 1),
                                Dialogo
                                        .Capturar("Ingrese el color del vehiculo: ", "Color", 1),
                                Dialogo
                                        .Capturar("Ingrese la marca del vehiculo: ", "Marca", 1),
                                Dialogo
                                        .Capturar("Ingrese la cedula del encargado del vehiculo: ", "Cedula", 1),
                                Dialogo
                                        .Capturar("Ingrese tamanno del carro: ", "Tamanno", 1));
                        vehiculos[i] = carro;
                        break;
                    case 2:
                        Vehiculos moto = new Moto(Dialogo
                                .Capturar("Ingrese el numero de placa del vehiculo: ", "Numero de placa", 1),
                                Dialogo
                                        .Capturar("Ingrese el color del vehiculo: ", "Color", 1),
                                Dialogo
                                        .Capturar("Ingrese la marca del vehiculo: ", "Marca", 1),
                                Dialogo
                                        .Capturar("Ingrese la cedula del encargado del vehiculo: ", "Cedula", 1),
                                Integer.parseInt(Dialogo.Capturar(
                                        "Ingrese el cilindraje de la moto: \n[1].150\n[2].250\n[3].500 ", "Cilindraje", 1)));
                        vehiculos[i] = moto;
                        break;
                    case 3:
                        Vehiculos camion = new Camion(Dialogo
                                .Capturar("Ingrese el numero de placa del vehiculo: ", "Numero de placa", 1),
                                Dialogo
                                        .Capturar("Ingrese el color del vehiculo: ", "Color", 1),
                                Dialogo
                                        .Capturar("Ingrese la marca del vehiculo: ", "Marca", 1),
                                Dialogo
                                        .Capturar("Ingrese la cedula del encargado del vehiculo: ", "Cedula", 1),
                                Double.parseDouble(Dialogo.Capturar("Ingrese el tonelaje del camion: ",
                                        "Tonelaje", 1)));
                        vehiculos[i] = camion;
                        break;
                }
                return;
            }
        }

        Dialogo.Mostrar("Parqueo lleno.", "Parqueo", 0);
    }

    public void registrarSalida() {
        String op = Dialogo.Capturar("Ingrese el numero de placa del vehiculo: ", "Registrar salida", 1);
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] instanceof Carro) {
                Carro carro = new Carro();
                carro = (Carro) vehiculos[i];
                if (carro.getNumPlaca().equals(op)) {
                    int horas = Integer.parseInt(
                            Dialogo.Capturar("Vehiculo encontrado!\nIngrese la horas que estuvo en el parqueo: ",
                                    "Registrar salida", 1));
                    Dialogo.Mostrar("Salida registrada exitosamente!\n Datos de vehiculo:\n" + carro.toString()
                            + "\nMonto final: " + carro.cobroParqueo(horas, carro.getTamanno()), "Registrar salida", 1);
                    vehiculos[i] = null;
                    ordenar();
                    return;
                }
            } else if (vehiculos[i] instanceof Moto) {
                Moto moto = new Moto();
                moto = (Moto) vehiculos[i];
                if (moto.getNumPlaca().equals(op)) {
                    int horas = Integer.parseInt(
                            Dialogo.Capturar("Vehiculo encontrado!\nIngrese la horas que estuvo en el parqueo: ",
                                    "Registrar salida", 1));
                    Dialogo.Mostrar("Salida registrada exitosamente!\n Datos de vehiculo:\n" + moto.toString()
                            + "\nMonto final: " + moto.cobroParqueo(horas, moto.getCilindraje()), "Registrar salida",
                            1);
                    vehiculos[i] = null;
                    ordenar();
                    return;
                }
            } else if (vehiculos[i] instanceof Camion) {
                Camion camion = new Camion();
                camion = (Camion) vehiculos[i];
                if (camion.getNumPlaca().equals(op)) {
                    int horas = Integer.parseInt(
                            Dialogo.Capturar("Vehiculo encontrado!\nIngrese la horas que estuvo en el parqueo: ",
                                    "Registrar salida", 1));
                    Dialogo.Mostrar("Salida registrada exitosamente!\n Datos de vehiculo:\n" + camion.toString()
                            + "\nMonto final: " + camion.cobroParqueo(horas, camion.getTonelaje()), "Registrar salida",
                            1);
                    vehiculos[i] = null;
                    ordenar();
                    return;
                }
            } 
        }

        Dialogo.Mostrar("Vehiculo no encontrado", "Error", 0);

    }

    public void ordenar() {
        for (int i = 0; i < vehiculos.length-1; i++) {
            if (vehiculos[i] == null && vehiculos[i + 1] != null) {
                vehiculos[i] = vehiculos[i + 1];
                i = 0;
            }
        }
    }

}
