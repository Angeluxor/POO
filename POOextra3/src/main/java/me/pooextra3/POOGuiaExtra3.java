package pooguiaextra3;

import Service.RaicesService;

public class POOGuiaExtra3 {

    public static void main(String[] args) {
        
        Raices raiz1 = new Raices(10,2,6);
        //Math.pow(raiz.getB(), 2)-4*raiz.getA()*raiz.getC();
        // Para que de 0 = 10, 0, 0
     
        //RaicesService rS = new RaicesService();
        
        System.out.println("Discriminante: " + RaicesService.getDiscriminante(raiz1));
        // Trae el metodo estatico de la clase servicios, no necesito instanciar el Service
        
        System.out.println("Raices: " + RaicesService.tieneRaices(raiz1));
        
         System.out.println("Raiz: " + RaicesService.tieneRaiz(raiz1));
         
          //RaicesService.obtenerRaices(raiz1);
          
          //RaicesService.obtenerRaiz(raiz1);
          
          RaicesService.calcular(raiz1);
    }
    
}


