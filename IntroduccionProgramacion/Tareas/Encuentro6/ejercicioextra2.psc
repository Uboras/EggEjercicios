///Leer tres n�meros que denoten una fecha (d�a, mes, a�o) y comprobar que sea una fecha
///v�lida. Si la fecha no es v�lida escribir un mensaje de error por pantalla. Si la fecha es
///	v�lida se debe imprimir la fecha cambiando el n�mero que representa el mes por su
///nombre. Por ejemplo: si se introduce 1 2 2006, se deber� imprimir "1 de febrero de 2006".

Algoritmo ejercicio2
	definir dia,mes,ano Como Entero
	escribir "ingrese la fecha"
	leer dia,mes,ano
	Si dia<=31 y mes<=12 Entonces
		Segun mes Hacer
			1:
				escribir dia," de enero de " ano
			2:
				escribir dia " de febrero de " ano
			3:
				
		Fin Segun
	SiNo
	escribir "la fecha ingresada no es valida"
	Fin Si
FinAlgoritmo


	