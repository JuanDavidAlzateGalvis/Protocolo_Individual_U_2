/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual2.Taller1;

/**
 *
 * @author juana
 */
public class Libro {
    
    String titulo;
    String autor;
    int numeroPaginas;
    
    public Libro() {
        titulo = "Desconocido";
        autor = "No asignado";
        numeroPaginas = 0;
    }
    
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    @Override
    public String toString() {
        return "Libro = Titulo: " + titulo + ", Autor: " + autor + ", Numero de paginas: " + numeroPaginas; }
}
