//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La fun-
//ción debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la fun-
//SubCadena(cadena,desde,hasta)ión Subcadena().



Algoritmo Fraseyletra
	
	
	Definir frase,letra Como Caracter
	
	Escribir "la frase"
	leer frase
	Escribir "la letra a buscar"
	leer letra
	
	Escribir  "estan" x(frase,letra) "veces"
finAlgoritmo


Funcion cantidad <- x(frase,letra)
	definir cantidad, in,i,  Inicio Como Entero
	cantidad=0
	in= 0
	
	para i <- 1 Hasta Longitud(frase) con paso 1 Hacer
		si SubCadena(frase,in,in) = letra Entonces
			cantidad= cantidad+1
			
		FinSi
		
		in=in+1
	FinPara
	
	
	
FinFuncion
	