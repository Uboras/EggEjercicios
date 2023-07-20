// Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
// un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
// posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
// o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
// en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
// más cercano.
// Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
// H o l a m u n d o c r u e l !
// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
// Si se desea ingresar el carácter "%" en la posición 8, entonces el resultado con desplaza-
// miento sería:
// h o l a m u n  MOD  d o c r u e l !
// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
// Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posición 10 es-
// taba más cerca de la posición 8 que el espacio de la posición 4.
Algoritmo extra_ej5V2
	///definición de variables
	Dimension vector[20],juntavector[20]
	Definir cumulo,vector,juntavector,vectorenganche,frase,elegida Como Caracter
	Definir i,posicion,difespaciomenor,difespaciomayor,aux Como Entero
	i=0
	vectorenganche=""
	///ingreso de frase
	Repetir
		Escribir 'Ingrese una frase de hasta 20 caracteres'
		Leer frase
		Si longitud(frase)>20 Entonces
			Escribir 'La frase ingresada supera los 20 caracteres'
			Escribir ' '
		FinSi
	Mientras Que longitud(frase)>20
	Borrar Pantalla
	Escribir Mayusculas(frase)
	///llena vector con frase y juntavector de espacios " " vacios hasta casilla 19
	Para i<-0 Hasta 19 con paso 1 Hacer
		vector[i] <- subcadena(frase,i,i)
		juntavector[i] <- subcadena(frase,i,i)
	FinPara
	///ingreso de carácter extra
	Repetir
		Escribir 'Ingrese un carácter cualquiera'
		Leer elegida
	Mientras Que longitud(elegida)<>1
	///ingreso de posición para el carácter extra
	Hacer	
	Escribir 'Posición:'
	Leer posicion
	Mientras Que  no posicion<longitud(frase) 
	escribir""
	difespaciomenor <- 0
	difespaciomayor <- 0
	aux <- 0
	i <- 0
	
	///distancias izq. der.	
	si vector[posicion]<>' ' Entonces
		Para i<-(posicion-1) Hasta 0 Con Paso -1 Hacer
			Si vector[i]=' ' Entonces
				difespaciomenor <- i
			FinSi
		FinPara
		Para i<-posicion+1 Hasta longitud(frase) Hacer
			Si vector[i]=' ' Entonces
				difespaciomayor <- i
			FinSi
		FinPara
		si difespaciomenor<0 Entonces
			difespaciomenor=0
		FinSi
		si difespaciomayor>19 Entonces
			difespaciomayor=19
		FinSi
	finsi
	
	escribir difespaciomenor," ", difespaciomayor
	////check espacio libre

	Si vector[posicion]=' ' Entonces
		Para i<-0 Hasta posicion-1 Hacer
			juntavector[i] <- vector[i]
		FinPara
		juntavector[posicion] <- elegida
		Para i<-posicion+1 Hasta longitud(frase) Hacer
			juntavector(i) <- vector[i]
		FinPara
		
	sino	
		////ir derecha
		Si difespaciomayor-posicion<posicion-difespaciomenor Entonces
			Para i<-0 Hasta difespaciomenor-1 Hacer
				juntavector[i] <- vector[i]
				
			FinPara
			
			Para i<-(difespaciomenor+1) Hasta posicion Con Paso 1 Hacer
				
				juntavector[i] <- vector[i]		
			FinPara
			para i=difespaciomayor Hasta 19
				
				juntavector[i] <- vector[i-1]
			FinPara
			juntavector[posicion] <- elegida
	SiNo
		Si difespaciomayor-posicion>posicion-difespaciomenor Entonces
		
		
				
			Para i<-(difespaciomenor+1) Hasta posicion Con Paso 1 Hacer
				
				
				
			FinPara
//			 Hacer
//				juntavector[i] <- vector[i]
//				
//			FinPara
//			
//			Para i<-(difespaciomenor+1) Hasta posicion Con Paso 1 Hacer
//				
//				juntavector[i] <- vector[i]		
//			FinPara
//			para i=difespaciomayor Hasta 19
//				
//				juntavector[i] <- vector[i-1]
//			FinPara
//			juntavector[posicion] <- elegida
//			
		FinSi
			
			
		finSi
	FinSi
		
	para i=0 hasta 19 Hacer
		escribir juntavector(i) Sin Saltar
		
	FinPara
	Escribir ""
//	Si difespaciomayor-posicion>posicion-difespaciomenor Entonces
//		Para i<-0 Hasta posicion-1 Hacer
//			juntavector[i] <- vector[i]
//		FinPara
//		juntavector[posicion] <- elegida
//		Para i<-posicion+1 Hasta longitud(frase)-1 Hacer
//			juntavector[i] <- vector[i]
//		FinPara
//	FinSi

FinAlgoritmo
