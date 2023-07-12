/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.pooextra4.services;

import java.util.Scanner;
import me.pooextra4.entities.NIF;

/**
 *
 * @author idmig
 */
public class NIFServices {

    public static NIF crearNif() {
        Scanner scann = new Scanner(System.in);

        System.out.println("Por favor ingrese el número de DNI");
        String dni = scann.nextLine();
        while (dni.length() < 8) {
            System.out.println("El número de DNI debe tener 8 dígitos");
            dni = scann.nextLine();
        }
        long dniAux = Long.parseLong(dni);

        return new NIF(dniAux, calcularNif(dniAux));
    }

    public static String calcularNif(long dni) {
        Character[] list = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int codigo = (int) dni % 23;
        return list[codigo].toString();
    }

    public static String mostrar(NIF nif) {

        return "" + nif.getDni() + "-" + nif.getNif().toUpperCase();

    }

}
