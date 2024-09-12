package ejer0;


import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String idUsuario;
    private String nombre;
    private String telefono;
    private String email;
    private List<Libro> librosPrestados;

    public Usuario(String idUsuario, String nombre, String telefono, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.librosPrestados = new ArrayList<>();
    }

    public void registrar() {
        // Método ficticio para registrar usuario en una base de datos, por ejemplo.
        System.out.println("Usuario registrado: " + nombre);
    }

    public void actualizarInfo(String telefono, String email) {
        this.telefono = telefono;
        this.email = email;
        System.out.println("Información actualizada para " + nombre);
    }

    public List<Libro> consultarPrestamos() {
        return librosPrestados;
    }

    public void agregarPrestamo(Libro libro) {
        librosPrestados.add(libro);
    }

    public void removerPrestamo(Libro libro) {
        librosPrestados.remove(libro);
    }
}
