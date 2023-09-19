/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.tiendaelectrodomesticos;

import me.tiendaelectrodomesticos.entities.Lavadora;
import me.tiendaelectrodomesticos.entities.Televisor;
import me.tiendaelectrodomesticos.services.LavadoraService;
import me.tiendaelectrodomesticos.services.TelevisorService;

/**
 *
 * @author idmig
 */
public class TiendaElectrodomesticos {

    public static void main(String[] args) {
        
        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();
        
        TelevisorService.crearTv(televisor);
        LavadoraService.crearLavadora(lavadora);
        TelevisorService.precioFinal(televisor);
        LavadoraService.precioFinal(lavadora);
        System.out.println(lavadora.toString());
        System.out.println(televisor.toString());
        
    }
}
