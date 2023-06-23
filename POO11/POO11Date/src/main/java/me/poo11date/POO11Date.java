/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.poo11date;

import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author idmig
 */
public class POO11Date {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dia;
        int mes;
        int anio;

        System.out.println("Ingrese el dia");
        dia = scan.nextInt();
        System.out.println("Ingrese el mes");
        mes = scan.nextInt() - 1;
        System.out.println("Ingrese el año");
        anio = scan.nextInt() ;       
                
        
        Calendar fechaIngresada = new GregorianCalendar(anio, mes, dia);
        Calendar fechaActual = new GregorianCalendar();    
       
        System.out.println("La fecha ingresada fue: " + fechaIngresada.get(Calendar.DATE) + "/" 
                + (fechaIngresada.get(Calendar.MONTH)+ 1)+"/"+ fechaIngresada.get(Calendar.YEAR));        
       
        System.out.println("La fecha actual es: " + fechaActual.get(Calendar.DATE) + "/" 
                + (fechaActual.get(Calendar.MONTH)+1) +"/"+ fechaActual.get(Calendar.YEAR));

        System.out.println("La diferencia de años entre las fechas es:"
                + (fechaActual.get(Calendar.YEAR) - fechaIngresada.get(Calendar.YEAR)));

    }
}
