'''
# Ejercicio No 2

Escribe un programa capaz de mostrar todos los números impares desde un número de inicio y otro final.
Por ejemplo: teniendo numero_inicial = 2 y numero_final = 8, el programa debe imprimir por consola: [3, 5, 7]
'''

inicio = int(input("Introduce el número inicial: "))
final = int(input("Introduce el número final: "))
numero_impares = []

# Validamos que el segundo número sea mayor al primero
while(inicio > final):
    print("El segundo número debe ser mayor")
    final = int(input("Por favor ingreselo nuevamente: "))

while(inicio <= final):
    if (inicio % 2) != 0:
        #print(f"Los numeros Impares desde {inicio} hasta {final} son los: {inicio}")
        numero_impares.append(inicio)
    inicio += 1

print(f"Los numeros Impares desde {inicio} hasta {final} son : {numero_impares}")