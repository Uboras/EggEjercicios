//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el usua-
//rio. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar tam-
//bién debe ser ingresado por el usuario). El programa debe indicar la posición donde se en-
//cuentra el valor. En caso de que el número se encuentre repetido dentro del arreglo se deben
//
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso de que el número a buscar no está adentro del arreglo se debe mostrar
//un mensaje.//



Algoritmo rellene
	definir tamano como entero
	
	Definir  c Como Real
	Definir cajadevalores como real
	
	Escribir "cuantos valores ingresaras?"
	leer tamano
	
	c=0
	Dimension cajadevalores[tamano]
	
	Hacer
		
		Escribir "dato a guardar"
		leer cajadevalores[c]
	c=c+1
		
Mientras Que c <> tamano

	
	
	Definir cont, i Como Entero
	Definir valorbuscado Como Real
	
	Escribir "valorbuscado"
	leer valorbuscado
	
	
	cont=0
	para i<-0 Hasta tamano-1 Con Paso 1 Hacer
		
		si cajadevalores(i) = valorbuscado Entonces
			Escribir "esta en la posicion " cont
			cont= cont+1
		FinSi
		
		
	FinPara
	
	si cont=0 Entonces
		Escribir "no se encuentra el numero"
		
	sino 
		Escribir "se encontro " cont " veces"		
	FinSi
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo

//
//S
//	
//	
//	
//
//	