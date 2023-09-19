/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.tiendaelectrodomesticos.services;

import java.util.Scanner;
import me.tiendaelectrodomesticos.entities.Televisor;
import static me.tiendaelectrodomesticos.services.ElectrodomesticoService.crearElectrodomestico;

/**
 *
 * @author idmig
 */
public class TelevisorService extends ElectrodomesticoService {

    public static void crearTv(Televisor televisor) {
        Scanner scann = new Scanner(System.in);
        crearElectrodomestico(televisor);
        System.out.println("Por favor ingrese la resolución:");
        televisor.setPulgadas(scann.nextInt());
        scann.nextLine();
        System.out.println("¿Tiene TDT? S/N");
        if (scann.nextLine().equalsIgnoreCase("s")) {
            televisor.setTDT(true);
        } else {
            televisor.setTDT(false);
        }
    }

    public static void precioFinal(Televisor televisor) {
        int precioFin = ElectrodomesticoService.precioFinal(televisor);
        if (televisor.getPulgadas() > 40) {
            precioFin = (int) (precioFin * 1.3);
        }
        if (televisor.isTDT()) {
            precioFin += 500;
        }

        televisor.setPrecio(precioFin);
    }

}
