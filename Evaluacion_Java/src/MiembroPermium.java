// Nombre alumno: Alex Fernandez
// Evaluación Java


import java.util.ArrayList;
import java.util.List;

public class MiembroPermium extends Usuario {
    // Atributos
    private List<Libro> librosReservados;

    // Constructor
    public MiembroPermium(String nombre) {
        super(nombre);
        this.librosReservados = new ArrayList<>();
    }

    //Métodos
    public String getNombre() {
        return super.getNombre();
    }

    public void reservar_libro(String tituloLibro) {
        boolean disponible = false;

        for (Libro libro : Libro.getListaTodosLibros()) {

            if (libro.getTituloLibro().equals(tituloLibro)) {
                disponible = true;
                boolean dispo_libro = libro.getDisponibilidad();
                if (dispo_libro == true) {
                    librosReservados.add(libro);
                    libro.marcar_reservado();

                    System.out.println("El libro con el título: " + libro.getTituloLibro() + " ha sido reservado con éxito por el usuario " + this.getNombre());
                } else {
                    System.out.println("El libro " + libro.getTituloLibro() + " no existe.");
                }
                break;
            }
        }
    }

    public void cancelar_reserva(String tituloLibro) {
        boolean disponible = false;

        for (Libro libro: Libro.getListaTodosLibros()) {
            if(libro.getTituloLibro().equals(tituloLibro)) {
                disponible = true; {
                    librosReservados.remove(tituloLibro);
                    libro.marcar_reservado();

                    System.out.print("La reserva del libro: " + libro.getTituloLibro() + " ha sido cancelada por el usuario " + this.getNombre());
                }
                break;
            }
            if(disponible == false){
                System.out.println("Libro no encontrado: " + tituloLibro);
            }
        }
    }
}
