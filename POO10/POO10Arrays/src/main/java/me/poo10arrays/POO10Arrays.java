/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.poo10arrays;

import java.util.Arrays;

/**
 *
 * @author idmig
 */
public class POO10Arrays {

    public static void main(String[] args) {
        
        double arrayA[] = new double[50];
        double arrayB[];
       
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = Math.round(Math.random()*100);
        }       
        
        System.out.println(Arrays.toString(arrayA));
        
        Arrays.sort(arrayA);
        arrayB = Arrays.copyOf(arrayA, 20);
        Arrays.fill(arrayB, 11, 20, 0.5);
        
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));        
       
    }
}
