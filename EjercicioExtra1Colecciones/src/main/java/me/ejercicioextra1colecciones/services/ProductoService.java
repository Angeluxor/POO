/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.ejercicioextra1colecciones.services;

import java.util.ArrayList;
import java.util.Scanner;
import me.ejercicioextra1colecciones.entities.Producto;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author idmig
 */
public class ProductoService {

    public static ProductoService productoServiceSingleton = new ProductoService();

    public Producto crearProducto() {
        Scanner scann = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese el nombre del producto");
        String nombreAux = scann.next();
        nombreAux = StringUtils.stripAccents(nombreAux);
        System.out.println("Por elija la categoría del producto");
        System.out.println("1. Alimentos");
        System.out.println("2. Aseo");
        System.out.println("3. Electrónica");
        System.out.println("4. Hogar");
        System.out.println("5. Bebés");
        String categoriaAux;
        switch (scann.nextInt()) {
            case 1:
                categoriaAux = "Alimentos";
                break;
            case 2:
                categoriaAux = "Aseo";
                break;
            case 3:
                categoriaAux = "Electrónica";
                break;
            case 4:
                categoriaAux = "Hogar";
                break;
            case 5:
                categoriaAux = "Bebés";
                break;
            default:
                System.out.println("Elección inválida");
                categoriaAux = "Indeterminada";
        }

        System.out.println("Por favor ingrese el precio del producto");
        double precioAux = scann.nextDouble();
        System.out.println("Por favor ingrese el inventario inicial");
        int cantidadAux = scann.nextInt();
        return new Producto(nombreAux, categoriaAux, precioAux, cantidadAux);
    }

    public void agregarProducto(ArrayList<Producto> listaProductos) {
        listaProductos.add(crearProducto());
        System.out.println("Producto agregado a la lista");
    }

    public Producto leerProducto(String nombre, ArrayList<Producto> listaProductos) {

        for (Producto productoActual : listaProductos) {

            if (productoActual.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado");
                return productoActual;
            }

        }
        System.out.println("Producto no encontrado");
        return null;
    }

    public void modificarProducto(ArrayList<Producto> listaProductos) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto que desea modificar");
        Producto producto = leerProducto(scann.nextLine(), listaProductos);

        if (producto != null) {
            System.out.println("Por favor elija el atributo del producto que desea modificar");
            System.out.println("1. Nombre" + "\n 2. Categoria" + "\n 3. Precio" + "\n 4. Cantidad");
            switch (scann.nextInt()) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre del producto:");
                    producto.setNombre(scann.nextLine());
                    break;
                case 2:
                    System.out.println("Por elija la nueva categoría del producto");
                    System.out.println("1. Alimentos");
                    System.out.println("2. Aseo");
                    System.out.println("3. Electrónica");
                    System.out.println("4. Hogar");
                    System.out.println("5. Bebés");
                    String categoriaAux;
                    switch (scann.nextInt()) {
                        case 1:
                            categoriaAux = "Alimentos";
                            break;
                        case 2:
                            categoriaAux = "Aseo";
                            break;
                        case 3:
                            categoriaAux = "Electrónica";
                            break;
                        case 4:
                            categoriaAux = "Hogar";
                            break;
                        case 5:
                            categoriaAux = "Bebés";
                            break;
                        default:
                            System.out.println("Elección inválida");
                            categoriaAux = "Indeterminada";
                    }
                    producto.setCategoria(categoriaAux);
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo precio del producto:");
                    producto.setPrecio(scann.nextDouble());
                    break;
                case 4:
                    System.out.println("Ingrese la nueva cantidad del producto:");
                    producto.setCantidad(scann.nextInt());
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    public void eliminarProducto(ArrayList<Producto> listaProductos) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        Producto producto = leerProducto(scann.nextLine(), listaProductos);
        if (producto != null) {
            listaProductos.remove(producto);
        }
    }

    public void generadorProducto(ArrayList<Producto> listaProductos) {
        Scanner scann = new Scanner(System.in);
        boolean opt = true;

        while (opt) {
            agregarProducto(listaProductos);
            System.out.println("¿Desea crear otro producto? S/N");
            opt = scann.nextLine().equalsIgnoreCase("S");
        }

    }
}
