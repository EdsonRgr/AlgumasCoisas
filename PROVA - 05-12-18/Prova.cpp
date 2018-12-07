#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main () {
	setlocale (LC_ALL, "Portuguese");
	
		int canaldetv, canal1, canal2, canal3, canal4, z , resp, voto, pess, casa,resultado ;
		float media, pctg,mediat ;   
	
	canal2=0;
	casa=1;
	resp=0;
	printf("-------------------- PESQUISA IBOPE -------------------\n");
	printf("\n *----Bem Vindo a Pesquisa----* ");
	
	do{			
		printf("\nQuantas pessoas ha na residencia ? ");
		scanf("%d", &pess);
					
			while(1 <= pess ){
				
				printf("\nQual é seu canal favorito ");
				printf("\n Escolha 1 para = Canal sbt");
				printf("\n Escolha 2 para = Canal record");
				printf("\n Escolha 3 para = Canal globo");
				printf("\n Escolha 4 para = Canal mtv");
				printf("\nDigite o numero do seu canal favorito : ");
				scanf("%d", &canaldetv);
					switch(canaldetv){
						
						case 1 :
						voto+=1;
						canal1+= 1;
						printf ("\nCanal sbt \n ");
						break;
						
						case 2 :
						voto+=1;
						canal2+= 1;
						printf ("\nCanal record \n ");
						break;
						
						case 3 :
						voto+=1;
						canal3+= 1;
						printf ("\nCanal globo \n ");
						break;
							
						case 4 :
						voto+=1;
						canal4+= 1;
						printf ("\nCanal mtv \n ");
						break;	
						
						default:
						printf ("Escolha Inválida");
					}
	
								pess--;
								
							}
		
	
		
		
		printf("\nDeseja realizar outra pesquisa ? 1 = SIM \\ 2 = NÂO : ");
		scanf("%d", &resp);
		
		
			if(resp == 1){
				printf("\n  * Continue a pesquisa* \n");
				casa++;
		}
			else if (canal1 > canal2 && canal1 > canal3 && canal1 > canal4 ){
			
				resultado=canal1+canal2+canal3+canal4;
				
				mediat=voto/casa;
				printf("\n Medida de Telespectadores  %.2f", mediat);
				printf("quantidade de votos %d",voto);
				printf("\ntotal de residencia = %d\n", casa);
					
					printf("\n	1° Canal SBT = %d \n", canal1);
					printf("\n	2° Canal RECORD = %d" , canal2);
					printf("\n	3° Canal GLOBO = %d" , canal3);
					printf("\n	4° Canal Mtv = %d" , canal4);
					
					resp=3;
					casa++;
				
		}
		
			else if (canal2 > canal1 && canal2 > canal3 && canal2 > canal4 ){
			
				resultado=canal1+canal2+canal3+canal4;
				
				
				mediat=pess/casa;
				printf("\n Medida de Telespectadores %.2f", mediat);
				printf("\nquantidade de votos %d",voto);
				printf("\ntotal de residencia = %d\n", casa);
					
					printf("\n	1° Canal RECORD = %d \n ", canal1);
					printf("\n	2° Canal SBT = %d" , canal2);
					printf("\n	3° Canal GLOBO = %d" , canal3);
					printf("\n	4° Canal Mtv = %d" , canal4);
					
					resp=3;
					casa++;
				
		}	
			else if (canal3> canal1 && canal3 > canal2 && canal3 > canal4){
			
				resultado=canal1+canal2+canal3+canal4;
				
				mediat=voto/casa;
				printf("\n Medida de Telespectadores %.2f", mediat);
				printf("quantidade de votos %d",voto);
				printf("\ntotal de residencia = %d\n", casa);
					
					printf("\n	1° Canal GLOBOSBT = %d \n", canal1);
					printf("\n	2° Canal RECORD = %d" , canal2);
					printf("\n	3° Canal SBT = %d" , canal3);
					printf("\n	4° Canal Mtv = %d" , canal4);
					
					resp=3;
					casa++;
				
		}
			else if (canal4 > canal1 && canal4 > canal2 && canal4 > canal3 ){
			
				resultado=canal1+canal2+canal3+canal4;
				
				
				mediat=voto/casa;
				printf("\n Medida de Telespectadores %.2f", mediat);
				printf("quantidade de votos %d",voto);
				printf("\ntotal de residencia = %d\n", casa);
					
					printf("\n	1° Canal Mtv = %d \n", canal1);
					printf("\n	2° Canal RECORD = %d" , canal2);
					printf("\n	3° Canal SBT = %d" , canal3);
					printf("\n	4° Canal GLOBOSBT= %d" , canal4);
					
					resp=3;
					casa++;		
		}	
		
		
	
	}while(resp < 2 );
	
	

	
	system("PAUSE");
	return(0);
	
}
