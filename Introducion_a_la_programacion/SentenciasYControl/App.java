package SentenciasYControl;

/**Ejercios de sentencias y control

En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Ejercicio N1
Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Ejercicio N2
Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.

Ejercicio N3
Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Ejercicio N4
Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Ejercicio N5
Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. 
También habrá que poner un default para cuando el valor de la variable no sea una estación.
*/

public class App {
    public static void main(String[] args) {

        // Se definie variable como entero.
        int numeroIf = 5;
        // Se crea la sentencias para validar.
        if(numeroIf == 0){
            System.out.println("EL numero ingresado es: " + numeroIf);
        }else if(numeroIf < 0){
            System.out.println("EL numero es Negativo es: " + numeroIf);
        }else{
            System.out.println("EL numero es Posativo es: " + numeroIf);
        }
        ////////////////////////////////////////////////////////////////////////
        int numeroWhile = 1;
        while(numeroWhile <= 3){
            System.out.println("El valor de la variable numeroWhile es: " + numeroWhile);
            numeroWhile ++;
        }
        ///////////////////////////////////////////////////////////////////////
        // Segun la condicion solo se repirte una vez se ejecuta el programa.
        int numeroDoWhile = 5;
        do{
            //System.out.println("El valor de la variable numeroDoWhile es: " + numeroWhile);
            
            System.out.println("El valor de la variable numeroDoWhile es: " + numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
            // En caso que numero sema mayor se repirte hasta ese numero en la condicion, si es menor entonces se incremente en uno hasta alcanzar el valor para cumplir la condicion.
        }while(numeroDoWhile <= 5);
        ///////////////////////////////////////////////////////////////////////////
        int numeroFor = 0;
        for (int i = 0; i <= 3; i++){

                System.out.println("El numero de la variable numeroFor es: " + numeroFor);
                numeroFor ++;
        }
        ///////////////////////////////////////////////////////////////////////////
        String estacion = "otono";

        switch(estacion.toLowerCase()){
            case "invierno":
                System.out.println("La estacion del años seleccionado es: " + estacion.toUpperCase());
                break;
            case "primavera":
                System.out.println("La estacion del años seleccionado es: " + estacion.toUpperCase());
                break;
            case "verano":
                System.out.println("La estacion del años seleccionado es: " + estacion.toUpperCase());
                break;
            case "otono":
                System.out.println("La estacion del años seleccionado es: " + estacion.toUpperCase());
                break;
            default:
                System.out.println("La estacion "+ estacion.toUpperCase()+" del años seleccionado no existe.");
        }
    }
}
