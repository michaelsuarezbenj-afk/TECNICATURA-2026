conteo_positivos = 0
conteo_negativos = 0
conteo_neutros = 0

for i in range(1, 11):
    num = int(input(f'{i}. Digite un número: '))

    if num > 0:
        conteo_positivos += 1
    elif num < 0:
        conteo_negativos += 1
    else:
        conteo_neutros += 1

print("\nResultados:")
print("Positivos:", conteo_positivos)
print("Negativos:", conteo_negativos)
print("Neutros:", conteo_neutros)