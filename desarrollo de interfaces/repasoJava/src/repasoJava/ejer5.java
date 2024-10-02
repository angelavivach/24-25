package repasoJava;

import java.util.Scanner;

public class ejer5 {
	public static int Factorial(int numero) {
		int resultado = 0;
		 if(numero==1) { //lo igualamos a 1 porque sera el ultimo numero por el que se puede multiplicar
			 resultado=1;
	    	  System.out.println("Fin");
	      }else {
	    	  System.out.println(numero);
	    	  resultado = numero*Factorial(numero-1);
	      }
		 return resultado;
	}


	public static void main(String[] args) {

      Scanner teclado = new Scanner(System.in);
      System.out.println("Introduce un numero");
      int numero=teclado.nextInt();
      System.out.println("El resultado es: " + Factorial(numero));
      
	}
	
}
