






Algoritmo sin_titulo
	
	Definir vectorLetras,  frase Como Caracter
	Definir long, i  como entero
	
	long=0	
	i=0
		
	fraseorig(long, frase)	
	Dimension vectorletras[19]
	
	Letrasdentro( vectorletras, frase, i )
	intercambios(vectorletras)
	
	frase1( vectorletras, i )
	
	
FinAlgoritmo

// pedir la fras
SubProceso fraseOrig(long Por Referencia, frase Por Referencia)
	
Repetir		

	frase= " "
	
	Escribir "¿frase a decodificar?"
	leer frase
	
mientras que Longitud(frase) >= 19
FinSubProceso




// incluir letras en vector
SubProceso Letrasdentro( vectorletras, frase, i )
	
	
	para i<- 0 Hasta 18 Hacer
		
		si Subcadena(frase,i,i) <> " " Entonces
			vectorletras[i]= Subcadena(frase,i,i)
		sino 
			vectorletras[i]= " "
			
		FinSi
		Escribir vectorletras[i] Sin Saltar
		
	FinPara
	
	
FinSubProceso

// intercambiar letras dentro del vector y mostar

SubProceso intercambios( vectorletras)
	
	Definir intercambio Como Caracter
	Definir posi Como Entero
	
	Escribir "escribir el caracter y la posicion a arreglar"
	leer intercambio ; leer posi
	
	si vectorletras[posi-1] = " " Entonces
		vectorletras[posi-1] = intercambio
	SiNo
		Escribir "la posicion esta ocupada "
	FinSi
	
FinSubProceso

SubProceso frase1(vectorletras, i)
	Para i<- 0 Hasta 18 Hacer
		
		Escribir vectorletras(i) Sin Saltar
		
	FinPara
	
	
	
FinSubProceso
//