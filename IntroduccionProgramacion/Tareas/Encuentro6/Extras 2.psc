//Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por pantalla
//un mensaje que indique a qué día de la semana corresponde. Considere que el número 1
//corresponde al día "Lunes", y así sucesivamente.
Algoritmo sin_titulo
	Definir dia, mes, ano Como Entero
	Escribir "defina un numero de dia"
	Escribir "defina un numero de mes"
	Escribir "defina un numero de año"
	leer dia, mes, ano 
	
	
	
	si(0<dia o dia>30) Entonces
		
		Escribir "no es un valor correcto"
	SiNo		
	si (0<mes o mes>12)
		Escribir "no es un valor correcto"
	sino
		
		Segun mes Hacer
		1: escribir "es:", dia "enero", ano
			
		2: escribir "es:",dia "febrero", ano
			
		3:escribir "es:",dia "marzo", ano
			
		4:escribir "es:",dia "abril", ano "abril"
		
		5:escribir "es:",dia "mayo", ano "mayo"
		
		6: escribir "es:",dia "enero", ano "junio" 
		7:escribir "es:", dia "enero", ano "julio"
			
		8: escribir "es:",dia "ago", ano "agosto"
			
		9:escribir "es:",dia "sept", ano "septiembre"
			
		10:escribir "es:",dia "oct", ano "octubre"
			
		11:escribir "es:",dia "nov", ano "noviembre"
			
		12: escribir "es:",dia "dic", ano 
			
			
	fin segun
	
		FinSi
	FinSi
	
FinAlgoritmo
