/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_faviohuaman;

import javax.swing.JOptionPane;

public class Animal {
    //Atributos
    String nombre;
    int edad;
    
    public String obtenerNombre() {
        JOptionPane.showMessageDialog(null,"El nombre del animal es " +nombre);
        return nombre;
    }
    
    public int obtenerEdad() {
        JOptionPane.showMessageDialog(null,"La edad del animal es " +edad);
        return edad; 
    }
    
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Nombre del animal: " + nombre + "\nEdad del animal: " + edad + " años");
    }
}