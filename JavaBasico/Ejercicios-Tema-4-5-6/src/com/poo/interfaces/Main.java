package com.poo.interfaces;

/**
 * Crear una interfaz CocheCRUD.
 *
 * Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
 *
 * Como métodos de CocheCRUD podemos poner:
 *
 * save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
 *
 * Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
 */
public class Main {

    //static CocheCRUDImpl CocheCRUDImpl;

    public static void main(String[] args) {

        CocheCRUDImpl cocheCRUDImpl = new CocheCRUDImpl();

        System.out.println("Implementacion de Interface -> Implements");
        System.out.println();
        cocheCRUDImpl.save();
        cocheCRUDImpl.findAll();
        cocheCRUDImpl.delete();

    }
}
