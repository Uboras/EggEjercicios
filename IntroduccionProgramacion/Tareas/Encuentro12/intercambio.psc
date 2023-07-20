Algoritmo sin_titulo
//	Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//	La variable A, debe terminar con el valor de la variable B.	
	
	Definir var1, var2 Como entero
	
	Escribir "escriba variable1 y variable2"
	leer var1, var2
	
	Cambio(var1, var2)
	
	
	
	
	Escribir  "variable2" var1 "y variable1" var2
	
	
FinAlgoritmo



SubProceso cambio (var1 Por Referencia, var2 Por Referencia)
	Definir f Como Entero
	
	f = var1
	var1= var2
	var2= f
	
	
FinSubProceso
	