package me.colecciones6tienda;

import java.util.HashMap;
import java.util.Scanner;
import me.colecciones6tienda.entities.Producto;
import me.colecciones6tienda.services.ProductoService;

/**
 *
 * @author idmig
 */
public class Colecciones6Tienda {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        HashMap<Integer, Producto> mapaProductos = new HashMap<>();
        ProductoService productoService = new ProductoService();
        boolean flagOut = false;
        while (!flagOut) {
            System.out.println("Bienvenido");
            System.out.println("Elija una opción");
            System.out.println("1. Agregar productos"
                    + "\n2. Listar productos"
                    + "\n3. Modificar un producto"
                    + "\n4. Eliminar un producto"
                    + "\n5. Salir");
            switch (scann.nextInt()) {
                case 1:
                    productoService.generadorProducto(mapaProductos);
                    break;
                case 2:
                    System.out.println(mapaProductos.toString());
                    break;
                case 3:
                    productoService.modificarProducto(mapaProductos);
                    break;
                case 4:
                    productoService.eliminarProducto(mapaProductos);
                    break;
                case 5:
                    flagOut = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        }
    }
}
