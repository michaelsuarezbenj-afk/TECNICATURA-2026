edad = int(input("Digite su edad: "))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)
if veinte or treinta:
    if veinte:
        print('Estas dentro del rango de los (20\'0) años')
    elif treinta:
        print('Estas dentro del rango de los (30\'0) años')
    else:
        print('No estas dentro del rango')
else:
    print("No estas dentro del rango de los (20'0) a (30'0) años")
