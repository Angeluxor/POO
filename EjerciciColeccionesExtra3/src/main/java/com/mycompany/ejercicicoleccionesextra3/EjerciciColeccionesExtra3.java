/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicicoleccionesextra3;

import com.mycompany.ejercicicoleccionesextra3.entities.Libro;
import com.mycompany.ejercicicoleccionesextra3.services.ServicioLibro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author idmig
 */
public class EjerciciColeccionesExtra3 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in).useDelimiter("\n");
        ServicioLibro servicioLibro = new ServicioLibro();
        HashSet<Libro> conjuntoLibros = new HashSet<>();

        System.out.println("Bienvenido");
        servicioLibro.generarLibros(conjuntoLibros);
        boolean salida = true;

        while (salida) {
            System.out.println("Por favor elija una opción:\n1. Listar libros \n2. Prestar libro \n3. Devolver libro \n4. Salir");
            switch (scann.nextInt()) {
                case 1:
                    System.out.println(conjuntoLibros.toString());
                    break;
                case 2:
                    System.out.println("Por favor ingrese el nombre del libro que desea prestar");
                    servicioLibro.prestar(conjuntoLibros, scann.next());
                    break;
                case 3:
                    System.out.println("Por favor ingrese el nombre del libro que desea devolver");
                    servicioLibro.devolver(conjuntoLibros, scann.next());
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    salida = false;
                    break;
                default:
                    System.out.println("Opción inválida");;
            }
        }
    }
}
