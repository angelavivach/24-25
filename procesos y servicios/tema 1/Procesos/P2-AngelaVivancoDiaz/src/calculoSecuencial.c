#include <stdio.h>
#include <stdbool.h>

bool es_primo(int num) {
	    if (num < 2) return false;
	        for (int i = 2; i * i <= num; i++) {
			        if (num % i == 0) return false;
				    }
		    return true;
}

int main() {
	    unsigned long long int suma_primos = 0;
	        unsigned long long int suma_impares = 0;

		    // Calcular la suma de números primos entre 1 y 10,000,000
		         for (int i = 1; i <= 10000000; i++) {
		                 if (es_primo(i)) {
		                             suma_primos += i;
		                                     }
		                                         }
		    
		                                    // Calcular la suma de números impares entre 1 y 5,000,000
		                                                 for (int i = 1; i <= 5000000; i += 2) {
		                                                         suma_impares += i;
		                                                             }
		    
		                   printf("Suma de primos entre 1 y 10,000,000: %llu\n", suma_primos);
		                   printf("Suma de impares entre 1 y 5,000,000: %llu\n", suma_impares);
		    
		return 0;
}

		    
