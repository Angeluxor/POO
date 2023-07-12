//Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
//(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
//métodos:
package me.poo12date.entities;

import java.util.Date;

/**
 *
 * @author idmig
 */
public class Persona {
    
    private String name;
    private Date bDay;
    
    public Persona(){
        
    }

    public Persona(String name, Date bDay) {
        this.name = name;
        this.bDay = bDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getbDay() {
        return bDay;
    }

    public void setbDay(Date bDay) {
        this.bDay = bDay;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\n Fecha de nacimiento: " + bDay;
    }
    
        
    
}
