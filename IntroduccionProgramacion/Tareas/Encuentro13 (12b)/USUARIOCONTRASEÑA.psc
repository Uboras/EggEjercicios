//Crear una funci�n llamada "Login", que recibe un nombre de usuario y una contrase�a y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contrase�a es "asdasd". Ade-
//m�s, la funci�n calculara el n�mero de intentos que se ha usado para loguearse, tenemos solo
//	
//			3 intentos, si nos quedamos sin intentos la funci�n devolver� Falso.


Algoritmo sin_titulo
	Definir usuario, contrasena Como Caracter
	
	Escribir "Nombre de usuario"
	leer usuario
	Escribir "Escribir contrase�a"
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
			Escribir "Escribir contrase�a"
			leer contrasena
		
		
		intentos=intentos+1
		
		Mientras Que intentos < 2
		
	ingreso=falso
	
fin si

Escribir ingreso
	
FinFuncion
	