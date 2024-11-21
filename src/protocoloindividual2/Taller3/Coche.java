/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual2.Taller3;

/**
 *
 * @author juana
 */
public class Coche {

    String marca;
    String modelo;
    static int contadorCoches = 0;

    public Coche() {
        contadorCoches++; }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarContador() {
        System.out.println("Contador de coches: " + contadorCoches); }

    public void mostrarDetalles() {
        System.out.println("Marca del coche: " + marca);
        System.out.println("Modelo del coche: " + modelo);
    }

    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Toyota", "2019");
        Coche coche2 = new Coche("Mazda", "2024");
        
        System.out.println("Ejercicio 1");
        System.out.println("");
        coche1.mostrarDetalles();
        System.out.println("");
        coche2.mostrarDetalles();
        System.out.println("");
        Coche.mostrarContador();
    }
}
