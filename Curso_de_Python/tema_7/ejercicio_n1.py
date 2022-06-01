from operaciones import math_basic as m
"""
# Ejercicio N1

En este ejercicio tendréis que crear un módulo que contenga las operaciones básicas de una calculadora: sumar, restar, multiplicar y dividir.

Este módulo lo importaréis a un archivo python y llamaréis a las funciones creadas. Los resultados tenéis que mostrarlos por consola.
"""
num1 = 8
num2 = 3

ope = m.Operaciones(num1, num2)

print(f"La suma de {ope.num1} y {ope.num2} es: ", ope.suma())
print(f"La resta de {ope.num1} y {ope.num2}: es:", ope.resta())
print(f"La multiplicacion de {ope.num1} y {ope.num2}: es: ", ope.multiplicacion())
print(f"La division de {ope.num1} y {ope.num2}: es: ", round(ope.division(), 3))
print(f"La potencia de {ope.num1} y {ope.num2}: es: ", ope.potencia())
print(f"El modulo o residuo de {ope.num1} y {ope.num2}: es: ", ope.modulo())
