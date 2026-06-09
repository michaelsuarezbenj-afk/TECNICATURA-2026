# Programa que determina la estación del año según el número de mes ingresado

mes = int(input("Ingresá el número de mes (1 al 12): "))

estacion = None  # Variable vacía, sin valor asignado todavía

if mes >= 1 and mes <= 3:
    estacion = "Verano"
elif mes >= 4 and mes <= 6:
    estacion = "Otoño"
elif mes >= 7 and mes <= 9:
    estacion = "Invierno"
elif mes >= 10 and mes <= 12:
    estacion = "Primavera"

if estacion is None:
    print("El número ingresado no corresponde a un mes válido (1-12).")
else:
    print(f"El mes {mes} corresponde a la estación de {estacion}.")