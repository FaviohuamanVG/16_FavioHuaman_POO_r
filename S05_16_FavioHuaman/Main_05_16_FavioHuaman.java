/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_16_FavioHuaman;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Main_05_16_FavioHuaman {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
    /*     //JOPTIONPANE
         String nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        int edadEstudiante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        
        //Objeto Estudiante
        Estudiante student = new Estudiante(nombreEstudiante, edadEstudiante);
        
        student.getEdad();
        student.getNombre();
        
        
        //Objeto Libro
        String tituloLibro = JOptionPane.showInputDialog("Ingrese el título del libro:");
        String autorLibro = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        Libro libro = new Libro(tituloLibro, autorLibro);

        JOptionPane.showMessageDialog(null,"Información del Estudiante:\nNombre: " + student.getNombre() + "\nEdad: " + student.getEdad(),"Información del Estudiante",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Información del Libro:\nTítulo: " + libro.Titulo() + "\nAutor: " + libro.Autor(),"Información del Libro",JOptionPane.INFORMATION_MESSAGE);      
     }
     */
     
     
     //Scanner
     
     
        // Interactuar con la clase CuentaBancaria
        System.out.print("Ingrese el nombre del titular de la cuenta bancaria: ");
        String titular = scanner.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(titular);

        System.out.print("Ingrese la cantidad a depositar: ");
        double cantidadDeposito = scanner.nextDouble();
        cuenta.depositar(cantidadDeposito);

        System.out.print("Ingrese la cantidad a retirar: ");
        double cantidadRetiro = scanner.nextDouble();
        cuenta.retirar(cantidadRetiro);

        System.out.println("Saldo final de la cuenta bancaria: " + cuenta.getSaldo());

        // Interactuar con la clase Auto
        scanner.nextLine(); // Consumir la nueva línea
        System.out.print("Ingrese la marca del auto: ");
        String marcaAuto = scanner.nextLine();

        System.out.print("Ingrese el modelo del auto: ");
        String modeloAuto = scanner.nextLine();

        System.out.print("Ingrese el año del auto: ");
        int anioAuto = scanner.nextInt();

        Auto auto = new Auto(marcaAuto, modeloAuto, anioAuto);
        auto.mostrarInformacion();

        scanner.close();
    }

}
