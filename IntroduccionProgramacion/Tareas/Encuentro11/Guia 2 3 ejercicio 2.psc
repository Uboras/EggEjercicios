///Escribir un programa que lea un número entero y devuelva el número de dígitos que
///componen ese número. Por ejemplo, si introducimos el número 12345, el programa
///	deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
///de división. Nota: recordar que las variables de tipo entero truncan los números o
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
