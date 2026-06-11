suma: float = 0.0
calificacion_baja = 9999

i = 1

while i <= 10:
    calificacion = float(input(f"{i}. Digite una calificación: "))

    # Suma acumulativa
    suma += calificacion

    # Calcular la menor calificación
    if calificacion < calificacion_baja:
        calificacion_baja = calificacion

    i += 1

calificacion_promedio = suma / 10

print("\nLa calificación promedio es:", calificacion_promedio)
print("La calificación más baja es:", calificacion_baja)