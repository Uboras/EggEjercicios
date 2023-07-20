///Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario, encon-
///trando la manera de que la frase se muestre de manera continua en la matriz.
///Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
///		H A B
///		I L I
///	    D A D
///	Nota: recordar el uso de la función Subcadena().

Algoritmo Enc22_Ej5
	
	Definir matriz, palabra Como Caracter
	Definir i, j, contador Como Entero
	
	Dimension matriz(3,3)
	
	contador = 0
	
	Escribir " Escriba una palabra de 9 caracteres "
	Leer palabra
	
	Para i<-0 Hasta 2
		Para j<-0 Hasta 2
			
			matriz(i,j) = Subcadena(palabra, contador, contador)
			
			contador=contador+1
						
		FinPara
		
	FinPara
	
	Para i<-0 Hasta 2
		Para j<-0 Hasta 2
			Escribir sin saltar  " [ " matriz(i,j) " ] "
			
		FinPara
		
		Escribir " "
		
	FinPara
	
FinAlgoritmo
