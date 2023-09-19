/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.cineapp.services;

import java.util.ArrayList;
import me.cineapp.entities.Pelicula;

/**
 *
 * @author idmig
 */
public class PeliculaService {
    
    public static ArrayList<Pelicula> generadorPeliculas(){
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        
        peliculas.add(new Pelicula("Avatar", "James Cameron", 162, 13));
        peliculas.add(new Pelicula("Barbie", "Greta Gerwig", 114, 13));
        peliculas.add(new Pelicula("La Purga", "Gerard McMurray", 90, 18));
        peliculas.add(new Pelicula("Oppenheimer", "Christopher Nolan", 180, 13));
        peliculas.add(new Pelicula("Gato con botas", "Joel Crawford", 100, 13));
        
        return peliculas;
    }
    
}
