package ejerIntroduccion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;

public class ejer3CrearFichero {

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

	        // Crear el objeto File para el fichero
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
	    }
	
}
