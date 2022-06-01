"""
# Ejercicio No 18

En este ejercicio, tendréis que crear un archivo py donde creéis un archivo txt, lo abráis y escribáis dentro del archivo. Para ello, tendréis que acceder dos veces al archivo creado.
"""
txt1 = "Hola Mundo\n"
txt2 = "Adio mundo cruel\n"

# Escibimos en  el fichero
f = open("datos.txt", "w")
datos = f.write(txt1)
datos2 = f.write(txt2)
f.close()

# Leemos lo que tiene el fichero
file = open("datos.txt", "r")
datos_r = file.read(11)
file.close()

# Mostra la información del fichero.
print(datos_r)