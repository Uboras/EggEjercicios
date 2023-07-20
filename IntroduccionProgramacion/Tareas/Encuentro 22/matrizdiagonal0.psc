//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//	
//	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro subpro-
//	ceso para imprimir la matriz.
//
//


Algoritmo sin_titulo
	
	Definir matrizdiagonal, i,j Como Entero
	
	
	Dimension matrizdiagonal(4,4) 
	
	i=0
	j=0 
	
	rellenar(matrizdiagonal,i,j)
	
	mostrarpantalla(matrizdiagonal, i , j)
	
FinAlgoritmo

SubProceso rellenar(matrizdiagonal,i,j)
	Para i<-0 Hasta 3 hacer
		Para j<-0 Hasta 3 hacer
			
			si i = j Entonces
				matrizdiagonal(i,j)=0
			SiNo
				
			matrizdiagonal(i,j)= Aleatorio(0 , 99) 
			
			FinSi
		FinPara
		
		
	FinPara
	
FinSubProceso



SubProceso mostrarpantalla(matrizdiagonal,i,j)
	Para i<-0 Hasta 3 hacer
		Para j<-0 Hasta 3 hacer
			
		
			Escribir matrizdiagonal(i,j)  " " Sin Saltar
			
		FinPara
	Escribir " "	

	FinPara
	
	
FinSubProceso
