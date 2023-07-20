//Escriba un programa que solicite al usuario números decimales mientras que el usuario
///escriba números mayores al primero que se ingresó. Por ejemplo: si el usuario ingresa
///	como primer número un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
///	número. El programa continuará solicitando valores sucesivamente mientras los valores
///	ingresados sean mayores que 3.1, caso contrario, el programa finaliza.




Algoritmo sin_titulo
	Definir num1, num2,c Como Real
	
	Escribir "escribir un numero"
	leer num1
	
	Escribir "escribir un numero mayor que ", num1
	leer num2
	
	Mientras num1<num2 Hacer
				
		Escribir "escribir un numero mayor que ", num1
		leer num2
		
	FinMientras
	
	Escribir "proceso terminado"
FinAlgoritmo
