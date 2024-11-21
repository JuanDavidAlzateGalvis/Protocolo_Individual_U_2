/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual2.Taller2;

/**
 *
 * @author juana
 */
public class Producto {
    
    private String nombre;
    private int precio;
    
    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String mostrarProducto() {
        return "Producto = nombre: " + nombre + ", Precio: " + precio; }
    
    /**
    public static void mostrarNombre(){
        System.out.println(this.nombre);
    }
     */
}
