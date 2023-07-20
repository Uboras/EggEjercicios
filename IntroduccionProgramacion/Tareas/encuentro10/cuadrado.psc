Algoritmo sin_titulo
//	Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//	múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//	recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//	compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//	vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//	deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//		vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
	//cada venta.
	Definir numVendedores, sueldoBase, comisiones, numVentas, totalVentas, vendedor, i, j , ventas Como Entero
	numVendedores = 2
	totalVentas = 0
	
	para i = 1 Hasta numVendedores Hacer
		Escribir "Ingrese el sueldo base del vendedor n°" i
		Leer sueldoBase
		Escribir "Ingrese cuantas ventas que realizo el vendedor n° " i
		leer numVentas
		
		Para  j = 1 hasta numVentas Hacer
			Escribir "Cuanto cobro por la venta n° " j
			Leer ventas
			
			totalVentas = totalVentas + ventas
		FinPara
		comisiones = totalVentas * 0.1
		Escribir "El valor total a pagar por comisiones para el vendedor n°" i " es " comisiones 
		Escribir "El total a pagar al vendedor n° " i " es igual a " comisiones + sueldoBase
		
		
	FinPara
	
	

	
	
FinAlgoritmo
