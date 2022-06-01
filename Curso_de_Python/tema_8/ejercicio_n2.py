"""
# Ejercicio N 2

En este segundo ejercicio, tendréis que crear un archivo py y dentro crearéis una clase Vehículo, haréis un objeto de ella, lo guardaréis en un archivo y luego lo cargamos.
"""

import os
from turtle import st


class Vehiculo(object):

    def __init__(self):
        self.__nombre = None
        self.__c_puertas = None
        self.__modelo = None

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_puertas(self, c_puertas):
        self.__c_puertas = c_puertas

    def set_modelo(self, modelo):
        self.__modelo = modelo

    def get_nombre(self):
        return self.__nombre

    def get_puertas(self):
        return self.__c_puertas

    def get_modelo(self):
        return self.__modelo

v = Vehiculo()

v.set_nombre("Toyota")
v.set_puertas("4")
v.set_modelo("2022")


nombre = v.get_nombre()
puertas = v.get_puertas()
modelo = v.get_modelo()

# Guatrdamos los datos obtenidos
with open("fichero.txt", "a") as file:
    file.write("======================================\n")
    file.write("Nombre: "+ nombre + "\n")
    file.write("Cantidad de Puertas: "+ puertas + "\n")
    file.write("Modelo: "+ modelo +"\n")
    file.write("======================================\n")
file.close()

# Mostramos los datos
f = open("fichero.txt", "r")
datos_f = f.read()
f.close()

print(datos_f)
