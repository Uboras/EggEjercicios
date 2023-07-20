Algoritmo sin_titulo

Definir c, longVector como entero
	
	Escribir "1.rellenar vector a"
	Escribir "2.rellenar vector b"
	Escribir "3.rellenar vector c"
	Escribir "4.c con recta de vectores	"
	Escribir "5. mostrar"
	Escribir "6. 	saalir"
	
	leer c
	
	Escribir "Logitud de vectores"
	leer longVector
	
	Segun c Hacer
		
		1: escribir vectorA(longVector)
		2:escribir vectorB(longVector)
		3:escribir vectorC(longVector,opcion1, opcion2)
		4:escribir vectorC1(longVector, opcion1,opcion2)
		5:
		6:
			
	FinSegun
FinAlgoritmo

	
funcion vector1<- vectorA(longVector)
	Definir opcion1, i como real 
	
	Dimension opcion1[longVector]
	
	
	Para i<- 0 hasta longVector-1 Hacer
		opcion1(i) = aleatorio(-100,100)
		Escribir opcion1(i)
	FinPara
	
	
	
FinFuncion

funcion vector2<- vectorB(longVector)
	Definir opcion2, i como real 
	
	Dimension opcion2[longVector]
	
	
	Para i<- 0 hasta longVector-1 Hacer
		opcion2(i) = aleatorio(-100,100)
		Escribir opcion2(i)
	FinPara
	
FinFuncion


Funcion vector3 <- vectorC(longVector, opcion1,opcion2)
	
	Definir opcion3, i como real 
	
	Dimension opcion3[longVector]
	
	
	Para i<- 0 hasta longVector-1 Hacer
		opcion3(i) = opcion1(i)+opcion2(i)
		Escribir opcion3(i)
		
	FinPara
	
	
	
FinFuncion
Funcion vector4 <- vectorC1(longVector, opcion1,opcion2)
	
	Definir opcion4, i como real 
	
	Dimension opcion4[longVector]
	
	
	Para i<- 0 hasta longVector-1 Hacer
		opcion4(i) = opcion2(i)-opcion1(i)
		Escribir opcion4(i)
		
	FinPara
	
FinFuncion

Funcion vector5
	Definir decision Como Caracter 
	Escribir "Que desea mostrar?"
	leer Decision
	
	
	Segun Minusculas(Decision)
		"a":Escribir opcion1
			
		"b":Escribir opcion2
			
			
		"c": 
			
		
	FinSegun
	
	
FinFuncion









