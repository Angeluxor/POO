/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.votacionegg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.votacionegg.entities.Alumno;
import me.votacionegg.services.Simulador;
import static me.votacionegg.services.Simulador.generadorAlumnos;

/**
 *
 * @author idmig
 */
public class VotacionEgg {

    public static void main(String[] args) {  
        
        ArrayList<Alumno> listaAlumnos = generadorAlumnos();
        Simulador.votacion(listaAlumnos);
        Collections.sort(listaAlumnos, new Alumno());
        List<Alumno> facilitadores = listaAlumnos.subList(0, 6);
        List<Alumno> suplentes = listaAlumnos.subList(6, 11);
        System.out.println("Recuento votación: \n" + listaAlumnos);
        System.out.println("Facilitadores: \n" + facilitadores);
        System.out.println("Suplentes: \n" + suplentes);
       
        
    }
}
