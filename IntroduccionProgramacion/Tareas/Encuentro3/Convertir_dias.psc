//convertir dias en horas minutos y segundos
/// ingresa dias 

Algoritmo Convertir_dias
	Definir hora, minuto, seg, dia como real
	
	Escribir "ingresa la cantidad de dias a convertir"
	leer dia
	
	hora = dia * 24
	minuto = hora * 60
	seg = minuto * 60
	
	Escribir dia, " Dias Son en horas ",hora
	escribir " minutos son: ",minuto
	Escribir " segundos son: ", seg
	
FinAlgoritmo
