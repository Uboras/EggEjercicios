Algoritmo Final
    //Definición de variables
    Definir calculadora Como Entero
    Definir cadena1, cadena2 Como Caracter
    Definir diagonal3D1, diagonal3D2 Como Entero
    //Definimos las 3 dimensiones de la matriz calculadora
    Dimension calculadora(3, 3, 3)
    //Asignamos valores a las cadenas de texto
    cadena1 = "123456789"
    cadena2 = "321654987"
    //Inicializamos la matriz
    inicializarMatriz(calculadora)
	//Llenamos las matrices como se marca en el enunciado
    llenarMatriz_Z0(calculadora, cadena1)
    llenarMatriz_Z1(calculadora, cadena2)
    llenarMatriz_Z2(calculadora)
    //Mostramos los resultados de la matriz
    imprimirMatriz(calculadora)
    //Asignamos los valores de las diagonales 3D
	diagonal3D1 =calculadora(0, 2, 0)*calculadora(1, 1,1)*calculadora(2, 0, 2)
	diagonal3D2=calculadora(0, 0, 0)*calculadora(1, 1,1)*calculadora(2, 2, 2)
	
    //Escribimos los resultados de las diagonales
    Escribir "La multiplicación de los elementos de la diagonal 3D 1 es ", diagonal3D1
    Escribir "La multiplicación de los elementos de la diagonal 3D 2 es ", diagonal3D2
	
FinAlgoritmo

SubProceso inicializarMatriz(calculadora)
	// inicializar 
	Definir k,i,j Como Entero
	
	para k<-0 Hasta  2 Hacer
		para i<- 0 Hasta 2
			para j<- 0 Hasta 2
				calculadora(k,i,j) = 0
				
				
			FinPara
		FinPara
	FinPara

	
FinSubProceso

SubProceso  llenarMatriz_Z0(calculadora, cadena1)
	Definir k, i,j Como Entero
	k=0
	para i<- 0 Hasta  2 Hacer
		Para j <- 0 Hasta  2 Hacer
			calculadora(0,i,j) = ConvertirANumero(Subcadena(cadena1, k , k ))
			k=k+1
		FinPara
	FinPara
	
	
	
	


SubProceso   llenarMatriz_Z2(calculadora)
	Definir k, i,j Como Entero
	
		
		para i<- 0 Hasta  2 con paso 1 Hacer
			Para j <- 0 Hasta  2 Con Paso 1 Hacer
			calculadora(2,i,j) = calculadora(1,i,j) * calculadora(0,i,j)
			
		FinPara
finpara

	
FinSubProceso

SubProceso      imprimirMatriz(calculadora)
	Definir k,i,j Como Entero
	para k<-0 Hasta  2 Hacer
		Escribir "- - - - - - - -  " 
		escribir " La capa " k+1
		Escribir "- - - - - - - -  " 
		para i<- 0 Hasta 2
			para j<- 0 Hasta 2
				Escribir sin saltar  calculadora(k,i,j) " "
				
				
			FinPara
			Escribir " " 
		FinPara
		
	FinPara
	Escribir " " 
	
	
FinSubProceso

