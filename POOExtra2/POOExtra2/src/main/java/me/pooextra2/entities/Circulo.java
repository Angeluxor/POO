/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.pooextra2.entities;

/**
 *
 * @author idmig
 */
public class Circulo extends FiguraGeometrica{
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, int tipo) {
        super(tipo);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
       
    
}
