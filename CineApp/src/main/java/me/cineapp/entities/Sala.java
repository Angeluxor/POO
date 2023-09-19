/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.cineapp.entities;

/**
 *
 * @author idmig
 */
public class Sala {
    
    private Pelicula pelicula;
    private double precioEntrada;    
    private Espectador[][] espectadores = new Espectador[8][6]; 
    private String[][] mapaSala = new String[8][6]; 


    public Sala() {
    }

    public Sala(Pelicula pelicula, double precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
    }   
      
    
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Espectador[][] getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(Espectador[][] espectadores) {
        this.espectadores = espectadores;
    }

    public String[][] getMapaSala() {
        return mapaSala;
    }

    public void setMapaSala(String[][] mapaSala) {
        this.mapaSala = mapaSala;
    }
    
    

    @Override
    public String toString() {
        return "Sala{" + "pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + ", espectadores=" + espectadores + '}';
    }
    
    
    
}
