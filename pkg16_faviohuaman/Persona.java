/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_faviohuaman;

/**
 *
 * @author Carlos
 */
public class Persona {
    //atributospublic class Juegos {

    String nombre;
    String accion;
    String accion2;

    public void hablar() {
        System.out.println("El alumno " + nombre + " dijo "+ accion +"");
    }
    
    public void orden(){
        System.out.println("El alumno realizo la accion de " +accion2 + "");
    }

}
