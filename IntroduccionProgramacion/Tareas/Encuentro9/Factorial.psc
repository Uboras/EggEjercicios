///La función factorial se aplica a números enteros positivos. El factorial de un número entero
///positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:
///	n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n
///	Escriba un programa que calcule las factoriales de todos los números enteros desde el 1
///hasta el 5. El programa deberá mostrar la siguiente salida:
///	!1 = 1
///	!2 = 1*2 = 2
///	...
///	!5 = 1*2*3*4*5 = 120


Algoritmo Factorial
Definir num1, num2,num3, num4 , i,j  como entero
num2=1
num3=1
Escribir "introducir el numero N"
leer num1
num4 = num1

Escribir Sin Saltar"!" num1 "="


	para i<-1 hasta num1 con paso 1 Hacer
		para j<-1 hasta num1 con paso 1 Hacer
			num2= num2*num1
			num1=num1-1
			
		FinPara
		
		
		para i<-1 hasta num4 con paso 1 hacer
			para j<-1 hasta num4 con paso num4 hacer 
				Escribir sin saltar num3 "*"
				num3= num3+1	
			FinPara
			
		FinPara
		Escribir "=" num2
FinPara
FinAlgoritmo
