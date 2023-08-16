/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.apphotel.entities;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author idmig
 */
public class Reserva {
    
    private int ID;
    private Habitacion habitacion;
    private ArrayList<Persona> listaPersonas;
    private LocalDate checkIn, checkOut;

    public Reserva() {
    }

    public Reserva(int ID, Habitacion habitacion, ArrayList<Persona> listaPersonas, LocalDate checkIn, LocalDate checkOut) {
        this.ID = ID;
        this.habitacion = habitacion;
        this.listaPersonas = listaPersonas;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }
    
       
    
}
