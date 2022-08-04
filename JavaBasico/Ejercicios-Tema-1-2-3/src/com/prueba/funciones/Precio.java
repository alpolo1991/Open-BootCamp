package com.prueba.funciones;
/**
 * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */
public class Precio {
    public static void main(String[] args) {

        float iva = 19f;
        float precio = 1200f;

        float resultado = getPrecio(precio, iva);

        System.out.println("El precio con el IVA del "+iva+"% incluido es de: "+resultado);
    }

    public static float getPrecio(float precio, float iva){
        return precio * iva;
    }
}
