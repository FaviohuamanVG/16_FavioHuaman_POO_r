/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_FavioHuaman;

/**
 *
 * @author Carlos
 */
public class Estudiante_16 {
    // Atributos_16
    String nombre;
    int edad;

    // Constructores_16
    Estudiante_16() {
    }

    Estudiante_16(String nombre, int edad) {
        // Constructor con parámetros
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos_16
    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}