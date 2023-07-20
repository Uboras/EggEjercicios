//7R. Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5 produc-
//tos en los 5 días hábiles de la semana. Se desea conocer:
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.
// El informe final tendrá un formato como el que se muestra a continuación:
//	
//						Lunes Martes Miércoles Jueves Viernes Total producto
//	
//	Producto 1
//	Producto 2
//	Producto 3
//	Producto 4
//	Producto 5
//	Total semana
//	Producto más vendido



Algoritmo ej7extra
	
	definir i,j,matrizfinal,sumaventasdia,sumaventasproda,masvendido Como Entero
	definir txt,txt1 como caracter
	
	dimension matrizfinal(8,8)
	dimension txt1(7)
	txt="                       Lunes       Martes     Miércoles    Jueves     Viernes   Total Producto"
//	sumaventasdia=0;sumaventasprod=0;masvendido=0
	
	/////rellena matriz aleatoriamente
	para i=0 hasta 6 Hacer
		para j=0 hasta 6 Hacer			
			hacer
				matrizfinal(i,j)=aleatorio(0,10)
			Mientras Que j>0 y matrizfinal(i,j)=matrizfinal(i,j-1)
			si j>4 o i>4 Entonces
				matrizfinal(i,j)=0
			FinSi			
		FinPara		
	FinPara
	
	////rellena vector texto
	para i=0 hasta 6 Hacer		
		si i=5 Entonces
			txt1(i)="Tot.Semana  | "
		SiNo
			si i=6 Entonces
				txt1(i)="P.+Vendido  | "
			SiNo
				txt1(i)="Producto    | "
			FinSi
		FinSi
	FinPara

	////Total ventas cada día de la semana	
		para i=0 hasta 4 Hacer
		sumaventasdia=0
		para j=0 hasta 6 Hacer			
			sumaventasdia=matrizfinal(j,i)+sumaventasdia	
			
		FinPara
		matrizfinal(5,i)=sumaventasdia
	FinPara
	
	///Producto mas vendido
	i=0
	matrizfinal(6,i)=0
	para i=0 hasta 4 Hacer
		para j=0 hasta 3 Hacer			
		si matrizfinal(j,i)>matrizfinal((j+1),i) y matrizfinal(j,i)>matrizfinal(6,i)      Entonces
			matrizfinal(6,i)=matrizfinal(j,i)	
			escribir i," ",j
			FinSi	
			si (matrizfinal(j,i)< matrizfinal(j+1,i)) y matrizfinal(j+1,i)> matrizfinal(6,i) Entonces
				matrizfinal(6,i)=matrizfinal(j+1,i)
				escribir i," ",j
			finsi
		FinPara
				
	FinPara
	
	escribir matrizfinal(6,0)
	esperar tecla
	///Total ventas producto
		para i=0 hasta 4 Hacer
		sumaventasproda=0
		para j=0 hasta 4 Hacer			
		sumaventasproda=matrizfinal(i,j)+sumaventasproda
		matrizfinal(i,5)=sumaventasproda
		FinPara
		
	FinPara
	
	
	
	
	//////escribir varios
	Limpiar Pantalla
	Escribir "----------------------------------------------------------------------------------------------------"
	escribir txt
Escribir "----------------------------------------------------------------------------------------------------"
para i=0 hasta 6
	escribir txt1(i),i+1 " |"sinsaltar
		para j=0 hasta 5

		
		si ( i=6 o i=5 )y j=5
		matrizfinal(i,j)=0	
			
		finsi	
		
			si matrizfinal(i,j)<10 Entonces
				escribir "      | 0" matrizfinal(i,j) " |" sin saltar	
			SiNo
				escribir "      ","| " matrizfinal(i,j) " |" sin saltar
			FinSi


			
		FinPara
		escribir ""
		Escribir "----------------------------------------------------------------------------------------------------"		
		
	FinPara
	esperar Tecla
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo
