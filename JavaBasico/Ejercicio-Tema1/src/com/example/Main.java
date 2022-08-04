package com.example;

/**
 * Para este primer ejercicio tendréis que realizar lo siguiente:
 *
 * Crea un proyecto de Java desde 0
 * Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
 * Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
 */
public class Main {
    public static void main(String[] args) {

        //Boolean -> Verdadero o Falso --> Lógicos
        boolean verdadero = true;
        System.out.println("Boolean: "+verdadero);
        boolean falso = false;
        System.out.println("Boolean: "+falso);

        //Integers --> Numéricos
        byte numero1 = 120;
        System.out.println("Byte: "+numero1);
        short numero2 = 1000;
        System.out.println("Short: "+numero2);
        int numero3 = 3000000;
        System.out.println("Int: "+numero3);
        long numero4 = 4555555;
        System.out.println("Long: "+numero4);

        //Decimales
        float decimal1 = 3.15f;
        System.out.println("Float: "+decimal1);
        double decimal2 = 3.1516d;
        System.out.println("Double: "+decimal2);

        //String -> Cadena de texto/ Char -> Character
        char caracter = 'a';
        System.out.println("Char: "+caracter);
        String cadena = "Alfonso";
        System.out.println("String: "+cadena);

    }
}