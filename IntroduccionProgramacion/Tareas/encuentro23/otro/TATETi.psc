//tateti



Algoritmo sin_titulo
	Definir Nom1, nom2 Como Caracter
	Definir vectorLetras Como caracter
	Definir tateti, frase Como Caracter
	Definir i, j, num Como Entero
	Definir C Como Logico
	Dimension vectorLetras[9]
	
	para i<-0 Hasta 8 hacer 
		vectorLetras(i)= " "
	FinPara
	
	
	i=0
	j=0
	C= Falso
	frase= "ABCDEFGHI"
	
	
	
	Dimension tateti(5,4)
	
	para i<-0 Hasta 3 Hacer
		para j<-0 hasta 3 Hacer
			
			si i=0 o i=3 o j=0 o j= 3 Entonces
				tateti(i,j)= "= "
			sino
				tateti(i,j) = "." 
			FinSi
		FinPara
	FinPara
	para i<-0 hasta 3 Hacer
		para j<- 0 Hasta 3 Hacer
			
			Escribir tateti(i,j) Sin Saltar " "
			
		FinPara
		
		Escribir " " 
	FinPara
	
	
	
	Escribir "bienvenido al Juego tateti "
	Escribir "Su nombre y de su amigo!" ; leer Nom1, Nom2
	Escribir "Eliji un numero " nom1  " para ver quien comienza!1-2 "; 
	leer num
	Escribir "Empecemos!!!" "Comienza " 
	si num = aleatorio(1,2)
		Escribir Nom1
	SiNo
		escribir Nom2
	FinSi
	escribir "Toca una tecla para continuar!"
	esperar Tecla
	Limpiar Pantalla
	Mostrarletras( vectorLetras, frase)
	juego(tateti, vectorLetras, i , j,  nom1, nom2,C, frase)
	
	Felicidades()
	
FinAlgoritmo


	
	
SubProceso Juego(tateti, i , j, vectorLetras , nom1, nom2, C, frase)
	Definir posicion, posicion1 como caracter
	
	c= falso
	// partida y elecciones 



Hacer
	
	Mostrarletras(vectorLetras, frase)	
	
Escribir " elija la posicion a ocupar con su nombre " nom1 
leer posicion 
Escribir " elija la posicion a ocupar con su nombre " nom2
leer posicion1
Segun Minusculas(posicion)
	"a": tateti(1,1) = Subcadena(nom1,0,0)
	"b":tateti(1,2) = Subcadena(nom1,0,0)
	"c":tateti(1,3) = Subcadena(nom1,0,0)
	"d":tateti(2,1) = Subcadena(nom1,0,0)
	"e":tateti(2,2) = Subcadena(nom1,0,0)
	"f":tateti(2,3) = Subcadena(nom1,0,0)
	"g":tateti(3,1) = Subcadena(nom1,0,0)
	"h":tateti(3,2) = Subcadena(nom1,0,0)
	"i":tateti(3,3) = Subcadena(nom1,0,0)
		
FinSegun
Segun Minusculas(posicion1)
	"a": tateti(1,1) = Subcadena(nom2,0,0)
	"b":tateti(1,2) = Subcadena(nom2,0,0)
	"c":tateti(1,3) = Subcadena(nom2,0,0)
	"d":tateti(2,1) = Subcadena(nom2,0,0)
	"e":tateti(2,2) = Subcadena(nom2,0,0)
	"f":tateti(2,3) = Subcadena(nom2,0,0)
	"g":tateti(3,1) = Subcadena(nom2,0,0)
	"h":tateti(3,2) = Subcadena(nom2,0,0)
	"i":tateti(3,3) = Subcadena(nom2,0,0)
		
FinSegun

para i<-0 hasta 4 Hacer
para j<- 0 Hasta 4 Hacer
	
	Escribir " " tateti(i,J) " " Sin Saltar
	FinPara
Escribir " " 
FinPara

VERIFICACION(tateti,I,J, C)



Mientras QUE C <> Verdadero 
FINSUBPROCESO


SubProceso VERIFICACION(tateti,I,J,C Por Referencia)
	
	
	
	para i<-1 hasta 3 Hacer
		PARA J<-1 Hasta 0 Hacer
		
	si tateti(i,j) = tateti(i,j+1) y tateti(i,j+1) = tateti(i,j+2) y tateti(i,j) <> "." y tateti(i,j+2) <>  "." y tateti(i,j+1) <>  "." Entonces
		Escribir tateti(i,j) " Es el ganador"
		c= verdadero
	FinSi
	FinPara
	
FinPara

PARA I<- 0 Hasta  0 Hacer
para j<-1 hasta 3 Hacer
	si tateti(i,j) = tateti(i+1,j) y tateti(i+1,j) = tateti(i+2,j) y tateti(i,j) <> "." y tateti(i+1,j) <> "." y tateti(i+2,j) <> "." Entonces
		Escribir tateti(i,j) " Es el ganador"
		c= verdadero
	FinSi
FINPARA
FinPara

i=0
j=0
si tateti(i,j) = tateti(i+1,j+1) y tateti(i+1,j+1) = tateti(i+2,j+2) y tateti(i,j) <> "." y  tateti(i,j+1) <> "."y tateti(i,j+2) <> "."  Entonces
	Escribir  tateti(i,j) " Es el ganador "
	c= verdadero
FinSi
	
	
FinSubProceso

SubProceso Felicidades()

	Escribir "Gracias por jugara con nosotros"	
	
FinSubProceso


SubProceso Mostrarletras(vectorLetras, frase)	
		Definir i , j Como Entero
				
	Para i<-0 Hasta 8 con paso 1  Hacer
		si i <= 2  Entonces			
			Escribir vectorLetras(i) Sin  Saltar " "
		FinSi
	
	Escribir " "
	para i<-3 Hasta 5 con paso 1  Hacer
		si i <= 6 y i >= 3 Entonces
			Escribir vectorLetras(i) " "Sin Saltar
		FinSi
	finpara	
	Escribir " "
	para i<-5 Hasta 8 con paso 1  Hacer
		si i<=8 y i>=6 Entonces
			Escribir vectorLetras(i) " " Sin Saltar
		FinSi
		
	FinPara
	Escribir " " 
FinPara

finsubProceso	
