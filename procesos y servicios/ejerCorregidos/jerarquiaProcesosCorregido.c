#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main(){
	pid_t pid1,pid2,pidn,pidn2;

	int status;
	pid_t proceso_terminado;

	pid1 =fork();
	if(pid1==-1){
		printf("No se pudo crear el hijo ");
		exit(-1);
	}
	if(pid1==0){
		printf("Hijo1 tiene el PID %d y PPID %d.\n", getpid(),getppid());
		exit(0);
	}

	pid2=fork();
	if(pid2==-1){
		printf("No fue psoible crear hijo2");
		exit(-1);
	}
	if(pid2==0){
		pidn=fork();
		if(pidn==-1){
			printf("no se pudo crear nieto1");
			exit(-1);
		}
		if(pidn==0){
			printf("Soy el nieto 1 con PID %d y PPID %d \n",getpid(),getppid());
			exit(2);
		}

		pidn2=fork();
		if(pidn2==-1){
			printf("el nieto2 no se pudo crear");
			exit(-1);
		}
		if(pidn2==0){
			printf("Soy el nieto2 y mi PID es %d y mi PPID %d \n",getpid(),getppid());
			exit(2);
		}

		printf("Soy el hijo2 con PID %d y PPID %d \n",getpid(),getppid());
		printf("Soy el hijo 2 y he creado dos hijo con PID %d y PPID %d \n",pidn,pidn2);

		for (int i = 0; i<2;i++){
			proceso_terminado = wait(&status);
			if(WIFEXITED(status)){
				printf("Proceso %d terminado con estado %d.\n",proceso_terminado,WEXITSTATUS(status));
			} else{
				printf("Proceso hijo terminó de manera anormal.\n");
			}
		}
		exit(1);
	}
	printf("Soy el padre con PID: %d y PPID: %d\n",getpid(),getppid());
	printf("\tSoy el padre y he creado dos hijos con PID: %d y PID: %d\n",pid1,pid2);
	// Ya creados los 2 hijos, el padre puede terminar.
	// PERO antes de terminar tiene que esperar a sus hijos.
	for (int i = 0; i<2;i++){
		proceso_terminado = wait(&status);
		if(WIFEXITED(status)){
			printf("Proceso %d terminado con estado %d.\n",proceso_terminado,WEXITSTATUS(status));
		} else{
			printf("Proceso hijo terminó de manera anormal.\n");
		}
	}
	exit(0);}


