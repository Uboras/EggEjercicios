



algoritmo sin_titulo
	definir precio, peso Como Real
	Escribir "escribir el precio y el peso"
	leer precio, peso
	si peso >=0 y peso <=2 Entonces
		Escribir precio "no hay descuento"
		leer precio
	sino 
		si peso>2 y peso <= 5
			Escribir precio " tiene un descuento de 10%"
		sino 
			si peso >5 y peso <= 10 Entonces
				Escribir precio " tiene un descuento de 15%"
			sino 
				si peso>10 Entonces
					Escribir precio " tiene un descuento de 20%" 
				FinSi
			FinSi
		FinSi
		FinSi
	
FinAlgoritmo
