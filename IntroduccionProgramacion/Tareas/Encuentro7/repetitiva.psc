///Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A continuaci�n,
///se debe pedir al usuario que ingrese n�meros enteros situados entre el m�ximo y m�nimo.
///Cada vez que un n�mero se encuentre entre ese intervalo, se sumara uno a una variable.
///El programa terminar� cuando se escriba un n�mero que no pertenezca a ese intervalo, y
///al finalizar se debe mostrar por pantalla la cantidad de n�meros ingresados dentro del
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
