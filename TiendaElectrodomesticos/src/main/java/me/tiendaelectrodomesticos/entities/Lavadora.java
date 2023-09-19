/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.tiendaelectrodomesticos.entities;

/**
 *
 * @author idmig
 */
public class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora() {
    }       

    public Lavadora(int carga, int precio, String color, String consumoEnergetico, int pesoKilos) {
        super(precio, color, consumoEnergetico, pesoKilos);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }        

    @Override
    public String toString() {        
        return super.toString() + " Carga: " + carga;
    }   
    
 
    
    
}
