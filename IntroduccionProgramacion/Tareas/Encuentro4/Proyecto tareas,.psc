///Iniciar sesion administrador en pc
//////Buscar ultimos ingresos publicidad
///Hoja de calculos mensuales
///revisar correo electronico >10 revisarcorreo de voz
///emergencia de otros departamentos
///realizar tareas de voz
///mandar correo electronico
///Apagar la pc
///regar plantas
///Pedir el almuerzo gratis
///
///

Algoritmo sin_titulo
	
	Definir ingPUb, calMensuales,emergencia,envioMail, regarPlanta, PedirAlmuerzoGratis Como caracter
	
	Definir prnderPc Como Caracter
	Definir correosElec, tareasVoz Como Entero
	
	correosElec = 6
	tareasVoz = 3 
	
	Escribir "¿Iniciar pc Como administrador?"
	Leer prnderPc
si Minusculas(prnderPc) = "si" Entonces
	Escribir "¿Buscaste los ultimos ingresos mensuales de publicidad?"
	leer ingPUb
	
	
	si Minusculas(ingPUb) = "si" Entonces
		Escribir "¿LLenaste las hojas de calculos mensuales?"
		leer calMensuales
		
		
		
		si Minusculas(calMensuales) ="si" Entonces
			Escribir "Revisar correos electronicos"
			
			si correosElec<10 Entonces
				Escribir "Revisar emergencia de otros departamentos"
				
				
				
				
				si tareasVoz>0 Entonces
					Escribir "Realizar las Solicitudes ejecutivas"
					Escribir "mandar mail al terminar las solicitudes ejecutivas"
					Escribir "apagar la pc, Regar las plantas"
										
				FinSi
			sino escribir "Revisar correo electronico"
				escribir "Emergencia de otros departamentos"
				escribir "Realizar solicitudes ejecutivas"
				escribir "Mandar correo electronico"
				escribir "Apagar la pc y Regar plantas" 
				escribir "Pedir el almuerzo gratis"
			FinSi
		sino escribir "Hoja de calculos mensuales"
			escribir "Revisar correo electronico"
			escribir "Emergencia de otros departamentos"
			escribir "Realizar solicitudes ejecutivas"
			escribir "Mandar correo electronico"
			escribir "Apagar la pc y Regar plantas" 
			escribir "Pedir el almuerzo gratis"
	
		FinSi
	sino Escribir "Buscar ultimos ingresos publicidad"
		escribir "Hoja de calculos mensuales"
		escribir "Revisar correo electronico"
		escribir "Emergencia de otros departamentos"
		escribir "Realizar solicitudes ejecutivas"
		escribir "Mandar correo electronico"
		escribir "Apagar la pc y Regar plantas" 
		escribir "Pedir el almuerzo gratis"
		
	finSi
sino escribir "Inicia la pc como administrador" 
	Escribir "Buscar ultimos ingresos publicidad"
	escribir "Hoja de calculos mensuales"
	escribir "Revisar correo electronico"
	escribir "Emergencia de otros departamentos"
	escribir "Realizar solicitudes ejecutivas"
	escribir "Mandar correo electronico"
	escribir "Apagar la pc y Regar plantas" 
	escribir "Pedir el almuerzo gratis"
	finsi
	
	
FinAlgoritmo
