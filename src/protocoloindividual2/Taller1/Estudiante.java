/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual2.Taller1;

/**
 *
 * @author juana
 */
public class Estudiante {
    
    String nombre;
    String curso;
    int edad;
    
    public Estudiante() {
        nombre = "No asignado";
        curso = "Desconocido";
        edad = 0;
    }
    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Estudiante(String curso) {
        this.curso = curso; }
    
    public Estudiante(String nombre, int edad, String curso) {
        this(curso);
        this.nombre = nombre; 
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Estudiante = Nombre: " + nombre + ", Curso: " + curso + ", Edad: " + edad; }
}
