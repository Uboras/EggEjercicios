//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario, encon-
//trando la manera de que la frase se muestre de manera continua en la matriz.



Algoritmo fraseMatriz
	
	
	Definir frase Como Caracter
	Definir matrizfrase Como Caracter
	//Definir i, j Como Entero
	
	
	
	Dimension matrizfrase[3,3]
	
	
	
	
	Escribir "Palabra a ingresar en la matriz"
	leer frase
	
	
	rellenarmatriz(matrizfrase, frase)
	
	
	
	
FinAlgoritmo




SubProceso rellenarmatriz( matrizfrase, frase )
	Definir j, i, c Como Entero
	c=0
	
	Para i<-0 Hasta 2 Hacer
		
		para j<- 0 Hasta 2 Hacer
			
			matrizfrase(i,j) = Subcadena(frase, c , c)
		c=c+1
			Escribir matrizfrase(i,j) Sin Saltar
			
		FinPara
		Escribir " " 	
		
		
	FinPara
	
	
	
	
FinSubProceso
	