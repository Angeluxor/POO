/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.circunferencia.services;

import java.util.Scanner;
import me.circunferencia.entities.CircunferenciaEntitie;

/**
 *
 * @author idmig
 */
public class CircunferenciaService {
    
    public static CircunferenciaEntitie crearCircunferencia(){ 
        Scanner scann = new Scanner(System.in);
        System.out.println("Por favor ingrese el rádio de la circunferencia que desea crear");
        double radio = scann.nextDouble();        
        return new CircunferenciaEntitie(radio);
}
    
    public static double area(CircunferenciaEntitie circunferencia){
        return Math.PI * Math.pow(circunferencia.getRadio(), 2);        
    }
    
    public static double perimetro(CircunferenciaEntitie circunferencia){
        return 2 * Math.PI * circunferencia.getRadio();        
    }
    
}
