//	Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//	tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//			numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//			Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
//					realizar el ejercicio.
//FinAlgoritmo
	
Funcion Juancito <- paresImpares(numIng)
	Definir uni Como Real
	Definir cifras, impar Como Entero
	
	uni=numIng
	cifras=0
	 
	impar=0
	
	mientras 	uni <> 0 Hacer
		
		escribir Sin Saltar uni mod 10 
		si ((uni mod 10) mod 2 ) <> 0 Entonces
			
			impar= impar+1
		
	FinSi
		
		uni= uni/10
		uni=trunc(uni)
		cifras= cifras+1
	
	
		
		
		
	FinMientras
	
	si impar=cifras Entonces
		Escribir "Las cifras  son iMPARES"
	SiNo
		Escribir "Las cifras no son Impares"
	FinSi
	
	
	
FinFuncion
Algoritmo paresImpares_
	
	Definir numIng Como Real
	
	escribir "Escribir el numero a Analizar"
	
	leer numIng
	
	Escribir paresImpares(numIng)
	
	
FinAlgoritmo
