//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el usua-
//rio. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor m�s
//grande del vector.



Algoritmo Mayornumero
	
	Definir vector Como real
	
	Escribir " El valor mayor es: " valores()
	
FinAlgoritmo



funcion ValorMayor <- valores()
	
	Definir numIngdim, ValorMayor, vectorValores, numIng,c Como Entero
	
Escribir "Digite el tama�o del vector "
leer numIngdim
	
	Dimension vectorValores[numIngdim]
	
	
	c=0
	
	hacer
		
	Escribir "Digite los numeros a comparar "
	leer numIng
	
	vectorValores[c]=numIng
	c=c+1
	
	mientras que c <> numIngdim
	
	ValorMayor=0
	
	Para c<-0 Hasta numIngdim-1 Hacer
		segun c
			0:ValorMayor=vectorValores[c]
			de otro modo 
			si ValorMayor < vectorValores[c] 
				
				ValorMayor=vectorValores[c]
				
			finsi
				
		FinSegun
		
		
		
	FinPara
	
FinFuncion
	