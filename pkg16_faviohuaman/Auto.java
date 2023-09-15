/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_faviohuaman;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Auto {
    //atributos
    String marca;
    String color;
    int km;
    
    public void marca(){
        JOptionPane.showMessageDialog(null,"El auto es de la marca " + marca );
    }
    
    public void color(){
        JOptionPane.showMessageDialog(null,"El color del carro es " + color);
    }
    
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Marca del auto: " + marca + "\nColor del Auto: " + color + "\nY recorrio " + km + "km");
    }
}
