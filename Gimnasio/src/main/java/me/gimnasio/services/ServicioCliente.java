/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.gimnasio.services;

import java.util.ArrayList;
import java.util.Scanner;
import me.gimnasio.entities.Cliente;

/**
 *
 * @author idmig
 */
public class ServicioCliente {

    private static int idController = 0;

    public static Cliente registrarCliente() {
        Scanner scann = new Scanner(System.in);
        int idAux = idController;
        idController++;
        System.out.println("Por favor ingrese el nombre del cliente a registrar");
        String nombreAux = scann.nextLine();
        System.out.println("Por favor ingrese la edad del cliente a registrar");
        int edadAux = scann.nextInt();
        System.out.println("Por favor ingrese la estatura del cliente a registrar");
        float alturaAux = scann.nextFloat();
        System.out.println("Por favor ingrese el peso del cliente a registrar");
        float pesoAux = scann.nextFloat();
        scann.nextLine();
        System.out.println("Por favor ingrese el objetivo del cliente a registrar");
        String objetivoAux = scann.nextLine();

        return new Cliente(idAux, edadAux, pesoAux, alturaAux, nombreAux, objetivoAux);
    }

    public static void obtenerClientes(ArrayList<Cliente> clientes) {

        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    public static void actualizarCliente(ArrayList<Cliente> clientes,
            int id,
            String nombre,
            int edad,
            float estatura,
            float peso,
            String objetivo) {

        for (Cliente cliente : clientes) {
            
            System.out.println(cliente.getId());
            if (cliente.getId() == id) {
                cliente.setAltura(estatura);
                cliente.setEdad(edad);
                cliente.setNombre(nombre);
                cliente.setObjetivo(objetivo);
                cliente.setPeso(peso);

            }

        }

    }
    
    public static void eliminarCliente(ArrayList<Cliente> clientes, int id){
        
        for (Cliente clienteActual : clientes) {
            
            if(clienteActual.getId() == id){
                clientes.remove(clientes.indexOf(clienteActual));
            }
        }
    }

}
