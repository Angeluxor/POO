/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.cineapp.entities;

/**
 *
 * @author idmig
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private int duracionMinutos;
    private int edadMinima;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracionMinutos, int edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMinutos = duracionMinutos;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionMinutos=" + duracionMinutos + ", edadMinima=" + edadMinima + '}';
    }
    
    
    
}
