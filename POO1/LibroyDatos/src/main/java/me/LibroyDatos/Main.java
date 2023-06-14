/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.LibroyDatos;

import entities.Libro;

/**
 *
 * @author idmig
 */
public class Main {

    public static void main(String[] args) {
        
        Libro libro = Libro.crearLibro();
        
        System.out.println(libro.toString());
        
    }
}
