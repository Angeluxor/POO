/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.colecciones5paises.services;

import java.util.Scanner;
import java.util.Set;
import me.colecciones5paises.entities.Pais;

/**
 *
 * @author idmig
 */
public class PaisService {    
    

    private Pais crearPais(){
        Scanner scann = new Scanner(System.in).useDelimiter("\n");
        String nombreTemp;
        String idiomaTemp;
        double extensionTemp;
        double poblacionTemp;
        
        System.out.println("Ingrese el nombre del país por favor:");
        nombreTemp = scann.next();
        System.out.println("Ingrese el idioma del país por favor:");
        idiomaTemp = scann.next();
        System.out.println("Ingrese la extensión en KM2 del país por favor:");
        extensionTemp = scann.nextDouble();
        System.out.println("Ingrese la población del país por favor:");
        poblacionTemp = scann.nextDouble();
        System.out.println("País creado exitosamente");
        
        return new Pais(nombreTemp, idiomaTemp, extensionTemp, poblacionTemp);
    }
    
    
    public void agregarPais(Set<Pais> conjuntoPaises){
        conjuntoPaises.add(crearPais());
        System.out.println("País agregado exitosamente");                
    }
    
    public boolean eliminarPais(Set<Pais> conjuntoPaises){
        Scanner scann = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del país que desea eliminar por favor");
        String paisBuscado = scann.next();
        for (Pais paisTemp : conjuntoPaises) {
            if (paisTemp.getNombre().equals(paisBuscado)) {
                conjuntoPaises.remove(paisTemp);
                return true;
            }
        }
        return false;
    }
    
}
