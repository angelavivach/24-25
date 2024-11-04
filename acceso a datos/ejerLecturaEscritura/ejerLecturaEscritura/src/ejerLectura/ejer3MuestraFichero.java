package ejerLectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejer3MuestraFichero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el nombre del fichero
        System.out.println("Introduce el nombre del fichero que contiene los restaurantes:");
        String nombreFichero = scanner.nextLine();

        // Crear el objeto File para el fichero
        File fichero = new File(nombreFichero);

        // Mostrar la ruta absoluta del fichero para verificar que se está leyendo el archivo correcto
        System.out.println("Ruta absoluta del fichero: " + fichero.getAbsolutePath());

        // Comprobar si el fichero existe
        if (!fichero.exists()) {
            System.out.println("El fichero no existe.");
            return;
        }

        // Comprobar si el fichero tiene permisos de lectura
        if (!fichero.canRead()) {
            System.out.println("El fichero no tiene permisos de lectura.");
            return;
        }

        // Definir los nombres de los campos
        String[] campos = {"Nombre", "Dirección", "Ciudad", "Teléfono", "Tipo"};

        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
            String linea;

            // Leer el fichero línea por línea
            while ((linea = reader.readLine()) != null) {
                // Separar los valores de los campos por comas (suponiendo CSV)
                String[] valores = linea.split(",");

                // Verificar que la línea tiene la cantidad correcta de valores
                if (valores.length != campos.length) {
                    System.out.println("Formato incorrecto en la línea: " + linea);
                    continue;
                }

                // Mostrar cada campo y su valor
                for (int i = 0; i < campos.length && i < valores.length; i++) {
                    System.out.println(campos[i] + ": " + valores[i]);
                }

                // Separador entre entradas de restaurantes
                System.out.println("-------------------------");
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

