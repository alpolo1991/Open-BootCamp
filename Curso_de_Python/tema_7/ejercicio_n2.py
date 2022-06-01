import time

"""
# Ejercicio N2

En este segundo ejercicios tendréis que crear un script que nos diga si es la hora de ir a casa. Tendréis que hacer uso del modulo time. Necesitaréis la fecha del sistema y poder comprobar la hora.

En el caso de que sean más de las 7, se mostrará un mensaje y en caso contrario, haréis una operación para calcular el tiempo que queda de trabajo.
"""
class TiempoTrabajo:

    def __init__(self):
        print("=========================================")
        print(time.strftime("Fecha: %b-%d-%Y"))
        print(time.strftime("Son las: %H:%M:%S")) #%p -> Muestra la Conversation AM/PM
        print("=========================================")

    def tiempo_restante(self):
        self.hora = int(time.strftime("%H"))
        self.minutos = int(time.strftime("%M"))
        if self.hora >= 19:
            print("Es hora de ir a casa")
        else:
            tiempo_restante_h = 18 - self.hora 
            tiempo_restante_m = 59 - self.minutos
            print(f"Quedan {tiempo_restante_h} horas y {tiempo_restante_m} minutos para ir a casa.")

t = TiempoTrabajo()
t.tiempo_restante()
