// Nombre alumno: Alex Fernandez
// Evaluación Java


import java.util.ArrayList;
import java.util.List;

public class Libro {
    // Atributos
    private String tituloLibro;
    private Autor autor;
    private boolean disponible;
    // Creando la lista donde se irán añadiendo todos los libros creados
    private static List<Libro> listaTodosLibros = new ArrayList<>();

    // Constructor
    public Libro(String tituloLibro, Autor autor) {
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.disponible = true;
        listaTodosLibros.add(this);
    }

    // Métodos
    public String getTituloLibro() {
        return tituloLibro;
    }

    public Autor getAutorLibro() {
        return autor;
    }

    public static List<Libro> getListaTodosLibros() {
        return listaTodosLibros;
    }

    public boolean getDisponibilidad() {
        return disponible;
    }

    public boolean marcar_prestado() {
        System.out.println("El libro " + this.tituloLibro + " deja de estar disponible");
        return this.disponible = false;
    }

    public boolean marcar_devuelto() {
        System.out.println("El libro " + this.tituloLibro + " vuelve a estar disponible");
        return this.disponible = true;
    }

    public boolean marcar_reservado() {
        System.out.println("El libro " + this.tituloLibro + " ha sido reservado");
        return this.disponible = false;
    }
}
