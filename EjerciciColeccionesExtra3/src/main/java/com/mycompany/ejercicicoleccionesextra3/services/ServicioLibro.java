/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicicoleccionesextra3.services;

import com.mycompany.ejercicicoleccionesextra3.entities.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author idmig
 */
public class ServicioLibro {

    public Libro crearLibro() {
        Scanner scann = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Por favor ingrese el nombre el libro:");
        String tituloTemp = scann.nextLine();
        System.out.println("Por favor ingrese el nombre del autor:");
        String autorTemp = scann.next();
        System.out.println("Por favor ingrese el número de ejemplares:");
        int ejemplaresTemp = scann.nextInt();

        return new Libro(tituloTemp, autorTemp, ejemplaresTemp);
    }

    public void agregarLibro(HashSet<Libro> conjuntoLibros) {

        conjuntoLibros.add(crearLibro());

    }

    public void generarLibros(HashSet<Libro> conjuntoLibros) {
        Scanner scann = new Scanner(System.in).useDelimiter("\n");     
        agregarLibro(conjuntoLibros);       
        System.out.println("¿Desea agregar otro libro?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        String respuesta = scann.next();
        while (respuesta.equals("1") || respuesta.equalsIgnoreCase("Si") || respuesta.equalsIgnoreCase("Sí")) {
            agregarLibro(conjuntoLibros);
            System.out.println("¿Desea agregar otro libro?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            respuesta = scann.next();
        }

    }

    public Libro buscar(HashSet<Libro> conjuntoLibros, String libroBuscado) {

        for (Libro libroActual : conjuntoLibros) {
            if (libroActual.getTitulo().equalsIgnoreCase(libroBuscado)) {
                return libroActual;
            }
        }

        return null;
    }

    public boolean prestar(HashSet<Libro> conjuntoLibros, String libroBuscado) {

        for (Libro libroActual : conjuntoLibros) {
            if (libroActual.getTitulo().equalsIgnoreCase(libroBuscado)) {
                if (libroActual.getPrestados() == libroActual.getEjemplares()) {
                    System.out.println("No quedan ejemplares del libro");
                    return false;
                } else {
                    System.out.println("Libro prestado con éxito");
                    libroActual.setPrestados(libroActual.getPrestados() + 1);
                    return true;
                }
            }
        }
        System.out.println("No sé encontró el libro buscado");
        return false;
    }

    public boolean devolver(HashSet<Libro> conjuntoLibros, String libroEntregado) {
        Libro libroDevuelto = buscar(conjuntoLibros, libroEntregado);
        if (libroDevuelto != null) {
            if (libroDevuelto.getPrestados() > 0) {
                libroDevuelto.setPrestados(libroDevuelto.getPrestados() - 1);
                System.out.println("Libro entregado con éxito");
                return true;
            } else {
                System.out.println("El libro que intenta entregar no tiene ejemplares en préstamo");
                return false;
            }
        } else {
            System.out.println("El libro que intenta devolver no se encontró");
            return false;
        }
    }

}
