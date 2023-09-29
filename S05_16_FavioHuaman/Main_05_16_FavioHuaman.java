/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_16_FavioHuaman;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Main_05_16_FavioHuaman {
     public static void main(String[] args) {
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

                JOptionPane.showMessageDialog(
            null,
            "Información del Estudiante:\nNombre: " + student.getNombre() + "\nEdad: " + student.getEdad(),
            "Información del Estudiante",
            JOptionPane.INFORMATION_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "Información del Libro:\nTítulo: " + libro.Titulo() + "\nAutor: " + libro.Autor(),
            "Información del Libro",
            JOptionPane.INFORMATION_MESSAGE
        );

        
     }
}
