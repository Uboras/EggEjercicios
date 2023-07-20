//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro subpro-
//grama que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y los re-
//sultados por pantalla.
//
//
//


Algoritmo rellenoyoperaciones
	definir matrizNM, n, m, i , j , suma  Como Entero
	
	Escribir "¿Cuantas filas y columnas quiere la matriz?"; leer n , m 
	
	i=0
	j=0
	suma=0
	Dimension matrizNM(n,m)
	
	rellenadoaleatorio(matrizNM, m , n, i , j  )
	
	Escribir  sumatoria(matrizNM, i , j, m, n, suma) " es sumatoria de los elementos "
FinAlgoritmo



SubProceso rellenadoaleatorio(matrizNM, m , n, i , j )
	
	Para i<-0 Hasta n-1 hacer
		Para j<-0 Hasta m-1 hacer
			
			matrizNM(i,j)= Aleatorio(0 , 99) 
			Escribir matrizNM(i,j)  " " Sin Saltar
			
		FinPara
		Escribir " "
		
	FinPara
	
		
FinSubProceso


funcion suma <- sumatoria(matrizNM, i , j, m, n, suma )
	
	Para i<-0 Hasta n-1 hacer
		Para j<-0 Hasta m-1 hacer
			
			suma = suma + matrizNM(i,j)
			
			
			
		FinPara
	FinPara
FinFuncion






	