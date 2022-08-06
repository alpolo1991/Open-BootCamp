package com.poo.interfaces;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Implementacion de save().");
    }

    @Override
    public void findAll() {
        System.out.println("Implementacion de findAll().");
    }

    @Override
    public void delete() {
        System.out.println("Implementacion de delete()");
    }
}
