package com.mycompany.generar;

/**
 * @author Fanny
 */
public class Generar {

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("       PROYECTO CONSOLA          ");
        System.out.println("================================");
        System.out.println("Bienvenido a mi programa en NetBeans 23");
        System.out.println();
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Hola, " + nombre + "! Gracias por ejecutar este programa.");
        scanner.close();
    }
}
