package ejerLectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejer2NumCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el nombre del directorio
        System.out.println("Introduce el nombre del directorio donde crear el archivo:");
        String nombreDirectorio = scanner.nextLine();

        // Solicitar al usuario el nombre del fichero
        System.out.println("Introduce el nombre del fichero (con extensión, por ejemplo: archivo.txt):");
        String nombreFichero = scanner.nextLine();

        // Crear el objeto File para el directorio
        File directorio = new File(nombreDirectorio);

        // Verificar si el directorio no existe, crearlo
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado con éxito.");
            } else {
                System.out.println("No se pudo crear el directorio.");
                return;
            }
        }

        // Crear el objeto File para el fichero usando la ruta completa
        File fichero = new File(directorio, nombreFichero);

        try {
            // Crear el fichero si no existe
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado con éxito.");
                
                // Escribir un contenido básico en el archivo
                FileWriter writer = new FileWriter(fichero);
                writer.write("Este es un archivo creado por el programa.");
                writer.close();

                System.out.println("Contenido escrito en el fichero.");
                
            } else {
                System.out.println("El fichero ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }

        // Variables para contar caracteres y vocales
        int numCaracteres = 0;
        int numVocales = 0;

        // Usar la ruta completa del archivo para leer
        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
            int caracter;
            
            // Leer el fichero carácter por carácter
            while ((caracter = reader.read()) != -1) {
                char c = (char) caracter;
                
                // Contar el carácter leído
                numCaracteres++;
                
                // Comprobar si es una vocal
                if (esVocal(c)) {
                    numVocales++;
                }
            }

            // Mostrar resultados
            System.out.println("El fichero tiene " + numCaracteres + " caracteres.");
            System.out.println("El fichero tiene " + numVocales + " vocales.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Método auxiliar para comprobar si un carácter es una vocal
    private static boolean esVocal(char c) {
        // Convertir el carácter a minúscula para hacer la comprobación
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}



