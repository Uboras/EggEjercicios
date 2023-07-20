//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
//la matriz de la siguiente forma:




Algoritmo sin_titulo
	
	Definir matriz, i , j, filas Como Entero
	i=0
	j=0
	
	Escribir "cuantas filas desea?"
	leer filas
	
	Dimension matriz[filas,3]
	
	
	rellenar(matriz,i,j, filas)
	mostar(matriz,i,j, filas)
	
	Escribir "Muchas gracias"
	
FinAlgoritmo

SubProceso rellenar(matriz,i,j, filas)
	Definir col1, col2 Como Entero
	
	para i<-0 Hasta filas-1 Hacer
		
	Escribir "valores a sumar"
	leer col1, col2
	
	matriz(i,0)=col1
	matriz(i,1)=col2
	matriz(i,2)= col1+col2
	
	FinPara
	
	Esperar 1 segundos
	Limpiar Pantalla
FinSubProceso

SubProceso mostar(matriz,i,j, filas) 
	para i<-0 Hasta filas-1 Hacer
		
			Escribir  Sin Saltar matriz(i,0) " + " matriz(i,1) " = " matriz(i,2) 
			escribir " "
			
		FinPara

FinSubProceso
	