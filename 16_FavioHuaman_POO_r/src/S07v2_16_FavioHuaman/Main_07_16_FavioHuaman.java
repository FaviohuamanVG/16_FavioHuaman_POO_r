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
public class Main_07_16_FavioHuaman {
    public static void main(String[] args) {
        
        Persona1_16 persona1 = new Persona1_16 ("Juan Pérez", 30, "123 Calle Principal");

        // Crear una instancia de Persona sin dirección
        Persona1_16 persona2 = new Persona1_16("María López", 25);

        // Mostrar información de ambas personas
        
        boolean j = persona1.flot(true);
        boolean x = persona2.flot(false);
        System.out.println(x);
        System.out.println(j);
        persona1.mostrarInformacion();
        persona1.getNombre();
        System.out.println("-------------------------");
        persona2.mostrarInformacion();
        persona2.getNombre();
    }
}
