/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import java.util.*;

/**
 *
 * @author GabrielPC
 */
public class ApiColecciones {

    public static void main(String[] args) {

        // Si no se indica el tipo de dato, es Object predeterminado
        // Mas lento para iterar, pero guarda en orden segun se annada
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

        for (Object object : miLista) {
            System.out.println(object);
        }

        // Lambda, funciona igual que forEach de arriba
        // miLista.forEach(elemento -> {
        // System.out.println(elemento);
        // });

        // No se pueden duplicar elementos por el hashCode y el metodo equals ya
        // implementado.
        // Mas eficiente para buscar elementos, no guarda en orden agregado
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

        for (Object object : miSet) {
            System.out.println(object + "" + object.hashCode());
        }

        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");

        String elemento = (String) miMapa.get("valor1");
        System.out.println(elemento);
        System.out.println(miMapa.keySet());
        System.out.println(miMapa.values());
        System.out.println(miMapa);

    }
}
