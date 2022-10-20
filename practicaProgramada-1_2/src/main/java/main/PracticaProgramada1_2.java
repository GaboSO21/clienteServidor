/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import Menu.Menu;

/**
 *
 * @author GabrielPC
 */
public class PracticaProgramada1_2 {

    public static void main(String[] args) {
        Menu menu = new Menu();
        System.out.println(p());
        menu.mostrar();

    }
    public static int p(){
        return 300/1000*1500;
    }
}


