/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.muelle.entities;

/**
 *
 * @author idmig
 */
public class Barco {
    
    private int matricula;
    private int esloraMt;
    private int annioFabricacion;

    public Barco() {
    }

    public Barco(int matricula, int esloraMt, int annioFabricacion) {
        this.matricula = matricula;
        this.esloraMt = esloraMt;
        this.annioFabricacion = annioFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEsloraMt() {
        return esloraMt;
    }

    public void setEsloraMt(int esloraMt) {
        this.esloraMt = esloraMt;
    }

    public int getAnnioFabricacion() {
        return annioFabricacion;
    }

    public void setAnnioFabricacion(int annioFabricacion) {
        this.annioFabricacion = annioFabricacion;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "\nMatricula: " + matricula + "\nMetros de eslora: " + esloraMt + "\nAño de fabricación: " + annioFabricacion;
    }
    
    public int modulo() {
        return esloraMt*10;        
    }
    
    
    
}
