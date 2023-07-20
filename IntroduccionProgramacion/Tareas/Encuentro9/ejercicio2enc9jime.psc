Algoritmo ejercicio2
	definir i, inicial , final, long Como Entero
	definir frase , frase2 Como Caracter	
	
	Escribir "Ingrese una frase: "
	leer frase
	
	inicial=0
	final=0	
	long=longitud (frase)
	
	Para i <-1 Hasta Long-1 Con Paso 1 Hacer
		
		frase2=Subcadena(frase, long-i,long-i)
		Escribir Sin Saltar frase2," "
				
	Fin Para		
	
FinAlgoritmo
