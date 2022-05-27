'''
# Ejercicio No 1

En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:

Color
Ruedas
Puertas

Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:

Velocidad
Cilindrada

Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.
'''

class Veiculo(object):
    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas

class Coche(Veiculo):
    def __init__(self, color, ruedas, puertas, velocidad, cilindrada):
        super().__init__(color, ruedas, puertas)
        self.velocidad = velocidad
        self.cilindrada = cilindrada

c = Coche('rojo', 6, 8, 200, 1900)

print(f"Color del coche: {c.color}")
print(f"Total de ruedas: {c.ruedas}")
print(f"Total de puertas: {c.puertas}")
print(f"Velocidad: {c.velocidad} km/h")
print(f"Hp: {c.cilindrada}")