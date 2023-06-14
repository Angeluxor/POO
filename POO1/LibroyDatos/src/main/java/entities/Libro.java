/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Scanner;

/**
 *
 * @author idmig
 */
public class Libro {
    
    private String titulo;
    private String ISBN;
    private String autor;
    private int paginas;

    public Libro() {
    }
      

    public Libro(String titulo, String ISBN, String autor, int paginas) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public static Libro crearLibro(){
        Scanner scann = new Scanner(System.in);
        System.out.println("Por favor ingrese el título del libro");
        String t = scann.nextLine();
        System.out.println("Por favor ingrese el ISBN del libro");
        String i = scann.nextLine();
        System.out.println("Por favor ingrese el autor del libro");
        String a = scann.nextLine();
        System.out.println("Por favor ingrese el número de páginas del libro");
        int p = scann.nextInt();
        Libro libro = new Libro(t, i, a, p);
        return libro;
}

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", ISBN=" + ISBN + ", autor=" + autor + ", paginas=" + paginas + '}';
    }


    
    
    
}
