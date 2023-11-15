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
public class Calculadora {
    //atributos
    int a;
    int b;
    
    //metodo
    public void cal(){
        System.out.println(a);
    }
    
    
    
    //metodo constructor
    //sobre carga de constr
    public Calculadora(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public Calculadora(int a){
        this.a = a;    
    }
        
    //metodos
    
    public void suma(){
        int suma = a + b;
        System.out.println("la suma es "+ suma );
    }
    
    public int suma2(int a, int b){
        return a + b;
    }
    
}
