i: int = 1
suma = 0.0

while i <= 5:
    print(f"\nSalario del empleado {i}")

    horas = float(input("Digite las horas trabajadas: "))
    tarifa = float(input("Digite la tarifa por hora: "))

    salario = horas * tarifa

    print("El salario es: $", salario)

    suma += salario
    i += 1

print("\nLa suma de todos los salarios es: $", suma)