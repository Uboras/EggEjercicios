Algoritmo ej7
	definir palabra Como Caracter
	definir c Como Entero
	Escribir "Introducir palabra o frase"
	leer palabra
	c =Longitud(palabra)
	si SubCadena(palabra,1,1) = subcadena(palabra, c , c ) Entonces
		escribir "correcto"
	SiNo
		escribir "incorrecto"
	FinSi
	
FinAlgoritmo
