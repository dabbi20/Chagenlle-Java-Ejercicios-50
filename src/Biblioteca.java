import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {

    private List<Libro> catalogo;
    private Map<String, Libro> indicePorIsbn;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        catalogo = new ArrayList<>();
        indicePorIsbn = new HashMap<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {

        catalogo.add(libro);
        indicePorIsbn.put(libro.getIsbn(), libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Libro buscarLibro(String isbn) {
        return indicePorIsbn.get(isbn);
    }

    public Prestamo crearPrestamo(
            String idPrestamo,
            Usuario usuario,
            String isbn,
            LocalDate fechaInicio,
            LocalDate fechaVencimiento) {

        Libro libro = buscarLibro(isbn);

        if (libro == null) {
            throw new IllegalArgumentException(
                    "No existe un libro con ese ISBN."
            );
        }

        Prestamo prestamo = new Prestamo(
                idPrestamo,
                libro,
                usuario,
                fechaInicio,
                fechaVencimiento
        );

        prestamos.add(prestamo);

        return prestamo;
    }

    public void devolverLibro(
            String idPrestamo,
            LocalDate fechaDevolucion) {

        Prestamo prestamoEncontrado = null;

        for (Prestamo prestamo : prestamos) {

            if (prestamo.getId().equals(idPrestamo)) {
                prestamoEncontrado = prestamo;
                break;
            }
        }

        if (prestamoEncontrado == null) {
            throw new IllegalArgumentException(
                    "No existe un préstamo con ese id."
            );
        }

        prestamoEncontrado.registrarDevolucion(
                fechaDevolucion
        );
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Libro> getCatalogo() {
        return catalogo;
    }
}