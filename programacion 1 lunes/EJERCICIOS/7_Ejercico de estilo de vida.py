# Programa que indica la etapa de vida según la edad ingresada

edad = int(input("Ingresá tu edad: "))

if edad < 0:
    print("La edad no puede ser negativa.")
elif edad <= 10:
    print("La infancia es increíble y bella.")
elif edad <= 19:
    print("Tienes muchos cambios, mucho que estudiar.")
elif edad <= 29:
    print("Amor y comienza el trabajo.")
elif edad <= 39:
    print("Etapa de consolidación profesional y familiar.")
elif edad <= 49:
    print("Madurez plena, momento de disfrutar logros.")
elif edad <= 59:
    print("Preparación para una nueva etapa, más tranquila.")
elif edad <= 69:
    print("Tiempo de descanso, viajes y disfrutar de la familia.")
elif edad <= 79:
    print("Sabiduría y experiencia para compartir.")
elif edad <= 100:
    print("Etapa de oro, llena de recuerdos y enseñanzas.")
else:
    print("¡Edad fuera del rango humano común!")