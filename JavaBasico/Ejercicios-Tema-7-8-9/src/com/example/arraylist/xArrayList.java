package com.example.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class xArrayList {
    public static void main(String[] args) {

        // Creamos una lista de tipo ArrayList --> String:
        ArrayList<String> arrayList = new ArrayList<>();

        // Añadir elementos
        arrayList.add("Alfonso");
        arrayList.add("Gonzalez");
        arrayList.add("Yuby");
        arrayList.add("Tatiana");
        arrayList.add("Yulissa");
        System.out.println("Contenudo del ArrayList<> es: "+arrayList);

        for (String ArrayList: arrayList) {
            System.out.println("Datos de ArraList "+ArrayList);
        }

        // Quitar un elemento:
        arrayList.remove("Gonzalez");
        System.out.println("Contenido de la lista: " + arrayList);

        // Las listas tienen tamaño:
        System.out.println("Tamano: " + arrayList.size());

        // Creamos LinkedList
        LinkedList<String> listaCopiada = new LinkedList<>();

        // Copiamos los datos de ArraList a LinkeList
        for (int i = 0; i < arrayList.size(); i++) {
            listaCopiada.add(arrayList.get(i));
        }

        for (String listaCopiadaArray : listaCopiada) {
            System.out.println("Los datos Copiados a LinkedList: "+listaCopiadaArray);
        }

        // Cada tipo de lista tiene sus pros y sus contras:
        // ArrayList:
        //  - Utiliza un array dinámico internamente
        //  - Es más rápida para almacenar y buscar datos
        //  - Solo implementa la interfaz "List", por lo que solo puede actuar como una lista
        //
        // LinkedList:
        //  - Utiliza una lista doblemente enlazada a nivel interno
        //  - Es más rápida para modificar datos
        //  - Puede funcionar como lista y como cola, ya que implementa las interfaces "List" y "Deque"
        //
        // Hay más tipos, ¡búscalos!
    }
}
