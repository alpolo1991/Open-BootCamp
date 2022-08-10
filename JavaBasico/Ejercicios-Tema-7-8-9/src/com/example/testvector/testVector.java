package com.example.testvector;

import java.util.Vector;

public class testVector {
    public static void main(String[] args) {

        Vector<Integer> xVector = new Vector<>();

        xVector.add(1);
        xVector.add(2);
        xVector.add(3);
        xVector.add(4);
        xVector.add(5);
        xVector.add(6);
        // Sin Eliminar
        System.out.println("Contenido del vector: " + xVector);

        // Quitar segundo elemento:
        xVector.remove(2);
        System.out.println("Contenido del vector: " + xVector);
        // Quitar tercer elemento:
        xVector.remove(3);
        System.out.println("Contenido del vector: " + xVector);

        // Los vectores tienen capacidad y tamaño:
        System.out.println("Tamano: " + xVector.size() + " - Capacidad: " + xVector.capacity());

        // Recorrer un vector
        for (int i = 0; i < xVector.size(); i++) {
            System.out.println("Valor en la posicion " + i + " del vector: " + xVector.get(i));
        }

        // Recorrerlo con la forma corta:
        for (int i : xVector) {
            System.out.println("Valor actual del vector: " + i);
        }

        /**
         * * Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
         *
         * R:: -> El problema radica en que por cada 10 elementos el crea un nuevo array por debajo para copiar esos los nuevos datos por tanto utiliza más memoria o recursos del ordenador lo cual el programa se ejecutara más lento.
         */
    }
}
