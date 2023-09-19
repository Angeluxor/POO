/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.cineapp.services;

import java.util.ArrayList;
import me.cineapp.entities.Espectador;
import me.cineapp.entities.Sala;

/**
 *
 * @author idmig
 */
public class SalaService {

    public static void generadorMapa(Sala sala) {

        String[][] mapa = sala.getMapaSala();
        String letra;

        for (int i = 0; i < mapa.length; i++) {
            for (int j = mapa[i].length - 1; j >= 0; j--) {
                switch (j) {
                    case 0:
                        letra = "A";
                        break;
                    case 1:
                        letra = "B";
                        break;
                    case 2:
                        letra = "C";
                        break;
                    case 3:
                        letra = "D";
                        break;
                    case 4:
                        letra = "E";
                        break;
                    case 5:
                        letra = "F";
                        break;
                    default:
                        throw new AssertionError();
                }

                if (sala.getEspectadores()[i][j] == null) {
                    mapa[i][j] = (i + 1) + "|" + letra + "|" + "  ";
                } else {
                    mapa[i][j] = (i + 1) + "|" + letra + "|" + "X ";
                }

            }
        }

        sala.setMapaSala(mapa);

    }

    public static void generadorEspectadores(Sala sala) {
        Espectador[][] espectadores = sala.getEspectadores();
        ArrayList<Espectador> listaEspectadores = EspectadorService.generadorEspectadores();
        int k = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (k < listaEspectadores.size()) {
                    Espectador espectador = listaEspectadores.get(k);
                    if (espectador.getEdad() > sala.getPelicula().getEdadMinima() && espectador.getDineroDisponible() > sala.getPrecioEntrada()) {
                        espectadores[i][j] = espectador;                        
                        k++;
                    } else {                        
                        k++;
                        j--;
                    }
                }
            }
        }

        sala.setEspectadores(espectadores);
    }

    public static void imprimirMapaSala(Sala sala) {
        String[][] mapa = sala.getMapaSala();

        for (String[] fila : mapa) {
            System.out.println("");
            for (String elementoActual : fila) {
                System.out.print(elementoActual);
            }

        }
    }

}
