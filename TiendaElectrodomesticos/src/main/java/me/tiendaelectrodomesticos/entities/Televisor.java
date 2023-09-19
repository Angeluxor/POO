/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.tiendaelectrodomesticos.entities;

/**
 *
 * @author idmig
 */
public class Televisor extends Electrodomestico {
    
    private int pulgadas;
    private boolean TDT;

    public Televisor() {
    }
  
    public Televisor(int pulgadas, boolean TDT, int precio, String color, String consumoEnergetico, int pesoKilos) {
        super(precio, color, consumoEnergetico, pesoKilos);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return super.toString() + " Pulgadas: " + pulgadas + " TDT: " + TDT;
    }       
           
    
    
}
