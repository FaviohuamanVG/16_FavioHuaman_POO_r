/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_faviohuaman;

/**
 *
 * @author Carlos
 */
public class Calculator {
    //atributos
    int a;
    int b;
    int total;
    
    public void suma(){
        total = a + b;
        System.out.println("La suma es "+total);
    }
    
    public void resta(){
        total = a - b;
        System.out.println("La resta es "+total);
    }
    
    public void multi(){
        total = a * b;
        System.out.println("La multiplicacion es "+total);
    }
    
     public void div(){
        total = a / b;
        System.out.println("La division es "+total);
    }
    
}
