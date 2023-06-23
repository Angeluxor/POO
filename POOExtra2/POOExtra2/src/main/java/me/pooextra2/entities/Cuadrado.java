/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.pooextra2.entities;

/**
 *
 * @author idmig
 */
public class Cuadrado extends FiguraGeometrica{
    
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    } 
    
    public Cuadrado(int lado, int tipo) {
        super(tipo);
        this.lado = lado;        
    }        
    
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    
    
}
