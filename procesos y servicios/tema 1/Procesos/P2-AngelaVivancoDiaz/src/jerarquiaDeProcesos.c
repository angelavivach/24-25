#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/types.h>

void create_chil(int level, int child_num){
	pid_t pid=fork();

	if(pid < 0){
		//no creado
		perror("No se puedo crear");
		exit(1);
	}else if (pid ==0){
		//hijo1
		printf("Nivel: %d, PID: %d, PPID: %d\n", level,getpid(),getppid());

		//creamos nieto
		if (level ==1){
			for (int i=1; i<=2;i++){
				create_chil(2,i);
			}
		}//salimos del proceso hijo
		 exit (0);
	}else{
		//proceso padre
		int status;
		waitpid(pid,&status,0);//espera al hijo 
	}
}

int main(){
	printf("Padre PID: %d\n",getpid());

	//hijo1
	create_chil(1,1);

	//hijo2
	create_chil(1,2);
	return 0;
}

