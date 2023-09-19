/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.constructora.entities;

/**
 *
 * @author idmig
 */
public class EdificioOficinas extends Edificio{
    
    private int oficinas;
    private int personasOficina;
    private int numeroPisos;

    public EdificioOficinas() {
    }

    public EdificioOficinas(int oficinas, int personasOficina, int numeroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personasOficina = personasOficina;
        this.numeroPisos = numeroPisos;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getPersonasOficina() {
        return personasOficina;
    }

    public void setPersonasOficina(int personasOficina) {
        this.personasOficina = personasOficina;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }            

    @Override
    public double calcularSuperficie() {
        return ancho*largo*numeroPisos;
    }

    @Override
    public double calcularVolumen() {
        return ancho*largo*alto;
    }
    
    public void cantPersonas(){
        System.out.println("La cantidad de que pueden trabajar en cada piso es de:" + personasOficina*(oficinas/numeroPisos));
        System.out.println("La cantidad total de personas que pueden trabajar en el edificio es de: " + personasOficina*oficinas + "\n");
        
    }

    
}
