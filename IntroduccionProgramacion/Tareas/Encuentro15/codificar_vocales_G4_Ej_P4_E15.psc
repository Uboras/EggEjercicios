Algoritmo codificar_vocales_G4_Ej_P4_E15
	
	// cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
	// a e i o u
	// @ # $ % *
	
	Definir frase como caracter
	
	Escribir "Ingrese la frase a codificar: "
	Leer frase
	
	intercambio(frase)	
		
	Escribir "La frase codificada sería: " frase
	
FinAlgoritmo


SubProceso intercambio(frase)
	
	Definir i, cantLetras Como Entero
	Definir letra Como Caracter
	
	i=0
	cantLetras = longitud(frase)
	
	
	para i <-1 hasta cantLetras Hacer
		
		letra = subcadena(frase,i,i)
		
		Segun 
			
				1."a" Entonces letra = "@"
				
				2. "e" letra = "#"
				
				3. "i" letra = "$"
				
				4. "o" letra = "%"
				
				5. "u" letra = "*"
				
				
				
					
					
				 
				
			
		FinSegun
		
		
	FinPara
	
	
	
	
FinSubProceso
