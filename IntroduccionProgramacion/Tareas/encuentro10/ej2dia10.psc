Algoritmo ej2
	
	definir j,i,lado Como Entero
	definir g Como Caracter
	escribir "Ingrese número cuántos asteriscos tenga por lado"
	leer lado
	
	para i=1 hasta lado hacer
		para j=1 hasta lado Hacer
			si i>1 y i<lado	y j>1 y j<lado Entonces
				escribir sin saltar "  "
			sino 
				escribir sin saltar "* "
			FinSi
		FinPara
		escribir " "
	finpara	
	

FinAlgoritmo
//Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree un
//cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar
//* * * *
//*     *
//*     *
//* * * *