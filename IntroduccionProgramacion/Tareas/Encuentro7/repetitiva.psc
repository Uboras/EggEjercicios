///Escriba un programa que solicite dos números enteros (mínimo y máximo). A continuación,
///se debe pedir al usuario que ingrese números enteros situados entre el máximo y mínimo.
///Cada vez que un número se encuentre entre ese intervalo, se sumara uno a una variable.
///El programa terminará cuando se escriba un número que no pertenezca a ese intervalo, y
///al finalizar se debe mostrar por pantalla la cantidad de números ingresados dentro del
///intervalo.

Algoritmo sin_titulo
	
	Definir numMax, numMin, numIng, cantidad	 Como Entero
	
	Escribir "numero maximo y minimo"
	leer numMax, numMin
	cantidad = 0 
	Escribir "escribir numeros"
	leer numIng
	
	si numIng< numMax y numIng> numMin Entonces
			
		Mientras numIng > numMin y numIng < numMax hacer
			Escribir "escribir numeros"
			leer numIng
			cantidad = cantidad + 1 
		FinMientras
		
		finsi
		
		Escribir cantidad
		
FinAlgoritmo
