Algoritmo Matriz_Producto
//	4. Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3. Inicia-
//	lice las matrices para evitar el ingreso de datos por teclado.
	Definir matrizA, matrizB, productoAB Como real
	
	Dimension matrizA(3,3), matrizB(3,3), productoAB(3,3)
	llenarMatrices(matrizA, matrizB)
	matrizProducto(matrizA, matrizB, productoAB)
	imprimeMatrices(matrizA, matrizB, productoAB)
	
FinAlgoritmo 


SubProceso llenarMatrices(matrizA, matrizB)
	Definir i, j Como Entero
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			matrizA(i,j)= Aleatorio(1,10)
			matrizB(i,j)= Aleatorio(1,10)
		Fin Para
	Fin Para
FinSubProceso
SubProceso matrizProducto(matrizA, matrizB, productoAB)
Definir i,j,k Como Entero
	///Asigno cero a cada elemento de la matriz productoAB
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			productoAB(i,j) = 0
		Fin Para
	FinPara
	///Agrego la variable k, para multiplicar la misma fila por la misma columna
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Para k<-0 Hasta 2 Con Paso 1 Hacer
				productoAB(i,j)=productoAB(i,j)+(matrizA(i,k)*matrizB(k,j))
			Fin Para
		Fin Para
	
	Fin Para
	
//	Para i<-0 Hasta 2 Con Paso 1 Hacer
//		Para j<-0 Hasta 2 Con Paso 1 Hacer
//			productoAB(i.j)=
//		Fin Para
//	FinPara
//		si i=0 entonces
//		productoAB(i,j)= (matrizA(i,0)*matrizB(0,j))+(matrizA(i,1)*matrizB(2,j))+(matrizA(i,2)*matrizB(2,j))
//		Fin Si
//		si i=1 entonces
//			productoAB(i,j)= (matrizA(i,0)*matrizB(0,j))+(matrizA(i,1)*matrizB(2,j))+(matrizA(i,2)*matrizB(2,j))
//		Fin Si
//		si i=2 entonces
//			productoAB(i,j)= (matrizA(i,0)*matrizB(0,j))+(matrizA(i,1)*matrizB(2,j))+(matrizA(i,2)*matrizB(2,j))
//		Fin Si
// Fin Para
FinSubProceso

SubProceso imprimeMatrices(matrizA, matrizB, productoAB)
	Definir i,j Como Entero
	Escribir "La matriz A es:"
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar matrizA(i,j) " ; "
		Fin Para
		Escribir " "
	Fin Para
	Escribir " "
	Escribir "La matriz B es:"
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar matrizB(i,j) " ; "
		Fin Para
		Escribir " "
	Fin Para
	Escribir " "
	Escribir "La matriz producto de A*B es:"
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar productoAB(i,j) " ; "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso
