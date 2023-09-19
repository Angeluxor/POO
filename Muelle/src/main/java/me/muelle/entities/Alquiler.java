/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.muelle.entities;

import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author idmig
 */
public class Alquiler {

    private String nombre;
    private int documentoCliente;
    private GregorianCalendar fechaAlquiler;
    private GregorianCalendar fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;
    private int costo;

    public Alquiler() {
    }

    public Alquiler(String nombre, int documentoCliente, GregorianCalendar fechaAlquiler, GregorianCalendar fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        calcularCosto();
         
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public GregorianCalendar getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(GregorianCalendar fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public GregorianCalendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(GregorianCalendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
      
    @Override
    public String toString() {
        return nombre + "\nDocumento: " + documentoCliente + "\nFecha alquiler: " + fechaAlquiler.getTime()+ "\nFecha devolución: " + fechaDevolucion.getTime() + "\nPosicion amarre: " + posicionAmarre + "\nBarco: " + barco + "\nCosto alquiler: " + costo;
    }

    public int calcularDuracion() {
        return (int) (TimeUnit.MILLISECONDS.toDays(fechaDevolucion.getTimeInMillis()-fechaAlquiler.getTimeInMillis()));
    }

    public int calcularCosto() {        
        return costo = calcularDuracion()*barco.modulo();
    }

}
