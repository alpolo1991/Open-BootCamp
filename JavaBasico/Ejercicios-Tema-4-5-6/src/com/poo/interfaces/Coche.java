package com.poo.interfaces;

public class Coche {

    String marca;
    String modelo;
    String color;
    int numeroPuertas;
    int numeroLlantas;
    int cc;

    public Coche(){

    }

    public Coche(String marca, String modelo, String color, int numeroPuertas, int numeroLlantas, int cc) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.numeroLlantas = numeroLlantas;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                ", numeroLlantas=" + numeroLlantas +
                ", cc=" + cc +
                '}';
    }
}
