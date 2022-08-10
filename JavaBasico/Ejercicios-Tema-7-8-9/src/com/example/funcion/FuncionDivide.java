package com.example.funcion;

import java.util.Scanner;

public class FuncionDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Devision de Dos Numeros.");

        System.out.print("Ingrese un numero: ");
        int numeroA = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numeroB = scanner.nextInt();

       try {
           DividePorCero(numeroA, numeroB);
        } catch (ArithmeticException e){
            System.out.println("\n¡No se puede dividir por cero!\nEsto no puede hacerse"+ e);
        }
    }

    public static void DividePorCero(int numeroA, int numeroB) throws ArithmeticException{

        try {
            float resultado = numeroA / numeroB;
            System.out.println("\nDemo de codigo. \nEl resultado es: "+resultado);
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }

    }
}
