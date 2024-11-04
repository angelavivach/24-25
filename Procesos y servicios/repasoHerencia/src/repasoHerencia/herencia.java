package repasoHerencia;

import java.util.ArrayList;
import java.util.List;


public class herencia {
	
	public static void main(String [] args) {
		//crear hija
		cliente client=new cliente(null, null, null, 0, 0, null, null, 0);
		
		client.getNombre();
		client.getEdad();
		
		administrador admin=new administrador(null, null, null, 0, 0, null, null);
		
		admin.getApellido();
		admin.getCargo();
		
		List <cliente>lista=new ArrayList <cliente>();
		lista.add(new cliente("Angela", "Vivanco", "asds", 2, 3, "sdsd", "sds", 20));
		lista.add(new cliente("Paqui", "Diaz", "dfdfs", 3, 3, "sdsd", "sds", 30));
		lista.add(new cliente("Fer", "Vivanco", "frf", 2, 2, "sdsd", "sds", 16));
		
		System.out.println("---INDICE---");
		for (int i=0; i<lista.size();i++){
			System.out.println("Prueba indice:"+ lista.get(i).getEdad());
		}
		
		System.out.println("---FOREACH---");
		for (cliente cliente:lista) {
			System.out.println("Prueba foreach:"+ cliente.getEdad());
		}
	}

}