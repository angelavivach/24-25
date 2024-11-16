package Ejercicio2;

public enum Entidad {
    PEPITA, MINA, JUGADOR, VACIO;

    @Override
    public String toString() {
        switch (this) {
            case PEPITA: return "P";
            case MINA: return "M";
            case JUGADOR: return "J";
            case VACIO: return ".";
            default: return ".";
        }
    }
}



