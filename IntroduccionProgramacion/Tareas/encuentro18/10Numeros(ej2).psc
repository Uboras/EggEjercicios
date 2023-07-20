//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al arre-
//glo.
//
//
Algoritmo meros
	
	Definir diezNum Como real
	Definir suma, resta, multi Como Real
	Definir i como entero
	
	
	Dimension diezNum[10]
	
	
	i=0
	
	Hacer
		
		Escribir "Escribir 10 cifras a usar"
		leer diezNum(i)
		
		i=i+1
		
	Mientras Que i<10
	
	
	
	
	escribir suma1(dieznum,suma), "la suma total es de " suma
	Escribir resta1(dieznum,resta) "la resta total es de " resta
	Escribir multi1(dieznum,multi) "la multiplicacion es de " multi
//	

	
FinAlgoritmo

Funcion sumatoria <- suma1(dieznum, suma Por Referencia)
	
	Definir i Como Entero
	
	suma= 0 
	
	Para i<-0 hasta 9 con paso 1 Hacer
		
		
		suma=suma + dieznum(i)
		
	FinPara
	
FinFuncion

Funcion restoria <- resta1(dieznum, resta Por Referencia)
	
	Definir i Como Entero
	
	resta = 0 
	
	Para i<-0 hasta 9 con paso 1 Hacer
		
		
		resta = resta - dieznum(i)
		
	FinPara
	
FinFuncion

Funcion multiplicatoria <- multi1(dieznum, multi Por Referencia)
	
	Definir i Como Entero
	
	multi= 1
	
	Para i<-0 hasta 9 con paso 1 Hacer
		
		
		multi =  multi * dieznum(i)
		
	FinPara
	
FinFuncion





	