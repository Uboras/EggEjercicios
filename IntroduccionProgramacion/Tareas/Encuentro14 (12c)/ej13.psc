//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//		transformar el numero a cadena para realizar el ejercicio.




funcion retorno <- cantidad(num)
definir uni,num2, cant, c  Como real
Definir logic como logico


uni=num
cant=0


mientras 	uni <> 0 Hacer
	uni= uni/10
	uni=trunc(uni)
	cant=cant+1
	
FinMientras
Escribir cant

logic=Verdadero
uni=num
Mientras (cant)>1 Hacer
	Escribir uni
	
	si uni mod 10 = trunc( uni/10^(cant-1)) y logic= Verdadero Entonces
		Escribir uni mod 10
		Escribir  trunc(uni / (10^(cant-1)))
		Escribir "esta bien"
		
		Escribir uni = trunc(uni / (10^(cant-1)))
		Escribir uni = uni*(10^(cant-1))
		
		Escribir uni
		uni= trunc(uni/10)
	Escribir uni
	
		
	sino 
		logic=falso
	FinSi
	cant=cant-2
finMientras

	
	
	
	/// igualar 
	
	
//	si mode1=mode2 Entonces
//	cant=cant-1
//		
//	SiNo
//	Escribir "el numero no es capicua"
//	finsi	
//			
//	Escribir "el numero es capicua"
//	
//Mientras Que divisor <> trunc(cant/2)

	 
	
	
	
	
	
FinFuncion




Algoritmo ej10
	
	definir num,uni Como real
	
	escribir" Introduzca un número"
	leer num
	
	escribir cantidad(num)
	
finAlgoritmo