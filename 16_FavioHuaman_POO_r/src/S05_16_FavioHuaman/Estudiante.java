package S05_16_FavioHuaman;

/**
 *
 * @author Carlos
 */
public class Estudiante {
    public String nombre;
    public int edad;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos 
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
