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
public class Main_07_16_FavioHuaman {
    public static void main(String[] args) {
        Persona1_16 per1 = new Persona1_16();
        Persona2_16 per2 = new Persona2_16();
        
        per1.per1("Maria", 21);
        per1.saludar();
        per2.nombre();
        per2.edad();
        per2.per1("Jose", 20);
        per2.saludar();
    }
}
