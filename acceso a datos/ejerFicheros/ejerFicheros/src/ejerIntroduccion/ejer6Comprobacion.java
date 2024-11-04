package ejerIntroduccion;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ejer6Comprobacion {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario el nombre del fichero
	        System.out.println("Introduce el nombre del fichero (con extensión, por ejemplo: archivo.txt):");
	        String nombreFichero = scanner.nextLine();

	        // Crear un objeto File para el fichero
	        File fichero = new File(nombreFichero);

	        // Comprobar si el fichero existe
	        if (fichero.exists()) {
	            // Si el fichero existe, mostrar su ruta absoluta
	            System.out.println("El fichero existe. Su ruta es: " + fichero.getAbsolutePath());
	        } else {
	            // Si el fichero no existe, intentar crearlo
	            try {
	                if (fichero.createNewFile()) {
	                    System.out.println("El fichero no existía, pero se ha creado.");

	                    // Cambiar los permisos a solo lectura
	                    if (fichero.setReadable(true) && fichero.setWritable(false)) {
	                        System.out.println("Los permisos del fichero han sido cambiados a solo lectura.");
	                    } else {
	                        System.out.println("No se pudo cambiar los permisos del fichero.");
	                    }
	                } else {
	                    System.out.println("No se pudo crear el fichero.");
	                }
	            } catch (IOException e) {
	                System.out.println("Ocurrió un error al intentar crear el fichero: " + e.getMessage());
	            }
	        }
	    }

}
