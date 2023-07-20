///Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula seg�n el siguiente criterio: la parte pr�ctica vale el 10%; la parte de problemas vale
//	el 50% y la parte te�rica el 40%. El programa leer� el nombre del alumno, las tres notas
//	obtenidas, mostrar� el resultado por pantalla, y a continuaci�n volver� a pedir los datos del
//	siguiente alumno hasta que el nombre sea una cadena vac�a. Las notas deben estar
//	comprendidas entre 0 y 10, y si no est�n dentro de ese rango no se imprimir� el promedio
//	y se mostrar� un mensaje de error.

Algoritmo notas
	Definir nota1, nota2, nota3 Como real
	Definir promedio  Como Real
	definir nomAlum Como Cadena
	
	Escribir "Nombre de alumno"
	leer nomAlum
	
	
	Mientras nomAlum <> "" Hacer
		escribir "notas Practica, Problemas y teoria en ese orden"
		leer nota1, nota2, nota3
		
		si  nota1<11 y nota2<=11 y nota3<11 y nota1>0 y nota2>0 y nota3>0 Entonces
			promedio= (nota1*10 + nota2*50 + nota3*40)/100
			
			Escribir "La nota o promedio es: ", promedio 
			Escribir "Nombre de otro alumno"
			leer nomAlum
			
		sino 
			Escribir "Error en las notas"
			Escribir "Nombre de otro alumno"
			leer nomAlum
		finsi
	FinMientras
	Escribir "Espacio vacio o incorrecto"
	
	
//	

	
FinAlgoritmo
