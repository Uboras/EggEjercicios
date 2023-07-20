Algoritmo Calculo_Jornal_Trabajador
//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.
//			
//	El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día		
//	de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además, debe-
//	mos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era festivo o			
//	no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.
	
	Definir usuario, dia, turno, feriado Como Caracter

	Definir horas Como real
	
	Escribir "Ingrese su nombre"
	leer usuario
	
	Escribir "Ingrese el dia trabajado"
	Leer dia
	
	Escribir "¿El dia trabajado fue festivo? S/N"
	Leer feriado
	feriado = Mayusculas(feriado)
	
	Escribir "Ingrese el turno trabajado. D: diurno y N: nocturno"
	Leer turno
	turno = Mayusculas(turno)
	
	Escribir "Ingrese la cantidad de horas trabajadas"
	leer horas
	
	
	Escribir "La tarifa de ", usuario " por el dia trabajado es: $", Jornal_Trabajador(usuario, turno, horas)
	
FinAlgoritmo
///a) La tarifa de las horas diurnas es de $ 90
///	b) La tarifa de las horas nocturnas es de $ 125
///	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
///	un 15% si el turno es nocturno.
Funcion jornal <- Jornal_Trabajador ( feriado, turno, horas )
	Definir jornal Como Real
	jornal = 0
	Si turno = "D" Entonces
		jornal = horas * 90
		si feriado = "S" Entonces
			jornal = jornal + (jornal * 0.10)
		FinSi
		
	SiNo
		jornal = horas * 125
		si feriado = "S" Entonces
			jornal = jornal + (jornal * 0.15)
		FinSi
		
	Fin Si
Fin Funcion


