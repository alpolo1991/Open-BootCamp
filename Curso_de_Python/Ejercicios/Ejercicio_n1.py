'''
# Ejercicio N1

Para este ejercicio tenéis que crear en la consola de python variables que representen los siguientes datos de un contacto:

Nombre
Apellidos
Edad
Email
Teléfono
Casado (verdadero o falso)
Con Hijos (verdadero o falso)
Lista de amigos
Películas vistas (diccionario con clave y valor. El valor será el título de la película)
Una vez hayas creado todas las variables, muéstralas por consola haciendo uso de la función print().
'''

name = "Juan"
last_name = "Perez"
age = 30
email = "jperez@gmail.com"
phone = "123456789"
married = True
has_children = False
peliculas_vistas = {"Batman": "Batman Begins", "Superman": "Superman Returns", "Spiderman": "Spiderman", "Ironman": "Ironman"}

print("Nombre Completo: " + name + " " + last_name)
print("Edad: " + str(age))
print("Email: " + email)
print(f"Telefono: {phone}")
print("EsCasado: ", married)
print(f"Tines Hijos: {has_children}")
print(f"Peliculas Vistas: {peliculas_vistas}")