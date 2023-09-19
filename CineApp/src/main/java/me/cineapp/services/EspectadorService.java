/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.cineapp.services;

import java.util.ArrayList;
import me.cineapp.entities.Espectador;

/**
 *
 * @author idmig
 */
public class EspectadorService {

    public static ArrayList<Espectador> generadorEspectadores() {
        ArrayList<Espectador> espectadores = new ArrayList<>();

        for (int i = 1; i < 61; i++) {
            espectadores.add(new Espectador(Integer.toString(i), (int) (Math.random() * 70), (Math.random() * 1000)));
        }

        return espectadores;
    }

}
