Algoritmo sin_titulo
	definir num1,num2 Como Entero
	definir multiplo Como Logico
	escribir "ingrese 2 numeros si el primero es multiplo del segundo dira VERDADERO"
	Leer num1,num2
	multiplo=x(num1,num2)
	escribir multiplo
FinAlgoritmo
Funcion multiplo=x(num1,num2)
	definir multiplo Como Logico
	multiplo=num1 mod num2 =0
FinFuncion
///Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
///que el primer número múltiplo del segundo y devuelva verdadero si el primer número es múlti-
///	plo del segundo, sino es múltiplo que devuelva falso.