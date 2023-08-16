/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.colecciones5paises.entities;

import java.util.Objects;

/**
 *
 * @author idmig
 */
public class Pais implements Comparable<Pais>{
    
    private String nombre;
    private String idioma;
    private double extension;
    private double poblacion;

    public Pais() {
    }

    public Pais(String nombre, String idioma, double extension, double poblacion) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.extension = extension;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();        
        sb.append(nombre).append(":");
        sb.append("\nIdioma: ").append(idioma);
        sb.append("\nExtension: ").append(extension);
        sb.append("\nPoblacion: ").append(poblacion);        
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + Objects.hashCode(this.idioma);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.extension) ^ (Double.doubleToLongBits(this.extension) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.poblacion) ^ (Double.doubleToLongBits(this.poblacion) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (Double.doubleToLongBits(this.extension) != Double.doubleToLongBits(other.extension)) {
            return false;
        }
        if (Double.doubleToLongBits(this.poblacion) != Double.doubleToLongBits(other.poblacion)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.idioma, other.idioma);
    }

    @Override
    public int compareTo(Pais pais) {
        return this.nombre.compareTo(pais.getNombre());
    }
       
    
    
    
}
