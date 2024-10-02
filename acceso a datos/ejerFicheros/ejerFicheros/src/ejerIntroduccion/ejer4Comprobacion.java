package ejerIntroduccion;

import java.io.File;
import java.io.IOException;

public class ejer4Comprobacion {
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
	
	public static void comprobarDirectorio(File f) {
		if(f.isDirectory()) {
			listarFicheros(f);
		}else {
			if(f.isFile())
				System.out.println("Es un fichero no se puede recorrer");
		}
	}
	
	public static void listarFicheros(File d) {
		File[] ficheros=d.listFiles();
		
		for(File f:ficheros) {
			if(f.isFile()) {
				System.out.println(f.getName()+" es un fichero");
			}
			if(f.isDirectory()) {
				System.out.println(f.getName()+" es un directorio");
			}
		}
	}

	public static void main(String[] args) {
		//crear directorio
		String nombreDirectorio=".\\ejer1\\";
		File directorio =new File(nombreDirectorio);
		// Se escribe el nombre del fichero que se guarda fisicamente
		String nombrefichero="ficheroPrueba4.txt";
		File fichero = new File(nombreDirectorio+nombrefichero);
		
		
		if(!directorio.exists()) {
			System.out.println("el directorio no existe");
			if(directorio.mkdirs()) {
			   
			}else {
				System.out.println("No se ha podido crear el directorio");
			}
			
		}//Si el directorio no exite 
		else {
			//directorio existe
			System.out.println("El directorio existe");
			 crearFichero(fichero);
		}
		comprobarDirectorio(directorio);
		System.out.println("Listar");
		listarFicheros(directorio);
	}

}
