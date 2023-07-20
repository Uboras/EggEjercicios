//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales re-
//petidas. Al final el procedimiento mostrará la frase final.
//Por ejemplo:
//Entrada: "Habia una vez un barco"
//Salida: "Habi un vez n brco"
//Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? que-
//dan al no estar repetidas.
Algoritmo ej9
	
	definir frase Como Caracter
	
	escribir "Ingrese una frase"
	leer frase
	cambia(frase)
	
FinAlgoritmo

SubProceso cambia(frase)
	
	definir ii,a,e,i,oo,u como entero	
	definir r,fraseNueva,vacio Como Caracter
	fraseNueva=""
	a=0
	e=0
	i=0
	oo=0
	u=0
	vacio=" "
	para ii=0 hasta Longitud(frase)
		r= Subcadena(frase,ii,ii)
		
		si r="a" o r="e" o r="i" o r="o" o r="u" Entonces
		Segun r hacer
			
			"a":
				a=a+1
			"e":
				e=e+1
			"i":
				i=i+1
			"o":
				oo=oo+1
			"u":
				u=u+1
		FinSegun
		si a>1 y r="a" Entonces
			r=vacio
		FinSi
		si  e>1 y r="e" entonces
			r=vacio
		finsi
		si i>1 y r="i" Entonces
			r=vacio
		FinSi
		si oo>1 y r="o" Entonces
			r=vacio
		FinSi
		si u>1 y r="u" entonces
		r=vacio
		finsi
	finsi
	frasenueva=concatenar(frasenueva,r)
	FinPara	
	escribir frasenueva
	
FinSubProceso
//		mientras a>0 o e>0 o i>0 o oo>0 o u>0 Hacer
//			
//		FinMientras