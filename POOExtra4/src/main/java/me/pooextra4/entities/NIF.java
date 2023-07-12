/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.pooextra4.entities;

/**
 *
 * @author idmig
 */
public class NIF {

    private long dni;
    private String nif;

    public NIF() {
    }

    public NIF(long dni, String nif) {
        this.dni = dni;
        this.nif = nif;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

}
