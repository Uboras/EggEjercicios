///Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale
//	el 50% y la parte teórica el 40%. El programa leerá el nombre del alumno, las tres notas
//	obtenidas, mostrará el resultado por pantalla, y a continuación volverá a pedir los datos del
//	siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben estar
//	comprendidas entre 0 y 10, y si no están dentro de ese rango no se imprimirá el promedio
//	y se mostrará un mensaje de error.

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
