Proceso MenuJuegos
	
	Definir opcion Como Entero
	
	Escribir "===== MENU ====="
	Escribir "1. Adivina el numero"
	Escribir ""
	Escribir ""
	Leer opcion
	
	Segun opcion Hacer
		
		1:
			// Juego Adivina el Numero
			
			Definir num, usuario, intentos, min, max Como Entero
			
			intentos <- 0
			min <- 1
			max <- 100
			
			num <- azar(max - min + 1) + min
			
			Escribir "¡¡Adivina el numero!!"
			
			Repetir
				Escribir "Elije un numero entre ", min, " y ", max
				Leer usuario
				
				intentos <- intentos + 1
				
				Si usuario < num Entonces
					Escribir "El numero es mayor"
				SiNo
					Si usuario > num Entonces
						Escribir "El numero es menor"
					FinSi
				FinSi
				
			Hasta Que usuario = num
			
			Escribir "Felicidades! Adivinaste el numero ", num
			Escribir "Lo lograste en ", intentos, " intentos"
			
		2:
			Escribir ""
			
			
			
		3:
			Escribir ""
			
		De Otro Modo:
			Escribir "Opcion no valida"
			
	FinSegun
	

FinProceso
