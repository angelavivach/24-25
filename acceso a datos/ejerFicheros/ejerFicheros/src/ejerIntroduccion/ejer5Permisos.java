package ejerIntroduccion;

import java.io.File;
import java.io.IOException;

public class ejer5Permisos {
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
	public static void verPermisos(File f) {
		String permisos="";
		//permisos lectura
		if (f.canRead()) {
			permisos=permisos+"r";
		}
		else {
			permisos=permisos+"_";
		}
		// permisos escritura
		if (f.canWrite()) {
			permisos=permisos+"w";
		}
		else {
			permisos=permisos+"_";
		}
		// permisos ejecucion
		if (f.canExecute()) {
			permisos=permisos+"x";
		}
		else {
			permisos=permisos+"_";
		}
		System.out.println("Los permisos del archivo " + f.getName()+ " son: " +permisos);
	}
	public static void cambiarPermisos(File f) {
		f.setExecutable(false);
		f.setReadable(false);
		f.setWritable(false);
	}
	public static void main(String[] args) {
		//crear directorio
				String nombreDirectorio=".\\ejer5\\";
				File directorio =new File(nombreDirectorio);
				// Se escribe el nombre del fichero que se guarda fisicamente
				String nombrefichero = "ficheroPermisos.txt";
				File fichero = new File(nombreDirectorio+nombrefichero);
				
				if(!directorio.exists()) {
					System.out.println("el directorio no existe");
					if(directorio.mkdirs()) {		
				          verPermisos(fichero);
					}else {
						System.out.println("No se ha podido crear el directorio");
					}
				}//Si el directorio no exite
				else {
					//directorio existe
					System.out.println("El directorio existe");
					 crearFichero(fichero);
					 verPermisos(fichero);
					 cambiarPermisos( fichero);
					
				}
	}


}
