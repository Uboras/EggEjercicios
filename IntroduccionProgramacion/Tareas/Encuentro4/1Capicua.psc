Algoritmo sin_titulo
	
	definir num,centena,unidad Como Entero
	Escribir "Ingrese número de 3 cifras"
	leer num
	
	Si num > 99 y num < 1000 Entonces
		unidad=num mod 10
		num <- trunc (num-2)
		centena =num
		si num=unidad Entonces
			Escribir "El número es capicúa"
		sino escribir "El número no es capicúa"
			
		FinSi
		
		
	Fin Si
	
	
FinAlgoritmo