/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.ejercicioextra1colecciones;

import java.util.ArrayList;
import java.util.Scanner;
import me.ejercicioextra1colecciones.entities.Producto;
import me.ejercicioextra1colecciones.services.ProductoService;

/**
 *
 * @author idmig
 */
public class Tienda {

    private static ArrayList<Producto> listaProductos = new ArrayList();

    public static void main(String[] args) {
        ProductoService.productoServiceSingleton.generadorProducto(listaProductos);
        System.out.println(listaProductos.toString());
        ProductoService.productoServiceSingleton.modificarProducto(listaProductos);
        ProductoService.productoServiceSingleton.eliminarProducto(listaProductos);
        venta();
        reposicion();
        System.out.println(listaProductos.toString());
    }
    
    public static boolean venta(){
        Scanner scann = new Scanner(System.in);
        System.out.println("Por ingrese el nombre del producto que desea comprar");
        Producto producto = ProductoService.productoServiceSingleton.leerProducto(scann.nextLine(), listaProductos);
        System.out.println("¿Qué cantidad desea adquirir?");
        int cantidadDeseada = scann.nextInt();
        if(producto == null){
            System.out.println("El producto no existe");
            return false;
        } else if (producto.getCantidad()<cantidadDeseada){
            System.out.println("No hay existencias suficientes del producto");
            return false;
        } else {
            producto.setCantidad(producto.getCantidad()-cantidadDeseada);
            System.out.println("Compra exitosa");
            return true;
        }
    }
    
    public static boolean reposicion(){
        Scanner scann = new Scanner(System.in);
        System.out.println("Por ingrese el nombre del producto que desea reponer");
        Producto producto = ProductoService.productoServiceSingleton.leerProducto(scann.nextLine(), listaProductos);
        System.out.println("¿Qué cantidad desea reponer?");
        int cantidadDeseada = scann.nextInt();
        if(producto == null){
            System.out.println("El producto no existe");
            System.out.println("¿Desea crearlo? S/N");
            if(scann.nextLine().equalsIgnoreCase("S")){
                ProductoService.productoServiceSingleton.agregarProducto(listaProductos);
            }
            return false;
        } else {
            producto.setCantidad(producto.getCantidad()+cantidadDeseada);
            System.out.println("Reposición exitosa");
            return true;
        }
    }
}
