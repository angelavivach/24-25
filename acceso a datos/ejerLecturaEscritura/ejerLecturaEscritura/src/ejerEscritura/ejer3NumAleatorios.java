package ejerEscritura;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ejer3NumAleatorios {
	 // Función para generar y guardar números aleatorios en un fichero
    public static void guardarNumerosAleatorios(int cantidad, String rutaFichero) {
        Random random = new Random();

        try (FileWriter writer = new FileWriter(rutaFichero)) {
            // Generar los números aleatorios y escribirlos en el fichero
            for (int i = 0; i < cantidad; i++) {
                int numeroAleatorio = random.nextInt(Integer.MAX_VALUE); // Número entero positivo aleatorio
                writer.write(numeroAleatorio + "\n");
            }

            System.out.println("Se han generado y guardado " + cantidad + " números aleatorios en el fichero " + rutaFichero);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el fichero: " + e.getMessage());
        }
    }
    
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Pedir la cantidad de números aleatorios al usuario
	        System.out.println("Introduce la cantidad de números aleatorios que deseas generar:");
	        int cantidadNumeros = scanner.nextInt();

	        // Limpiar el buffer del scanner
	        scanner.nextLine();

	        // Pedir la ruta del fichero donde se guardarán los números
	        System.out.println("Introduce la ruta del fichero (por ejemplo: numerosAleatorios.txt):");
	        String rutaFichero = scanner.nextLine();

	        // Generar y guardar los números aleatorios
	        guardarNumerosAleatorios(cantidadNumeros, rutaFichero);

	        scanner.close();
	    }

	   

}
