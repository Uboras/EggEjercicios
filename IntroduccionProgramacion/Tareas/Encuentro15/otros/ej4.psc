//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y termi-
//nada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vo-
//	cal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (inclu-
//	yendo a las vocales acentuadas) se mantienen sin cambios.
//	a e i o u
//	@ # $ % *
//	Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación co-
//	rrespondiente. Utilice la estructura "según" para la transformación.
//	Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//	La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//	NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.


Algoritmo ej4
	
	definir frase Como Caracter
	Escribir "Ingrese palabra o frase para codificar:"
	leer frase
	codificado(frase)
	
	
	
FinAlgoritmo
SubProceso codificado (frase)
	definir r,a,e,i,oo,u,palabracod Como Caracter
	definir x Como Entero
	a="@"
	e="#"
	i="$"
	oo="%"
	u="*"
	palabracod=""
	para x=0 hasta Longitud(frase)
		
		r= Subcadena(frase,x,x)
		Segun r hacer
			
			"a":
					r=a
			"e":
					r=e
			"i":
					r=i
			"o":
					r=oo
			"u":
					r=u
			
			
		FinSegun
		palabracod= concatenar(palabracod,r)
		
		
	FinPara
	
	escribir palabracod
	
	
	
FinSubProceso
	