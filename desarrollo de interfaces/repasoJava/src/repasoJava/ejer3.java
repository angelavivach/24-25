package repasoJava;

import java.util.ArrayList;

public class ejer3 {

	public static void main(String[] args) {
		
		int [] arrayEnteros= {2,3,4,5,6,7,8,9};
		int pares=0;
		for (int numero:arrayEnteros) {
			if(numero%2 ==0) {
				pares++;
			}
		}
		System.out.println("Son pares: " + pares);

	}

}
