/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.junit1.entities;

/**
 *
 * @author idmig
 */
public class Product {
    
    private String name;
    private double price;
    private double discountMultiplier;

    public Product() {
    }

    public Product(String name, double price, double discountMultiplier) {
        this.name = name;
        this.price = price;
        this.discountMultiplier = discountMultiplier;
    }   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountMultiplier() {
        return discountMultiplier;
    }

    public void setDiscountMultiplier(double discountMultiplier) {
        this.discountMultiplier = discountMultiplier;
    }

       
}
