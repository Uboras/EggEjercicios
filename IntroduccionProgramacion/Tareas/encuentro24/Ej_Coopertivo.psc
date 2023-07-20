Algoritmo ejercicioCooperativoGuia4
	
	Definir tablero como cadena
	
	Dimension tablero(9,12)
	
	inicializarMatriz( tablero,9,12)
	
	agregarPalabra0( tablero, 0)
	
	agregarPalabra1(tablero, 1)
	
	agregarPalabra2( tablero, 2)

	agregarPalabra3( tablero, 3)
	
	agregarPalabra4( tablero, 4)
	
	agregarPalabra5( tablero, 5)
	
	agregarPalabra6( tablero, 6)
	
	agregarPalabra7( tablero, 7)
	
	agregarPalabra8( tablero, 8)
	
	
	imprimirMatriz( tablero, 9, 12)
	buscarR( tablero, 9, 12)

	
FinAlgoritmo

SubProceso inicializarMatriz(tablero,9,12)
	
	Definir i, j Como Entero
	Para i<-0 Hasta 8
		Para j<-0 Hasta 10
			tablero(i,j) = ""
			
		FinPara
	FinPara
	
FinSubProceso

	
SubProceso agregarPalabra0( tablero, 0)
		Definir c Como Caracter
		Definir I,J, contador Como ENTERO
		c= "VECTOR"
		contador=0
		para i<-0 Hasta 0 Hacer
			para j<-0 Hasta  12-1 Hacer
				
				tablero(i,j)= Subcadena(C,contador,contador)
				contador=contador+1
			FinPara
		FinPara
		
FinSubProceso


SubProceso agregarPalabra1(tablero, 1)
	
	Definir i,j, contador Como Entero
	Definir c Como Caracter
	
	contador=0
	c="MATRIX"
	
	Para i<-1 Hasta 1
		Para j<-0 Hasta 11
			
			tablero(i,j) = Subcadena(c,contador,contador)
			contador=contador+1
			
		FinPara
	FinPara
FinSubProceso


SubProceso agregarPalabra2( tablero, 2)
	Definir c Como Caracter
	Definir I,J, contador Como ENTERO
	contador=0
	c= "PROGRAMA"
	para i<-2 Hasta 2 Hacer
		para j<-0 Hasta  12-1 Hacer
			
			tablero(i,j)= Subcadena(C,contador,contador)
			contador=contador+1
			
		FinPara
	FinPara
	
FinSubProceso


SubProceso agregarPalabra3( tablero, 3)
	Definir c Como Caracter
	Definir I,J, contador Como ENTERO
	contador=0
	c= "SUBPROGRAMA"
	para i<-3 Hasta 3 Hacer
		para j<-0 Hasta  12-1 Hacer
			tablero(i,j)= Subcadena(C,contador,contador)
			contador=contador+1
		FinPara
	FinPara
	
FinSubProceso


SubProceso agregarPalabra4( tablero, 4)
	Definir c Como Caracter
	Definir I,J, contador Como ENTERO
	contador=0
	c= "SUBPROCESO"
	para i<-4 Hasta 4 Hacer
		para j<-0 Hasta  12-1 Hacer
			tablero(i,j)= Subcadena(C,contador,contador)
			contador=contador+1
		FinPara
	FinPara
	
FinSubProceso


SubProceso agregarPalabra5( tablero, 5)
	Definir c Como Caracter
	Definir I,J, contador Como ENTERO
	contador=0
	c= "VARIABLE"
	para i<-5 Hasta 5 Hacer
		para j<-0 Hasta  12-1 Hacer
			tablero(i,j)= Subcadena(C,contador,contador)
			contador=contador+1
		FinPara
	FinPara
	
FinSubProceso


SubProceso agregarPalabra6( tablero, 6)
	Definir c Como Caracter
	Definir I,J, contador Como ENTERO
	contador=0
	c= "ENTERO"
	para i<-6 Hasta 6 Hacer
		para j<-0 Hasta  12-1 Hacer
			tablero(i,j)= Subcadena(C,contador,contador)
			contador=contador+1
		FinPara
	FinPara
	
FinSubProceso


SubProceso agregarPalabra7( tablero, 7)
	Definir c Como Caracter
	Definir I,J, contador Como ENTERO
	contador=0
	c= "PARA"
	para i<-7 Hasta 7 Hacer
		para j<-0 Hasta  12-1 Hacer
			tablero(i,j)= Subcadena(C,contador,contador)
			contador=contador+1
		FinPara
	FinPara
	
FinSubProceso


SubProceso agregarPalabra8( tablero, 8)
	Definir c Como Caracter
	Definir I,J, contador Como ENTERO
	c= "MIENTRAS"
	contador=0
	para i<-8 Hasta 8 Hacer
		para j<-0 Hasta  12-1 Hacer
			tablero(i,j)= Subcadena(C,contador,contador)
			contador=contador+1
		FinPara
	FinPara
	
FinSubProceso

SubProceso imprimirMatriz( tablero, 9, 12)
	Definir I,J Como ENTERO
	
	para i<-0 Hasta 8 Hacer
		para j<-0 Hasta  11 Hacer
			
			Escribir Sin Saltar "  " tablero(i,j) "  "
			
		FinPara
		
		Escribir " "
		
	FinPara
	
FinSubProceso

SubProceso buscarR( tablero, 9, 12)
	Definir i, j, posicR, cont, diferencia Como Entero
	Dimension posicR(9)
	cont=0
	
	Para i<-0 Hasta 8
		posicR(i)=0
	FinPara
	
		
	Para i<-0 Hasta 8 Hacer
	cont= 0
			Para j<-0 Hasta 11 Hacer
				Mientras tablero(i,j) = "R" y cont < 1
				posicR(i) = j
				cont=1
				FinMientras
			finPara
		
		
	FinPara
	
	Para i<-0 Hasta 8
		
		Escribir posicR(i) " "
			
	FinPara
	
	diferencia=0
	
	Para i<-0 Hasta 8
	
		mientras Minusculas(tablero(i,5)) <> "r"   hacer
	
		Para j<- 11 Hasta 1 Con Paso -1 hacer
			tablero(i,j) = tablero(i,j-1)
		FinPara
		Tablero(i,0)= "*"

		FinMientras
	Para j<- 11 Hasta 0 Con Paso -1 hacer
		tablero(i,j) = tablero(i,j)
	FinPara
FinPara


para i<-0 Hasta 8 Hacer
	para j<-0 Hasta  11 Hacer
		
		Escribir Sin Saltar "  " tablero(i,j) "  "
		
	FinPara
	
	Escribir " "
	
FinPara
	Escribir " ***********************" 
	
FinSubProceso


	