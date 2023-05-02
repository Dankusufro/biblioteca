package biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private String fechaPublicacion;
    private String genero;

    public Libro(String titulo, String autor, String isbn, String fechaPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
