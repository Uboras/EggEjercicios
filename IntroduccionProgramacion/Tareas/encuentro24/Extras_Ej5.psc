Algoritmo Extra_Ej5
	
	Definir frase, vector, caract Como Caracter
	
	Definir i,  posic, posicD, posicI, long Como Entero
	
	Dimension vector[20]
	
	Escribir " Ingrese una frase de menos de 20 caracteres "
	Leer frase
	
	long = Longitud(frase)
	
	Si long > 19 Entonces
		Escribir " Ingrese frase de menos caracteres. Maximo 20 "
		Leer frase
	FinSi
	
	Para i = 0 Hasta 19 Hacer
		vector[i] = Subcadena(frase,i,i) // llena el vector con la frase
		Si i>Longitud(frase) // si i es mayor q la frase y sobran caracteres sin ocupar, llenarlos con un espacio
			vector(i)= " "
		FinSi
		Escribir vector(i) " " sin saltar 
	FinPara
	Escribir " "
	
	Escribir "Ingrese un caracter"
	leer caract
	Escribir "Ingrese una posicion entre 0 y 19" 
	leer posic
	
		
		Si vector[posic] == " " Entonces
			vector[posic] = caract
						
		SiNo 
			posicI = posic-1
			posicD =posic+1
			
			Mientras vector[posicD] <> " " Hacer
				
				posicD = posicD + 1
								
			FinMientras
			
			Mientras vector[posicI] <> " " y posicI <> 0 Hacer
				
				Si posicI <> 0 Entonces
					posicI = posicI - 1
					
				FinSi
				
			FinMientras
			
			Si posicI = 0 Entonces //SI LA POSIC IZQ ESTA EN EL LUGAR CERO, ESCRIBIR LA FRASE A PARTIR DE LA POSICION PEDIDA
				
				Para i<-posic Hasta 18 Hacer
					vector[i] = Subcadena(frase, i, i)
				FinPara
				
			SiNo   // SI EL ESPACIO ENTRE LA POSICION DCHA Y EL " " ES MENOS, SE CORRE TODO HACIA LA DCHA luego de poner el caracter en la posic elegida
				si posicD - posic <= posic - posicI Entonces
					//hay un espacio mas cerca del lado derecho
					para i = posic Hasta 18 Hacer
						vector[i+1] = Subcadena(frase,i,i)
					FinPara
				SiNo  //SINO, SI EL " " ESTA MAS CERCA DE LA POSIC IZQ, SE CORRE LO DE LA IZQ PARA PONER EL CARACTER EN LA POSIC ELEGIDA
					//hay un espacio mas cerca del lado izquierdo
					para i = posicI Hasta posic Hacer
						
						vector[i] = Subcadena(frase,i+1,i+1)
						
					FinPara
				FinSi
				
			FinSi
		FinSi
	
		vector[posic] = caract
		
		para i = 0 hasta 19 Hacer
			Escribir Sin Saltar vector[i]
			//si vector[i] = " " Entonces
			//vector[posic] = caract
			//FinSi
		FinPara
		Escribir " "
		
		
FinAlgoritmo
