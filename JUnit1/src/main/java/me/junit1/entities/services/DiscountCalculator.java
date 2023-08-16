/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.junit1.entities.services;

import me.junit1.entities.Product;

/**
 *
 * @author idmig
 */
public class DiscountCalculator {

    public DiscountCalculator() {
    }    
        
    public double netPrice (Product product){                    
        return product.getPrice()*product.getDiscountMultiplier(); 
    }
    
}
