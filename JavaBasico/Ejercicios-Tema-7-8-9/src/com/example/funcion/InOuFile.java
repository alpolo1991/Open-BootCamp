package com.example.funcion;

import java.io.*;

public class InOuFile {
    public static void main(String[] args) {
        // Variable ruta Archivo Input
        String FileInput = "C:\\Users\\AGP\\Downloads\\Ope.py";
        // Variable Ruta Archivo de Salida o Copia del Archivo Original.
        String FileOut = "C:\\Users\\AGP\\Downloads\\copia.txt";

        // Funcion que realiza el proceso.
        FileInOu(FileInput, FileOut);
    }

    public static void FileInOu(String fileIn, String fileOut){
        try {
            InputStream ficheroIn = new FileInputStream(fileIn);
            try {
                byte[] byteData = ficheroIn.readAllBytes();

                for (byte bytesData: byteData) {
                    System.out.print((char)bytesData);
                }

                // Vamos a copiar los datos del archivo dado como Input
                PrintStream fileInOut = new PrintStream(fileOut);
                fileInOut.write(byteData);
                System.out.println("La Copia se realizo Exitosamente");
                ficheroIn.close();

            } catch (IOException e) {
                System.out.println("Error al leer el archivo.\n"+ e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: No se pudo abrir el archivo. \n"+ e.getMessage());
        }
    }
}
