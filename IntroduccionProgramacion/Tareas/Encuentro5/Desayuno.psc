Algoritmo sin_titulo
	definir Desayuno, cafeCortado, lecheVegetal como caracter
	
	Escribir "¡Buenos dias! que quieres para desayunar Te o Café?"
	Leer Desayuno
	
	si Minusculas(Desayuno) = "te" Entonces
		Escribir "Excelente, ya se lo servimos"
		
	sino 
		si Minusculas(Desayuno) = "cafe" Entonces
			Escribir "excelente, cortadoca?"
			leer cafeCortado
			
			si Minusculas(cafeCortado) = "si" Entonces
				escribir"Buenisimo, con leche vegetal?"
				leer lecheVegetal
				
				
				
				si Minusculas(lecheVegetal) ="si" Entonces
					Escribir "Excelente ya se lo traemos al cafe cortado con leche vegetal"
					
				sino escribir "Será con leche de vaca entonces, ya se lo acerco a la mesa"
					
				FinSi
				
			FinSi
			
			
				
			
		FinSi
		
	FinSi
	si Minusculas(Desayuno) <> "te" y Minusculas(Desayuno) <> "cafe" Entonces
		Escribir "No tenemos otras opciones para Desayuno disculpe"
	FinSi
	
FinAlgoritmo
