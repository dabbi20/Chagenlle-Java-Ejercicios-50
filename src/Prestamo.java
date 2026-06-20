import java.time.LocalDate;

public class Prestamo {

    private String id;
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private LocalDate fechaDevolucion;

    public Prestamo(String id,
                    Libro libro,
                    Usuario usuario,
                    LocalDate fechaInicio,
                    LocalDate fechaVencimiento) {

        if (fechaVencimiento.isBefore(fechaInicio)) {
            throw new IllegalArgumentException(
                    "La fecha de vencimiento no puede ser anterior a la fecha de inicio."
            );
        }

        this.id = id;
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;

        libro.prestar();
    }

    public boolean estaActivo() {
        return fechaDevolucion == null;
    }

    public boolean estaVencido() {

        if (fechaDevolucion == null) {
            return false;
        }

        return fechaDevolucion.isAfter(fechaVencimiento);
    }

    public void registrarDevolucion(LocalDate fechaDevolucion) {

        if (!estaActivo()) {
            throw new IllegalStateException(
                    "El préstamo ya fue devuelto."
            );
        }

        this.fechaDevolucion = fechaDevolucion;

        libro.devolver();
    }

    public String getId() {
        return id;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
}