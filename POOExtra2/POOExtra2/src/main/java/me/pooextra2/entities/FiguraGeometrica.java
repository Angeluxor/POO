/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.pooextra2.entities;

/**
 *
 * @author idmig
 */
public abstract class FiguraGeometrica {
    
    private double perimetro;
    private double area;
    private int tipo;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(int tipo) {        
        this.tipo = tipo;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }        
       
}
