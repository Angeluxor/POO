/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.votacionegg.entities;

import java.util.ArrayList;

/**
 *
 * @author idmig
 */
public class Voto {
    
    private Alumno votante;
    private ArrayList<Alumno> votados;

    public Voto() {
        votados = new ArrayList<Alumno>();
    }

    public Voto(Alumno votante, ArrayList<Alumno> votados) {
        this.votante = votante;
        this.votados = votados;
    }

    public Alumno getVotante() {
        return votante;
    }

    public void setVotante(Alumno votante) {
        this.votante = votante;
    }

    public ArrayList<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(ArrayList<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Votante: " + votante + "\nVotados: " + votados;
    }
    
    
    
}
