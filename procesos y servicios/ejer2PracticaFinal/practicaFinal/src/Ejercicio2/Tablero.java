package Ejercicio2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Random;

public class Tablero {
    private final ConcurrentHashMap<Posicion, Entidad> tablero;
    private final Random random;

    // Constructor que inicializa el tablero y coloca pepitas y minas aleatorias
    public Tablero() {
        this.tablero = new ConcurrentHashMap<>();
        this.random = new Random();

        // Inicializamos todas las posiciones del tablero como VACIO
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                tablero.put(new Posicion(i, j), Entidad.VACIO);
            }
        }

        // Colocamos algunas pepitas y minas aleatoriamente en el tablero
        for (int i = 0; i < 5; i++) {
            colocarEntidadAleatoria(Entidad.PEPITA);
        }

        for (int i = 0; i < 3; i++) {
            colocarEntidadAleatoria(Entidad.MINA);
        }
    }

    // Método para colocar una entidad aleatoria en una celda VACIA
    private void colocarEntidadAleatoria(Entidad entidad) {
        int x, y;
        do {
            x = random.nextInt(15);  // Genera una coordenada aleatoria para X (0-14)
            y = random.nextInt(15);  // Genera una coordenada aleatoria para Y (0-14)
        } while (tablero.get(new Posicion(x, y)) != Entidad.VACIO);  // Si no está vacía, lo intenta de nuevo
        tablero.put(new Posicion(x, y), entidad);
    }

    // Método sincronizado para realizar una jugada en una posición aleatoria
    public synchronized String jugar(int jugadorId) {
        // Intentamos hacer hasta 100 intentos de encontrar una posición vacía aleatoria
        for (int intento = 0; intento < 100; intento++) {
            int x = random.nextInt(15);  // Genera una coordenada aleatoria para X (0-14)
            int y = random.nextInt(15);  // Genera una coordenada aleatoria para Y (0-14)
            Posicion posicion = new Posicion(x, y);

            // Si la celda está vacía o tiene una pepita, el jugador realiza la jugada
            Entidad entidadEnPosicion = tablero.get(posicion);
            if (entidadEnPosicion == Entidad.VACIO) {
                tablero.put(posicion, Entidad.JUGADOR);  // El jugador ocupa la celda
                return "Jugador " + jugadorId + " se movió a " + posicion + " (VACIO)";
            } else if (entidadEnPosicion == Entidad.PEPITA) {
                tablero.put(posicion, Entidad.JUGADOR);  // El jugador ocupa la celda
                return "Jugador " + jugadorId + " se movió a " + posicion + " y recogió una PEPITA";
            } else if (entidadEnPosicion == Entidad.MINA) {
                return "Jugador " + jugadorId + " se movió a " + posicion + " y encontró una MINA. El juego termina.";
            }
        }

        // Si después de 100 intentos no encuentra una celda vacía, devuelve un mensaje
        return "Jugador " + jugadorId + " no pudo realizar la jugada. El tablero está lleno.";
    }

    // Método para mostrar el tablero (opcional)
    public void mostrarTablero() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                Posicion posicion = new Posicion(i, j);
                System.out.print(tablero.get(posicion) + " ");
            }
            System.out.println();
        }
    }
}



