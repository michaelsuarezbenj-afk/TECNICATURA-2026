n_elementos = int(input("Digite la cantidad de elementos a ingresar: "))

suma_pares = 0
conteo_pares = 0
suma_impares = 0
conteo_impares = 0

i = 1

while i <= n_elementos:
    num = int(input(f"{i}. Digite un número: "))

    if num % 2 == 0:  # Número par
        suma_pares += num
        conteo_pares += 1
    else:  # Número impar
        suma_impares += num
        conteo_impares += 1

    i += 1

print("\nRESULTADOS:")

print("La suma de los números pares es:", suma_pares)
print("La cantidad de números pares es:", conteo_pares)

if conteo_pares == 0:
    print("No se han digitado números pares")

print("\nLa suma de los números impares es:", suma_impares)
print("La cantidad de números impares es:", conteo_impares)

if conteo_impares == 0:
    print("No se han digitado números impares")
else:
    promedio_impares = suma_impares / conteo_impares
    print("El promedio de los impares es:", promedio_impares)