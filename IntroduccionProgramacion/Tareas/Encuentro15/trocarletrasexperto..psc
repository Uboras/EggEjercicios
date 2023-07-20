Algoritmo sin_titulo
	definir frase, primeraParte, segundaParte Como Caracter
	definir i Como Entero
	Hacer
		Escribir "Ingrese una palabra o frase, terminada con un punto"
		leer frase
	Mientras Que  Subcadena(frase,Longitud(frase)-1,Longitud(frase)-1) != "."
	Para i<-0 Hasta longitud(frase)-1 Con Paso 1 Hacer
		traerPrimeraParte(primeraParte,frase,i)
		traerSegundaParte(segundaParte,frase,i)
		Segun Subcadena(frase,i,i) Hacer
			"a":
				frase <- Concatenar(primeraParte,concatenar("@", segundaParte))
			"e":
				frase <- Concatenar(primeraParte,concatenar("#", segundaParte))
			"i":
				frase <- Concatenar(primeraParte,concatenar("$", segundaParte))
			"o":
				frase <- Concatenar(primeraParte,concatenar("%", segundaParte))
			"u":
				frase <- Concatenar(primeraParte,concatenar("*", segundaParte))
				
			De Otro Modo:
				
		FinSegun
	FinPara
	Escribir "frase: ",frase
FinAlgoritmo

SubProceso traerPrimeraParte ( primeraParte por referencia, frase, i )
	primeraParte <- Subcadena(frase,0,i-1)
Fin Funcion

Funcion traerSegundaParte ( segundaParte por referencia, frase, i )
	segundaParte <- Subcadena(frase,i+1,(longitud(frase)-1) )
Fin Funcion

