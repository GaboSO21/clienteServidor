/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.clase_1.controller;

import misClases.Carro;

/**
 *
 * @author GabrielPC
 */
public class Clase_1 {

    public static void main(String[] args) {
    
        Carro toyota = new Carro(4, true);
        Carro suzuki = new Carro(3, "Rojo", 88000, true);
        
        System.out.println("Numero de puertas toyota: " + toyota.getNumPuertas());
        System.out.println("Numero de puertas suzuki: " + suzuki.getNumPuertas());
    }
}
