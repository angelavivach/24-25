package ejer0;

public class Biblioteca2 {

	public static void main(String[] args) {
		  // Creación de libros
        Libro libro3 = new Libro("9788466374972", "DANZA DE DRAGONES", "GEORGE R.R. MARTIN", 2011);
        Libro libro4 = new Libro(" 9788499898902", "EL MONSTRUO VIENE A VERME", "SIOBHAN DOWD", 2011);

        // Creación de usuarios
        Usuario usuario3 = new Usuario("u789", "Maria", "987654321", "maria@email.com");
        Usuario usuario4 = new Usuario("u101", "Daniel", "123456789", "daniel@email.com");

        // Realización de préstamos en Biblioteca2
        Prestamo prestamo3 = new Prestamo("p3", libro3, usuario3);
        prestamo3.realizarPrestamo();

        Prestamo prestamo4 = new Prestamo("p4", libro4, usuario4);
        prestamo4.realizarPrestamo();

        // Devolución de préstamo en Biblioteca2
        prestamo3.finalizarPrestamo();

	}

}
