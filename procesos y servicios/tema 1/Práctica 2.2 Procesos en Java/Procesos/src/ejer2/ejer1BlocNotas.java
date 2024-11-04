package ejer2;

import java.io.IOException;

public class ejer1BlocNotas {
	public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        ProcessBuilder processBuilder;

        // Determinar el sistema operativo
        if (os.contains("win")) {
            // Windows
            processBuilder = new ProcessBuilder("notepad.exe");
        } else if (os.contains("nix") || os.contains("nux")) {
            // Linux
            processBuilder = new ProcessBuilder("gedit");
        } else {
            System.out.println("Sistema operativo no soportado.");
            return;
        }

        // Iniciar el proceso
        try {
            Process process = processBuilder.start();
            // Esperar a que el proceso finalice 
            process.waitFor();
        } catch (IOException e) {
            System.err.println("Error al iniciar el proceso: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("El proceso fue interrumpido: " + e.getMessage());
        }
    }

}
