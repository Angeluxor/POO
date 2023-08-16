/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.colecciones6tienda.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import me.colecciones6tienda.entities.Producto;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author idmig
 */
public class ProductoService {

    public static Integer key = 0;

    public Producto crearProducto() {
        Scanner scann = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese el nombre del producto");
        String nombreAux = scann.next();
        nombreAux = StringUtils.stripAccents(nombreAux);
        System.out.println("Por favor ingrese el precio del producto");
        double precioAux = scann.nextDouble();

        return new Producto(nombreAux, precioAux);
    }

    public void agregarProducto(HashMap<Integer, Producto> mapaProductos) {
        mapaProductos.put(key++, crearProducto());
        System.out.println("Producto agregado a la lista");
    }

    public Producto leerProductoValor(String nombre, HashMap<Integer, Producto> mapaProductos) {

        for (Map.Entry<Integer, Producto> productoActual : mapaProductos.entrySet()) {
            Integer key = productoActual.getKey();
            Producto value = productoActual.getValue();
            if (value.getNombre().equalsIgnoreCase(nombre)) {
                return value;
            }
        }
        System.out.println("Producto no encontrado");
        return null;
    }
    
    public Integer leerProductoClave(String nombre, HashMap<Integer, Producto> mapaProductos) {

        for (Map.Entry<Integer, Producto> productoActual : mapaProductos.entrySet()) {
            Integer key = productoActual.getKey();
            Producto value = productoActual.getValue();
            if (value.getNombre().equalsIgnoreCase(nombre)) {
                return key;
            }
        }
        System.out.println("Producto no encontrado");
        return null;
    }

    public void modificarProducto(HashMap<Integer, Producto> mapaProductos) {
        Scanner scann = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del producto que desea modificar");
        Producto producto = leerProductoValor(scann.nextLine(), mapaProductos);

        if (producto != null) {
            System.out.println("Por favor elija el atributo del producto que desea modificar");
            System.out.println("1. Nombre" + "\n 2. Precio");
            switch (scann.nextInt()) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre del producto:");
                    producto.setNombre(scann.next());
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo precio del producto:");
                    producto.setPrecio(scann.nextDouble());
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    public void eliminarProducto(HashMap<Integer, Producto> mapaProductos) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        Integer producto = leerProductoClave(scann.nextLine(), mapaProductos);
        if (producto != null) {
            mapaProductos.remove(producto);
        }
    }

    public void generadorProducto(HashMap<Integer, Producto> mapaProductos) {
        Scanner scann = new Scanner(System.in);
        boolean opt = true;

        while (opt) {
            agregarProducto(mapaProductos);
            System.out.println("¿Desea crear otro producto? S/N");
            opt = scann.nextLine().equalsIgnoreCase("S");
        }

    }
}
