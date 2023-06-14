/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.circunferencia;

import me.circunferencia.entities.CircunferenciaEntitie;
import me.circunferencia.services.CircunferenciaService;

/**
 *
 * @author idmig
 */
public class Circunferencia {

    public static void main(String[] args) {
       CircunferenciaEntitie circunferencia = CircunferenciaService.crearCircunferencia(); 
       
        System.out.println("El radio de la circunferencia es " + circunferencia.getRadio());
        System.out.println("El área de la circunferencia es " + CircunferenciaService.area(circunferencia));
        System.out.println("El perímetro de la circunferencia es " +  CircunferenciaService.perimetro(circunferencia));
    }
}
