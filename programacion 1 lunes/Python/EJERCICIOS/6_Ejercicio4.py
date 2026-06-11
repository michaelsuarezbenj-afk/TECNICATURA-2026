# Ejercicio 4: Área y longitud de un círculo
import math

# Pedimos el radio al usuario
radio = float(input("Ingresa el radio del círculo: "))

# Calculamos área y longitud
area = math.pi * (radio**2)
longitud = 2 * math.pi * radio

# Mostramos resultados
print("Área del círculo:", area)
print("Longitud de la circunferencia:", longitud)