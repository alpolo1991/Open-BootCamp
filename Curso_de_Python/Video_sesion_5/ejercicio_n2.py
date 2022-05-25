'''
# Ejercicio No 2

Escribe una función que pueda decirte si un número (número entero) es primo o no.
'''

def primo(numero):
    
    while numero <= 0:
        numero = int(input("Ingrese un número mayor: "))

    for primo in range(2, numero):
        if (numero % primo) == 0:
            return False
        return True

numero = int(input("Ingrese un número: "))

isprimo = primo(numero)

if isprimo:
    print(f"El número {numero} es primo")
else:
    print(f"El número {numero} no es primo")