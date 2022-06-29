"""
Ejercecio N°2

En este segundo ejercicio, tendréis que crear una interfaz sencilla la cual debe de contener una lista de elementos seleccionables, 
también debe de tener un label con el texto que queráis.
"""

import tkinter as tk
from tkinter import Tk

class Window(object):

    def __init__(self):
        self.windows = Tk()
        self.windows.title("Lista Check Button")
        self.windows.geometry("300x200")
        self.windows.config(bg="blue")

    def listbox_test(self):
        selec = tk.StringVar()
        listbox = tk.Listbox(self.windows)

        ciudades = ["Bogota", "Cali", "Medellin", "Santander", "San Andres", "Rioacha", "Choco", "Buenaventura"]
        
        label = tk.Label(text="Lista de Ciudades de Colombia")
        label.pack(padx=2, pady=2)

        for item in ciudades:
            listbox.insert(tk.END, item)
        listbox.pack()
    """
        self.ciudad_1 = None
        self.ciudad_2 = None
        self.ciudad_3 = None
        self.ciudad_4 = None
        self.ciudad_5 = None
    
    def select_1(self):
        if self.ciudad_1.get():
            txt_label = tk.Label(self.windows, text="Seleccionaste: Bogota")
            txt_label.pack(padx=2, pady=2)
    
    def select_2(self):
        if self.ciudad_2.get():
            txt_label = tk.Label(self.windows, text="Seleccionaste: Cali")
            txt_label.pack(padx=2, pady=2)

    def select_3(self):
        if self.ciudad_3.get():
            txt_label = tk.Label(self.windows, text="Seleccionaste: Medellin")
            txt_label.pack(padx=2, pady=2)

    def select_4(self):
        if self.ciudad_4.get():
            txt_label = tk.Label(self.windows, text="Seleccionaste: Santander")
            txt_label.pack(padx=2, pady=2)

    def select_5(self):
        if self.ciudad_5.get():
            txt_label = tk.Label(self.windows, text="Seleccionaste: San Andres")
            txt_label.pack(padx=2, pady=2)

    def check_button(self):
        txt_label = tk.Label(self.windows, text="Que Ciudad Quieres Conocer de Colombia")
        txt_label.pack(padx=4, pady=6)

        self.ciudad_1 = tk.IntVar()
        self.ciudad_2 = tk.IntVar()
        self.ciudad_3 = tk.IntVar()
        self.ciudad_4 = tk.IntVar()
        self.ciudad_5 = tk.IntVar()

        bogota = tk.Checkbutton(self.windows, text="Bogota", onvalue=1, offvalue=0, variable=self.ciudad_1, command=self.select_1)
        bogota.pack(padx=2, pady=2)
        cali = tk.Checkbutton(self.windows, text="Cali", onvalue=1, offvalue=0, variable=self.ciudad_2, command=self.select_2)
        cali.pack(padx=2, pady=2)
        medellin = tk.Checkbutton(self.windows, text="Medellin", onvalue=1, offvalue=0, variable=self.ciudad_3, command=self.select_3)
        medellin.pack(padx=2, pady=2)
        santander = tk.Checkbutton(self.windows, text="Santander", onvalue=1, offvalue=0, variable=self.ciudad_4, command=self.select_4)
        santander.pack(padx=2, pady=2)
        san_andres = tk.Checkbutton(self.windows, text="San Andres", onvalue=1, offvalue=0, variable=self.ciudad_5, command=self.select_5)
        san_andres.pack(padx=2, pady=2)
    """

    def run_mainloop(self):
        self.windows.mainloop()

def main():
    windows = Window()
    windows.listbox_test()

    windows.run_mainloop()

if __name__ == '__main__':
    main()