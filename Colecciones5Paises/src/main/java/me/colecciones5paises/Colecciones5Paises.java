/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.colecciones5paises;


import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import me.colecciones5paises.entities.Pais;
import me.colecciones5paises.services.PaisService;

/**
 *
 * @author idmig
 */
public class Colecciones5Paises {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in).useDelimiter("\n");
        PaisService paisService = new PaisService();
        TreeSet<Pais> conjuntoPaises = new TreeSet<>();
        HashSet<Pais> con = new HashSet<>();
        System.out.println("Bienvenido\n¿Desea empezar a crear países\n1.Sí\n2.No");

        while (scann.nextInt() == 1) {
            paisService.agregarPais(conjuntoPaises);
            System.out.println("¿Desea agregar más paises?\n1.Sí\n2.No");
        }
        
        System.out.println(conjuntoPaises.toString());
        if(paisService.eliminarPais(conjuntoPaises)){
            System.out.println("Eliminado de manera exitosa");
        } else {
            System.out.println("No se encontró el país");
        }              
        
        System.out.println(conjuntoPaises.toString());
        
        
    }
}
