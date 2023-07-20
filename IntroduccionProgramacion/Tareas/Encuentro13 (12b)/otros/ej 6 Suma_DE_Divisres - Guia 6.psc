
Algoritmo Suma_DE_Divisres
//Realizar una función que calcule y retorne la suma de todos los divisores del número n distin-
	//tos de n. El valor de n debe ser ingresado por el usuario.
	
	definir n Como Entero
	Escribir "Ingrese un numero"
	leer n
	
	Escribir "La suma de los divisores de ", n, " son " Suma_Divisores(n)
FinAlgoritmo

Funcion suma <- Suma_Divisores ( n )
	
	Definir suma, i Como Entero
	suma = 0
	Para i = 1 Hasta (n-1) Con Paso 1 Hacer
		
		Si n mod i = 0 Entonces
			suma = suma + i
	
		Fin Si
	Fin Para
Fin Funcion



