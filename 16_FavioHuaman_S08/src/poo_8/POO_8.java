/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_8;

/**
 *
 * @author Carlos
 */
public class POO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculadora cal = new Calculadora(1, 2);
        cal.cal();
        cal.suma();
        int j = cal.suma2(3, 4);
        System.out.println(j);
        
        
    }
    
}
