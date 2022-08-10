package com.example.arraylist;

import java.util.ArrayList;

public class zArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> listInteger = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            listInteger.add(i);
        }

        for (int i = 0; i <= listInteger.size(); i++) {
            if (listInteger.get(i) % 2 == 0 ) {
                listInteger.remove(i);
            }

        }

        for (int arrayListInt: listInteger) {
            System.out.println("El Array List Final es: "+ arrayListInt);
        }
    }
}
