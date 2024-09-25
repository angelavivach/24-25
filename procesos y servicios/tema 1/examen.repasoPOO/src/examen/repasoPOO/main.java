package examen.repasoPOO;

import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) {
       persona perso=new persona(null);
       
	   perso.getNombre();
	   
		
	   List <persona>lista=new ArrayList <persona>();
	   lista.add(new persona("Juan"));
	   lista.add(new persona("Ana"));
		
	   coche coch=new coche(null, null, 0, null, 0);
		
	   coch.getMarca();
	   coch.getModelo();
	   coch.getAño();
	   coch.getNumeroPuertas();
	   coch.getPropietario();
		
		List <coche>lista1=new ArrayList <coche>();
		lista1.add(new coche("Toyota", "Corolla",2020, "Juan", 4));
		lista1.add(new coche("Honda", "Civic", 2021, "Ana", 4));
		lista1.add(new coche("Ford", "Focus", 2022, "No tiene propietario",4));
		
		
			
			System.out.println("---Coche---");
			for (int i=0; i<lista1.size();i++){
				System.out.println("Total vehiculos creados: ");
				System.out.println("Coche 1 propietario: " + lista1.get(i).getPropietario());
				System.out.println("Coche 2 propietario: "+ lista1.get(i).getPropietario());
				System.out.println("Coche 3 propietario: "+  lista1.get(i).getPropietario());
				
			}
			


	}

}
