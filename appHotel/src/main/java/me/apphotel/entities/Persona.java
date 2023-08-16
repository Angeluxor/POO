/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.apphotel.entities;

/**
 *
 * @author idmig
 */
public class Persona {
    
    private String nombre, pais;
    private int DNI, edad;

    public Persona() {
    }

    public Persona(String nombre, String pais, int DNI, int edad) {
        this.nombre = nombre;
        this.pais = pais;
        this.DNI = DNI;
        this.edad = edad;
    }   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
