Algoritmo	guia5_ejrojo
	Definir vector, frase, nuevo_caracter  Como caracter
	Definir i, posicion, posicionI, posicionD Como Entero
	
	Dimension vector[20]
	

	Escribir "Ingrese una frase de hasta 20 caracteres"
	Leer frase
	para i = 0 Hasta 19 Hacer
		vector[i] = Subcadena(frase,i,i)
		Si i>Longitud(frase)
			vector(i)= " "
		FinSi
		//Escribir "[ " vector(i) sin saltar " ]"
	FinPara
	Escribir " "
	
	Escribir "Ingrese un caracter"
	leer nuevo_caracter
	Escribir "Ingrese una posicion entre 0 y 19" 
	leer posicion
	si vector[posicion] = " " Entonces
		vector[posicion] = nuevo_caracter
	SiNo
		
	//verificar espacios cercanos hacia la derecha o izquierda
	posicionI = posicion 
	posicionD = posicion 
	Mientras vector[posicionD] <> " " Hacer
		
		posicionD = posicionD + 1
		
		
	FinMientras
	Mientras vector[posicionI]  <> " " Y posicionI <>0 Hacer 
		Si posicionI<>0
			posicionI = posicionI - 1
		FinSi
	FinMientras
	Escribir posicionD
	Escribir posicionI
	
	si  posicionI=0 entonces
		//Escribir "hay un espacio mas cerca del lado derecho"
		para i = posicion Hasta 18 Hacer
			vector[i+1] = Subcadena(frase,i,i)
		FinPara	
	SiNo 
		si posicionD - posicion <= posicion - posicionI Entonces
			//hay un espacio mas cerca del lado derecho
			para i = posicion Hasta 18 Hacer
				vector[i+1] = Subcadena(frase,i,i)
			FinPara
		SiNo
			//hay un espacio mas cerca del lado izquierdo
			para i = posicionI Hasta posicion Hacer
				
				vector[i] = Subcadena(frase,i+1,i+1)
				
			FinPara
		FinSi
		
	FinSi
FinSi

	vector[posicion] = nuevo_caracter
	
		
	para i = 0 hasta 19 Hacer
		Escribir Sin Saltar vector[i]
		//si vector[i] = " " Entonces
		//vector[posicion] = nuevo_caracter
		//FinSi
	FinPara
	Escribir " "
	
FinAlgoritmo

