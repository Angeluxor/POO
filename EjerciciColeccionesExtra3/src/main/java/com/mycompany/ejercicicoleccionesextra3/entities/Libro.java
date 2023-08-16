/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicicoleccionesextra3.entities;

//el título del libro, autor, número de ejemplares y número de ejemplares prestado
/**
 *
 * @author idmig
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    private int disponibles;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        prestados = 0;
        disponibles = ejemplares - prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
        disponibles = ejemplares - prestados;
    }

    @Override
    public String toString() {
        return "________________\n"+titulo + "\nAutor: " + autor + "\nEjemplares: " + ejemplares + "\nDisponibles: " + disponibles + "\nPrestados: " + prestados + "\n________________";
    }
    
    
    
    
}
