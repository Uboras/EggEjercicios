Algoritmo sin_titulo
	
	Definir frase Como Caracter
	Escribir "Frase>"
	leer frase
	
	Frasenueva(frase)
	
Escribir 	frase
FinAlgoritmo



SubProceso frasenueva(frase Por Referencia)
	Definir i como entero
	Definir n, frase1 Como Caracter
	

	
	para i<-0	 Hasta Longitud(frase) Con Paso 1 Hacer
		
		n = Concatenar(subcadena(frase,i,i), " ")
		frase1= Concatenar(frase1,n)
		FinPara
	
	frase = frase1
FinSubProceso
	