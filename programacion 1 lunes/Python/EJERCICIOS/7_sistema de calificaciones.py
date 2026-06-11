# Sistema de calificaciones según la nota ingresada

nota = float(input("Ingresá una calificación del 0 al 10: "))

if nota >= 9 and nota <= 10:
    print("Calificación: A")
elif nota >= 8 and nota < 9:
    print("Calificación: B")
elif nota >= 7 and nota < 8:
    print("Calificación: C")
elif nota >= 6 and nota < 7:
    print("Calificación: D")
elif nota >= 0 and nota < 6:
    print("Calificación: F")
else:
    print("El valor ingresado es incorrecto. Debe estar entre 0 y 10.")