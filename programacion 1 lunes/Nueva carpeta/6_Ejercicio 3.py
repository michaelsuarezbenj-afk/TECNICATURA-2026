# Ejercicio 3: Intercambiar valores de dos variables

# Pedimos los valores
a = int(input("Ingresa el valor de a: "))
b = int(input("Ingresa el valor de b: "))

print("Valores originales -> a:", a, " b:", b)

# Metodo 1: usando variable auxiliar
aux = a
a = b
b = aux

print("Valores intercambiados (con auxiliar) -> a:", a, " b:", b)

# Metodo 2: usando asignación múltiple (más Pythonic)
a, b = b, a
print("Valores intercambiados (Pythonic) -> a:", a, " b:", b)