Algoritmo sin_titulo
//	Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//	m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//	recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//	compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//	vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//	deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//		vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
	//cada venta.
	Definir numVendedores, sueldoBase, comisiones, numVentas, totalVentas, vendedor, i, j , ventas Como Entero
	numVendedores = 2
	totalVentas = 0
	
	para i = 1 Hasta numVendedores Hacer
		Escribir "Ingrese el sueldo base del vendedor n�" i
		Leer sueldoBase
		Escribir "Ingrese cuantas ventas que realizo el vendedor n� " i
		leer numVentas
		
		Para  j = 1 hasta numVentas Hacer
			Escribir "Cuanto cobro por la venta n� " j
			Leer ventas
			
			totalVentas = totalVentas + ventas
		FinPara
		comisiones = totalVentas * 0.1
		Escribir "El valor total a pagar por comisiones para el vendedor n�" i " es " comisiones 
		Escribir "El total a pagar al vendedor n� " i " es igual a " comisiones + sueldoBase
		
		
	FinPara
	
	

	
	
FinAlgoritmo
