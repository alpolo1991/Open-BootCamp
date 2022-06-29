from tkinter import ttk, Tk
import tkinter

"""
Ejercicio No 1

En este ejercicio tenéis que crear una lista de RadioButton que muestre la opción que se ha seleccionado 
y que contenga un botón de reinicio para que deje todo como al principio.
"""

class Window():

    def __init__(self):
        self.windows = Tk()
        self.windows.title("Lista Radio Button")
        self.windows.geometry("500x400")
        self.windows.config(bg="goldenrod3")

    def obtener(self):
        select = self.pais.get()
        if select:
            txt_label = ttk.Label(self.windows, text="El pais selecioando de la lista es: " + select)
            txt_label.pack(padx=2, pady=2)

    def reset(self):
        #self.windows.quit()
        self.windows.destroy()

        self.windows = main()


    def lista_radio_button(self):
        txt_label = ttk.Label(self.windows, text="Seleleccione una Lista del Radio Button")
        txt_label.pack(padx=4, pady=6)

        #lista_txt = ["Colombia", "España", "Panama", "Brasil", "Ecuador"]

        self.pais = tkinter.StringVar()

        colombia = ttk.Radiobutton(self.windows, text="Colombia", value="Colombia", variable=self.pais)
        colombia.pack(padx=2, pady=2)
        espana = ttk.Radiobutton(self.windows, text="España", value="Espana", variable=self.pais)
        espana.pack(padx=2, pady=2)
        panama = ttk.Radiobutton(self.windows, text="Panama", value="Panama", variable=self.pais)
        panama.pack(padx=2, pady=2)
        brasil = ttk.Radiobutton(self.windows, text="Brasil", value="Brasil", variable=self.pais)
        brasil.pack(padx=2, pady=2)
        ecuador = ttk.Radiobutton(self.windows, text="Ecuador", value="Ecuador", variable=self.pais)
        ecuador.pack(padx=2, pady=2)

        btn1 = ttk.Button(self.windows, text="Obtener", command=self.obtener)
        btn1.pack(padx=2, pady=2)

        btn2 = ttk.Button(self.windows, text="Reset", command=self.reset)
        btn2.pack(padx=2, pady=2)

    """
    def widget_main(self):
        self.frame = ttk.Frame(self.windows)
        self.frame.grid(column=0, row=0)

        username_label = ttk.Label(self.frame, text="Username:")
        username_label.grid(column=0, row=0, sticky=tkinter.W, padx=30, pady=20)

    def username_text(self,):
        #label_text = tkinter.Label(self.windows, text="Hola Eqtiqueta", bg="black", fg="red")
        #label_text.pack(ipadx=20, ipady=15, fill="x")

        #label_text = tkinter.Label(self.windows, text="Adios", bg="red", fg="black")
        #label_text.pack(ipadx=20, ipady=15, fill="both", side="left")
        username_label = ttk.Label(self.windows, text="Username:")
        username_label.grid(column=0, row=0, sticky=tkinter.W, padx=5, pady=5)

        username_entry = ttk.Entry(self.windows)
        username_entry.grid(column=1, row=0, sticky=tkinter.E, padx=5, pady=5)

    def passwd_text(self):
        passwd_label = ttk.Label(self.windows, text="Password:")
        passwd_label.grid(column=0, row=1, sticky=tkinter.W, padx=5, pady=5)

        passwd_entry = ttk.Entry(self.windows, show="#")
        passwd_entry.grid(column=1, row=1, sticky=tkinter.E, padx=5, pady=5)

    def btn_txt(self):
        btn_login = ttk.Button(self.windows, text="Enviar")
        btn_login.grid(column=0, row=2, sticky=tkinter.E, padx=5, pady=5)

        btn_reset = ttk.Button(self.windows, text="Login")
        btn_reset.grid(column=1, row=2, sticky=tkinter.E, padx=5, pady=5)
    """

    def run_mainloop(self):
        self.windows.mainloop()

def main():
    windows = Window()
    windows.lista_radio_button()

    windows.run_mainloop()

if __name__ == '__main__':
    main()