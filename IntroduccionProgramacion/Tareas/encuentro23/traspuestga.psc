Algoritmo sin_titulo
		Definir matriz, matriz1, i , j, n , m Como Entero
		
		escribir "Las dimensiones de la matriz"
		leer n , m
		
		
		Dimension matriz[n,m]
		Dimension matriz1(m,n)
		
		i=0
		j=0
		
		rellenado(matriz, i , j, n, m  )
		
		traspuesta(matriz, matriz1, i , j, n, m)
		
		mostra(matriz1, matriz, i , j, n, m  )
		
		
FinAlgoritmo



SubProceso rellenado(matriz, i , j, n, m  )
	
	para i<-0 Hasta n-1 Hacer
		para j<-0 Hasta m-1  Hacer
			
			matriz(i,j) = Aleatorio(1, 100)
			
			
			
		FinPara
		
	FinPara
	
	
	
FinSubProceso


SubProceso mostra(matriz1, matriz , i , j, n, m  )
	
	
	para i<-0 Hasta n-1 Hacer
		para j<-0 Hasta m-1  Hacer
			
			Escribir matriz(i,j) " - " Sin Saltar
			
			
		FinPara
		Escribir " "
	FinPara
	
	Escribir ""
	Escribir ""
	Escribir ""
	
	
	para i<-0 Hasta m-1 Hacer
		para j<-0 Hasta n-1  Hacer
			
			Escribir matriz1(i,j) " - " Sin Saltar
			
			
		FinPara
		Escribir " "
	FinPara
	
	
	
	
	
FinSubProceso

SubProceso traspuesta(matriz, matriz1, i , j, n, m)
	
	
	para i<-0 Hasta m-1 Hacer
		para j<-0 Hasta n-1  Hacer
			
			matriz1(i,j) = matriz(j,i) 
			
			
		FinPara
		Escribir " "
	FinPara
	
	
	
	
	
	
FinSubProceso

	
	
	
	
	
	
	

	


