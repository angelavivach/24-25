package ejer1;

public class Sonido {
	public static void main(String[] args) {
        animal animal1 = new Perro();
        animal animal2 = new Gato();
        
        animal1.hacerSonido();  // Guau!
        animal2.hacerSonido();  // Miau!
    }

}
