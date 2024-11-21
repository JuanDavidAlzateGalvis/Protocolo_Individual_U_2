/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual2.Taller2;

/**
 *
 * @author juana
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    
    public Estudiante() {
        this("Desconocido", 0); }
    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String mostrarEstudiante() {
        return "Estudiante = nombre: " + nombre + ", edad: " + edad; }
}
