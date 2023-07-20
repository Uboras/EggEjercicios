//Realizar un procedimiento que permita realizar la división entre dos números y muestre el co-
//ciente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//50 ? 13 = 37 una resta realizada
//37 ? 13 = 24 dos restas realizadas
//24 ? 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
Algoritmo divisor
	
	Definir num1, num2 Como Entero
	Escribir "numero 1 y 2 "
	leer num1, num2
	
	resta(num1, num2)
	
FinAlgoritmo


SubProceso Resta(num1 Por Referencia, num2)
Definir c Como Entero	
c=0
	Repetir
		c=c+1
		Escribir num1 " / " num2 "es " (num1-num2) " " c " se realizaron"
		num1=num1-num2
		
	mientras Que num1 >= num2 y num1>0
		
		
	
	Escribir "el resto es " num1
finSubProceso 
	