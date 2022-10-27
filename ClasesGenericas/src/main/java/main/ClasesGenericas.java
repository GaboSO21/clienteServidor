/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import genericos.claseGenerica;

/**
 *
 * @author GabrielPC
 */
public class ClasesGenericas {

    public static void main(String[] args) {
       
        claseGenerica<Integer> objetoInt = new claseGenerica<Integer>(15);
        objetoInt.obtenerTipo();

        claseGenerica<String> objetoString = new claseGenerica<String>("Juan");
        objetoString.obtenerTipo();

    }
}
