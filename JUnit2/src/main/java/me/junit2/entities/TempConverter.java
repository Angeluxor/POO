/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.junit2.entities;

/**
 *
 * @author idmig
 */
public class TempConverter {
    
    public double celsiusToFahrenheit (double celsius){
        
        return (celsius*9/5)+32;
    }
    
    public double fahrenheitToCelsius (double fahrenheit){
        
        return (fahrenheit-32)/(9/5);
    }
    
}
