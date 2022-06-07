"""
En este segundo ejercicio.
Tenéis que crear una aplicación que obtendrá los elementos impares de una lista pasada por parámetro con filter y 
realizará una suma de todos estos elementos obtenidos mediante reduce.
"""

from functools import reduce


print("Ingrese los números para validar si sin impares.")
numeros = int(input("Cuantos numeros deseas ingresar: "))
lista = []
impares = []
n = 0

# Simple, solicitamos que ingrese una cantidad de numeros a ingresar.
while numeros > 0:
    
    n += 1
    insert_lista = int(input(f"Ingresar el número {n}: "))
    lista.append(insert_lista)

    numeros -= 1

# Ahora lo que hacemos es recorrer la lista con un for para calcular los numeros impares
#def num_impares(a):
#    for num in a:
#        if num % 2 != 0:
#            impares.append(num)

def num_impares(x):
    if x % 2 != 0:
        return True
    
    return False

# Solo se hace una suma
def suma(a, b):
    return a + b

#Filtramos los numeros introducidos, sacando solo los impares
impares = filter(num_impares, lista)
print(f"Números ingresados: {lista}")

# Ahora solo sumanos utilizando el filtro
result = reduce(suma, impares)
print(f"La suma de los numeros impares es: {result}")