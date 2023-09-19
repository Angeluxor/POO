/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.muelle;

import java.util.GregorianCalendar;
import me.muelle.entities.Alquiler;
import me.muelle.entities.Barco;
import me.muelle.entities.BarcoMotor;
import me.muelle.entities.Velero;
import me.muelle.entities.Yate;

/**
 *
 * @author idmig
 */
public class Muelle {

    public static void main(String[] args) {
        
        Barco barco1 = new Barco(1, 10, 1996);
        Barco barco2 = new BarcoMotor(8, 2, 15, 2001);
        Barco barco3 = new Velero(2, 3, 20, 1992);
        Barco barco4 = new Yate(3, 13, 4, 25, 2005);
        
        Alquiler alquiler1 = new Alquiler("Juan", 1020, 
                new GregorianCalendar(2023, 9, 1), 
                new GregorianCalendar(2023, 9, 5), 1, barco1);
        
        Alquiler alquiler2 = new Alquiler("Ana", 2030, 
                new GregorianCalendar(2022, 8, 26), 
                new GregorianCalendar(2022, 9, 2), 2, barco2);
        
        Alquiler alquiler3 = new Alquiler("María", 4030, 
                new GregorianCalendar(2021, 1, 1), 
                new GregorianCalendar(2021, 1, 12), 3, barco3);
        
        Alquiler alquiler4 = new Alquiler("Pedro", 5060, 
                new GregorianCalendar(2023, 4, 10), 
                new GregorianCalendar(2023, 4, 21), 4, barco4);
        
//        System.out.println(barco1);
//        System.out.println(barco2);
//        System.out.println(barco3);
//        System.out.println(barco4);
                
        System.out.println(alquiler1);
        System.out.println(alquiler2);
        System.out.println(alquiler3);
        System.out.println(alquiler4);
        
       
    }
}
