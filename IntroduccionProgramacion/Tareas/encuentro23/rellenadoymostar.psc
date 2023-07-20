//Realizar un programa que rellene de números aleatorios una matriz a través de un subpro-
//grama y generar otro subprograma que muestre por pantalla la matriz final.



Algoritmo sin_titulo
	Definir matriz, i , j  Como Entero
	
	Dimension matriz[5,5]
	i=0
	j=0
	
	rellenado(matriz, i , j )
	mostra(matriz, i, j )
	
	
FinAlgoritmo



SubProceso rellenado(matriz, i , j )
	
	para i<-0 Hasta 4 Hacer
		para j<-0 Hasta 4 Hacer
			
			matriz(i,j) = Aleatorio(10, 99)
			
			
			
		FinPara
		
	FinPara
	
	
	
FinSubProceso


SubProceso mostra(matriz, i, j )
	para i<-0 Hasta 4 Hacer
		para j<-0 Hasta 4 Hacer
			
			Escribir matriz(i,j) " - " Sin Saltar
			
			
		FinPara
		Escribir " "
	FinPara
	
	
	
	
	
FinSubProceso
	