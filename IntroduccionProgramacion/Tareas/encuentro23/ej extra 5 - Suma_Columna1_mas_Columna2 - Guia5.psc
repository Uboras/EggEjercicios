Algoritmo Suma_Columna1_mas_Columna2
//	5. Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//	primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//	deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
// la matriz de la siguiente forma:
//	3 + 5 = 8
//	4 + 3 = 7
//	1 + 4 = 5...
	
	Definir matriz, n Como Entero
	
	Escribir "Ingresar la cantidad de filas a sumar"
	leer n
	Dimension matriz(n,3)
	Definir i,j Como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Si j=0 O j=1 Entonces
				Escribir "Ingrese el valor de la fila ",i+1
				leer matriz(i,j)
			Fin Si
			si j=2 Entonces
				matriz(i,j)=(matriz(i,0)+matriz(i,1))
			FinSi
		Fin Para
		
	Fin Para
	imprimeMatriz(matriz,n)
	
FinAlgoritmo

SubProceso imprimeMatriz(matriz,n)
	Definir i,j Como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			si j=0 Entonces
				Escribir Sin Saltar matriz(i,j) " + "
			FinSi
			si j=1 Entonces
				Escribir Sin Saltar matriz(i,j) " = "
			FinSi
			si j=2 Entonces
				Escribir Sin Saltar matriz(i,j)
			FinSi
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso