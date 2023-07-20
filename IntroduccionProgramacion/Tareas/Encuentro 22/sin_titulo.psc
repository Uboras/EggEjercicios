//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//Por ejemplo:
//	2 7 6
//	9 5 1
//	4 3 8
//	
//	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un algo-
//	ritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que sea
//		
//		mágica escribir la suma. Además, el programa deberá comprobar que los números introduci-
//		dos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la matriz
//		
//		que no debe superar orden igual a 10.
//



Algoritmo sin_titulo
	
	Definir matrizmagic, c, n , i,j, numIng Como entero
	Definir vectorcompara como entero
	i=0
	j=0
	c=0
	
	
	
	Escribir "Indique lugares de la matriz hasta 10 "
	leer n
	
	
	si  n < 10 y n > 0 Entonces
		n=n
		
	sino 
		Escribir "Indique lugares de la matriz hasta 10 "
		leer n
	FinSi

	Dimension vectorcompara(n*2+2)
	Dimension matrizmagic(n,n)
	
	
	Para i<-0 Hasta n-1 Hacer
		vectorcompara(i) = 0
		
	FinPara
	
	
	para i<- 0 Hasta n-1 Hacer
		para j<- 0 Hasta n-1 Hacer
			
			Escribir "numeros a ingresar en filas y columnas "
			leer numIng
			matrizmagic(i,j)=numIng
		FinPara
	FinPara
	
	Para i<-0 Hasta n-1 Hacer
		Para j<-0 Hasta n-1 Hacer
			Escribir matrizmagic(i,j) " " Sin Saltar
			
		FinPara
		
	Escribir " "	
	FinPara



	
	
	
	
	
	verificacion(vectorcompara, matrizmagic , i , j , n , c )
	
	comparacion(vectorcompara, i , j, n  )
	
	
	

FinAlgoritmo


SubProceso verificacion(vectorcompara, matrizmagic,i,j, n, c)
	Definir suma1, suma2 Como Entero
	
	
	c=0	
	suma1=0
	suma2=0
	
	
	// filas	
		 para i<- 0 Hasta  n-1 Hacer
			para j<-0 hasta n-1 Hacer
			suma1 = suma1 + matrizmagic(i,j)
			Escribir suma1 " es suma1"
			
		FinPara
			
			vectorcompara(c) = suma1
			suma1=0
			c=c+1
		finPara
		 
		//columnas	
		
		para i<- 0 Hasta  n-1 Hacer
			para j<-0 hasta 0 Hacer
				suma1 = suma1 + matrizmagic(i,j)

				
				Escribir j "es J " i " i es " suma1  " suma1 en columnas "
				Escribir matrizmagic(i,j)
			FinPara
			

			
	FinPara
	vectorcompara() = suma1
	suma1=0
	c=c+1
	
	
	
	//diagonales
	c=0
	i=0
	suma1=0
	suma2=0
	
	para i<- 0 Hasta  n-1 Hacer
		para j<-0 hasta n-1 Hacer
			si i=j Entonces
				suma1 = suma1 + matrizmagic(i,j)
				
			FinSi
			
			si i=n-1-c y  j =n-1-c Entonces
				
				suma2= suma2+matrizmagic(i,j)
				c=c+1
				
				Escribir suma2
			FinSi
			
			Escribir matrizmagic(i,j) "e" Sin Saltar
			Escribir suma1
			
		FinPara
		Escribir " "
	FinPara
	
	
	
	para i<- 0 Hasta  n-1 Hacer
		para j<-0 hasta n-1 Hacer
			
		
		si i=n-1-c y  j =n-1-c Entonces
		
		suma2= suma2+matrizmagic(i,j)
		c=c+1
		
		Escribir suma2
	FinSi
	
fin Para
FinPara

	
	
	
	
	
	
	Escribir suma1 "diagonales"
	Escribir suma2 " diagonales reversas"
	
	vectorcompara(c) = suma1
	vectorcompara(c+1) =suma2
	suma1=0
	c=c+1
	
	
	
FinSubProceso


SubProceso comparacion ( vectorcompara, i , j, n  )
	
	i=1
	
	repetir
	si i > 1  y i < 9 Entonces
		si vectorcompara(i-1) <> vectorcompara(i) 
			
			Escribir "no es magica"
			
		SiNo
		i=i+1
		FinSi
	FinSi
	Mientras que i > n*2+2
	
Escribir " es magica" 
	

	
	para i<-0 Hasta n-1
		
		Escribir vectorcompara(i) "  "  Sin Saltar
		
		
	FinPara
	Escribir " " 
	
	
FinSubProceso




