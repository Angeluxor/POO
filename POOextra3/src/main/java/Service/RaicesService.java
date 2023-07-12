package Service;

import pooguiaextra3.Raices;

public class RaicesService {

    public static double getDiscriminante(Raices raiz) {

        double discriminante = Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC();
        //double discriminanteMas  = (Math.pow(raiz.getB(), 2))+4(*raiz.getA()*raiz.getC());

        return discriminante;
    }

    public static boolean tieneRaices(Raices raiz) {

        return getDiscriminante(raiz) >= 0;

    }

    public static boolean tieneRaiz(Raices raiz) {

        return getDiscriminante(raiz) == 0;

    }

    public static void obtenerRaices(Raices raiz) {

        if (tieneRaices(raiz)) {

            double r1 = (-raiz.getB() + Math.sqrt(Math.pow(raiz.getB(), 2)) - (4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA());
            double r2 = (-raiz.getB() - Math.sqrt(Math.pow(raiz.getB(), 2)) - (4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA());
            //  (-b±√((b^2)-(4*a*c)))/(2*a) 

            System.out.println("Obtener raices: " + r1 + " " + r2);
        }

    }

    public static void obtenerRaiz(Raices raiz) {

        if (tieneRaiz(raiz)) {

            double r1 = (-raiz.getB() + Math.sqrt(Math.pow(raiz.getB(), 2)) - (4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA());
            System.out.println("Raiz: " + r1);
        }

    }

    public static void calcular(Raices raiz) {

        if (getDiscriminante(raiz) < 0) {
            System.out.println("No tiene solucion");
        } else {
            obtenerRaices(raiz);
            obtenerRaiz(raiz);
        }

    }

}

// Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
// Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
// Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
// Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//posibles soluciones.
// Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
// Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
//
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
//delante de -b
