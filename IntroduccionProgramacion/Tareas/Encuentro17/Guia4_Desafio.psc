Algoritmo Guia4_Desafio
	Definir listado Como Entero
	menu()
	
	
	
FinAlgoritmo

//Inicio Menu
SubProceso menu()
	Definir listado Como Entero

	escribir "1- Calcular muro de ladrillo"
	
	escribir "2- Calcular viga de hormigón"
		
	escribir "3- Calcular columnas de hormigón"
			
	escribir "4- Calcular contrapisos"
			
	escribir "5- Calcular techo"
			
	escribir "6- Calcular pisos"
				
	escribir "7- Calcular pintura"
			
	escribir "8- Calcular iluminación"
			
	escribir "9- Salir"
			
	leer listado
	
	segun listado hacer
		1: calcularMuro()
		2: calcViga()
		3: calcularColumna()
		4: contrapiso()
		5: calcTecho()
		6: calcularPisos()
		7: calcularPintura()
		8: calcularIluminacion()
		De Otro Modo:
			Limpiar Pantalla
		
	FinSegun
	definir altura, base, espesor como numerico
	altura = 0
	base = 0 
	espesor = 0
FinSubProceso


//Fin Menu


// 1- Calcular Muro

SubProceso calcularMuro()
	Definir espesor, largo, alto, ladrillos como entero
	Definir superficie, cemento, arena como real
	Escribir "Ingrese el espesor del muro:20cm o 30cm"
	Leer espesor
	Escribir "Ingrese el largo del muro:"
	Leer largo
	Escribir "Ingrese el alto del muro:"
	Leer alto
	Superficie=largo*alto
	Si espesor=20 Entonces
		ladrillos=90
		cemento=10.9
		arena=0.09
		Escribir "La superficie total del muro a construir es de: ", superficie," metros cuadrados."
		Escribir "La necesidad de materiales es de:"
		Escribir "Ladrillos: ", ladrillos*superficie," unidades."
		Escribir "Cemento:", cemento*superficie, " kg"
		Escribir "Arena:", arena*superficie, " m3"
		
		Si espesor=30 Entonces
			ladrillos=120
			cemento=15.2
			arena=0.115
			Escribir "La superficie total del muro a construir es de: ", superficie," metros cuadrados."
			Escribir "La necesidad de materiales es de:"
			Escribir "Ladrillos:", ladrillos*superficie
			Escribir "Cemento:", cemento*superficie, " kg"
			Escribir "Arena:", arena*superficie, " m3"
		FinSi
	FinSi
	menu()
Fin subproceso




//2- Calcular Viga

SubProceso calcViga()
	definir largo Como Entero
	Escribir "Ingresar el largo de la viga"
	leer largo	
	Definir mtViga Como Entero
	Definir cemento, arena , piedra, hierro8, hierro4 Como numerico
	cemento = 0
	arena = 0 
	piedra = 0
	hierro8 = 0
	hierro4 = 0
	para mtViga = 1 hasta largo Hacer
		cemento = cemento + 9
		arena = arena + 0.02
		piedra = piedra + 0.02
		hierro8 = hierro8 + 4
		hierro4 = hierro4 + 3
	FinPara
	Escribir "Los materiales necesarios para la viga son: "
	Escribir "Cemento: " cemento " Kg"
	Escribir "Arena: " arena " m3"
	Escribir "Piedra: " piedra " m2"
	Escribir "Hierro del 8: " hierro8 "m"
	Escribir "Hierro del 4: " hierro4 "m"
	Escribir "Pulse una tecla para salir"
	Esperar Tecla 
	menu()
	
FinSubProceso


// 3- Calcular columna
SubProceso calcularColumna()
	
	definir largo,cemento,arena,piedra,hierro10,hierro4 Como Real
	
	Escribir "Ingrese el largo de la columna"
	leer largo
	
	////Variables por metro lineal de columna
	
	arena=0.016
	cemento=7.5
	piedra=0.016
	hierro10=6
	hierro4=4
	
	Escribir "Los materiales necesarios para una columna de ", largo, " mts. son:"
	Escribir "Cemento= ",cemento*largo," Kg."
	Escribir  "Piedra= ",piedra*largo," m2"
	Escribir  "Arena= ",arena*largo," m3"
	Escribir "Hierro del 10= ",hierro10*largo," m"
	Escribir "Hierro del 4= ",hierro4*largo," m"	
	Escribir "Pulse una tecla para salir"
	Esperar Tecla 
	menu()
	
FinSubProceso

// 4-Calcular contrapisos

subproceso contrapiso
	Definir espesor, altura, base, volumen como real
	Escribir "espesor, ancho y largo porfavor" ; leer espesor, altura, base
	volumen=0
	calculovolumen(altura,base,espesor, volumen)
	
	Escribir "Necesita " volumen*105 " kg de cemento, "  volumen*0.45 " kg de arena y " volumen*0.9 " kg de piedra"
	Escribir "Pulse una tecla para salir"
	Esperar Tecla 
	menu()
FinSubProceso





//iluminacion
SubProceso calcularIluminacion()
	Definir superficie, iluminacion como numerico
	Escribir "Ingrese la superficie de la habitacion"
	leer superficie
	iluminacion = superficie * 0.20
	Escribir "La superficie minima de iluminación natural es: " iluminacion " m2 de superficie"
	Escribir "Pulse una tecla para salir"
	Esperar Tecla 
	menu()	
FinSubProceso

//pisos 
SubProceso calcularPisos()
	
	definir altura , base ,superfici,recortes, superficie_total como numerico
	escribir "ingrese es ancho del piso"; leer altura
	escribir "ingrese el largo del piso"; leer base
	superficie_total = 0
	calculosuperficie(altura,base, superfici)
	
	recortes = superfici * 0.10
	superficie_total = superfici + recortes
	Escribir superficie_total " m2"
	Escribir "Pulse una tecla para salir"
	Esperar Tecla 
	menu()
	
FinSubProceso
//calcular techo


SubProceso calcTecho()
	Definir espesor, ancho, base, altura, volumen como numerico
	
	Escribir "Ingrese el espesor"
	Leer espesor
	Escribir "Ingrese el ancho"
	leer altura
	Escribir "Ingrese el largo"
	leer base
	calculovolumen(altura,base,espesor,volumen)
	Escribir  "Cemento: " volumen * 33 " kg" " Arena: " volumen * 0.072 "m3" " Piedra : " volumen * 0.072 "m3" "Hierro del 8: " volumen * 7 "m" "Hierro del 4: " volumen * 4
	Escribir "Pulse una tecla para salir"
	Esperar Tecla 
	menu()	
FinSubProceso





//Calcular pintura
SubProceso calcularPintura()
	definir superficieMuro,pintura,rendimiento como real
	Escribir "Ingresar la superficie del muro a pintar"
	leer superficieMuro
	
	////Rendimiento de pintura por m2
	rendimiento=6
	
	Escribir "Para ",superficieMuro," m2, hacen falta ",superficieMuro/rendimiento," litros de pintura"
	Escribir "Pulse una tecla para salir"
	Esperar Tecla 
	menu()	
FinSubProceso

// calculo de superficie
SubProceso calculosuperficie(altura, base, superfici Por Referencia)
	superfici = 0
	superfici= altura * base
FinSubProceso


//Calculo de volumen 
SubProceso  calculovolumen(altura,base,espesor, volumen Por Referencia)
	volumen = 0
	volumen = altura * base * espesor
	
FinSubProceso
	
	
	


	


	