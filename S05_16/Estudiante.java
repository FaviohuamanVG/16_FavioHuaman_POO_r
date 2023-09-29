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
public class Estudiante {
    public String nombre;
    public int edad;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos 
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
