package ejer0;


public class Prestamo {
    private String idPrestamo;
    private Libro libro;
    private Usuario usuario;

    public Prestamo(String idPrestamo, Libro libro, Usuario usuario) {
        this.idPrestamo = idPrestamo;
        this.libro = libro;
        this.usuario = usuario;
    }

    public void realizarPrestamo() {
        if (!libro.estaPrestado()) {
            libro.prestar();
            usuario.agregarPrestamo(libro);
            System.out.println("Préstamo realizado: " + libro.informacion() + "\nEstado: Prestado");
        } else {
            System.out.println("El libro " + libro.informacion() + " \\nno está disponible para préstamo.");
        }
    }

    public void finalizarPrestamo() {
        libro.devolver();
        usuario.removerPrestamo(libro);
        System.out.println("Préstamo finalizado para libro: " + libro.informacion() + "\nEstado: Disponible");
    }
}