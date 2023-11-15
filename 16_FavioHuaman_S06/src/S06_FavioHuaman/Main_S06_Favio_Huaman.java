/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_FavioHuaman;

/**
 *
 * @author Carlos
 */
public class Main_S06_Favio_Huaman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear instancias de Estudiante_00
        Estudiante_16 estudiante1 = new Estudiante_16();
        Estudiante_16 estudiante2 = new Estudiante_16("Juan", 20);

        // Llamar a métodos de Estudiante_00
        estudiante1.estudiar();
        estudiante2.mostrarInformacion();

        // Crear instancia de Calculadora_00
        Calculadora_16 calculadora = new Calculadora_16();

        // Llamar a métodos de Calculadora_00 con sobrecarga
        int sumaEnteros = calculadora.sumar(5, 10);
        double sumaDoubles = calculadora.sumar(2.5, 3.5);
        double producto = calculadora.multiplicar(2.0, 3.0);

        // Imprimir resultados
        System.out.println("Suma de enteros: " + sumaEnteros);
        System.out.println("Suma de doubles: " + sumaDoubles);
        System.out.println("Producto de doubles: " + producto);
    }
    
}
