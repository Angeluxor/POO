/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.apphotel.entities;

/**
 *
 * @author idmig
 */
public class Habitacion {

    private int numeroHabitacion, maximoHuespedes;

    public Habitacion() {
    }

    public Habitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        if (numeroHabitacion > 0 && numeroHabitacion < 6) {
            maximoHuespedes = 2;
        } else if (numeroHabitacion > 5 && numeroHabitacion < 9) {
            maximoHuespedes = 3;
        } else {
            maximoHuespedes = 4;
        }
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getMaximoHuespedes() {
        return maximoHuespedes;
    }

    public void setMaximoHuespedes(int maximoHuespedes) {
        this.maximoHuespedes = maximoHuespedes;
    }

}
