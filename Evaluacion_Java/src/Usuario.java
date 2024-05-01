// Nombre alumno: Alex Fernandez
// Evaluación Java


import java.util.ArrayList;
import java.util.List;

public class Usuario {
    // Atributos
    private String nombre;
    private List<Libro> librosPrestados;

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    // Métodos
    public void tomar_prestado(String tituloLibro) {
        boolean disponible = false;

        // Aqui recorremos la lista de libros totales
        for (Libro libro: Libro.getListaTodosLibros()) {

            // Miro si el titulo del libro coincide con el nombre que le he pasado
            if(libro.getTituloLibro().equals(tituloLibro)) {
                disponible = true;
                boolean dispo_libro = libro.getDisponibilidad();
                if(dispo_libro == true) {
                    librosPrestados.add(libro);
                    libro.marcar_prestado();

                    //lista libros prestados .add(libro)
                    System.out.println("El libro con título: " + libro.getTituloLibro() + " ha sido prestado al usuario " + this.nombre);
                } else {
                    System.out.println("El libro " + libro.getTituloLibro() + " no está disponible.");
                }
                break;
            }
        }
        if(disponible == false){
            System.out.println("Libro no encontrado: " + tituloLibro);
        }

    }

    public void devolver_prestado(String tituloLibro) {
        boolean disponible = false;

        for (Libro libro: Libro.getListaTodosLibros()) {
            if(libro.getTituloLibro().equals(tituloLibro)) {
                disponible = true; {
                    librosPrestados.remove(tituloLibro);
                    libro.marcar_devuelto();

                    System.out.print("El libro con título: " + libro.getTituloLibro() + " ha sido devuelto por el usuario " + this.nombre);
                }
                break;
            }
            if(disponible == false){
                System.out.println("Libro no encontrado: " + tituloLibro);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }
}
