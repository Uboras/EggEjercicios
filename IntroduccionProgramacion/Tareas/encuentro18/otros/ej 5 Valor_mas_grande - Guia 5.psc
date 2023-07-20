
Algoritmo Valor_mas_grande
//	Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el usua-
//	rio. A continuación, se deberá crear una función que reciba el vector y devuelva el valor más
//	grande del vector.
	
	Definir n, i, valores Como Entero
	Escribir "Ingrese el tamaño del vector"
	leer n
	
	Definir Vector Como Entero
	Dimension vector[n]
	
	Escribir "Ingrese los ", n " valores del vector"
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		leer valores
		vector[i]=valores
	Fin Para
	
	Escribir Sin Saltar "El vector es igual a: "
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		escribir Sin Saltar "[",Vector[i] "]"
	Fin Para
	Escribir " "
	Escribir "El valor mas grande del vector es: " valorMasGrande(Vector, n)
	
FinAlgoritmo

Funcion valorMayor <- ValorMasGrande ( Vector, n )
	Definir valorMayor, i Como Entero
	valorMayor= 0
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		
		Si Vector[i]>valorMayor Entonces
			valorMayor=Vector[i]
		Fin Si
		
	Fin Para
	
Fin Funcion



