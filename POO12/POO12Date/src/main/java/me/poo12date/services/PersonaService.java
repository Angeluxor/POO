// Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//actual.
// Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
// Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
package me.poo12date.services;

import java.util.Date;
import java.util.Scanner;
import me.poo12date.entities.Persona;

/**
 *
 * @author idmig
 */
public class PersonaService {

    /**
     * Este método rellena el objeto mediante un Scanner y le pregunta al
     * usuario el nombre y la fecha de nacimiento de la persona a crear
     *
     * @return Un nuevo objeto de tipo Persona
     */
    public static Persona crearPersona() {
        Scanner scann = new Scanner(System.in);
        int year, month, day;
        System.out.println("Por favor ingrese el nombre de la persona");
        String name = scann.nextLine();
        do {
            System.out.println("Por favor ingrese el año de su nacimiento completo");
            year = scann.nextInt() - 1900;
        } while (year < 1);
        do {
            System.out.println("Por favor ingrese el mes de su nacimiento");
            month = scann.nextInt() - 1;
        } while (month < 0 || month > 11);
        do {
            System.out.println("Por favor ingrese el día de su nacimiento ");
            day = scann.nextInt();
        } while (day < 0 || day > 31);
        Date bDay = new Date(year, month, day);

        return new Persona(name, bDay);
    }

    /**
     * Calcula la edad de una entidad de tipo persona con su fecha de nacimiento     *
     * @param persona de la que se va a calcular la edad
     * @return edad actual de la persona
     */
    public static int calcularEdad(Persona persona) {
        Date actualDate = new Date();
        float aux = (float) (persona.getbDay().getYear() * 365 + persona.getbDay().getMonth() * 30 + persona.getbDay().getDate() / 30) / 365;
        float aux2 = (float) (actualDate.getYear() * 365 + actualDate.getMonth() * 30 + actualDate.getDate() / 30) / 365;
        int edad = (int) Math.floor(aux2 - aux);

        return edad;
    }
    
    /**
     * Devuelve verdadero o falso comparando la edad de dos entidades de tipo persona
     * @param persona1 persona que se desea comprobar si es menor
     * @param persona2 persona respecto a la que se va a comparar
     * @return Verdadero o falso según si es o no menor
     */
    
    public static boolean menorQue(Persona persona1, Persona persona2) {
        return calcularEdad(persona1) < calcularEdad(persona2);
    }
    
    public static void mostrarPersona(Persona persona){
        System.out.println(persona.toString());
    }

}

