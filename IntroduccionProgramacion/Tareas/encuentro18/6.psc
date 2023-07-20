Algoritmo Rellenar_Vectores
//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:

//D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//A, B, o C.
//F. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
	//vez.
	
	
	Definir tamanio Como Entero
	
	Escribir "Ingrese el tamaño de los vectores"
	Leer tamanio
	
	Definir vectorA Como Real
	Dimension vectorA[tamanio]
	Definir vectorB Como Real
	Dimension vectorB[tamanio]
	Definir VectorCsuma Como Real
	Dimension VectorCsuma[tamanio]
	Definir VectorCresta Como Real
	Dimension VectorCresta[tamanio]
	Definir i Como Entero
	Para i<-0 Hasta tamanio-1 Con Paso 1 Hacer
		vectorA[i]=Aleatorio(-100,100)
	Fin Para
	Para i<-0 Hasta tamanio-1 Con Paso 1 Hacer
		vectorB[i]=Aleatorio(-100,100)
	Fin Para
	Para i<-0 Hasta tamanio-1 Con Paso 1 Hacer
		VectorCsuma[i]=vectorA[i]+vectorB[i]
	Fin Para
	Para i<-0 Hasta tamanio-1 Con Paso 1 Hacer
		VectorCresta[i]=vectorA[i]-vectorB[i]
	Fin Para
	menu(tamanio, vectorA, vectorB, VectorCsuma, VectorCresta)
	
FinAlgoritmo

SubProceso menu(tamanio, vectorA, vectorB, VectorCsuma, VectorCresta)
	Definir opc Como caracter
	Repetir
		
			Escribir "Seleccione una opcion del menu"
			
			Escribir "A. Llenar Vector A."
			Escribir "B. Llenar Vector B. "
			Escribir "C. Llenar Vector C con la suma de los vectores A y B."
			Escribir "D. Llenar Vector C con la resta de los vectores B y A."
			Escribir "E. Mostrar Vectores."
			Escribir "F. Salir"
			
			Leer opc
			opc=Mayusculas(opc)
			
			Segun opc Hacer
				"A":
					llenarVectorA(tamanio, vectorA)
				"B":
					llenarVectorB(tamanio, vectorB)
				"C":
					llenarVectorCSuma(tamanio, vectorA , vectorB, VectorCsuma)
				"D":
					llenarVectorCresta(tamanio, vectorA, vectorB, VectorCresta)
				"E":
					menuMostrar(tamanio, vectorA, vectorB, VectorCresta, VectorCsuma)
					
				De Otro Modo:
					Escribir "Seleccione una opcion correcta"
			Fin Segun
	Mientras Que opc <> "F"
FinSubProceso

SubProceso llenarVectorA(tamanio, vectorA Por Referencia)
///A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
///usando la función Aleatorio(valorMin, valorMax) de PseInt.
	
	Para i<-0 Hasta tamanio-1 Con Paso 1 Hacer
		escribir Sin Saltar "[",vectorA[i] "]"
	Fin Para
FinSubProceso

SubProceso llenarVectorB(tamanio, vectorB Por Referencia)
///B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.

	Definir i Como Entero
	
	Para i<-0 Hasta tamanio-1 Con Paso 1 Hacer
		escribir Sin Saltar "[",vectorB[i] "]"
	Fin Para
FinSubProceso

SubProceso llenarVectorCSuma(tamanio, vectorA, vectorB, VectorCsuma Por Referencia)
///C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
///a elemento. Ejemplo: C = A + B
	Definir i Como Entero
	
	Para i<-0 Hasta tamanio-1 Con Paso 1 Hacer
		escribir Sin Saltar "[",VectorCsuma[i] "]"
	Fin Para
FinSubProceso

SubProceso llenarVectorCresta(tamanio, vectorA, vectorB, VectorCresta Por Referencia)
	///C. Llenar Vector C con la resta de los vectores A y B. La suma se debe realizar elemento
	///a elemento. Ejemplo: C = A - B
	Definir i Como Entero
	
	Para i<-0 Hasta tamanio-1 Con Paso 1 Hacer
		escribir Sin Saltar "[",VectorCresta[i] "]"
	Fin Para
FinSubProceso

SubProceso menuMostrar(tamanio, vectorA, vectorB, VectorCsuma, VectorCresta)
	
	
FinSubProceso 
	