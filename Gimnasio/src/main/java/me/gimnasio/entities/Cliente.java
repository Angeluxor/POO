/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.gimnasio.entities;

/**
 *
 * @author idmig
 */
public class Cliente {
    
    private int id;
    private int edad;
    private float peso;
    private float altura;
    private String nombre;
    private String objetivo;

    public Cliente() {
        
    }

    
    
    public Cliente(int id, int edad, float peso, float altura, String nombre, String objetivo) {
        this.id = id;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.nombre = nombre;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }

/* Este atributo no debe modificarse después de la creación de la instancia */    
//    public void setId(int id) {
//        this.id = id;
//    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return nombre + ":\n ID: " + id + "\n Edad: " + edad + "\n Peso: " + peso + "\n Altura: " + altura + "\n Objetivo: " + objetivo;
    }

   

    
    
}
