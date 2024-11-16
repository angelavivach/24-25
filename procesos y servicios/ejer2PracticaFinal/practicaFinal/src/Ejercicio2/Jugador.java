package Ejercicio2;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Jugador implements Runnable {
    private final int id;
    private final Tablero tablero;

    // Para controlar el turno de los jugadores
    private static final AtomicInteger turno = new AtomicInteger(1);
    private static final int NUM_JUGADORES = 4;  // Número de jugadores

    public Jugador(int id, Tablero tablero) {
        this.id = id;
        this.tablero = tablero;
    }

    @Override
    public void run() {
        try {
            // Los jugadores deben esperar su turno
            while (true) {
                // Espera a que sea su turno
                while (turno.get() != id) {
                    Thread.sleep(10);  // Pequeña espera para evitar busy-waiting
                }

                // Realizar las jugadas
                for (int i = 0; i < 5; i++) {
                    String resultado = tablero.jugar(id);  // El jugador intenta hacer una jugada
                    System.out.println("Jugador " + id + ": " + resultado);
                    if (resultado.contains("encontró una MINA")) {
                        break;  // Si el jugador encuentra una mina, termina el juego para este jugador
                    }
                }

                // Incrementar el turno para el siguiente jugador
                if (turno.get() < NUM_JUGADORES) {
                    turno.incrementAndGet();  // El siguiente jugador puede jugar
                } else {
                    turno.set(1);  // Reiniciar el turno para el primer jugador (comienza una nueva ronda)
                }

                // Salir del bucle de espera cuando se complete la ronda
                break;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Aquí va el código principal del Simulador
        Tablero tablero = new Tablero();
        ExecutorService executor = Executors.newFixedThreadPool(NUM_JUGADORES);  // Pool de hilos para los jugadores

        // Crear jugadores y asignarles un tablero
        for (int i = 1; i <= NUM_JUGADORES; i++) {
            Jugador jugador = new Jugador(i, tablero);
            executor.submit(jugador);  // Asigna la tarea del jugador al pool de hilos
        }
        
        // Espera a que todos los jugadores terminen
        executor.shutdown();
        while (!executor.isTerminated()) {
            // Espera hasta que todos los hilos hayan terminado
        }

        System.out.println("Todos los jugadores han terminado.");

        // Mostrar el estado final del tablero
        tablero.mostrarTablero();
    }
}

