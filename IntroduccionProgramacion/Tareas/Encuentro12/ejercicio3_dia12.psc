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
///Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
///que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es m�lti-
///	plo del segundo, sino es m�ltiplo que devuelva falso.