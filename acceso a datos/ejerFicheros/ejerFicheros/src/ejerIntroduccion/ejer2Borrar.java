package ejerIntroduccion;

import java.io.File;
import java.io.IOException;

public class ejer2Borrar {

	public static void crearFichero(File f) {
		
		 try {
		      if(!f.exists()) {
		            //Creamos fisicamente el fichero
		           if (f.createNewFile())
			          System.out.println("Fichero creado");
		           
		           else
			          System.out.println("Fichero no ha sido creado");
		     
	          }else
		            System.out.println("El fichero ya existe");
		
		            
      }
	     catch(IOException e) {
		     e.printStackTrace();
	     }
	}

	public static void main(String[] args) {
		//crear directorio
		String nombreDirectorio=".\\ejer1\\";
		File directorio =new File(nombreDirectorio);
		// Se escribe el nombre del fichero que se guarda fisicamente
		String nombrefichero = "ficheroPrueba2.txt";
		File fichero = new File(nombreDirectorio+nombrefichero);
		
		
		if(!directorio.exists()) {
			System.out.println("el directorio no existe");
			if(directorio.mkdirs()) {
		          
				fichero.delete();
			   
			}else {
				System.out.println("No se ha podido crear el directorio");
			}
			
		}//Si el directorio no exite 
		else {
			//directorio existe
			System.out.println("El directorio existe");
			 crearFichero(fichero);
			 
		}
		
		 if (fichero.delete())
		        System.out.println("El fichero ha sido borrado satisfactoriamente");
		    else
		        System.out.println("El fichero no pudó ser borrado");
		
	}
}
