/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.ahorcado;

import java.util.Scanner;
import me.ahorcado.entities.AhorcadoEnt;
import me.ahorcado.services.AhorcadoServ;

/**
 *
 * @author idmig
 */
public class Ahorcado {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("¿Desea iniciar un nuevo juego? S/N");
        String respuesta = scann.nextLine().toUpperCase();
        while (respuesta.equals("S")) {
            AhorcadoEnt newGame = AhorcadoServ.crearJuego();
            AhorcadoServ.juego(newGame);
            System.out.println("¿Desea iniciar un nuevo juego? S/N");
            respuesta = scann.nextLine().toUpperCase();
        }
    }
}
