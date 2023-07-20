


Algoritmo sin_titulo
	Definir matriz1, vector, matrizOriginal, i, j, h, suma1, suma Como Entero
	
	Dimension matrizOriginal[3,3], matriz1[3], vector[3]
	
	
	Para i<-0 Hasta 3-1 Hacer
		vector[i] = azar(10)
		Para j<-0 Hasta 3-1 Hacer
			
			matrizOriginal[i,j] =azar(10)
			matriz1[i] = 0
		FinPara
	FinPara
	
	
	Para i<-0 Hasta 3-1 Hacer
		
		Para j<-0 Hasta 3-1 Hacer
			
		Escribir Sin Saltar	matrizOriginal[i,j] " " 
		
	FinPara
	Escribir " "
FinPara
	
	Escribir "vector"
	Para i<-0 Hasta 3-1 Hacer
		Escribir vector(i) sin saltar " "
	FinPara
	Escribir " "

	suma=0
	suma1=0
	h=0
	para i<-0 Hasta 3-1 Hacer
		para j<-0 Hasta 3-1 Hacer
		
			matriz1(i)= (matrizOriginal(j,i) * vector(j)) + matriz1(i)
			
		FinPara
	FinPara
		
	
	
	 Escribir " Matriz nueva "
	Para i<-0 Hasta 3-1 Hacer
		Escribir matriz1[i] " " Sin Saltar
			
	FinPara
	
	Escribir " "
	
	
FinAlgoritmo
