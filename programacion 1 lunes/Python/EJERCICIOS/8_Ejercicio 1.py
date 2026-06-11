while True:

    año = int(input("Ingrese un año: "))


    if (año % 4 == 0) and ((año % 100 != 0) or (año % 400 == 0)):
        print("El año", año, "es bisiesto ")
    else:
        print("El año", año, "NO es bisiesto ")

  
    opcion = int(input("Para seguir adelante digite la opción 1, otro número para salir: "))
    if opcion != 1:
        print("Fin del programa. ¡Hasta luego!")
        break
