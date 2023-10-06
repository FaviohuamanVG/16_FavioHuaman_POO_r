/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S10_16;

/**
 *
 * @author Carlos
 */
public class Entrenador_16 extends seleccionFutbol_16 {

    public Entrenador_16(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }
       
//atributos
    private String idFederacion;

//metodos
    public void dirigirPartido() {
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " es el entrenador");
    }

            
}
