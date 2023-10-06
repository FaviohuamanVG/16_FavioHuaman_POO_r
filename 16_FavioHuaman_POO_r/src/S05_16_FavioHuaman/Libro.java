package S05_16_FavioHuaman;

/**
 *
 * @author Carlos
 */
public class Libro {
    private String titulo;
    private String autor;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Métodos para acceder a los atributos
    public String Titulo() {
        return titulo;
    }

    public String Autor() {
        return autor;
    }
}
