////pida un numero de 1 a 3 y lo escariba como 
///! ++  
///!+ +  
///!  +  
///!  +  
///!+++++
Algoritmo bro
	Definir i,j, num como enteros
	Escribir "Escribe 1,2 o 3"
	leer num
	
	
	
	para i<-1 Hasta num Con Paso 1 Hacer
		para j=1 hasta num con paso 1 hacer
			Escribir "*" sin saltar 
			
		FinPara
		Para j<-2 hasta num  con paso 1 Hacer
			si j=num-num+2 o j=num Entonces
				Escribir "*" sin saltar 
				
			sino
				
			FinSi
			Escribir"+" sin saltar 
		FinPara
		
	FinPara
FinAlgoritmo
