/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import Hilo.Hilo;

/**
 *
 * @author GabrielPC
 */
public class EjercicioHilos {

    public static void main(String[] args) {
        
        Hilo hilo = new Hilo("Hilo#1", 1000);
        Hilo hilo2 = new Hilo("Hilo#2", 500);
        
        hilo.start();
        try {
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo2.start();

        System.out.println("Esta vivo? " + hilo.getName() + " =" + hilo.isAlive());
        System.out.println("Esta vivo? " + hilo2.getName() + " =" + hilo2.isAlive());

    }
}
