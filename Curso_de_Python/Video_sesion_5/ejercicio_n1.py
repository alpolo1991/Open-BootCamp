'''
# Ejercicio No 1

Escribe una función que calcule el área de un triángulo, recibiendo la altura y la base como parámetros y otra función que calcule el área de un círculo recibiendo el radio del mismo.
'''


altura = int(input("Ingrese la altura del triangulo: "))
base = int(input("Ingrese la base del triangulo: "))

def are_triangulo(altura, base):
    return (altura * base) / 2

result = are_triangulo(altura, base)
print(f"El área del triangulo es: {result}")

radio = int(input("Ingrese el radio del círculo: "))
PI = 3.141592653589

def area_circulo(radio):
    return (radio ** 2) * PI

result = area_circulo(radio)
print(f"El área del círculo es: {result:.2f}")