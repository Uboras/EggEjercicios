//Realizar un programa que rellene de números aleatorios una matriz a través de un subpro-
//grama y generar otro subprograma que muestre por pantalla la matriz final.
//
//


Algoritmo rellenarymostrar
	Definir matriz, numIng, i , j como numero

	Dimension matriz(3,3)
	j=0
	i=0
	numIng=0
	
	rellenadomatriz(matriz,numIng, i, j )
	
	Escribir Mostrarporpatalla(matriz , i, j)
	
FinAlgoritmo


SubProceso rellenadomatriz(matriz, numIng, i , j)
	
	
	Para i<-0 Hasta 2 Hacer
		Para j<-0 hasta 2 Hacer
			
			Escribir "ingresar numeros a completar"
			leer numIng

			matriz(i,j)= numIng			
	
			FinPara
	
	
		FinPara
		
FinSubProceso



Funcion mostrarmatraz <- Mostrarporpatalla(matriz , i, j)
	
	Para i<-0 Hasta 2 Hacer
	Para j<-0 hasta 2 Hacer
		
		Escribir matriz(i,j) " " Sin Saltar
		
	FinPara
	
	Escribir " "
FinPara
	

	
FinFuncion
	