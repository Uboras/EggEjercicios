//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
//muestre por pantalla.


Algoritmo rellenar
	Definir valores, num, i Como Entero
	
	Dimension valores[5]
	
//	Escribir "valores valores" 
//	leer valores[]
	
	
	para i<-0 Hasta 4 con paso 1 Hacer
	Escribir  i+1, " valores! hasta 5 "
	leer num
	
	valores(i)=num
	
	
	
	FinPara
	
	Para i<-0 Hasta 4 con paso 1 hacer
		escribir "valor" i+1 " " valores(i)
	FinPara
	
	
FinAlgoritmo
