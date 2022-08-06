package com.poo.herencia;

import com.poo.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    public String tipopantalla;
    public int bateria;
    public boolean escargador;

    public SmartPhone(){

    }

    public SmartPhone(String fabricante, String marca, String modelo, String procesador, String color, String tipopantalla, int bateria, boolean escargador){
        super(fabricante, marca, modelo, procesador, color);
        this.tipopantalla = tipopantalla;
        this.bateria = bateria;
        this.escargador = escargador;
    }
}
