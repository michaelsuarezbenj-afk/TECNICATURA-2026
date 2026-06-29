Proceso MenuJuegos
	
	Definir opcion Como Entero
	
	Escribir "===== MENU ====="
	Escribir "1. Adivina el numero"
	Escribir "2. piedra pape o tigera "
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
	fin segun
	
	Segun opcion Hacer
		2:	Escribir "2_PiedraPapelTijera"
				
				Definir jugador, maquina Como Entero
				Definir opciones Como Caracter
				
				Dimension opciones[3]
				opciones[1] <- "Piedra"
				opciones[2] <- "Papel"
				opciones[3] <- "Tijera"
				
				Escribir "========================================="
				Escribir "       PIEDRA, PAPEL O TIJERA"
				Escribir "========================================="
				Escribir ""
				
				Repetir
					
					Escribir "Elegi una opcion:"
					Escribir "  1 - Piedra"
					Escribir "  2 - Papel"
					Escribir "  3 - Tijera"
					Escribir ""
					Escribir Sin Saltar "Tu eleccion: "
					Leer jugador
					
					Si jugador < 1 O jugador > 3 Entonces
						Escribir ""
						Escribir "Opcion invalida. Elegi 1, 2 o 3."
						Escribir ""
					FinSi
					
				Hasta Que jugador >= 1 Y jugador <= 3
				
				maquina <- Aleatorio(1, 3)
				
				Escribir ""
				Escribir "Vos elegiste: ", opciones[jugador]
				Escribir "La maquina eligio: ", opciones[maquina]
				Escribir ""
				
				Si jugador = maquina Entonces
					Escribir "*** ES UN EMPATE! ***"
				SiNo
					Si (jugador = 1 Y maquina = 3) O (jugador = 2 Y maquina = 1) O (jugador = 3 Y maquina = 2) Entonces
						Escribir "*** GANASTE! ***"
					SiNo
						Escribir "*** PERDISTE! La maquina gana ***"
					FinSi
				FinSi
				
				Escribir ""
				Escribir "========================================="
			De Otro Modo:
				Escribir "Opcion no valida"
				
				
		fin segun
		
FinAlgoritmo

	


