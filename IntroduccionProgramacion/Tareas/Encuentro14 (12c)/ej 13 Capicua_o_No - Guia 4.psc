Algoritmo Capicua_o_No
	//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
	//capic�a o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
	//transformar el numero a cadena para realizar el ejercicio.
	
	Definir num Como Entero
	Escribir "Ingrese un numero para saber si es capic�a"
	leer num
	
	Escribir Capicua(num)
FinAlgoritmo

Funcion variable_de_retorno <- Capicua ( num )
	Definir a, b, c Como Entero
	
	a= num
	c = 0
	Repetir
		b = a mod 10
		c = c*10 + b
		a = trunc (a / 10)
	Mientras Que a>0
	Si num = c Entonces
		Escribir "CAPICUA"
	SiNo
		Escribir "NO CAPICUA"
	Fin Si
	
Fin Funcion
