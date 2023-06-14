/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.poo4;

import me.poo4.entities.Rectangulo;
import me.poo4.services.ServiceRectangulo;

/**
 *
 * @author idmig
 */
public class POO4 {

    public static void main(String[] args) {
        
        Rectangulo rectangulo1 = ServiceRectangulo.crearRectangulo();
        System.out.println("Rectángulo 1 es:\n" + rectangulo1.toString());
        System.out.println("El perimetro del rectángulo 1 es: " + ServiceRectangulo.perimetro(rectangulo1));
        System.out.println("La superficie del rectángulo 1 es: " + ServiceRectangulo.superficie(rectangulo1));
        System.out.println("Así se ve dibujado el rectangulo 1\n");
        ServiceRectangulo.dibujar(rectangulo1);
                
    }
}
