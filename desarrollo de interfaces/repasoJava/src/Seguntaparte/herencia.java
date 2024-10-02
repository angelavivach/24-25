package Seguntaparte;

import java.util.ArrayList;
import java.util.List;

public class herencia {

	public static void main(String[] args) {
		//crear hija
				profesor profe=new profesor(null, null, null, 0, 0, false);
				
				List <profesor >lista=new ArrayList <profesor >();
				lista.add(new profesor("3454565Y", "Paco", "Sanchez Pijuan", 1000, 2, false));
				lista.add(new profesor("3454565Y", "Sofia", "Montesinos Labrador", 1500, 1, true));
				lista.add(new profesor("3454565Y", "Lucia", "Sanchez perez", 1300, 3, false));
				
				administracion admi=new administracion (null, null, null, 0, null, 0);
				
				List <administracion >lista1=new ArrayList <administracion >();
				lista1.add(new administracion("123456H", "Sonia", "Zapata perez", 1200, "Administrativo", 4));
				lista1.add(new administracion("123456H", "Juan", "Vivanco Diaz", 1450, "Economia", 7));
				
				directivo direc=new directivo (null, null, null, 0, false, false);
				List <directivo >lista2=new ArrayList <directivo >();
				lista2.add(new directivo("56789M", "Manuel", "Balde ", 1700, true, true));
				lista2.add(new directivo("56789M", "Pedro", "Pastor", 1670, true, false));
				
				
				System.out.println("---Profesor---");
				for (int i=0; i<lista.size();i++){
					System.out.print("Dni: "+ lista.get(i).DNI +" ");
					System.out.print("Nombre: "+ lista.get(i).nombre +" ");
					System.out.print("Apellidos: "+ lista.get(i).apellidos +" ");
					System.out.print("Salario: "+ lista.get(i).salario +" ");
					System.out.print("Numero asignaturas: "+ lista.get(i).nAsignaturas +" ");
					System.out.println("Es tutor: "+ lista.get(i).tutor +" ");
					
				}
				
				System.out.println("---Administración---");
				for (int i=0; i<lista1.size();i++){
					System.out.print("Dni: "+ lista1.get(i).DNI +" ");
					System.out.print("Nombre: "+ lista1.get(i).nombre +" ");
					System.out.print("Apellidos: "+ lista1.get(i).apellidos +" ");
					System.out.print("Salario: "+ lista1.get(i).salario +" ");
					System.out.print("Estudios: "+ lista1.get(i).estudios +" ");
					System.out.println("Años antigüedad: "+ lista1.get(i).antigüedad +" ");
				}
				
				System.out.println("---Administración---");
				for (int i=0; i<lista2.size();i++){
					System.out.print("Dni: "+ lista2.get(i).DNI +" ");
					System.out.print("Nombre: "+ lista2.get(i).nombre +" ");
					System.out.print("Apellidos: "+ lista2.get(i).apellidos +" ");
					System.out.print("Salario: "+ lista2.get(i).salario +" ");
					System.out.print("Es salesiano "+ lista2.get(i).salesiano +" ");
					System.out.println("Turno de mañana o de tarde "+ lista2.get(i).turno +" ");
				}
						

	}

}
