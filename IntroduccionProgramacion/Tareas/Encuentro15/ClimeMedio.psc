//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.




Algoritmo sin_titulo
	
	Definir dias Como Entero
	
	Repetir
	Escribir "¿Cuantos dias a calcular? para salir escribir 0 "
	leer dias
	
	climaMedia(dias)
	
Mientras Que dias <> 0	

FinAlgoritmo
	
	
SubProceso climaMedia (dias)
	
	Definir temMax, temMin Como real
	Definir c Como Entero
	
	c= 0
	
	Repetir
			
		escribir "Ingresa la temperatura Maxima y mínima"
		leer temMax
		leer temMin
		c=c+1
		Escribir (temMax+temMin)/2 " Grados de media"
		
	Mientras Que c <> dias
	
FinSubProceso

	
	
	

