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
public class Masajista_16 extends seleccionFutbol_16 {
        
    public Masajista_16(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

//atributos
    private String titulacion;
    private int aniosExperiencia;

   
//metodos

    public void darMasaje() {
        System.out.println(nombre + " da masajes");
    }

}
