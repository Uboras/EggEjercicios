///Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota
///se pedirá de nuevo hasta que la nota sea correcta.
Algoritmo sin_titulo
	
	Definir nota Como Entero
	
	
	Escribir "Escribir la nota"
	leer nota
	
	mientras nota>10 o nota<0 Hacer
		Escribir "Nota incorrecta!"
		leer nota
	FinMientras
	
	Escribir nota " es una nota correcta!"
FinAlgoritmo
