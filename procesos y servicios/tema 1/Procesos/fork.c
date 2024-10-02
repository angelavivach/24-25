#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/types.h>

int main(){

pid_t pid, pid2 , Hijo_pid;

pid = fork();
int status;

if(pid== -1){
	printf("no se puedo crear subproceso");
	exit(-1);
}

if(pid ==0){
	            //proceso hijo
		             printf("Soy el hijo\n, mi PID es %d\n\t PPID %d\n", getpid(),getppid());
			     exit(2);
		             }else {
		                         //proceso padre
		                printf("Soy el padre mi PID es %d\n\t PPID %d\n", getpid(),getppid());
				Hijo_pid = wait(&status);
						if(WIFEXITED(status)){
						printf("Proceso hijo termino con %d\n",WEXITSTATUS(status));
						}else{
							printf("El hijo termino de forma anormal\n");
		                                           
						printf("hola\n");
		                                                return EXIT_SUCCESS;
} }}	                                                 
