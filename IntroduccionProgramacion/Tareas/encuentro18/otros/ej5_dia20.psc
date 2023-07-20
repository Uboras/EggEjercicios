Algoritmo ej5
	definir frase,vector,x Como Caracter
	definir n,i,p Como Entero
	dimension vector(20)
	escribir "ingrese una frase de hasta de 20 carateres: " 
	leer frase 
	n=longitud(frase)
	para i=0 Hasta 19
		vector(i) =subcadena(frase,i,i)
		si i>Longitud(frase)
			vector(i)=" - "
			
		FinSi
	FinPara
	
	
	Para i=0 Hasta 19
		Escribir vector(i) " " Sin Saltar
	FinPara
	
	
	
	
	escribir "ingrese un caracter x y una posicion dentro del arreglo si esta vacia se llenara con el caracter ingresado:"
	leer x,p
	
	si subcadena(frase,p-1,p-1)=" "
		
		vector(p-1)= x
	sino 
		
		para i=p-1 hasta 19
			vector(i)=subcadena(frase,i-1,i-1)
			
			
			
		FinPara
	
	FinSi
	vector(p-1)=x
	para i=0 Hasta 19
		escribir vector(i) sin saltar
	FinPara
	
FinAlgoritmo
