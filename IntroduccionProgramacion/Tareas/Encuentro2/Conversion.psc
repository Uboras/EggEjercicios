// pasaje de medidas de metros a cm, ml y pulgadas

/// definir variables cm ml pulgadas metros 

Algoritmo Conversion
	
	Definir cm, ml, pulgadas, metros Como Real
	
	Escribir "¿Cuantos metros queres comvertir?"
	
	leer metros
	
	cm = metros * 100
	ml = metros * 1000
	pulgadas = (metros * 100) / 2.54
	
	Escribir "La conversión a cm: ", cm
	Escribir  "La conversión a ml: ", ml
	Escribir  "La conversión a pulgadas: ", pulgadas
	
	
	Escribir "Exitos"

FinAlgoritmo
