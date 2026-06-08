
valor = int(input("Digite un numero dentro del 1 al 7: "))
valorMinimo = 0
valorMaximo = 7
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f'El valor {valor} esta dentro del rango')
else:
    print(f'El valor {valor} No esta dentro del rango')
