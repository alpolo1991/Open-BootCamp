"""
Ejercicio N° 1

En este ejercicio tendréis que crear una tabla llamada Alumnos que constará de tres columnas: la columna id de tipo entero, la columna nombre que será de tipo texto y la columna apellido que también será de tipo texto.

Una vez creada la tabla, tenéis que insertarle datos, como mínimo tenéis que insertar 8 alumnos a la tabla.

Por último, tienes que realizar una búsqueda de un alumno por nombre y mostrar los datos por consola.
"""

import sqlite3
import sys

ruta = sys.path

conn = sqlite3.connect(ruta[0]+"/users.db")

cursor = conn.cursor()

def select_alumnos():

    rows = cursor.execute("SELECT * FROM Alumnos")

    print("Los Alumnos Son: \n")

    for row in rows:
        print(row)

    print("\n")

select_alumnos()

def insert_alumnos(nombre, apellido):

    conn = sqlite3.connect(ruta[0]+"/users.db")

    cursor = conn.cursor()

    sql_query = """INSERT INTO Alumnos(nombre, apellido) VALUES(?, ?);"""

    cursor.execute(sql_query, (nombre, apellido))

    conn.commit()

    cursor.close()

    conn.close()

entradas = input("Deseas agregar un nuevo Registro S/N.?: ")

while entradas.lower() != "n":

    nombre = None
    apellido = None

    nombre = input("Ingrese el Nombre del nuevo alumno: ")
    apellido = input("Ingrese el apellido del nuevo alumno: ")

    insert_alumnos(nombre, apellido)

    continuar = input("Deseas agregar un nuevo alumno S/N: ")

    if continuar.lower() != "s":
        break

def search_alumnos(nombre):

    rows = cursor.execute(f"SELECT nombre, apellido FROM Alumnos WHERE nombre = '{nombre}'")

    #dato = rows.fetchone()
    #print(dato)
    print("Nombre  |  Apellido \n")
    for row in rows:
        print(row)

print("Vamos a buscar un alumno ingresando el nombre")
nombre_buscado = input("Ingrese el nombre a buscar: ")

search_alumnos(nombre_buscado)

cursor.close()

conn.close()