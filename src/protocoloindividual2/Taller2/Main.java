/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual2.Taller2;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Alzate", 15);
        Producto producto = new Producto("Cocacola", 3000);
        
        System.out.println("Constructor por defecto:");
        System.out.println(estudiante.mostrarEstudiante());
        
        System.out.println("");
        System.out.println("Constructor por parametros:");
        System.out.println(producto.mostrarProducto());
        System.out.println(estudiante2.mostrarEstudiante());
    }
}
