package ejerLectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejer4PalabraRepite {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario el nombre del fichero
	        System.out.println("Introduce el nombre del fichero que contiene las palabras (por ejemplo: frutas.txt):");
	        String nombreFichero = scanner.nextLine();

	        // Crear el objeto File para el fichero
	        File fichero = new File(nombreFichero);

	        // Comprobar si el fichero existe
	        if (!fichero.exists()) {
	            System.out.println("El fichero no existe.");
	            return;
	        }

	        // Mapa para contar las veces que se repite cada palabra
	        Map<String, Integer> conteoPalabras = new HashMap<>();

	        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
	            String linea;

	            // Leer el fichero línea por línea
	            while ((linea = reader.readLine()) != null) {
	                // Convertir la línea a minúsculas y eliminar cualquier signo de puntuación
	                // para evitar que "manzana" y "manzana," se consideren palabras diferentes
	                linea = linea.toLowerCase().replaceAll("[^a-záéíóúñ ]", "");

	                // Dividir la línea en palabras usando espacios en blanco como delimitador
	                String[] palabras = linea.split("\\s+");

	                // Contar cada palabra
	                for (String palabra : palabras) {
	                    if (!palabra.isEmpty()) {
	                        // Si la palabra ya está en el mapa, aumentar su contador
	                        conteoPalabras.put(palabra, conteoPalabras.getOrDefault(palabra, 0) + 1);
	                    }
	                }
	            }

	            // Mostrar el conteo de palabras
	            System.out.println("Conteo de palabras en el fichero:");
	            for (Map.Entry<String, Integer> entry : conteoPalabras.entrySet()) {
	                System.out.println(entry.getKey() + ": " + entry.getValue());
	            }

	        } catch (IOException e) {
	            System.out.println("Ocurrió un error al leer el fichero: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }

}
