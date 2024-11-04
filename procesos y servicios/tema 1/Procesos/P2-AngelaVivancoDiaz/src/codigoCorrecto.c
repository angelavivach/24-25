#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
	int pid;

	// Crear un proceso hijo
	pid = fork();

	if (pid == -1) {
		// Error al crear el proceso hijo
		perror("fork failed");
		exit(1);
	}

	// Mensaje común a ambos procesos
	printf("Hola, ¿qué tal? Todo bien, gracias.\n");

	if (pid == 0) {
		// Proceso hijo
		printf("\tSoy el proceso hijo, mi PID es %d\n", getpid());
		printf("Estoy bien, gracias por preguntar\n");
	} else {
		// Proceso padre
		printf("Soy el proceso padre, mi PID es %d\n", getpid());
	}

	return 0;
}

