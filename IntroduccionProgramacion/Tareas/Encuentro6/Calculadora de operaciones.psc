Algoritmo sin_titulo
	Definir num1, num2 Como Entero
	definir oPer como caracter
	Definir suma,resta,mult,div como entero
	Escribir "Escribir los numeros a Operar en Orden"
	leer num1
	leer num2
	
	Escribir " Escribe ´S´ si quieres sumar"
	Escribir " Escribe ´R´ si quieres restar"
	escribir " Escribe ´M´ si quieres multiplicar"
	Escribir " Escribe ´D´ si quieres dividir"
	
	leer oPer 
	
	suma = num1 + num2
	resta =num1 - num2
	mult = num1 * num2
	div = num1 / num2
	
	Segun Mayusculas(oPer) hacer
		
		"S": Escribir "La suma de: ", num1 " y " num2 " es ", suma 
		"R":Escribir "La resta de: ", num1 " y " num2 " es: ", resta 
		"M":Escribir "La mult de: ", num1 " y " num2 " es: ", mult 
		"D":Escribir "La división de: ", num1 " y " num2 " es: ", div
			
		De Otro Modo:
			Escribir "opcion no valida"
			
	FinSegun
FinAlgoritmo
