'''
# Ejerciocio No 3

https://github.com/alpolo1991/Open-BootCamp/blob/main/Curso_de_Python/Video_sesion_5/ejercicio_n3.py
Escribe una función que pueda decirte si un año (número entero) es bisiesto o no.
'''


def esbisiesto(numero):

    while numero <= 0:
        numero = int(input("Ingrese un número mayor: "))

    if (numero % 4) == 0:
        if (numero % 100) == 0:
            if (numero % 400) == 0:
                return True
            else:
                return False
        else:
            return True
    else:
        return False

numero = int(input("Ingrese un año: "))

isbisiesto = esbisiesto(numero)
if isbisiesto:
    print(f"El año {numero} es bisiesto")
else:
    print(f"El año {numero} no es bisiesto")