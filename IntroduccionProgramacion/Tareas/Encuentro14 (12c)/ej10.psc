Funcion retorno <- sumdig ( num )
	definir uni,suma Como real
	
	
	
	
	
	uni=num
	suma=0	
		
	mientras 	uni <> 0 Hacer
		
		escribir Sin Saltar uni mod 10 "+"
		suma= suma + (uni mod 10)
		
		uni= uni/10
		uni=trunc(uni)
		
		
		
		
		
	FinMientras
	
Escribir  "=" suma

	//	
	//	
	//	
	//	
FinFuncion






Algoritmo ej10
	
	definir num,uni Como Entero
	escribir" Introduzca un número"
	leer num
	escribir sumdig(num)
	
FinAlgoritmo