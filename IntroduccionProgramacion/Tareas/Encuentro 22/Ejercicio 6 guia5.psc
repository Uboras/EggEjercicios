//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//
//


Algoritmo sin_titulo
	definir sumatoria, numerosIng, matrizmagica, i , j , c, lonmatriz Como Entero
	
	numerosIng=0
	i=0	
	j=0
	c=0
	
	
	Hacer
		
		Escribir "ingrese el tamaño de la matriz"
		leer lonmatriz
			
		
	Mientras Que  lonmatriz<0 y lonmatriz >= 10
	
	
	Dimension matrizmagica(lonmatriz,lonmatriz )
	Dimension sumatoria(lonmatriz*2 + 2 )
	
	
	
	Para i<-0 Hasta lonmatriz*2+2-1 Hacer
			
			sumatoria(i) = 0
			
			
		FinPara

	
	
	
	
	
	
	
	Ingresodedatos(matrizmagica, i , j, c, lonmatriz, numerosIng)
	sumarfilas(matrizmagica, i, j ,c, lonmatriz, sumatoria)
	sumarcolumnas(matrizmagica, i, j ,c, lonmatriz, sumatoria)
	sumadiagonales(matrizmagica, i, j, c, lonmatriz, sumatoria)
	verificacion(matrizmagica, i , j, lonmatriz, c,  sumatoria)
	
	Para j<-0 Hasta lonmatriz*2+2-1 Hacer
		si j<lonmatriz Entonces
		Escribir sumatoria(j) " Es la suma de las fila " j
	sino 
		si j>lonmatriz-1 y j<lonmatriz*2 Entonces
			Escribir sumatoria(j) " Es la suma de las columna " j
			
		sino 
			Escribir sumatoria(j) " es la suma de las diagonales "  j
			
		FinSi
	finsi	
		
	FinPara
	
	
	
FinAlgoritmo

SubProceso ingresodedatos(matrizmagica,i,j,c, lonmatriz, numerosIng)
	
	
	Para i<-0 Hasta lonmatriz-1 Hacer
		Para j<-0 Hasta lonmatriz-1 Hacer
			
			Escribir "Datos a ingresar, hasta " lonmatriz * lonmatriz
			leer matrizmagica(i,j)
			
			
		FinPara
		
		
	FinPara
	
	
// solo verificar	
	Para i<-0 Hasta lonmatriz-1 Hacer
		Para j<-0 Hasta lonmatriz-1 Hacer
			
	
			Escribir matrizmagica(i,j) Sin Saltar
			
			
		FinPara
		Escribir " "
		
	FinPara
	
	FinSubProceso
	
	
	SubProceso sumarfilas(matrizmagica, i, j ,c, lonmatriz, sumatoria)		
		
		Definir suma Como Entero
		suma=0
		c=0
		//filas
		Para i<-0 Hasta lonmatriz-1 Hacer
			Para j<-0 Hasta lonmatriz-1 Hacer
				
				suma= suma + matrizmagica(i,j)
				
				
			FinPara
		
			sumatoria(c) = suma
			suma= 0
			c=c+1
			
		FinPara
		
			
FinSubProceso


SubProceso sumarcolumnas(matrizmagica, i, j, c , lonmatriz, sumatoria)
	Definir suma Como Entero
		// columnas
		c = lonmatriz
		suma=0
		
		Para j<-0 Hasta lonmatriz-1 Hacer
			Para i<-0 Hasta lonmatriz-1 Hacer
				
				suma= suma + matrizmagica(i,j)
				
				
			FinPara
			
			sumatoria(c) = suma
			suma=0
			c=c+1
		FinPara
		
		
FinSubProceso

SubProceso sumadiagonales(matrizmagica, i, j, c, lonmatriz, sumatoria)
	Definir suma Como Entero
	c = lonmatriz*2
	suma=0
	
	Para j<-0 Hasta lonmatriz-1 Hacer
		Para i<-0 Hasta lonmatriz-1 Hacer
			
			si i=j Entonces
				suma = suma + matrizmagica(i,j)
				
			FinSi
			
			
		FinPara
		
		sumatoria(c) = suma
		
		
		
	FinPara
	
	
finSubProceso

SubProceso verificacion(matrizmagica, i , j, lonmatriz, c,  sumatoria)
	
	c=1
	
	Para  i<-0 Hasta (lonmatriz*2+2)-1 Hacer
		si (i+1) > (lonmatriz*2+2)-1 Entonces
			Escribir "termina proceso de verificacion"
		
		sino	
		si sumatoria(i) = sumatoria(i+1) Entonces
			c=c+1
			
		
		FinSi
		finsi
		
	FinPara
	
	Escribir c
	
	si c = (lonmatriz*2+2)-1 Entonces
		
		Escribir "Es magica"
		
	sino 
		Escribir "no es magica"
	FinSi
	
	
	
	
FinSubProceso

