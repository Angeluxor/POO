/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.gimnasio;

import java.util.ArrayList;
import me.gimnasio.entities.Cliente;
import me.gimnasio.services.ServicioCliente;

/**
 *
 * @author idmig
 */
public class Gimnasio {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();              
        clientes.add(ServicioCliente.registrarCliente());
        clientes.add(ServicioCliente.registrarCliente());        
        ServicioCliente.obtenerClientes(clientes);
        ServicioCliente.actualizarCliente(clientes, 1, "Juan", 28, 163, 56, "Nada");
        ServicioCliente.obtenerClientes(clientes);
        ServicioCliente.eliminarCliente(clientes, 1);
        ServicioCliente.obtenerClientes(clientes);
        
    }
}
