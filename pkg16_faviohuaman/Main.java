/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_faviohuaman;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        //Calculadora
        Calculator objCall2 = new Calculator();
        
        System.out.println("Ingrese el valor a");
          objCall2.a = scanner.nextInt();
        System.out.println("Ingrese el valor b");
          objCall2.b = scanner.nextInt();
        
        objCall2.suma();
        objCall2.resta();
        objCall2.multi();
        objCall2.div();
        
        //Persona
        
        Persona objPersona1 = new Persona();
        Persona objPersona2 = new Persona();
        
        System.out.println("Ingrese el nombre");
          objPersona1.nombre = scanner.next();
        System.out.println("Ingrese la accion");
          objPersona1.accion = scanner.next();
        System.out.println("Ingrese la accion2");
          objPersona2.accion2 = scanner.next();
          
          objPersona1.hablar();
          objPersona2.orden();
        
        // Auto
        
        Auto objAuto1 = new Auto();
        
        objAuto1.marca = JOptionPane.showInputDialog("Ingrese la marca");
        objAuto1.color = JOptionPane.showInputDialog("Ingrese el color");
        objAuto1.km = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el km"));
        
        objAuto1.marca();
        objAuto1.color();
        objAuto1.mostrarInformacion();
        
        //Animal
        
        Animal objAnimal1 = new Animal();
                
        objAnimal1.nombre = JOptionPane.showInputDialog("Ingrese el nombre del aniumal");
        objAnimal1.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del animal"));
        
        objAnimal1.obtenerNombre();
        objAnimal1.obtenerEdad();
        objAnimal1.mostrarInformacion();
    }
}
