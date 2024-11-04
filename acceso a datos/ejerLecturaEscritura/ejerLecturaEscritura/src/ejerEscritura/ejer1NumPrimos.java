package ejerEscritura;

import java.io.FileWriter;
import java.io.IOException;

public class ejer1NumPrimos {
	
	// Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si el número es divisible por otro número, no es primo
            }
        }
        return true; // Si no es divisible por ningún número, es primo
    }
    
	 public static void main(String[] args) {
	        String nombreFichero = "primos.txt";

	        try (FileWriter writer = new FileWriter(nombreFichero)) {
	            // Recorremos los números del 1 al 500
	            for (int i = 1; i <= 500; i++) {
	                if (esPrimo(i)) {
	                    // Escribimos los números primos en el fichero
	                    writer.write(i + "\n");
	                }
	            }
	            System.out.println("Los números primos se han guardado correctamente en " + nombreFichero);
	        } catch (IOException e) {
	            System.out.println("Ocurrió un error al escribir en el fichero: " + e.getMessage());
	        }
	    }

}
