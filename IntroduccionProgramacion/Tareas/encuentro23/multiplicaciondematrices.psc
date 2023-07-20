//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3. Inicia-
//lice las matrices para evitar el ingreso de datos por teclado.
//


Algoritmo sin_titulo
	Definir matriz1, matriz3, matriz2, i, j  Como Entero
	Dimension matriz1[3,3], matriz2[3,3], matriz3[3,3]
	
	
	//rellenado
	
	
	para i<-0 Hasta 3-1 Hacer
		para j <-0 Hasta 3-1 Hacer
			matriz1[i,j] = Aleatorio(1,9)
			matriz2[i,j] = Aleatorio(1,9)
			
		FinPara
	FinPara
	
	
	multiplicacion(matriz1, matriz2, matriz3,i,j)
	
		
		
		Para i<-0 Hasta 3-1 Hacer
			para j<-0 Hasta 3-1 Hacer
				
				Escribir matriz1[i,j] Sin Saltar" "
				
				
			FinPara
			Escribir " " 
		FinPara
		Escribir " "
		
		Para i<-0 Hasta 3-1 Hacer
			para j<-0 Hasta 3-1 Hacer
				
				Escribir matriz2[i,j] Sin Saltar" "
				
				
			FinPara
			Escribir " " 
		FinPara
		Escribir " "

		Para i<-0 Hasta 3-1 Hacer
			para j<-0 Hasta 3-1 Hacer
				
				Escribir matriz3[i,j] Sin Saltar " " 
				
				
			FinPara
			Escribir " " 
		FinPara
	
	
	
FinAlgoritmo



SubProceso multiplicacion(matriz1, matriz2, matriz3,i,j)
	
	
	Para i<-0 Hasta 3-1 Hacer
		para j<-0 Hasta 3-1 Hacer
			
			matriz3[i,j] =matriz1[i,j] * matriz2[i,j]
			
			
		FinPara
	FinPara
	
FinSubProceso
	