/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejercicicoleccionesextra3.services;

import com.mycompany.ejercicicoleccionesextra3.entities.Libro;
import java.util.HashSet;
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
public class ServicioLibroTest {
    
    public ServicioLibroTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }    
  

    /**
     * Test of generarLibros method, of class ServicioLibro.
     */
//    @org.junit.jupiter.api.Test
//    public void testGenerarLibros() {
//        System.out.println("generarLibros");
//        HashSet<Libro> conjuntoLibros = new HashSet<>();
//        ServicioLibro instance = new ServicioLibro();
//        instance.generarLibros(conjuntoLibros);
//        assertEquals(false, conjuntoLibros.isEmpty());                
//    }

    /**
     * Test of buscar method, of class ServicioLibro.
     */
    @org.junit.jupiter.api.Test
    public void testBuscar() {
        System.out.println("buscar");
        HashSet<Libro> conjuntoLibros = new HashSet<>();
        conjuntoLibros.add(new Libro("Nacho Lee", "Nacho", 12));
        String libroBuscado = "Harry Potter";
        ServicioLibro instance = new ServicioLibro();
        Libro expResult = null;
        Libro result = instance.buscar(conjuntoLibros, libroBuscado);
        assertEquals(expResult, result);  
    }

    /**
     * Test of prestar method, of class ServicioLibro.
     */
    @org.junit.jupiter.api.Test
    public void testPrestar() {
        System.out.println("prestar");
        HashSet<Libro> conjuntoLibros = new HashSet<>();
        Libro libro = new Libro("Nacho Lee", "Nacho", 12);
        conjuntoLibros.add(libro);
        String libroBuscado = "Nacho Lee";
        ServicioLibro instance = new ServicioLibro();
        boolean expResult = true;
        boolean result = instance.prestar(conjuntoLibros, libroBuscado);
        assertEquals(expResult, result);
        assertEquals(1, libro.getPrestados());
     
    }

    /**
     * Test of devolver method, of class ServicioLibro.
     */
    @org.junit.jupiter.api.Test
    public void testDevolver() {
        System.out.println("devolver");
        HashSet<Libro> conjuntoLibros = new HashSet<>();
        Libro libro = new Libro("Nacho Lee", "Nacho", 12);
        conjuntoLibros.add(libro);
        libro.setPrestados(1);
        String libroEntregado = "Nacho Lee";
        ServicioLibro instance = new ServicioLibro();
        boolean expResult = true;
        boolean result = instance.devolver(conjuntoLibros, libroEntregado);
        assertEquals(expResult, result);
        assertEquals(0, libro.getPrestados());
       
    }

}
