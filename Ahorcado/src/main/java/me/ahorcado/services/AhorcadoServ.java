/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.ahorcado.services;

import java.util.Arrays;
import java.util.Scanner;
import me.ahorcado.entities.AhorcadoEnt;

/**
 *
 * @author idmig
 */
public class AhorcadoServ {

    public static AhorcadoEnt crearJuego() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Por favor ingrese la palabra a buscar");
        String wordAux = scann.nextLine().toLowerCase();
        System.out.println("Por ingrese la cantidad máxima de intentos permitidos");
        int trysAux = scann.nextInt();
        String[] wordArrayAux = new String[wordAux.length()];

        for (int i = 0; i < wordAux.length(); i++) {
            wordArrayAux[i] = wordAux.substring(i, i + 1);
        }

        return new AhorcadoEnt(wordArrayAux, 0, trysAux);
    }

    public static void longitud(AhorcadoEnt ahorcado) {

        System.out.println("La longitud de la palabra es: " + ahorcado.getSearchedWord().length);

    }

    public static void buscar(AhorcadoEnt ahorcado, String inputLetter) {
        int contador = 0;

        for (String letterNow : ahorcado.getSearchedWord()) {

            if (letterNow.equals(inputLetter)) {
                ahorcado.setFindedLetters(ahorcado.getFindedLetters() + 1);
                contador++;
            }
        }

        if (contador == 0) {
            ahorcado.setMaxTrys(ahorcado.getMaxTrys() - 1);
            System.out.println("La letra: " + inputLetter + " NO se encontró en la palabra");
        } else {
            System.out.println("La letra: " + inputLetter + " se encontró " + contador + " veces");
        }

    }

    public static void encontradas(AhorcadoEnt ahorcado, String inputLetter) {

        buscar(ahorcado, inputLetter);

        System.out.println("Letras encontradas: " + ahorcado.getFindedLetters());
        System.out.println("Letras restantes: " + (ahorcado.getSearchedWord().length - ahorcado.getFindedLetters()));

    }

    public static void intentos(AhorcadoEnt ahorcado) {

        System.out.println("Número de intentos restantes: " + ahorcado.getMaxTrys());

    }

    public static void juego(AhorcadoEnt ahorcado) {
        Scanner scann = new Scanner(System.in);
        while (ahorcado.getMaxTrys() > 0 && (ahorcado.getSearchedWord().length - ahorcado.getFindedLetters()) > 0) {

            System.out.println("Por favor ingrese una letra para buscar en la palabra incognita");
            String letterAux = scann.nextLine().toLowerCase();
            longitud(ahorcado);
            encontradas(ahorcado, letterAux);
            intentos(ahorcado);

        }

        if (ahorcado.getMaxTrys() == 0) {
            System.out.println("Usted ha llegado al límite de intentos");
        } else {
            System.out.println("Ha encontrado todas las letras de la palabra");
            System.out.println("La palabra era: " + Arrays.toString(ahorcado.getSearchedWord()));
        }

    }

}
