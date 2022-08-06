package com.poo.clases;

public class SmartDevice {
    /*
    *   En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
    *   Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    *   Crear constructor vacío y con todos los parámetros para cada clase.
    *   Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
    */

    public String fabricante;
    public String marca;
    public String modelo;
    public String procesador;
    public String color;

    public SmartDevice(){

    }

    public SmartDevice(String fabricante, String marca, String modelo, String procesador, String color) {
        this.fabricante = fabricante;
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.color = color;
    }

}
