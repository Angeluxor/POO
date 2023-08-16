/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package me.junit2.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Tag;

/**
 *
 * @author idmig
 */
public class tempConverterTest {
    
    public tempConverterTest() {
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
     * Test of celsiusToFahrenheit method, of class TempConverter.
     */
   
    @Test
    public void testCelsiusToFahrenheit() {
        System.out.println("celsiusToFahrenheit");
        double celsius = 30;
        TempConverter instance = new TempConverter();
        double expResult = 86;
        double result = instance.celsiusToFahrenheit(celsius);
        assertEquals(expResult, result, 0);
      
    }

    /**
     * Test of fahrenheitToCelsius method, of class TempConverter.
     */
    @Test
    public void testFahrenheitToCelsius() {
        System.out.println("fahrenheitToCelsius");
        double fahrenheit = 32;
        TempConverter instance = new TempConverter();
        double expResult = 0.0;
        double result = instance.fahrenheitToCelsius(fahrenheit);
        assertEquals(expResult, result, 0);
       
                
    }
    
}
