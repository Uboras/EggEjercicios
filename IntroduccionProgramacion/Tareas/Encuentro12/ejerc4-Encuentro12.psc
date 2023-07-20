


funcion c = buscar(frase2, letra2)
	definir c,i,n Como Entero
	c = 0
	i = 0
	n = longitud(frase2)
	Mientras i < n hacer
		si letra2 == subcadena(frase2,i,i) Entonces
			c = c + 1
		FinSi
		i = i + 1
	FinMientras
FinFuncion

Algoritmo sin_titulo
	definir letra, frase Como Caracter
	definir cantidad como entero
	escribir "Ingresa frase"
	leer frase 
	escribir "Ingresa letra"
	leer letra 
	cantidad = buscar(frase,letra)
	escribir "La letra, " letra," se encuentra ",cantidad, " veces"  
	
	
FinAlgoritmo
