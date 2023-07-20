///
algoritmo ejercicio2
	definir td,tc Como Entero
	definir grado Como Caracter
	escribir "cuantos tornillos produciste? "
	leer tc
	escribir "cuantos tornillos defectuosos prduciste?"
	leer td
	Si td<=200 y tc>=10000 Entonces
	escribir "el grado de eficiencia del empleado es 8"
	SiNo
		Si td<=200 y tc<10000 Entonces
			escribir "el grado de eficiencia del empleado es 6"
		SiNo
			Si td>200 y tc>=10000 Entonces
				escribir "el grado de eficiencia del empleado es 7"
			SiNo
				escribir "el grado de eficiencia del empleado es 5"
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo

	