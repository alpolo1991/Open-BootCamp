import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 *
 * Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
 *
 * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
 * Elimina el 2o y 3er elemento y muestra el resultado final.
 *
 * Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
 *
 * Crea un ArrayList de tipo String, con 4 elementos.
 * Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
 *
 * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
 * A continuación, con otro bucle, recórrelo y elimina los numeros pares.
 * Por último, vuelve a recorrerlo y muestra el ArrayList final.
 * Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 *
 * Crea una función DividePorCero.
 * Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
 * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
 * Finalmente, mostraremos en cualquier caso: "Demo de código".
 *
 * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
 * La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
 *
 * Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */

public class Main {
    public static void main(String[] args) {
        // Variable ruta Archivo Input
        String xFileInput = "C:\\Users\\AGP\\Downloads\\Ope.py";
        // Variable Ruta Archivo de Salida o Copia del Archivo Original.
        String xFileOut = "C:\\Users\\AGP\\Downloads\\copia.txt";

        // Datos de Busqueda
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el caracter a buscar: ");
        String xSearchCaracter = scanner.nextLine();

        RemplaceCaracter(xSearchCaracter, xFileInput, xFileOut);
    }

    public static void RemplaceCaracter(String textSearch, String fileIn, String fileOut) {
        /**
         *
         * Busca un Caracter por consola.
         * Si encuentra el carcate lo elimina y en esa posiscion agrega el nuevo que se le pase por teclado.
         */
        try {
            InputStream ficheroIn = new FileInputStream(fileIn);
            try {
                byte[] byteData = ficheroIn.readAllBytes();

                // Mostramos por pantalla los datos que tiene el Archivo.
                //for (byte bytesData: byteData) {
                    //System.out.print((char)bytesData);
                //}
                ArrayList<String> xCaracter = new ArrayList<>();
                System.out.println("Datos Antes de Modificarse el Archivo.");
                for (int i = 0; i <= byteData.length -1; i++) {
                    System.out.print((char)byteData[i]);
                    xCaracter.add(String.valueOf((char)byteData[i]));
                }

                // Datos de a Reemplazar
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese el caracter por el cual se va reemplazar: ");
                String xTextReplace = scanner.nextLine();
                int j = 0;
                for (int i = 0; i < xCaracter.size(); i++) {
                    if (xCaracter.get(i).equals(textSearch)) {
                        xCaracter.remove(i);
                        xCaracter.add(i, xTextReplace);
                        j += 1;
                    }
                }

                if (j > 0) {
                    System.out.println("Se encontraron "+j+" Caracteres que coincide con la busqueda.");
                    System.out.println("Se agregara el caractar "+ xTextReplace.toUpperCase());
                    System.out.println();
                    System.out.println("Los datos modificados se mostraran a continuacion");

                    // Copiamos los datos del archivo dado
                    PrintStream fileInOut = new PrintStream(fileOut);
                    for (int i = 0; i < xCaracter.size(); i++) {
                        fileInOut.print(xCaracter.get(i));
                        System.out.print(xCaracter.get(i));
                    }

                    System.out.println("Se Realiza Copia Exitosamente");
                } else {
                    System.out.println("No se encontraron caracteres");
                }

                // Cerramos el Fichero
                ficheroIn.close();

            } catch (IOException e) {
                System.out.println("Error al leer el archivo.\n"+ e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: No se pudo abrir el archivo. \n"+ e.getMessage());
        }
    }
}