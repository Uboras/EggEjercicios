////Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica de
//tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un per�odo
//de prueba:
//	? Producir menos de 200 tornillos defectuosos.
//	? Producir m�s de 10000 tornillos sin defectos.
// El grado de eficiencia se determina de la siguiente manera:
//	? Si no cumple ninguna de las condiciones, grado 5.
//		? Si s�lo cumple la primera condici�n, grado 6.
//			? Si s�lo cumple la segunda condici�n, grado 7.
//				? Si cumple las dos condiciones, grado 8


Algoritmo EFICIENCIA
	definir defecTor, proTor como entero
	definir eficDefec, eficPro Como Logico
	
	Escribir "�Cuantos tornillos defectuosos produjo?"
	leer defecTor
	Escribir "�Cuantos tornillos se produjeron sin defectos?"
	leer proTor
	
	eficDefec= defecTor < 200
	eficPro= protor>10000
	
	si (efDefec = Verdadero) y (eficpro = verdadero) entonces 
		Escribir "la efectividad es de grado 8 "
		
	sino 
		si (efDefec = Falso) y (eficpro = verdadero) entonces 
			Escribir "la efectividad es de grado 7 "
			
		SiNo
			si (efDefec = Verdadero) y (eficpropro = Falso) entonces 
			Escribir "la efectividad es de grado 6 "
			
			sino
				si(efDefec = Falso) y (eficpro = Falso) entonces 
				Escribir "la efectividad es de grado 5 "
			finsi
		finsi
	FinSi
	
	FinSi
FinAlgoritmo
