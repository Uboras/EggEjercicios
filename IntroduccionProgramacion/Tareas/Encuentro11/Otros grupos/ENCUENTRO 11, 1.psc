Algoritmo sin_titulo
//	Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el número
	//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
	Definir Num, i Como Entero
	Definir Contador Como Entero
	Contador=0
	Hacer
		Contador=Contador+1
		Escribir "Ingrese un número entre el 1 y el 20"
		Leer Num
		Si Num < 21 Y Num > 0 Entonces
			
		
		Escribir Sin Saltar Num, " "
		Para i=1 Hasta Num Con Paso 1 Hacer
			Escribir Sin Saltar "*"
			Escribir Sin Saltar " "
		FinPara
		Escribir " "
	SiNo
		Escribir "Valor Erroneo"
		Contador=Contador-1
	FinSi
	Mientras Que Contador <> 5
	
	
FinAlgoritmo
