Algoritmo Correccion_SiAnidado
	Definir n1, n2, n3 Como Entero
	Escribir "MOSTRAR EL MAYOR DE 3 N�MEROS"
	Escribir "INGRESE N�MERO 01 : "
	leer n1
	Escribir "INGRESE N�MERO 02 : "
	leer n2
	Escribir "INGRESE N�MERO 03 : "
	Leer n3
	
	Si (n1 > n2 y  n1 > n3) Entonces
		Escribir "MAYOR ES ", n1
		siNo
		Si (n2 > n1 y n2> n3) Entonces
			Escribir "MAYOR ES ", n2
		sino 
			si (n3 > n1 y n3> n2) Entonces
			FinSi
			Escribir "MAYOR ES ", n3
		FinSi
	FinSi
	
FinAlgoritmo