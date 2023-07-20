//6. Realizar un programa que permita visualizar el resultado del producto de una matriz de ente-
//ros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden iniciali-
//zarse evitando así el ingreso de datos por teclado. 

Algoritmo ej6extra
	Definir matriz,vector,vectorresultado,i,j Como Entero
	dimension matriz(3,3)
	dimension vector(3)
	dimension vectorresultado(3)
	
	para i=0 hasta 2
		para j=0 hasta 2
			matriz(i,j)=aleatorio(1,9)			
		FinPara	
		vector(i)=aleatorio(1,9)
		vectorresultado(i)=0
	FinPara
	Limpiar Pantalla
	para i=0 hasta 2
		para j=0 hasta 2
			
			vectorresultado(i)=(vector(i)*matriz(i,j))+vectorresultado(i)
			escribir"|" matriz(i,j) "|" sin saltar
			
			si j=2
				escribir " X  |" , vector(i) sin saltar ,"| = ","|" vectorresultado(i),"|"
			FinSi
			
			
		FinPara
		escribir ""
		
	FinPara
	escribir""
	esperar tecla
	
	
FinAlgoritmo
