//Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd". Ade-
//más, la función calculara el número de intentos que se ha usado para loguearse, tenemos solo
//	
//			3 intentos, si nos quedamos sin intentos la función devolverá Falso.


Algoritmo sin_titulo
	Definir usuario, contrasena Como Caracter
	
	Escribir "Nombre de usuario"
	leer usuario
	Escribir "Escribir contraseña"
	leer contrasena
	
	
	Escribir ingresocorrecto(usuario,contrasena)

FinAlgoritmo




Funcion Correcto <- ingresocorrecto(usuario,contrasena)
	
	Definir intentos Como Entero
	Definir Ingreso como logico
	intentos = 0
	
	si usuario= "usuario1" y contrasena = "asdasd" Entonces
		ingreso= Verdadero
		sino
		Hacer
			Escribir "Nombre de usuario"
			leer usuario
			Escribir "Escribir contraseña"
			leer contrasena
		
		
		intentos=intentos+1
		
		Mientras Que intentos < 2
		
	ingreso=falso
	
fin si

Escribir ingreso
	
FinFuncion
	