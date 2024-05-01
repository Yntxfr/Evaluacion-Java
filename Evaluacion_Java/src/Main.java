// Nombre alumno: Alex Fernandez
// Evaluación Java

/*
Sistema Avanzado de Gestión de Biblioteca

Instrucciones:

Se debe crear un sistema para gestionar una Biblioteca. El sistema debe gestionar libros, autores, usuarios y miembros premium. Cada libro tiene un título, un autor y un indicador de disponibilidad, además hay una lista genérica de libros al que se añade cada libro en cuanto se crea. Los autores tienen un nombre y una lista de libros que han escrito, y son los únicos que pueden publicar los libros (cuando el autor publica el libro lo está creando). Los usuarios tienen un nombre y una lista de libros en préstamo. Los miembros premium, que heredan de usuarios, tienen la capacidad adicional de reservar libros que están actualmente prestados.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Biblioteca Yenots" + "\n");

        // Autores
        Autor autor1 = new Autor("Stephen King");
        Autor autor2 = new Autor("Marco Aurelio");
        Autor autor3 = new Autor("Albert Camus");

        // Libros
        autor1.publicar_libro("IT");
        autor1.publicar_libro("The Shinning");

        autor2.publicar_libro("Meditaciones");

        autor3.publicar_libro("La caída");

        autor3.publicar_libro("El extranjero");

        // Usuarios
        Usuario usuario1 = new Usuario("Yenot Kehoe");
        Usuario usuario2 = new Usuario("Kermit Frogue");

        // Miembro Premium
        MiembroPermium mPremium1 = new MiembroPermium("Otter Sologon");


        // Prints
        System.out.println("Libros publicados por: " + autor1.getNombre());
        for (Libro libro : autor1.getLibros()) {
            System.out.println(libro.getTituloLibro());
        }

        // Espacio
        System.out.println("\n");
        usuario1.tomar_prestado("IT");
        usuario2.tomar_prestado("IT");
        usuario2.tomar_prestado("Meditaciones");

        // Espacio
        System.out.println("\n");
        usuario1.devolver_prestado("IT");
        usuario2.devolver_prestado("Meditaciones");

        // Espacio
        System.out.println("\n");
        mPremium1.reservar_libro("IT");
        mPremium1.cancelar_reserva("IT");








    }
}

/* for para toda lista de libros
    unir –
    for – para encontrar titulo disponible
    en caso de estar disponible lo reserva y lo añade a su lista
    break para cerrar bucle

    dentro de la variable crear un boolean, la inicializo a falso
    cuando encuentro el libro pongo la variable a true


   Autor 1 crea libro 1
 */