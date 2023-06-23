/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.pooextra2.entities;

/**
 *
 * @author idmig
 */
public class Rombo extends FiguraGeometrica{
    private int lado;
    private int diagonal1;
    private int diagonal2;

    public Rombo(int lado, int diagonal1, int diagonal2) {
        this.lado = lado;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Rombo(int lado, int diagonal1, int diagonal2, int tipo) {
        super(tipo);
        this.lado = lado;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(int diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(int diagonal2) {
        this.diagonal2 = diagonal2;
    }
    
    
}
