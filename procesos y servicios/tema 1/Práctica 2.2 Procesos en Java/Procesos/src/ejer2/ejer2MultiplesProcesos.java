package ejer2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ejer2MultiplesProcesos {
		  public static void main(String[] args) {
			  List<Process> procesos = new ArrayList<>();
		        int numProcesos = 10;

		        // Iniciar los procesos
		        for (int i = 1; i <= numProcesos; i++) {
		            ProcessBuilder processBuilder = crearProceso(i);
		            try {
		                Process process = processBuilder.start();
		                procesos.add(process);
		                // Leer la salida del proceso
		                leerSalidaDelProceso(process);
		            } catch (IOException e) {
		                System.err.println("Error al iniciar el proceso " + i + ": " + e.getMessage());
		            }
		        }

		        // Esperar a que todos los procesos terminen
		        for (Process process : procesos) {
		            try {
		                process.waitFor();
		            } catch (InterruptedException e) {
		                System.err.println("El proceso fue interrumpido: " + e.getMessage());
		            }
		        }

		        System.out.println("Todos los procesos han finalizado.");
		    }

		    private static ProcessBuilder crearProceso(int id) {
		        Random random = new Random();
		        int waitTime = random.nextInt(5) + 1; // Tiempo de espera entre 1 y 5 segundos

		        // Comando que ejecuta cmd para imprimir y esperar
		        String comando = String.format("cmd /c echo Proceso %d iniciado & timeout /t %d >nul & echo Proceso %d terminado.", 
		                id, waitTime, id);

		        return new ProcessBuilder("cmd.exe", "/c", comando);
		    }

		    private static void leerSalidaDelProceso(Process process) {
		        // Leer la salida del proceso
		        new Thread(() -> {
		            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
		                String line;
		                while ((line = reader.readLine()) != null) {
		                    System.out.println(line);
		                }
		            } catch (IOException e) {
		                System.err.println("Error al leer la salida del proceso: " + e.getMessage());
		            }
		        }).start();
}
	}
