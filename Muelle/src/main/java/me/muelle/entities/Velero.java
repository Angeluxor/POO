/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.muelle.entities;

/**
 *
 * @author idmig
 */
public class Velero extends Barco{
    
    private int mastiles;

    public Velero() {
    }
    
    public Velero(int mastiles, int matricula, int esloraMt, int annioFabricacion) {
        super(matricula, esloraMt, annioFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMástiles:" + mastiles;
    }
    
      @Override
    public int modulo(){
        return super.modulo()+mastiles;
    }
    
    
    
}
