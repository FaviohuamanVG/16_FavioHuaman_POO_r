/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07v2_16_FavioHuaman;

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
            // dos objetos de la clase Persona1_16
        Persona1_16 persona1 = new Persona1_16("Juan", 30, "Calle A");
        Persona1_16 persona2 = new Persona1_16("María", 25);

        // Llamar a métodos de la clase Persona1_16
        persona1.mostrarInformacion();
        System.out.println("Flotante: " + persona1.flot(true));
        persona2.mostrarInformacion();
    }
}
