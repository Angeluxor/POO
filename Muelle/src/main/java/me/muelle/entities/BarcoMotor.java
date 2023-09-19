/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.muelle.entities;

/**
 *
 * @author idmig
 */
public class BarcoMotor extends Barco{
    
    private int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV, int matricula, int esloraMt, int annioFabricacion) {
        super(matricula, esloraMt, annioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPotencia: " + potenciaCV;
    }
    
    @Override
    public int modulo(){
        return super.modulo()+potenciaCV;
    }
    
    
}
