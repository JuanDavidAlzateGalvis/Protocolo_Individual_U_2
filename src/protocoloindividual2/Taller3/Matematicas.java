/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual2.Taller3;

/**
 *
 * @author juana
 */
public class Matematicas {
    
    static int sumar(int a, int b) {
        return a + b; } 
    
    static int restar(int a, int b) {
        return a - b; }
    
    static int multiplicar(int a, int b) { 
        return a * b; }
    
    static int dividir(int a, int b) { 
        return a / b; }

    public static void main(String[] args) {
        
        int a = 30;
        int b = 15;
        
        System.out.println("Operaciones basicas");
        System.out.println("");
        System.out.println("Suma de " + a + " y " + b + ": " + Matematicas.sumar(a, b));
        System.out.println("Resta de " + a + " y " + b + ": " + Matematicas.restar(a, b));
        System.out.println("Multiplicacion de " + a + " y " + b + ": " + Matematicas.multiplicar(a, b));
        System.out.println("Division de " + a + " y " + b + ": " + Matematicas.dividir(a, b));
    }
}
