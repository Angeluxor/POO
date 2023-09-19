/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.cineapp;

import java.util.ArrayList;
import me.cineapp.entities.Pelicula;
import me.cineapp.entities.Sala;
import me.cineapp.services.PeliculaService;
import me.cineapp.services.SalaService;

/**
 *
 * @author idmig
 */
public class CineApp {
    
    

    public static void main(String[] args) {
        ArrayList<Pelicula> listaPeliculas = PeliculaService.generadorPeliculas();
        
        Sala sala = new Sala(listaPeliculas.get(0), 150);                
        SalaService.generadorEspectadores(sala);        
        SalaService.generadorMapa(sala);
        SalaService.imprimirMapaSala(sala);
       
    }
}
