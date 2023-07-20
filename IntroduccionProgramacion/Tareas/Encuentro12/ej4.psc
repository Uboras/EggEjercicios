//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La fun-
//ción debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la fun-
//	ción Subcadena().
Algoritmo ej4
	definir frase,a como caracter
	definir contador Como Entero
	escribir "Introduzca un frase"
	leer frase
	escribir "Letra a buscar"
	leer a
	Escribir"La frase es: ",frase
	Escribir"La letra elegida es: ",a
	Escribir "La frase tiene ", resultado(frase,a), "veces la letra elegida"
		
FinAlgoritmo

funcion letras=resultado(frase,a)
	definir letras Como entero
	definir suma,i como entero
	suma=0
	letras=0	
	para i=1 Hasta Longitud(frase) Hacer
		si a=SubCadena(frase,i,i) Entonces
			suma=suma+1
		FinSi
		
	FinPara
	letras=suma
	
FinFuncion
	