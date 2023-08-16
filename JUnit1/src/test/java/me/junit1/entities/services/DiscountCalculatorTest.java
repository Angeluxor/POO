/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package me.junit1.entities.services;

import me.junit1.entities.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author idmig
 */
public class DiscountCalculatorTest {
    
    public DiscountCalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of netPrice method, of class DiscountCalculator.
     */
    @Test
    public void testNetPrice() {
        System.out.println("netPrice");
        Product product = new Product("X", 100, 0.9);
        DiscountCalculator instance = new DiscountCalculator();
        double expResult = 90.0;
        double result = instance.netPrice(product);
        assertEquals(expResult, result, 0);
  
        
    }
    
}
