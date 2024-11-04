package UMLVehiculos_AngelaVivancoDiaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void vehiculo(Scanner teclado) {

			Coche coche=new Coche (null, null, null, 0, 0, false, false);

			List <Coche >lista=new ArrayList <Coche >();
			lista.add(new Coche("mercedes", "gris", "344fge4rw", 10000, 6, false, true));
			lista.add(new Coche("cupra", "negro", "KDJ38437543H	", 6000,1, true, false));
			lista.add(new Coche("seat", "rojo", "JD24J4534", 20500, 17, false, true));
			

	        Avion avion=new Avion (null, null, null, 0, 0, 0, 0, false);	

			List <Avion>lista1=new ArrayList <Avion >();
			lista1.add(new Avion("iberdrola", "blaco", "DS7328DS6", 132000,5, 2, 123.4, false));
			lista1.add(new Avion("boing737", "blaco", "DS7328DS6",250000, 7, 2, 234.9, false));
			lista1.add(new Avion("marshall", "blaco", "DS7328DS6",89435, 6, 3, 532, true));
			
			Barco barco= new Barco (null, null, null, 0, 0, 0, 0, null);
			List <Barco>lista2=new ArrayList <Barco >();
			lista2.add(new Barco("neptuno", "negro",  "JDHF7328F", 23455, 2020, 10, 15, "vela"));
			lista2.add(new Barco("poseidon", "blanco",  "34fdf7328F", 2434, 2015, 22, 10, "pasajero"));
			

			System.out.println("---Vehiculos---");
			for (int i=0; i<lista.size();i++){
				System.out.println("El coche marca "+ lista.get(i).marca +" color " + lista.get(i).color+ "num bastidor "+ lista.get(i).nBastidor + " kilometros "+ lista.get(i).kilometros + "año fabricacion " + lista.get(i).aFabricacion + " es electrico " + lista.get(i).electrico+ "es antiguo "+ lista.get(i).isAntiguo());
			}

			System.out.println("");
			for (int i=0; i<lista1.size();i++){
				System.out.println("Marca del avion "+ lista1.get(i).marca +" color " +  lista1.get(i).color+ "num bastidor "+  lista1.get(i).nBastidor + " kilometros "+  lista1.get(i).kilometros + "año fabricacion " +  lista1.get(i).aFabricacion + " numero de motores " + lista1.get(i).getMotores()+ "velocidad  "+  lista1.get(i).getVelocidadMax());
			}	
			System.out.println("");
			for (int i=0; i<lista2.size();i++){
				System.out.println("Marca "+ lista2.get(i).marca +" color " +  lista2.get(i).color+ "num bastidor "+  lista2.get(i).nBastidor + " kilometros "+  lista2.get(i).kilometros + "año fabricacion " +  lista2.get(i).aFabricacion + " calado " + lista2.get(i).getCalado()+ "eslora  "+  lista2.get(i).getEslora() + "tipo barco " + lista2.get(i).getTipoBarco());
			}	
	}
	
	public static void vehiculoElectrico(Scanner teclado) {
		 // Creación de la lista de coches
        List<Coche> lista = new ArrayList<Coche>();
        lista.add(new Coche("Mercedes", "Gris", "344fge4rw", 10000, 6, false, true));
        lista.add(new Coche("Cupra", "Negro", "KDJ38437543H", 6000, 1, true, false));
        lista.add(new Coche("Seat", "Rojo", "JD24J4534", 20500, 17, false, true));

        // Mostrar solo coches eléctricos
        System.out.println("---Coches electricos---"); 
        for (int i = 0; i < lista.size(); i++) { 
        	if (lista.get(i).electrico) { 
        		System.out.println("El coche marca " + lista.get(i).marca + " es eléctrico"); } }
        }
	
	
	public static void velocidadMax(Scanner teclado) {
        // Creación de la lista de aviones
        List<Avion> lista1 = new ArrayList<Avion>();
        lista1.add(new Avion("Iberdrola", "Blanco", "DS7328DS6", 132000, 5, 2, 123.4, false));
        lista1.add(new Avion("Boeing737", "Blanco", "DS7328DS6", 250000, 7, 2, 234.9, false));
        lista1.add(new Avion("Marshall", "Blanco", "DS7328DS6", 89435, 6, 3, 532, true));

        // Mostrar la velocidad máxima de los aviones
        System.out.println("---Avión más rápido---"); 
        Avion avionMasRapido = lista1.get(0); 
        // Inicializamos con el primer avión 
        for (int i = 1; i < lista1.size(); i++) { 
        	if (lista1.get(i).getVelocidadMax() > avionMasRapido.getVelocidadMax()) {
        		avionMasRapido = lista1.get(i); 
        		// Actualizamos si encontramos uno más rápido 
        		} }
        System.out.println("El avión más rápido es " + avionMasRapido.marca + " con una velocidad de " + avionMasRapido.getVelocidadMax() + " km/h");
        	}


	public static void main(String[] args) {
		
		  Scanner teclado = new Scanner(System.in);

	        int opcion;

	        // Bucle para el menú
	        do {
	            System.out.println("\n--- Menú de Vehículos ---");
	            System.out.println("1. Mostrar todos los vehículos");
	            System.out.println("2. Mostrar si los coches son eléctricos o no");
	            System.out.println("3. Mostrar velocidad máxima de los aviones");
	            System.out.println("4. Salir");
	            System.out.print("Introduce un número: ");

	            opcion = teclado.nextInt();
	            switch (opcion) {
	                case 1:
	                    vehiculo(teclado);
	                    break;
	                case 2:
	                    vehiculoElectrico(teclado);
	                    break;
	                case 3:
	                    velocidadMax(teclado);
	                    break;
	                case 4:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción no válida, por favor elige de nuevo.");
	            }
	        } while (opcion != 4);

	        teclado.close();
	    }

}
