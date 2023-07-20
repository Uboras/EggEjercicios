Algoritmo CooperativoDesafio5
	Definir tablero como Cadena
	Dimension tablero[9, 12]
	inicializarMatriz(tablero, 9, 12)
	imprimirMatriz(tablero,9,12)
	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	acomodarPalabras(tablero)
	imprimirMatriz(tablero, 9, 12)
FinAlgoritmo

SubProceso  inicializarMatriz(tab,n,m)
	Definir i,j Como Entero
	para i=0 hasta n-1 Hacer
		para j=0 hasta m-1 Hacer
			tab(i,j)="*"
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(tab,n,m)
	definir i,j Como Entero
	para i=0 hasta n-1 Hacer
		para j=0 hasta m-1 Hacer
			Escribir tab(i,j) " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	Escribir "-------------------------------"
FinSubProceso

SubProceso agregarPalabra(tab,pal,n)
	definir j,l Como Entero
	l=Longitud(pal)-1
	para j=0 hasta l Hacer
		tab(n,j)=Subcadena(pal,j,j)
	FinPara
FinSubProceso

Funcion pos=buscarR(tab,n,c Por Referencia)
	Definir pos,j Como Entero
	c=0
	para j=0 Hasta 11 hacer
		si tab(n,j)="r" o tab(n,j)="R"
			c=c+1
			si c=1
				pos=j
			FinSi
		FinSi
	finpara
FinFuncion


SubProceso acomodarPalabras(tab)
	Definir i,j,pos,c Como Entero
	Definir matrizaux Como Caracter
	Dimension matrizaux(9,12)
	inicializarMatriz(matrizaux,9,12)

	Para i=0 Hasta 8 Hacer
		pos = 5 - buscarR(tab,i,c)
		Para j<-0 Hasta 11 Hacer
			Si pos < 12 Entonces
				matrizaux(i,pos) = tab(i,j)
				pos = pos+1
			FinSi
		FinPara
	FinPara

	Para i<-0 Hasta 8 Hacer
		Para j<-0 Hasta 11 Hacer
			tab(i,j) = matrizaux(i,j)
		FinPara
	FinPara
FinSubProceso
	