// Nombre alumno: Alex Fernandez
// Evaluación Java


import java.util.ArrayList;
import java.util.List;

public class Autor {
    // Atributos
    private String nombre;
    // Cuando el autor publica el libro lo está creando
    private List<Libro> libros;

    // Constructor
    public Autor(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Métodos
    public void publicar_libro(String tituloLibro) {
        Libro libro = new Libro(tituloLibro, this);
        this.libros.add(libro);
        System.out.println("El libro '" + tituloLibro + "' ha sido publicado por: " + this.getNombre());
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

}
