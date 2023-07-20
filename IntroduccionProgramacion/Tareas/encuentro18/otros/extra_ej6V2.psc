//Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
//un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
//posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
//o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
//en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
//más cercano.
//Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
//	H o l a m u n d o c r u e l !
//	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//	Si se desea ingresar el carácter "%" en la posición 8, entonces el resultado con desplaza-
//	miento sería:
//		
//		h o l a m u n % d o c r u e l !
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//		
//		Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posición 10 es-
//		taba más cerca de la posición 8 que el espacio de la posición 4.

Algoritmo extra_ej6V2
	
	///definición de variables
	definir vector,vectora,vectorb,frase,elegida Como Caracter
	definir i,posicion,difespacio2,difespacio1,aux como entero
	definir flag1,flag2 como logico
	Dimension vector(20),vectora(20),vectorb(20)
	
	///ingreso de frase
	Escribir "Ingrese una frase de hasta 20 caracteres"
	leer frase
	Limpiar Pantalla
	ESCRIBIR Mayusculas(frase)
	
	///llena matriz
	Mientras longitud(frase)>20 Hacer		
		Escribir "La frase ingresada supera los 20 caracteres"	
		leer frase
	FinMientras
	
	///llena de espacios " " vacios hasta casilla 19
	para i=0 hasta 19 Hacer
		vector(i)=subcadena(frase,i,i)		
		SI I>LONGITUD(frase)
		vector(i)=" "
		FinSi
	FinPara
	
	///ingreso de carácter extra
	hacer
	Escribir "Ingrese un carácter cualquiera"
		leer elegida
	mientras que longitud(elegida)<>1
	
	
	///ingreso de posición para el carácter extra
	Hacer	
		Escribir "Posición"
		leer posicion
	Mientras Que posicion>20
	
	difespacio1=0
	difespacio2=0
	aux=0
	
	flag1=Falso
	flag2=falso
	
	///// cambia?
	
	
	////busca un espacio a la derecha de la posición
				Hacer
					si vector(i)=" " Entonces
						difespacio1 = i
						aux=aux+1
					FinSi
					si aux>0 Entonces
						flag1=verdadero
					FinSi
					
					i=i+1
				Hasta Que i=longitud(frase) 
	
	aux=0
	i=posicion
	
	////busca un espacio a la izquierda de la posición
				hacer
					si vector(i)=" " Entonces
						difespacio2=i
						aux=aux+1
					FinSi
					si aux>0 Entonces
						flag2=Verdadero
					SiNo
						flag2=falso
					FinSi
					i=i-1 
				Hasta Que i=0
	escribir difespacio1," ",difespacio2
	
		
	esperar tecla
	
////		
			//	
			
	//escribir Mayusculas(vectora(i)) sin saltar
	
//		escribir elegida sin saltar
		si (flag1=verdadero y flag2=falso) o (flag1=Verdadero y flag2= Verdadero y (difespacio1-posicion > posicion-difespacio2)) Entonces
			
					para i=posicion hasta 19-posicion
				
					vectora(i)=vector(i+1)
					vectora(posicion)=elegida
				FinPara
				
			
		FinSi
		
		para i=posicion hasta 19
			vectora(i)=vector(i+1)
		FinPara
		
		
		para i=0 hasta 19
			Escribir Mayusculas(vectora(i)) sin saltar
		FinPara	
//	
//		//i encuentra dos espacios cercanos y el de la izquierda es más cercano al lugar elegido
//		si flag1=verdadero y flag2=Verdadero y  Entonces
//			para i=0 hasta posicion-1
//			escribir Mayusculas(vector(i)) sin saltar				
//			FinPara
//			escribir elegida sin saltar
//			para i=posicion+1 hasta 19
//			escribir Mayusculas(vector(i)) sinsaltar
//		FinPara	
//	FinSi
		
	
	escribir""
	
	
	
FinAlgoritmo
