package main;

import static aritmetica.Aritmetica.division;

import Excepciones.OperacionExcepcion;;

public class ManejoExepciones {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);
        } catch (OperacionExcepcion ex) {
            System.out.println("Error tipo OperacionExcepcion.");
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println("Error tipo Excepcion:");
            e.printStackTrace();
        } finally {
            System.out.println("Division revisada.");
        }
        System.out.println(resultado);
    }
}
