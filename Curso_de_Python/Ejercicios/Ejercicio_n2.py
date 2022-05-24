'''
# Ejercicio N2

Escribe un programa en la consola de python 
    que pida al usuario su peso (en kg) y estatura (en metros), 
    calcule el índice de masa corporal y lo almacene en una variable, 
    e imprima por pantalla la frase Tu índice de masa corporal es 
    donde es el índice de masa corporal calculado redondeado con dos decimales.
'''
# Pedimos los datos por Consola y los almacenamos
peso = float(input("Por favor ingrese su peso en Kg: "))
estatura = float(input("Ingresa tu estatura en metros: "))

operacion = peso / (estatura * 2)
# Redondear round(20.321456, 2) -> 20.32
print (f"Tu índice de masa corporal es: {operacion:.2f}")
