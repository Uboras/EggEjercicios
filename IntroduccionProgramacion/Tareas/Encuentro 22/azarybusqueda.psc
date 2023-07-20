//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//
//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las coorde-
//nadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En caso de no
//
//encontrar el valor dentro de la matriz se debe mostrar un mensaje.//


Algoritmo sin_titulo
	Definir matriz55, num, i,j,k,l,m   Como Entero
	
	Dimension matriz55[5,5]
	i=0
	j=0
	k=0
	l=0
	m=0
	
	rellenadoAleatorio(matriz55, i , j)
	Escribir "¿Que Numero quiere buscar entre 0 - 25 ?"
	leer num
	
	Escribir  buscarcifra(matriz55,i, j, num)  
	
	
	
	
FinAlgoritmo


Funcion lugar <- buscarcifra(matriz55,i,j, num)

	
	Para i<-0 Hasta 4 hacer
		Para j<-0 Hasta 4 hacer
			
		
			si matriz55(i,j)= num Entonces
			Escribir "ubicacion " i " " j " de la matriz" 
			
		FinSi
	
		FinPara
		
	FinPara
	
	Escribir " "
FinFuncion	


SubProceso rellenadoAleatorio(matriz55,i,j)
	
	Para i<-0 Hasta 4 hacer
		Para j<-0 Hasta 4 hacer
			
			matriz55(i,j)= azar(25)
			
			
			Escribir matriz55(i,J) " "	 Sin Saltar
			
			
		FinPara
		Escribir " "
	FinPara
	
	
FinSubProceso

	
	

	
	
	
	
	
	
	
	