/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.apphotel.entities;

/**
 *
 * @author idmig
 */
public class Alojamiento {
    
    private Reserva reserva;
    private int ID;

    public Alojamiento() {
    }

    public Alojamiento(Reserva reserva) {
        this.reserva = reserva;
        this.ID = reserva.getID();
    }   
    
    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
}
