Algoritmo sin_titulo
	Definir longVector como entero
	Definir opcion1, opcion2, opcion3, opcion4 como entero
	Escribir "Logitud de vectores"
	leer longVector
	
	
	Dimension opcion1[longVector]
	Dimension opcion2[longVector]
	Dimension opcion3[longVector]
	Dimension opcion4[longVector]
	
//vectorA(longVector, opcion1, opcion2, opcion3, opcion4)
//vectorB(longVector, opcion1, opcion2,opcion3, opcion4)
//vectorC(longVector,opcion1, opcion2, opcion3, opcion4)
//vectorC1(longVector, opcion1,opcion2, opcion3, opcion4)

	
	menu(longVector, opcion1, opcion2, opcion3, opcion4)
	
	
FinAlgoritmo


SubProceso menu(longVector, opcion1, opcion2 , opcion3, opcion4 )
Definir c, i   Como Entero
	
	Escribir "1.rellenar vector a"
	Escribir "2.rellenar vector b"
	Escribir "3.rellenar vector c"
	Escribir "4.c con recta de vectores	"
	Escribir "5. mostrar"
	Escribir "6. Salir"
	
	leer c
	
	
	
	Segun c Hacer
		
		1: vectorA(longVector, opcion1, opcion2, opcion3, opcion4 )
 		2: vectorB(longVector, opcion1 , opcion2, opcion3, opcion4)
		3: vectorC(longVector,opcion1, opcion2, opcion3, opcion4)
		4: vectorC1(longVector, opcion1, opcion2, opcion3, opcion4)
		5:vector5(longVector, opcion1,opcion2, opcion3, opcion4)
		
			
	FinSegun
	
	
FinSubProceso


// rellenar a	
SubProceso vectorA(longVector, opcion1 Por Referencia, opcion2, opcion3, opcion4)
	Definir i como real 
	
	Para i<- 0 hasta longVector-1 Hacer
		opcion1(i) = aleatorio(-100,100)
		
	FinPara
	
	
	esperar 3 Segundos
	Borrar Pantalla
	
	menu(longVector, opcion1, opcion2 , opcion3, opcion4)
	
FinSubProceso


// rellenar b


SubProceso  vectorB(longVector, opcion1, opcion2 Por Referencia, opcion3, opcion4 )
	Definir i como real 
	
	Para i<- 0 hasta longVector-1 Hacer
		opcion2(i) = aleatorio(-100,100)
	FinPara
	
	
	esperar 3 Segundos
	Borrar Pantalla
	menu(longVector, opcion1, opcion2, opcion3, opcion4)
	
FinSubProceso

// rellenar c con c=a+b


SubProceso  vectorC(longVector, opcion1,opcion2, opcion3 Por Referencia, opcion4)
	
	Definir  i como real 
	
	
	Para i<- 0 hasta longVector-1 Hacer
		opcion3(i) = opcion1(i)+opcion2(i)
	FinPara
	
	
	esperar 3 Segundos
	Borrar Pantalla
	menu(longVector, opcion1, opcion2, opcion3, opcion4)
FinSubProceso



// rellenar vector c c=b-a



SubProceso vectorC1(longVector, opcion1,opcion2, opcion4 Por Referencia, opcion3)
	Definir i como real 
	
	Para i<- 0 hasta longVector-1 Hacer
		opcion4(i) = opcion2(i)-opcion1(i)
	FinPara
	
	
	esperar 3 Segundos
	Borrar Pantalla
	menu(longVector, opcion1, opcion2, opcion3, opcion4)
	
	
FinSubProceso



SubProceso vector5 (longVector, opcion1,opcion2, opcion3, opcion4)
	
	Definir decision, i  Como entero 
	
	Escribir "Que desea mostrar?"
	Escribir "1. Mostrar vector a "
	Escribir "2. Mostrar vector b "
	Escribir "3. Mostrar vector c (c=a+b)"
	Escribir "4. Mostrar vector c (c=b-a)"
	Escribir "5. Salir"
	
	leer Decision
	
	
	Segun Decision
		1:Escribir " los datos son" 
			
			para i<- 0 Hasta (longVector-1) Hacer
				Escribir Sin Saltar "Posicion " i " es "  opcion1[longVector-1]
			FinPara
			
		2:Escribir " los datos son" 
			
			para i<- 0 Hasta (longVector-1) Hacer
				Escribir Sin Saltar "Posicion " i " es "  opcion2[longVector-1]
			FinPara 
		3:Escribir " los datos son" 
			para i<- 0 Hasta (longVector-1) Hacer
				Escribir Sin Saltar "Posicion " i " es "  opcion3[longVector-1]
			FinPara 
			
		4:escribir "los datos son" 
		para i<- 0 Hasta (longVector-1) Hacer
		Escribir Sin Saltar "Posicion " i " es "  opcion4[longVector-1]
		FinPara 
			
			
		
		5: 
			esperar 7 Segundos
			Borrar Pantalla
			menu(longVector, opcion1, opcion2, opcion3, opcion4)
		
		
	FinSegun
	
	
FinSubProceso










