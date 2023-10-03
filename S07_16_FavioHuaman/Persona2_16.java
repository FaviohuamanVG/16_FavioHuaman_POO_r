/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_16_FavioHuaman;

/**
 *
 * @author Carlos
 */
public class Persona2_16 {
      //Atributos
    public String nombre;
    public int edad;
    
    public void per1(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String nombre(){
        return this.nombre;
    }
    
    public int edad(){
        return this.edad;
    }
    
    public void saludar(){
        System.out.println("Hola, soy " +this.nombre +" mi edad es " +this.edad);
        
    }
}
