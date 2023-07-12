/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.gimnasio.entities;

/**
 *
 * @author idmig
 */
public class Rutina {
    
    
    private String nombre;
    private String descripcion;
    private int id;
    private int duracion;
    private int nivelDificultad;

    public Rutina() {
    }

    public Rutina(int id, String nombre, String descripcion, int duracion, int nivelDificultad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    @Override
    public String toString() {
        return nombre + "\n descripcion=" + descripcion + ", duracion=" + duracion + ", nivelDificultad=" + nivelDificultad + '}';
    }

   
    
}
