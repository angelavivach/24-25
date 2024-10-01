package ejerEscritura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejer4Ruta {
	
	// Método para copiar el contenido de dos ficheros en uno nuevo
    public static void copiarContenido(String rutaFichero1, String rutaFichero2, String rutaDestino) {
        File fichero1 = new File(rutaFichero1);
        File fichero2 = new File(rutaFichero2);

        // Comprobar si los ficheros existen
        if (!fichero1.exists() || !fichero2.exists()) {
            System.out.println("Uno o ambos ficheros no existen. Asegúrate de que las rutas son correctas.");
            return;
        }

        // Crear el nombre del nuevo fichero
        String nombreNuevoFichero = crearNombreNuevoFichero(fichero1.getName(), fichero2.getName());
        File nuevoFichero = new File(rutaDestino, nombreNuevoFichero);

        try (FileWriter writer = new FileWriter(nuevoFichero);
             BufferedReader reader1 = new BufferedReader(new FileReader(fichero1));
             BufferedReader reader2 = new BufferedReader(new FileReader(fichero2))) {

            // Copiar contenido del primer fichero
            String linea;
            while ((linea = reader1.readLine()) != null) {
                writer.write(linea + "\n");
            }

            // Copiar contenido del segundo fichero
            while ((linea = reader2.readLine()) != null) {
                writer.write(linea + "\n");
            }

            System.out.println("Contenido copiado exitosamente en: " + nuevoFichero.getPath());

        } catch (IOException e) {
            System.out.println("Ocurrió un error al copiar el contenido: " + e.getMessage());
        }
    }

    // Método para crear el nombre del nuevo fichero
    private static String crearNombreNuevoFichero(String nombreFichero1, String nombreFichero2) {
        // Quitar la extensión del fichero
        String nombreBase1 = nombreFichero1.contains(".") ? nombreFichero1.substring(0, nombreFichero1.lastIndexOf('.')) : nombreFichero1;
        String nombreBase2 = nombreFichero2.contains(".") ? nombreFichero2.substring(0, nombreFichero2.lastIndexOf('.')) : nombreFichero2;
        
        return nombreBase1 + "_" + nombreBase2 + ".txt"; // Asumimos que el nuevo fichero es de tipo .txt
    }
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la ruta del primer fichero
        System.out.println("Introduce la ruta del primer fichero de texto:");
        String rutaFichero1 = scanner.nextLine();

        // Pedir la ruta del segundo fichero
        System.out.println("Introduce la ruta del segundo fichero de texto:");
        String rutaFichero2 = scanner.nextLine();

        // Pedir la ruta de destino
        System.out.println("Introduce la ruta de destino (sin nombre de fichero):");
        String rutaDestino = scanner.nextLine();

        // Copiar el contenido de los ficheros en uno nuevo
        copiarContenido(rutaFichero1, rutaFichero2, rutaDestino);

        scanner.close();
    }

    

}
