Algoritmo ej5
	Definir contadoranterior, contadorposterior  Como numerico
	Definir direccion Como Caracter
	definir frase,vector,x Como Caracter
	definir n,i,p Como Entero
	dimension vector(20)
	escribir "ingrese una frase de hasta de 20 carateres: " 
	leer frase 
	
	
	n=longitud(frase)
	contadoranterior=0
	contadorposterior=0
	
	para i=0 Hasta 20
		vector(i) =subcadena(frase,i,i)
		si i>Longitud(frase)
			vector(i)=" "
			
		FinSi
	FinPara
	escribir "ingrese un caracter x y una posicion dentro del arreglo si esta vacia se llenara con el caracter ingresado:"
	leer x,p
	
	
	contadorDeEspacios(frase, contadoranterior, contadorposterior, p , direccion, i )	
	
	Escribir direccion
	
	si subcadena(frase,p-1,p-1)=" "
		
		//vector(i) = x		
		
	sino 
		si Minusculas(direccion) = "izquierda"
			
			para i = p-1-contadoranterior Hasta p-1 con paso 1 Hacer
				
				vector(i) = subcadena(frase,i-1,i-1)
				
				Escribir vector(i)
			FinPara
			 
			vector(i)=Subcadena(frase,i-1,i-1)
		SiNo
//			para i=p-1 hasta contadorposterior Con Paso -1 hacer
//				
//			
//				vector(i)=vector(i-1)
//				
//			FinPara
//			vector(i)=subcadena(frase,i-1,i-1)
		FinSi
		
	FinSi
	
i=p-1-contadoranterior
si i <> 0 Entonces
	
	para i=0  Hasta p-1 Con Paso 1 Hacer
		
		escribir vector(i) sin saltar
	FinPara
	
FinSi

	Para  i = p Hasta 19 Con Paso 1 Hacer
		
		Escribir vector(i) Sin Saltar
	FinPara
	vector(p-1) = x
	
FinAlgoritmo


SubProceso contadorDeEspacios(frase, contadoranterior Por Referencia, contadorposterior Por Referencia, p , direccion Por Referencia, i )
	

	Escribir contadoranterior
	// posicion anterior
	para i= p Hasta 0 con paso (-1) Hacer
		si Subcadena(frase, i-1,i-1) =" "
		Escribir  contadoranterior "Posicion vacia anterior"
		sino 
			contadoranterior=contadoranterior+1
			

		finsi
		
		Escribir contadoranterior
		
	FinPara
			
	i=0
		para i=p Hasta 19 con paso 1  Hacer
				si Subcadena(frase,i-1,i-1)= " "
					Escribir "la posicion vacia"
				SiNo
					contadorposterior= contadorposterior+1
					
				FinSi
		FinPara
			
			
			
	si contadoranterior=contadorposterior o contadoranterior>contadorposterior Entonces
				
				direccion = "izquierda"
			SiNo
				
				direccion= "derecha"
				
			FinSi
	
FinSubProceso
	