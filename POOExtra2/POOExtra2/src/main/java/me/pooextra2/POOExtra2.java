/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.pooextra2;

;
import me.pooextra2.entities.FiguraGeometrica;
import me.pooextra2.services.ServicioFiguraGeometrica;

/**
 *
 * @author idmig
 */
public class POOExtra2 {

    public static void main(String[] args) {

        FiguraGeometrica figura1 = ServicioFiguraGeometrica.crearFiguraGeometrica();       
       
        ServicioFiguraGeometrica.calcularAreaPerimetro();      
      
        System.out.println("El area de la figura es: " + figura1.getArea());
        System.out.println("El perimetro de la figura es: " + figura1.getPerimetro());
    }
}
