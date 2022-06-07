"""
Crea un script que le pida al usuario una lista de países (separados por comas). 
Éstos se deben almacenar en una lista. 
No debería haber países repetidos (haz uso de set). 
Finalmente, muestra por consola la lista de países ordenados alfabéticamente y separados por comas.
"""

paises = []

while True:
    nombres_paises = input("Ingrese el nombre de los paises: ")
    paises.append(nombres_paises)
    repetidos = set(paises)
    ordenados = sorted(repetidos)

    deseas_salir = input("Deseas seguir agregando paises a la lista [S/N]: ")
    if deseas_salir.lower() != "s":
        break
    
print(ordenados)