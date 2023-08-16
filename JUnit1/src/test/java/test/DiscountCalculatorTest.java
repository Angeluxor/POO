/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import me.junit1.entities.Product;
import me.junit1.entities.services.DiscountCalculator;
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

    @Test
    public void discountTest(){
        DiscountCalculator dc = new DiscountCalculator();
        assertEquals(90,dc.netPrice(new Product("X", 100, 0.9)));
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
