Algoritmo sin_titulo
	
Definir NumIng Como Entero

Escribir "escribe el numero a evaluar si es primo"
leer NumIng

escribir Primo(NumIng)
	
	
FinAlgoritmo


Funcion evaluacion <- primo (NumIng)
	Segun NumIng Hacer
		
		2: Escribir "el numero es primo"
		3: Escribir "el numero es primo"
		5: Escribir "el numero es primo"
		
			
		De Otro Modo:
						
			si (NumIng mod 5 <> 0) y (NumIng mod 2 <> 0) y (NumIng mod 3 <>	0) Entonces
				Escribir "el numero es Primo"
			sino 
				Escribir "el numero no es primo!"
				
			FinSi
			
			
	FinSegun
	
	
	
	
	
FinFuncion

	
	
	
	
	
	
//
//
//Realizar una función que reciba un numero ingresado por el usuario 
//y averigüe si el número es
//	primo o no. Un número es primo cuando es divisible sólo por 
//1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.