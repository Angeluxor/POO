/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.pooextra2.entities;

/**
 *
 * @author idmig
 */
public class Pentagono extends FiguraGeometrica{
    
    private int lado;
    private int apotema;

    public Pentagono(int lado, int apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public Pentagono(int lado, int apotema, int tipo) {
        super(tipo);
        this.lado = lado;
        this.apotema = apotema;
    }

     public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    } 

    public int getApotema() {
        return apotema;
    }

    public void setApotema(int apotema) {
        this.apotema = apotema;
    }
    
    
       
}
