/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.pooextra2.services;

import java.util.Scanner;
import me.pooextra2.entities.*;



/**
 *
 * @author idmig
 */
public class ServicioFiguraGeometrica {
    
    public static FiguraGeometrica crearFiguraGeometrica() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Por favor ingrese el tipo figura que desea crear:\n"
                + "1. Cuadrado\n"
                + "2. Rectángulo\n"
                + "3. Triángulo\n"
                + "4. Círculo\n"
                + "5. Hexágono\n"
                + "6. Pentágono\n"
                + "7. Rombo\n"
        );
        
        switch (scann.nextInt()) {
            case 1:
                System.out.println("Ingrese por favor el lado del cuadrado");
                int l = scann.nextInt();
                return new Cuadrado(l, 1);
            case 2:
                System.out.println("Ingrese por favor la base del rectángulo");
                int b = scann.nextInt();
                System.out.println("Ingrese por favor la altura del rectángulo");
                int a = scann.nextInt();
                return new Rectangulo(b, a, 2);
            case 3:
                System.out.println("Ingrese por favor el lado 1 del triángulo");
                int l1 = scann.nextInt();
                System.out.println("Ingrese por favor el lado 2 del triángulo");
                int l2 = scann.nextInt();
                System.out.println("Ingrese por favor el lado 3 del triángulo");
                int l3 = scann.nextInt();
                return new Triangulo(l1, l2, l3, 3);
            case 4:
                System.out.println("Ingrese por favor el radio del círculo");
                int r = scann.nextInt();
                return new Circulo(r, 4);
            case 5:
                System.out.println("Ingrese por favor el lado del hexágono");
                int lh = scann.nextInt();
                System.out.println("Ingrese por favor el apotema del hexágono");
                int ap = scann.nextInt();
                return new Hexagono(lh, ap, 5);
            case 6:
                System.out.println("Ingrese por favor el lado del pentágono");
                int lp = scann.nextInt();
                System.out.println("Ingrese por favor el apotema del pentágono");
                int apo = scann.nextInt();
                return new Pentagono(lp, apo, 6); 
            case 7:
                System.out.println("Ingrese por favor el lado del rombo");
                int lr = scann.nextInt();
                System.out.println("Ingrese por favor el lado del rombo");
                int d1 = scann.nextInt();
                System.out.println("Ingrese por favor el lado del rombo");
                int d2 = scann.nextInt();
                return new Rombo(lr, d1, d2, 7);    
            default:
                System.out.println("Opción inválida");
                return null;
        }        
    
}
    
//    public static void calcularAreaPerimetro(FiguraGeometrica figura){
//        switch (figura.getTipo()) {
//            case 1:
//                Cuadrado c = (Cuadrado)figura;
//                c.setArea( Math.pow(c.getLado(), 2));
//                c.setPerimetro(c.getLado()*4);                
//                break;          
//            case 2:
//                System.out.println("Ingrese aquí la formúla del area del rectángulo");
//                break;
//            case 3:
//                System.out.println("Ingrese aquí la formúla del area del triángulo");
//                break;
//            case 4:
//                System.out.println("Ingrese aquí la formúla del area del círculo");
//                break;
//            case 5:
//                System.out.println("Ingrese aquí la formúla del area del hexágono");
//                break;
//            case 6:
//                System.out.println("Ingrese aquí la formúla del area del pentágono");
//                break;
//            case 7:
//                System.out.println("Ingrese aquí la formúla del area del rombo");
//                break;    
//            default:
//                throw new AssertionError();
//        }
//        
//    }
    
     public static void calcularAreaPerimetro(Cuadrado cuadrado){
         System.out.println("Cuadrado");
     }

}
