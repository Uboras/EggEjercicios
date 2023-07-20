
	Algoritmo Ej3
		Definir usuario,clave,oferta Como Caracter
		Definir cont1,seleccion,botellas,saldo Como Entero
		Definir numazar,minimo,maximo,i,min500,mayor501,mayor1501 Como Entero
		minimo <- 100
		maximo <- 3000
		saldo <- 0
		Escribir 'ingrese el usuario'
		Leer usuario
		cont1 <- 0
		Si usuario='Albus_D' Entonces
			Mientras cont1<>3 Hacer
				cont1 <- cont1+1
				Escribir 'ingrese la clave'
				Leer clave
				Si clave='caramelodelimon' Entonces
					Escribir 'login'
					cont1 <- 3
					Repetir
						Escribir '1_ ingresar botellas'
						Escribir '2_ consultar saldo '
						Escribir '3_ salir '
						Leer seleccion
						Segun seleccion  Hacer
							1:
								Escribir 'cuantas botellas se ingresan'
								Leer botellas
								min500 <- 0
								mayor501 <- 0
								mayor1501 <- 0
								Para i<-1 Hasta botellas Hacer
									Repetir
										numazar <- AZAR(maximo+1)
									Hasta Que numazar>=minimo Y numazar<=maximo
									Escribir numazar
									Si numazar<=500 Entonces
										min500 <- min500+1
									FinSi
									Si numazar<=1501 Y numazar>=501 Entonces
										mayor501 <- mayor501+1
									FinSi
									Si numazar>1501 Entonces
										mayor1501 <- mayor1501+1
									FinSi
								FinPara
								Escribir ' valor de todals las botellas menor de 500gr es:',min500*50,'$'
								Escribir ' valor de todals las botellas menor de 1501 y mayaor a 501 gr es: ',mayor501*125,'$'
								Escribir 'valor de todals las botellas mayor 1501gr es: ',mayor1501*200,'$'
								saldo <- (min500*50)+(mayor501*125)+(mayor1501*200)
								Escribir 'el saldo total es: ',saldo
								Escribir 'acepta la oferta?'
								Leer oferta
								Segun oferta  Hacer
									'si','SI':
										Escribir 'SU SALDO ESTA CARGADO'
									'no','NO':
										Escribir 'devolviendo material'
										saldo <- 0
									De Otro Modo:
										Escribir 'opcion no valida'
								FinSegun
							2:
								Escribir saldo
						FinSegun
					Mientras Que seleccion<>3
				SiNo
					Escribir 'agoto los intentos'
				FinSi
			FinMientras
		SiNo
			Escribir 'usuaria incorrecto'
		FinSi
FinAlgoritmo

