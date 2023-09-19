/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.tiendaelectrodomesticos.services;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import me.tiendaelectrodomesticos.entities.Electrodomestico;

/**
 *
 * @author idmig
 */
public class ElectrodomesticoService {

    public static String comprobarConsumoEnergetico(String letra) {
        letra = letra.toUpperCase();
        String[] letras = {"A", "B", "C", "D", "E", "F"};
        List<String> categoriasValidas = Arrays.asList(letras);

        if (categoriasValidas.contains(letra)) {
            return letra;
        } else {
            return "F";
        }

    }

    public static String comprobarColor(String color) {
        color = color.toLowerCase();

        switch (color) {
            case "blanco":
                return color;
            case "negro":
                return color;
            case "rojo":
                return color;
            case "azul":
                return color;
            case "gris":
                return color;
            default:
                return "blanco";
        }

    }

    public static void crearElectrodomestico(Electrodomestico electrodomestico) {
        Scanner scann = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese el color del electrodoméstico");
        electrodomestico.setColor(comprobarColor(scann.nextLine()));
//        System.out.println("Por favor ingrese el precio del electrodoméstico");
//        electrodomestico.setPrecio(scann.nextInt());
        System.out.println("Por favor ingrese el consumo energético del electrodoméstico");
        electrodomestico.setConsumoEnergetico(comprobarConsumoEnergetico(scann.nextLine()));
        System.out.println("Por favor ingrese el peso del electrodoméstico");
        electrodomestico.setPesoKilos(scann.nextInt());
    }

    public static int precioFinal(Electrodomestico electrodomestico) {
        int precio = 1000;
        int auxPeso = electrodomestico.getPesoKilos();

        switch (electrodomestico.getConsumoEnergetico()) {
            case "A":
                precio += 1000;
                break;
            case "B":
                precio += 800;
                break;
            case "C":
                precio += 600;
                break;
            case "D":
                precio += 500;
                break;
            case "E":
                precio += 300;
                break;
            case "F":
                precio += 100;
                break;
        }

        if (auxPeso < 20 && auxPeso > 0) {
            precio += 100;
        } else if (auxPeso >= 20 && auxPeso < 50) {
            precio += 500;
        } else if (auxPeso >= 50 && auxPeso < 80) {
            precio += 800;
        } else if (auxPeso >= 80) {
            precio += 1000;
        } else {
            System.out.println("no válido");
        }

        return precio;
    }

}
