/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.colecciones1;

import java.util.ArrayList;

/**
 *
 * @author idmig
 */
public class Colecciones1 {

    public static void main(String[] args) {
        
        ArrayList<Integer> opcion1 = new ArrayList<>();
        ArrayList<Integer> opcion2 = new ArrayList<>();
        
        Integer buscado1 = 4;
        opcion1.add(4);
        opcion1.add(4);
        opcion1.add(8);

        Integer buscado2 = 2;
        opcion2.add(2);
        opcion2.add(2);
        opcion2.add(6);
        
        System.out.println(opcion1.toString());

        System.out.println(opcion2.toString());
        
        /*
        Una manera de eliminar todas las ocurrencias de un elemento dentro de un ArrayList
        */
        
        while (opcion1.remove(buscado1)) {          
            System.out.println("Se ha eliminado un elemento con la opción 1");
        }
        
        /*
        Otra manera de eliminar todas las ocurrencias de un elemento dentro de un ArrayList
        */

        boolean isRemoved;

        do {
            isRemoved = opcion2.remove(buscado2);
            if (isRemoved) {
                System.out.println("Se ha eliminado un elemento opción 2");
            }
        } while (isRemoved);
        
        System.out.println(opcion1.toString());

        System.out.println(opcion2.toString());

    }
}
