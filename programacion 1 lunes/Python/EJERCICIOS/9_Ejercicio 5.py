num: int = int(input("Digite un número: "))

if num < 0:
    print("El número debe ser mayor o igual a 0.")
else:
    i = 1
    factorial = 1

    while i <= num:
        factorial = factorial * i
        i += 1

    print("El factorial es:", factorial)