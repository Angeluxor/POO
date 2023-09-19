/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.tiendaelectrodomesticos.services;

import java.util.Scanner;
import me.tiendaelectrodomesticos.entities.Lavadora;

/**
 *
 * @author idmig
 */
public class LavadoraService extends ElectrodomesticoService {

    public static void crearLavadora(Lavadora lavadora) {
        Scanner scann = new Scanner(System.in);
        crearElectrodomestico(lavadora);
        System.out.println("Por favor ingrese la carga de la lavadora:");
        lavadora.setCarga(scann.nextInt());
    }

    public static void precioFinal(Lavadora lavadora) {
        int precioFin = ElectrodomesticoService.precioFinal(lavadora);
        if (lavadora.getCarga() >= 30) {
            precioFin += 500;
        }
        lavadora.setPrecio(precioFin);
    }
    

}
