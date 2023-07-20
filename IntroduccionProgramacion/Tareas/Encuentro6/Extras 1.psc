//Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por pantalla
//un mensaje que indique a qué día de la semana corresponde. Considere que el número 1
//corresponde al día "Lunes", y así sucesivamente.
Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "defina un numoer de 1-7"
	
	leer num 
	
	Segun num Hacer
		1: escribir "Lunes"
			
		2: escribir "martes"
			
		3:escribir "miercoles"
			
		4:escribir "jueves"
			
		5:escribir "viernes"
		
		6: escribir "sabado" 
		7:escribir "domingo"
		De Otro Modo:
			Escribir "no es un valor correcto"
	FinSegun
FinAlgoritmo
