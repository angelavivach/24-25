#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main (int argc){
	pid_t pid;
	pid = fork();

	if(pid==-1){
		printf("no se pudo crear hijo");
		exit(-1);
          }
        if (pid==0){
		printf("Hola soy el proceso hijo con PID: %d y PPID: %d\n. ",getpid(),getppid());
		
	} else{
		wait(NULL);
		printf("Hola soy el proceso padre con PID: %d y PPID %d\n He creado un proceso con PID %d\n",getpid(),getppid(),pid);
	}
	exit(0);

}


