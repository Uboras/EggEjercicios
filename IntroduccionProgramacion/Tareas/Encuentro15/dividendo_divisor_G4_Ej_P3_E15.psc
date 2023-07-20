Algoritmo dividendo_divisor_G4_Ej_P3_E15
	
	// Realizar un procedimiento que permita realizar la división entre dos números y muestre el cociente y el resto utilizando el método de restas sucesivas.
	// El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta	obtener un resultado menor que el divisor, este resultado es el residuo, 
	// y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
	//50 / 13 = 37 una resta realizada
	//37 / 13 = 24 dos restas realizadas
	//24 /13 = 11 tres restas realizadas
	//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
	
	Definir dividendo, divisor Como Real
	Definir contRestas como entero
	
	contRestas=0
	
	Escribir "Ingrese el dividendo para restar"
	Leer dividendo
	
	Escribir "Ingrese el divisor para restar"
	Leer divisor
	
	intercambio(dividendo,divisor,contRestas)
	
	Escribir " "
	Escribir "El residuo es: " dividendo " y el cociente es: " contRestas
	
	
	
FinAlgoritmo

SubProceso intercambio(dividendo por Referencia,divisor,contRestas por Referencia)
	
	Definir resta Como Real
	
	Repetir
		
		resta = dividendo - divisor
		contRestas=contRestas + 1
		
		Escribir dividendo " / " divisor " = " resta "        " contRestas " restas realizadas"
		
		dividendo = resta
		
	Mientras Que dividendo > divisor
	
	
	
	
	
	
FinSubProceso
