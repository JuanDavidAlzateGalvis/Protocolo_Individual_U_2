/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual2.Taller1;

import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
    
        Libro libro1 = new Libro();
        Estudiante estudiante1 = new Estudiante();
        CuentaBancaria cuenta1 = new CuentaBancaria();

        System.out.println("Constructor por defecto:");
        System.out.println("");
        System.out.println(libro1.toString());
        System.out.println(estudiante1.toString());
        System.out.println(cuenta1.toString());
        
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Libro...");
        System.out.print("Ingrese el titulo del libro: ");
        String titulo = teclado.nextLine();
        
        System.out.print("Ingrese el nombre del autor del libro: ");
        String autor = teclado.nextLine();

        System.out.print("Ingrese el numero de paginas del libro: ");
        int numeroPaginas = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("");
        System.out.println("Estudiante...");
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = teclado.nextLine();
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("Ingrese el nombre del curso: ");
        String curso = teclado.nextLine();
        
        System.out.println("");
        System.out.println("Cuenta bancaria...");
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = teclado.nextLine();
        
        System.out.print("Ingrese el numero de la cuenta: ");
        String numeroCuenta = teclado.nextLine();

        System.out.print("Ingrese el saldo: ");
        double saldo = teclado.nextDouble();
        
        Libro libro2 = new Libro(titulo, autor, numeroPaginas);
        Estudiante estudiante2 = new Estudiante(nombre, edad, curso);
        CuentaBancaria cuenta2 = new CuentaBancaria(tipoCuenta, numeroCuenta, saldo);

        System.out.println("");
        System.out.println("Constructor ingresado por consola:");
        System.out.println("");
        System.out.println(libro2.toString());
        System.out.println(estudiante2.toString());
        System.out.println(cuenta2.toString());
        
        teclado.close();
    }
}
