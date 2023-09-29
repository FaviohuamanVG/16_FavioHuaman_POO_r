/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_16;

/**
 *
 * @author Carlos
 */
public class Libro {
    private String titulo;
    private String autor;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Métodos para acceder a los atributos
    public String Titulo() {
        return titulo;
    }

    public String Autor() {
        return autor;
    }
}
