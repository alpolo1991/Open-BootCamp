package com.prueba.estructuradecontroles.bucles;

public class Bucles {
    public static void main(String[] args) {
        /**
         * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
         *
         * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
         * String[] nombres = {"", "", "", ""}
         */

        String nombres[] = {"Alfonso", "Jorge", "Jose", "Leidy"};

        for (int i = 0; i < nombres.length; i++) {
            System.out.print(" "+nombres[i]);
        }
    }
}
