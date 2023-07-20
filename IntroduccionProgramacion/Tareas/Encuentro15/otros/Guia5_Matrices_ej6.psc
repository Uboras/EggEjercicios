Algoritmo Guia5_Matrices_ej6
	Definir matriz, i, j, sumaFila, SumaCol, SumaDiag1, SumaDiag2, dim, x,v Como Entero
	Definir magica Como Logico
	magica=verdadero
	
	Escribir "Ingrese la dimensi�n de la matriz. El tama�o no debe superar orden igual a 10"
	Leer dim
	Mientras dim>10
		Escribir "Ingrese un tama�o v�lido. Menor o igual a 10"
		Leer dim
	FinMientras
	Dimension matriz(dim,dim)
	Dimension sumaFila(dim), SumaCol(dim)
	
	Escribir "Ingrese " dim * dim " n�meros"
	Para i=0 hasta dim-1
		Para j=0 hasta dim-1
//			Escribir "Ingrese un n�mero entre 1 y 9"
			Leer matriz(i,j)
			Mientras matriz(i,j) <1 o matriz(i,j) >9
				Escribir "Ingrese un tama�o v�lido. Menor o igual a 10"
				Leer matriz(i,j)
			FinMientras
			FinPara
	FinPara
	
	Para i=0 hasta dim-1
		Para j=0 hasta dim-1
			Escribir matriz(i,j) sin saltar " "
			
		FinPara
		Escribir " "
	FinPara
	

	Para i=0 hasta dim-1
		SumaFila(i)=0
		Para j=0 hasta dim-1
			sumaFila(i)=sumaFila(i)+matriz(i,j)
		FinPara
		//Escribir sumaFila(i)	
	FinPara
	
	Para i=0 hasta dim-1
		SumaCol(i)=0
		Para j=0 hasta dim-1
			sumaCol(i)=sumaCol(i)+matriz(j,i)
		FinPara
		//Escribir sumaCol(i)	
	FinPara
	
	SumaDiag1=0
	para i=0 Hasta dim-1
		
		para j=0 Hasta dim-1
			Si i=j
				SumaDiag1=sumaDiag1+matriz(i,j)
			FinSi
			
		FinPara
		
	FinPara
	//Escribir SumaDiag1
	
	SumaDiag2=0
	para i=dim-1 Hasta 0 con paso -1
		
		para j=dim-1 Hasta 0 con paso -1
			Si i=j
				SumaDiag2=sumaDiag2+matriz(i,j)
			FinSi
			
		FinPara
		
	FinPara
	//Escribir SumaDiag2
	
	Para i=0 hasta dim-1
		Si sumaCol(i)<>SumaDiag1 y sumaCol(i)<>SumaDiag2 y sumaCol(i)<>sumaFila(i)
			Magica=falso
		FinSi
	FinPara
	
	Si magica=verdadero
		Escribir "La matriz es m�gica"
		Escribir "La suma es " SumaDiag1
	SiNo
		Escribir "La matriz NO es m�gica"
	FinSi


FinAlgoritmo

//Una matriz m�gica es una matriz cuadrada (tiene igual n�mero de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//Por ejemplo:
//	2 7 6
//	9 5 1
//	4 3 8
//	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un algoritmo que compruebe si
// una matriz de datos enteros es m�gica o no, y en caso de que sea
//			m�gica escribir la suma. Adem�s, el programa deber� comprobar que los n�meros introducidos son correctos, 
//es decir, est�n entre el 1 y el 9. El usuario ingresa el tama�o de la matriz
//que no debe superar orden igual a 10.