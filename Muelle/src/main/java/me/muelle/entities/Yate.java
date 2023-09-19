/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.muelle.entities;

/**
 *
 * @author idmig
 */
public class Yate extends BarcoMotor{
    
    private int numeroCamarotes;

    public Yate() {
    }  

    public Yate(int numeroCamarotes, int potenciaCV, int matricula, int esloraMt, int annioFabricacion) {
        super(potenciaCV, matricula, esloraMt, annioFabricacion);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de camarotes: " + numeroCamarotes;
    }
    
      @Override
    public int modulo(){
        return super.modulo()+numeroCamarotes;
    }
}
