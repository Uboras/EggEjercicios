Algoritmo sin_titulo
	
	definir num,centena,unidad Como Entero
	Escribir "Ingrese n�mero de 3 cifras"
	leer num
	
	Si num > 99 y num < 1000 Entonces
		unidad=num mod 10
		num <- trunc (num-2)
		centena =num
		si num=unidad Entonces
			Escribir "El n�mero es capic�a"
		sino escribir "El n�mero no es capic�a"
			
		FinSi
		
		
	Fin Si
	
	
FinAlgoritmo