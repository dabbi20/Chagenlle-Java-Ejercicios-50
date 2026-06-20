public class Libro {

    private String id;
    private String titulo;
    private String autor;
    private String isbn;
    private EstadoLibro estadoLibro;

    public Libro(String id, String titulo,
                 String autor, String isbn) {

        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estadoLibro = EstadoLibro.DISPONIBLE;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public EstadoLibro getEstadoLibro() {
        return estadoLibro;
    }

    public boolean estaDisponible() {
        return estadoLibro == EstadoLibro.DISPONIBLE;
    }

    public void prestar() {

        if (!estaDisponible()) {
            throw new IllegalStateException(
                    "El libro ya está prestado."
            );
        }

        estadoLibro = EstadoLibro.PRESTADO;
    }

    public void devolver() {
        estadoLibro = EstadoLibro.DISPONIBLE;
    }
}