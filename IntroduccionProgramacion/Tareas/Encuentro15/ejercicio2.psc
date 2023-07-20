//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.

SubProceso tempro(min Por Valor, max Por Valor, num Por Valor)
	
	definir j Como Real
	j=(min+max)/2
	Escribir "el dia tubo un promedio de temperatura de: " j
	
FinSubProceso

Algoritmo tem_dia
	
	definir num, min, max, i Como Entero
	
	escribir "cantidad de dias a analizar "
	Leer  num
    para i=1 hasta num
		
		escribir "ingrese la temperatura minima "
		Leer min
		Escribir "ingrese la temperatura maxima "
		Leer max
		tempro(min, max, num)
		
	FinPara
	
FinAlgoritmo
	