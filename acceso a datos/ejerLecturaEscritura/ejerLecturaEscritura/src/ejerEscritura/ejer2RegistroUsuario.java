package ejerEscritura;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejer2RegistroUsuario {
	public static void main(String[] args) {
        String nombreFichero = "registroDeUsuario.txt";
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(nombreFichero, true)) {
            String frase;

            // Bucle para leer las frases del usuario
            while (true) {
                System.out.println("Introduce una frase (escribe 'fin' para terminar):");
                frase = scanner.nextLine();

                // Si el usuario introduce "fin", se sale del bucle
                if (frase.equalsIgnoreCase("fin")) {
                    break;
                }

                // Guardar la frase en el fichero con un salto de línea
                writer.write(frase + "\n");
            }

            System.out.println("Las frases se han guardado en el fichero " + nombreFichero);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el fichero: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
