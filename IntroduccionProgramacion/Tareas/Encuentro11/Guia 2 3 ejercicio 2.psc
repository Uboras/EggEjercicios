///Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
///componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
///	deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
///de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o
///resultados.

// pedir un numero/leerlo

Algoritmo sin_titulo
	
	Definir num1, c,variable,  unidad, decena, centena, mil, dmil, cmil Como real
	
	
	
	
	Escribir "escriba un numero de cifras"
	Leer num1
	
	c= 0
	
	
	Mientras num1>0 Hacer
		
		num1 = trunc(num1/10)
		
		c=c+1
		
	Fin Mientras
	Escribir "la cantidad de cifras es: " c

FinAlgoritmo
