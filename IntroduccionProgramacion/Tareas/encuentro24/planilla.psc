//falta
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.



Algoritmo planilla
	
	Definir matrizOriginal, i , j, vectorSuma, vectorTotalProc, vectorPromasvendido  como entero
	
	Definir vectorTitulo, vectorPro como caracter
	i=0
	j=0
	Dimension MatrizOriginal(5,5), vectorPro(8), vectorTitulo(6), vectorSuma[5], vectorTotalProc(5), vectorPromasvendido(5)
	
	para i<-0 Hasta 4
		vectorSuma(i)= 0 
		vectorTotalProc(i)= 0
		vectorPromasvendido(i)=0
	FinPara
	
	
	
	
	
	rellenadoMatrizOriginal(MatrizOriginal, i , j )
	titulosProductos(vectorPro,vectorTitulo, i , j)
	SumaPorDia(vectorSuma,MatrizOriginal,i,j)
	sumaProducto(vectorTotalProc, MatrizOriginal, i ,j)
	productovendido(vectorPromasvendido, MatrizOriginal, i , j )
	porpantalla(VectorPromasvendido, matrizOriginal, i , j, vectorSuma, vectorTotalProc, vectorTitulo, vectorPro)
	Busquedapructomasvendido(VectorPromasvendido, matrizOriginal, i , j, vectorSuma, vectorTotalProc, vectorTitulo, vectorPro)
	
	
	
	
	
	
FinAlgoritmo

//relleand vecator titulo y productos
SubProceso titulosProductos(vectorPro, vectorTitulo, i, j )	
	
	para i<-0 Hasta 5 Hacer
		
		si i=0 Entonces
			vectorPro[i]= "         " 			
		SiNo
			
		vectorPro[i] = "PRODUCTOS"
		finsi
	FinPara
	vectorPro(6) = "Totales  "
	vectorPro(7) = "Pro+Vend "
	//rellenado vector titulo
	vectorTitulo(0)= "Lunes "
	vectorTitulo(1)= "Martes "
	vectorTitulo(2)= "Miercoles "
	vectorTitulo(3)= "Jueves "
	vectorTitulo(4)= "Viernes "
	vectorTitulo(5)= "Total Productos"
	
FinSubProceso






//rellenadoMatrizOriginal
SubProceso rellenadoMatrizOriginal(MatrizOriginal, i , j )
	
	
	para i<-0 Hasta 4 Hacer
		para j<-0 Hasta 4 Hacer
		MatrizOriginal[i,j] = Aleatorio(0,9) 
		FinPara
		
	FinPara
	para i<-0 Hasta 4 Hacer
		para j<-0 Hasta 4 Hacer
			Escribir MatrizOriginal[i,j] Sin Saltar " " 
			finPara
		Escribir " "
	FinPara
	
	Escribir " " " "
	
	
FinSubProceso


//suma pordia

SubProceso SumaPorDia(vectorSuma, MatrizOriginal,i,j)
	Definir suma Como Entero
	suma=0
	
	para i<-0 Hasta 4 Hacer
Para J<-0 HASTA 4 HACER	
	vectorSuma[i]=MatrizOriginal(i,j) + vectorSuma[i]
FinPara

	FinPara
FinSubProceso
// suma producto

SubProceso sumaProducto(vectorTotalProc, MatrizOriginal, i ,j)
	para i<-0 Hasta 4 Hacer
		
	para j<-0 Hasta 4 Hacer
		vectorTotalProc[j]=MatrizOriginal(i,j) + vectorTotalProc[j]
	FinPara
	finpara	
	
FinSubProceso

SubProceso productovendido(vectorPromasvendido, MatrizOriginal, i , j )
	Definir comparativo, contI,  contJ Como Entero
	comparativo=0
	contI=0
	contJ=0
	i=0
	j=0
	
	
	Hacer
		
	 
		Hacer
			si comparativo<=matrizOriginal(i,j) Entonces
			
			comparativo= matrizOriginal(i,j)
			
			
			FinSi
		
			i=i+1
			contI=contI+1
		Mientras Que contI<5

		VectorPromasvendido(j)= comparativo
		comparativo=0
		contI=0
		i=0
		j=j+1
		contJ= contJ+1
		
	Mientras que contJ<5
	
FinSubProceso
SubProceso Busquedapructomasvendido(VectorPromasvendido, matrizOriginal, i , j, vectorSuma, vectorTotalProc, vectorTitulo, vectorPro)




FinSubProceso







SubProceso porpantalla(VectorPromasvendido, matrizOriginal, i , j, vectorSuma, vectorTotalProc, vectorTitulo, vectorPro)

	escribir  vectorPro(0) "  " Sin Saltar
	
	para i<-0 Hasta 5 Hacer
		Escribir vectorTitulo(i)   Sin Saltar
		
		
		
	FinPara
	Escribir " " 
	
	para i<-0 Hasta 4 Hacer
		
		Escribir vectorPro(i+1) " "  i+1 "   " matrizOriginal(i,j) "    " "  " matrizOriginal(i,j+1) "    " "  " matrizOriginal(i,j+2) "    " "  " matrizOriginal(i,j+3) "    " "   " matrizOriginal(i,j+4) "    " "       " vectorTotalProc(i) "    " 
		// el vectorPro(0) lo Escribir arriba
		
	FinPara
	Escribir vectorPro(6)  Sin Saltar
	Para i<- 0 Hasta  4 Hacer 
		Escribir "    "  vectorSuma(i) Sin Saltar " "
	FinPara
	Escribir " " 
	Escribir vectorPro(7)  Sin Saltar
	
	Escribir "     " Sin Saltar
	Para i<- 0 Hasta 4 Hacer
		Escribir VectorPromasvendido(i) Sin Saltar " "
		Escribir "     " Sin Saltar
	FinPara
Escribir " "
	

	


FinSubProceso










