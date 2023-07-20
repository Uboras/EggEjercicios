////El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de las
///cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
///programa que determine cuál es la nota eliminada y el promedio de los trabajos prácticos
///de un estudiante.

Algoritmo notas
	Definir nota1, nota2, nota3,nota4, promedio, eliminada Como Real
	
	Escribir "escariba las 4 notas"
	leer nota1, nota2, nota3,nota4
	
		si (nota1<nota2 y nota1<nota3 y nota1<nota4) Entonces
		eliminada = nota1
		
	sino 
		si (nota2<nota1 y nota2<nota3 y nota2<nota4) Entonces
			eliminada = nota2
			
		SiNo
			si (nota3<nota2 y nota3<nota1 y nota3<nota4) Entonces
				eliminada = nota3
				
			sino
				si (nota4<nota2 y nota4<nota3 y nota4<nota1) Entonces
					eliminada = nota4
					
				
						
					
				FinSi
			FinSi
		FinSi
		
	FinSi
	promedio = ((nota1 + nota2 + nota3 + nota4 - eliminada)/3)
	
	Escribir "el promedio es : ", trunc(promedio)
	Escribir "la nota eliminada es: " eliminada
	
	
	
FinAlgoritmo
