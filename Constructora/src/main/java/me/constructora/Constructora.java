/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.constructora;

import java.util.ArrayList;
import me.constructora.entities.Edificio;
import me.constructora.entities.EdificioOficinas;
import me.constructora.entities.Polideportivo;

/**
 *
 * @author idmig
 */
public class Constructora {

    public static void main(String[] args) {

        ArrayList<Edificio> edificios = new ArrayList<>();
        int techados = 0;
        int abiertos = 0;

        edificios.add(new Polideportivo("Tulio Ospina", true, 22, 6, 42));
        edificios.add(new Polideportivo("La Guaira", false, 20, 6, 40));
        edificios.add(new EdificioOficinas(12, 4, 4, 50, 12, 60));
        edificios.add(new EdificioOficinas(18, 3, 5, 40, 15, 80));

        for (Edificio edificio : edificios) {
            System.out.println(edificio.getClass().getSimpleName());
            System.out.println("Superficie: " + edificio.calcularSuperficie());
            System.out.println("Volumen: " + edificio.calcularVolumen() + "\n");
                                               
            if (edificio instanceof Polideportivo) {
                if (((Polideportivo) edificio).isTechado()) {
                    techados++;
                } else {
                    abiertos++;
                }
            } else {
                ((EdificioOficinas) edificio).cantPersonas();
            }                       
        }
        
        System.out.println("Cantidad de polideportivos techados: " + techados);
        System.out.println("Cantidad de polideportivos abiertos: " + abiertos);

    }
}
