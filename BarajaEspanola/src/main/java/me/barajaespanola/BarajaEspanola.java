/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.barajaespanola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import me.barajaespanola.entities.Carta;

/**
 *
 * @author idmig
 */
public class BarajaEspanola {

    private static ArrayList<Carta> baraja = new ArrayList<>();
    private static ArrayList<Carta> monton = new ArrayList<>();

    @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Elija una opción:");
            System.out.println("1. Iniciar nueva baraja");
            System.out.println("2. Mostrar baraja");
            System.out.println("3. Barajar");
            System.out.println("4. Siguiente carta");
            System.out.println("5. Dar cartas");
            System.out.println("6. Mostrar pila de descarte");
            System.out.println("7. Salir");
            switch (scann.nextInt()) {
                case 1:
                    crearBaraja();
                    break;
                case 2:
                    mostrarBaraja();
                    break;
                case 3:
                    barajar();
                    break;
                case 4:
                    siguienteCarta();
                    break;
                case 5:
                    System.out.println("Por favor ingrese el número de cartas que desea sacar");
                    darCartas(scann.nextInt());
                    break;
                case 6:
                    mostrarMonton();
                    break;
                case 7:
                    System.out.println("Hasta luego");
                    exit = true;
                default:
                    System.out.println("Opción inválida");
            }
        }

    }

    public static void crearBaraja() {

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    for (int j = 1; j < 13; j++) {
                        if (j != 8 && j != 9) {
                            baraja.add(new Carta(j, "Espadas"));
                        }
                    }
                    break;
                case 1:
                    for (int j = 1; j < 13; j++) {
                        if (j != 8 && j != 9) {
                            baraja.add(new Carta(j, "Bastos"));
                        }
                    }
                    break;
                case 2:
                    for (int j = 1; j < 13; j++) {
                        if (j != 8 && j != 9) {
                            baraja.add(new Carta(j, "Oros"));
                        }
                    }
                    break;
                case 3:
                    for (int j = 1; j < 13; j++) {
                        if (j != 8 && j != 9) {
                            baraja.add(new Carta(j, "Copas"));
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }

        }

    }

    public static void barajar() {
        Collections.shuffle(baraja);
    }

    public static void siguienteCarta() {
        if (!baraja.isEmpty()) {
            System.out.println(baraja.get(0));
            monton.add(baraja.get(0));
            baraja.remove(0);
        } else {
            System.out.println("No hay más cartas en la baraja");
        }
    }

    public static void cartasDisponibles() {
        baraja.size();
    }

    public static void darCartas(int cartasPedidas) {
        if (cartasPedidas < baraja.size()) {
            for (int i = 0; i < cartasPedidas; i++) {
                siguienteCarta();
            }
        } else {
            System.out.println("No hay cartas suficientes para esa acción");
        }

    }

    public static void mostrarMonton() {
        if (!monton.isEmpty()) {
            System.out.println(monton);
        } else {
            System.out.println("No hay cartas aún en el montón");
        }

    }

    public static void mostrarBaraja() {
        if (!baraja.isEmpty()) {
            System.out.println(baraja);
        } else {
            System.out.println("No hay cartas disponibles en la baraja");
        }
    }

    @Override
    public String toString() {
        return "BarajaEspanola:\n";
    }

}
