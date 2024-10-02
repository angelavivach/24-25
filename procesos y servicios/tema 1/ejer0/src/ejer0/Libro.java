package ejer0;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean prestado; // Indica si el libro está prestado o no

    public Libro(String isbn, String titulo, String autor, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false; // Al crear un libro, por defecto no está prestado
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    public String informacion() {
        return "Libro: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn + "\nAño de Publicación: " + anioPublicacion;
    }

    public boolean estaPrestado() {
        return prestado;
    }
}