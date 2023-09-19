/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.tiendaelectrodomesticos.entities;

/**
 *
 * @author idmig
 */
public class Electrodomestico {
    
    protected int precio;
    protected String color;
    protected String consumoEnergetico;
    protected int pesoKilos;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, String consumoEnergetico, int pesoKilos) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.pesoKilos = pesoKilos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPesoKilos() {
        return pesoKilos;
    }

    public void setPesoKilos(int pesoKilos) {
        this.pesoKilos = pesoKilos;
    }

    @Override
    public String toString() {
        return "Precio: " + precio + "Color: " + color + "Consumo energetico: " + consumoEnergetico + "Peso en kilogramos: " + pesoKilos;
    }   
                 
}
