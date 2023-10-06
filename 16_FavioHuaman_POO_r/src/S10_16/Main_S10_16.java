/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S10_16;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Main_S10_16 {
    
    public static ArrayList<seleccionFutbol_16> integrantes = new ArrayList<seleccionFutbol_16>(); 
    
        Futbolista_16 futbolista1 = new Futbolista_16(9, "arquero", 1, "paolo", "guerrero", 42);
        Masajista_16 masajista1  = new Masajista_16("si", 15, 2, "raul", "Martines", 50);
        Entrenador_16 RicardoGareca = new Entrenador_16("uno", 1, "Ricardo", "Gareca", 65);
        
        //ENTRESNAR
        futbolista1.concentrarse();
        futbolista1.entrenar();
        
        masajista1.darMasaje();
        masajista1.concentrarse();  
    }
}
