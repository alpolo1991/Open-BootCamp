'''
# Ejercicio No 3

Escribe un programa que sea capaz de mostrar los números del 1 al 100 en orden inverso.
'''

print("Programa capaz de mostrar un número ingresado en orden inverso")
numero = int(input("Ingrese un número: "))

while numero <= 0:
    numero = int(input("Por favor ingrese un número mayor al anterior: "))

for numeros in reversed(range(1, numero + 1)):
    print("Los numeros son:", numeros)