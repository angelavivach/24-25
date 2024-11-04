#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>

void main(){
	pid_t pid, Hijo_pid;
	pid = fork();

	if (pid == -1)
	{
		printf("No se ha podido crear el proceso hijo...");
		exit(-1);
	}
	if (pid == 0) // Nos encontramos en el proceso hijo
	{
		
		printf("Hola soy el proceso hijo con PID: %d y PPID: %d.\n",getpid(),getppid());
	}
	else // Nos encontramos en el proceso padre
	
		//3er paso
		//Hijo_pid = wait(NULL); //Espera la finalización del proceso hijo.
		printf("Hola soy el proceso padre con PID %d y PPID: %d.\n\t. He creado un proceso con PID: %d .\n",getpid(),getppid(),pid);
	}
	

