package ejer0;

public class Biblioteca1 {

	public static void main(String[] args) {
		 Libro libro1 = new Libro("978-3-16-675432-0", "El Señor de los Anillos", "J.R.R. Tolkien", 1954);
	        Libro libro2 = new Libro("978-0-553-978657-1", "1984", "George Orwell", 1949);

	        // Creación de usuarios
	        Usuario usuario1 = new Usuario("u123", "Angela", "123456789", "angela@email.com");
	        Usuario usuario2 = new Usuario("u456", "pascual", "987654321", "pascual.com");


        // Realización de préstamos en Biblioteca1
        Prestamo prestamo1 = new Prestamo("p1", libro1, usuario1);
        prestamo1.realizarPrestamo();

        Prestamo prestamo2 = new Prestamo("p2", libro2, usuario2);
        prestamo2.realizarPrestamo();

        // Devolución de préstamo en Biblioteca1
        prestamo1.finalizarPrestamo();

	}

}
