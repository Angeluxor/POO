/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.pooextra4;

import me.pooextra4.entities.NIF;
import me.pooextra4.services.NIFServices;

/**
 *
 * @author idmig
 */
public class POOExtra4 {

    public static void main(String[] args) {

        NIF nif1 = NIFServices.crearNif();
        System.out.println(NIFServices.mostrar(nif1));
    }
}
