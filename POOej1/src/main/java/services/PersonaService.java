/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entity.Persona;

/**
 *
 * @author idmig
 */
public class PersonaService {

    public void mostrarAtributos(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre()
                + "\nApellido: " + persona.getApellido()
                + "\nDocumento: " + persona.getDocumento());
    }

}
