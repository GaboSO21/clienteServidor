/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import java.sql.SQLInput;

import javax.swing.JOptionPane;

import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Triangulo;
import Figuras.figurasGeometricas;

/**
 *
 * @author GabrielPC
 */
public class Clase_3 {

    public static void main(String[] args) {

        figurasGeometricas circulo = new Circulo(
                Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el radio de su circulo: ")));

        figurasGeometricas triangulo = new Triangulo(
                Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base de su triangulo: ")),
                Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura de su triangulo: ")));

        figurasGeometricas cuadrado = new Cuadrado(
                Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el lado de su cuadrado: ")));

        JOptionPane.showMessageDialog(null, "Area de su circulo: " + circulo.calcularArea() +
                "\nPerimetro de su circulo: " + circulo.calcularPerimetro() +
                "\n------------------------" +
                "\nArea de su triangulo: " + triangulo.calcularArea() +
                "\nPerimetro de su triangulo: " + triangulo.calcularPerimetro() +
                "\n------------------------" +
                "\nArea de su cuadrado: " + cuadrado.calcularArea() +
                "\nPerimetro de su cuadrado: " + cuadrado.calcularPerimetro()

                , "Calculos", JOptionPane.INFORMATION_MESSAGE);

    }
}
