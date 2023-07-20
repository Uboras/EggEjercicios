//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:

	
//	El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día	
//	de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además, debe-
//	mos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era festivo o			
//	no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.


algoritmo sin_titulo
	
	
	Definir nomTrab, diaSemana, dia Como Caracter
	Definir festivo Como cadena
	Definir horas como entero
	
	
	
	Escribir "¿cual es el nombre del trabajador?"
	leer nomTrab
	Escribir "Dia de la semana"
	leer diaSemana 
	Escribir "¿que turno trabajaste diurno o nocturno ?"
	leer dia
	Escribir "¿era dia festivo?"
	leer festivo
	Escribir "¿Cuantas horas trabajasto?"
	leer horas
	
	
	
	Escribir Jornal( nomTrab, diaSemana, dia, festivo,horas)
	
FinAlgoritmo


Funcion Cobrar <-Jornal( nomTrab, diaSemana, dia, festivo,horas)
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
	//	un 15% si el turno es nocturno.	
	Definir aPagar Como Real
	Definir I Como Entero
aPagar=0	

Segun Minusculas(dia)
		"diurno":
			si minusculas(festivo) = "si" Entonces
			aPagar = 90*horas * 1.10
			sino 
			aPagar = 90*horas
			FinSi
		
		"nocturno":
			si minusculas(festivo) = "si" Entonces
				aPagar = 125*horas * 1.15
				sino 
					aPagar = 125*horas
					
		
			FinSi
		De Otro Modo:
		Escribir "ingreso mal algun dato"
			
	FinSegun
	
	
	para i<-1 Hasta (Longitud(nomTrab)+4)
		Escribir sin saltar "*"
	FinPara
	Escribir " "
	Escribir "  " nomTrab "  "
	para i<-1 Hasta (Longitud(nomTrab)+4)
		Escribir sin saltar "*"
	FIN PARA
	Escribir " "
	Escribir  " COBRARA  "
	para i<-1 Hasta (Longitud(nomTrab)+4)
		Escribir sin saltar "*"
	FIN PARA
	Escribir " "
	Escribir "  " aPagar "  "
	
	para i<-1 Hasta (Longitud(nomTrab)+4)
		Escribir sin saltar "*"
	FIN PARA
	
	
FinFuncion
