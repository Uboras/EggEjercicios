///Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
///verdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es
///		correcta haremos que una variable llamada Login sea verdadera.


Algoritmo sin_titulo
	Definir ctrase, usuario, salir Como Caracter
	Definir login Como Logico
	Definir Mbotella, Msaldo, Msalir como caracter
	Definir int, botellas, saldo, i Como Entero
	definir peso Como Entero
	
	/// 
	Definir acepta Como Caracter
	
	
Repetir
		
	Escribir "usuario"
	leer usuario
	Escribir "contraseña"
	leer ctrase
	
	int=1
	login= falso
	
	si Minusculas(usuario)= "albus_d" Entonces
		
		si Minusculas(ctrase) ="caramelosdelimon" Entonces
			 login=Verdadero
			
		
		 sino  
			 Mientras int<3 y login=falso Hacer
				 Escribir "incorrecta, escriba contraseña"
				 leer ctrase
				 int=int+1
				 login= falso
				  
			 Fin Mientras
		finSi
		 
	 sino 
		 Escribir login
fin si

Mientras Que login <> Verdadero


saldo=0


	
Repetir
	Escribir "------------menu-----------"
	Escribir "¿queres Ingresar botellas?" "S/N"
	leer Mbotella
	
		si Minusculas(Mbotella)="s" Entonces
			//ingresar botellas//
			
			Mientras Minusculas(Mbotella)="s"  Hacer
				Escribir "¿Cuantos botellas ingresaras?"
				leer botellas
				
				para i<-1 Hasta botellas Con Paso 1 hacer
					para i<-1 Hasta botellas con paso 1 hacer 
						peso =azar(3000)
						Escribir peso
						Si peso<501 Entonces
							
							Escribir "¿acepta sumar $50 a su saldo?" "S/N"
							leer acepta
							Segun Minusculas(acepta) Hacer
								
								"s": saldo=saldo+50
								"n": Escribir "DEVOLVIENDO MATERIAL"
									
							FinSegun
						SiNo
							
							si peso > 500 Y PESO<=1500 Entonces
								
								Escribir "¿acepta sumar $125 a su saldo?" "S/N"
								leer acepta
								Segun  Minusculas(acepta) Hacer
									
									"s": saldo=saldo+125
									"n": Escribir "DEVOLVIENDO MATERIAL"
										
								FinSegun
							sino		
								si peso>150 Entonces
									
									Escribir "¿acepta sumar $200 a su saldo?" "S/N"
									leer acepta
									Segun  Minusculas(acepta) Hacer
										
										"s": saldo=saldo+200
										"n": Escribir "DEVOLVIENDO MATERIAL"
											
									FinSegun
									
								FinSi
								
								
							FinSi
						FinSi
						
						
					
					

					
					FinPara
					
				finPara
				Escribir "------------menu-----------"
				Escribir "¿queres Ingresar botellas?" "S/N"
				leer Mbotella
			FinMientras
	 
			
		FinSi
		
		Escribir "¿queres saber el saldo?" "S/N"
		leer Msaldo
		
		si Minusculas(Msaldo)="s" Entonces
			Escribir saldo
		FinSi
		
		Escribir "¿Queres cerrar y salir"
		leer salir	

		Mientras Que Minusculas(salir) = "n"
		
FinAlgoritmo
