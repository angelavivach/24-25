package ejerLectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ejer5Alfabeticamente {
	
	  // Función para comprobar si el fichero existe
    public static boolean existeFichero(String nombreFichero) {
        File fichero = new File(nombreFichero);
        return fichero.exists();
    }

    // Función para leer las palabras del fichero
    public static List<String> leerPalabrasFichero(String nombreFichero) {
        List<String> listaPalabras = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;

            // Leer el fichero línea por línea
            while ((linea = reader.readLine()) != null) {
                // Dividir la línea en palabras usando espacios como delimitador
                String[] palabras = linea.split("\\s+");

                // Añadir cada palabra a la lista
                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        listaPalabras.add(palabra.toLowerCase()); // Convertir a minúsculas para evitar problemas de orden
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero: " + e.getMessage());
        }

        return listaPalabras;
    }

    // Función para ordenar alfabéticamente la lista de palabras
    public static void ordenarPalabras(List<String> listaPalabras) {
        Collections.sort(listaPalabras);
    }

    // Función para mostrar las palabras ordenadas
    public static void mostrarPalabrasOrdenadas(List<String> listaPalabras) {
        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : listaPalabras) {
            System.out.println(palabra);
        }
    }

    // Función para guardar las palabras ordenadas en un fichero
    public static void guardarPalabrasOrdenadas(List<String> listaPalabras, String nombreFicheroSalida) {
        try (FileWriter writer = new FileWriter(nombreFicheroSalida)) {
            for (String palabra : listaPalabras) {
                writer.write(palabra + "\n");
            }
            System.out.println("Las palabras ordenadas se han escrito en el fichero: " + nombreFicheroSalida);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo de salida: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el nombre del fichero
        System.out.println("Introduce el nombre del fichero que contiene las palabras (por ejemplo: planetas.txt):");
        String nombreFichero = scanner.nextLine();

        // Comprobar si el fichero existe
        if (!existeFichero(nombreFichero)) {
            System.out.println("El fichero no existe.");
            return;
        }

        // Leer las palabras del fichero y guardarlas en una lista
        List<String> listaPalabras = leerPalabrasFichero(nombreFichero);

        // Ordenar la lista de palabras
        ordenarPalabras(listaPalabras);

        // Mostrar las palabras ordenadas
        mostrarPalabrasOrdenadas(listaPalabras);

        // Guardar las palabras ordenadas en un nuevo fichero
        guardarPalabrasOrdenadas(listaPalabras, "planetas_ordenados.txt");

        scanner.close();
    }

}
