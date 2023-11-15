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
public class Persona1_16 {
        // Atributos de la clase Persona1_16
    private String nombre;
    private int edad;
    private String direccion;

    // Constructor de la clase Persona1_16
    public Persona1_16(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Otro constructor para permitir crear una Persona1_16 sin dirección
    public Persona1_16(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = "Dirección no especificada";
    }

    // Métodos para acceder y modificar los atributos
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    // Sobrecarga de métodos
    public boolean flot(boolean a) {
        return a;
    }
    public boolean flot(int a) {
        return a > 0;
    }
    // Métodos con valores de retorno (3 tipos de datos diferentes)
    public int calcularEdadEnMeses() {
        return edad * 12;
    }
    public double obtenerPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
    public String obtenerSaludo() {
        return "¡Hola! Mi nombre es " + nombre;
    }
    // Métodos con parámetros y argumentos
    public void setInformacion(String nuevoNombre, int nuevaEdad, String nuevaDireccion) {
        nombre = nuevoNombre;
        edad = nuevaEdad;
        direccion = nuevaDireccion;
    }
    public void imprimirMensaje(String mensaje, int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.println(mensaje);
        }
    }
    // Método para mostrar la información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Dirección: " + direccion);
    }
}
