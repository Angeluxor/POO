/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.pooej1;

import entity.*;
import services.PersonaService;


/**
 *
 * @author idmig
 */
public class POOej1 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Pérez", 00001);
        Persona persona2 = new Persona();
        
        PersonaService personaService = new PersonaService();
        
        personaService.mostrarAtributos(persona1);
    }
}
