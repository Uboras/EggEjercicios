Algoritmo ejercicio3
	
	definir alumnos, i , desaprobados, aprobados ,contadorParcial Como Entero
	definir integrador, exposicion , parcial, notaFinal , promedio,notaMayor Como Real
	
	Escribir "Ingrese la cantidad de alumnos: "
	leer alumnos
	
	integrador=0
	exposicion=0
	parcial=0
	desaprobados=0
	aprobados=0
	notaMayor=0		
	contadorParcial=0
	
	
	Para i<-1 Hasta alumnos Con Paso 1 Hacer
		Escribir "Ingrese la nota del integrador: "
		leer integrador
		Escribir "Ingrese la nota de la exposicion: "
		leer exposicion
		Escribir "Ingrese la nota del parcial: "
		leer parcial
		Escribir "___________________________________"
		
		notaFinal=(integrador * 0.35) + (exposicion * 0.25) + (parcial * 0.4)
		
		Si notaFinal <= 6.5 Entonces
			desaprobados=desaprobados+1
		FinSi
		
		si notaFinal>=7.5 Entonces
			aprobados=aprobados+1
			
		FinSi
		
		si exposicion>notaMayor Entonces
			notaMayor=exposicion
		
		FinSi
		
		si parcial >= 4 y parcial <= 7.5 Entonces
			contadorParcial=contadorParcial+1
		FinSi
		
		
	Fin Para
	
	Escribir "La cantidad de desaprobados es: ",desaprobados
	Escribir "Cantidad de alumnos con nota final mayor a 7.5: ",aprobados
	Escribir "La nota mas alta en exposicion: ",notaMayor
	Escribir "Estudiantes con notas entre 4 y 7.5: ", contadorParcial
	
	
	
FinAlgoritmo
