Algoritmo sin_titulo
	
	Definir hora,total,litrosNafta Como Real
	
	escribir "¿Cuánto tiempo usó el vehículo?"
	leer hora
	Si hora < 2 Entonces
		Escribir "Tiene que pagar $400 y la nafta va de regalo"
	SiNo
		Escribir "Cuántos litro de nafta usó?"
		leer litrosNafta
		escribir "Tiene que pagar= " ,(40*litrosNafta)+(hora*60*5.20)
		
	Fin Si
	
	
FinAlgoritmo
///La empresa "Te llevo a todos lados" está destinada al alquiler de autos y tiene un sistema
///de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro
///de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de
///regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la
///cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra
///40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total
///de $5,20 el minuto de uso. Realice un programa que permita registrar esa información y el
///total a pagar por el cliente.