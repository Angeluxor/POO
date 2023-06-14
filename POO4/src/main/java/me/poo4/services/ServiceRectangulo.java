/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.poo4.services;

import java.util.Scanner;
import me.poo4.entities.Rectangulo;

/**
 *
 * @author idmig
 */
public class ServiceRectangulo {

    public static Rectangulo crearRectangulo() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Por favor ingrese la base del rectángulo");
        double base = scann.nextDouble();
        System.out.println("Por favor ingrese la altura del rectángulo");
        double altura = scann.nextDouble();

        return new Rectangulo(base, altura);

    }

    public static double superficie(Rectangulo rectangulo) {
        return (rectangulo.getBase() * rectangulo.getAltura());
    }

    public static double perimetro(Rectangulo rectangulo) {
        return ((rectangulo.getBase() + rectangulo.getAltura()) * 2);
    }

    public static void dibujar(Rectangulo rectangulo) {
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            System.out.println("");
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i == 0 || i == rectangulo.getAltura() - 1 || j == 0 || j == rectangulo.getBase()-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
        }

    }

}
