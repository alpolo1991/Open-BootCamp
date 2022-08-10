package com.example.arraybidimensional;

public class BiDimensional {
    public static void main(String[] args) {
        int arrayInt[][] = new int[3][5];

        arrayInt[0][0] = 1;
        arrayInt[0][1] = 2;
        arrayInt[0][2] = 3;
        arrayInt[0][3] = 4;
        arrayInt[0][4] = 5;

        arrayInt[1][0] = 10;
        arrayInt[1][1] = 20;
        arrayInt[1][2] = 30;
        arrayInt[1][3] = 40;
        arrayInt[1][4] = 50;

        arrayInt[2][0] = 100;
        arrayInt[2][1] = 200;
        arrayInt[2][2] = 300;
        arrayInt[2][3] = 400;
        arrayInt[2][4] = 500;

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.println("La Posision [ "+i+ "][ "+j+ "] contiene el valor "+ arrayInt[i][j]);
            }
        }
    }
}
