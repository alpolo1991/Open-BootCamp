package com.example.textreverse;

import java.util.Scanner;

public class TextReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el texto a revertir: ");
        String textInput = scanner.nextLine();

        ReverseText(textInput);

    }

    public static void ReverseText(String textInput) {

        char caracter[] = new char[textInput.length()];

        for (int i = 0; i < textInput.length(); i++) {
            caracter[i] = textInput.charAt(i);
        }

        for (int j = textInput.length() - 1; j >= 0; j--) {
            System.out.print(caracter[j]);
        }
    }
}
