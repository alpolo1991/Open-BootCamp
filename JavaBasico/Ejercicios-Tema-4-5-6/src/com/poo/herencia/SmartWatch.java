package com.poo.herencia;

import com.poo.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    protected String pulsera;
    protected String tactic;
    protected boolean esclasico;

    public String getPulsera() {
        return pulsera;
    }

    public void setPulsera(String pulsera) {
        this.pulsera = pulsera;
    }

    public String getTactic() {
        return tactic;
    }

    public void setTactic(String tactic) {
        this.tactic = tactic;
    }

    public boolean isEsclasico() {
        return esclasico;
    }

    public void setEsclasico(boolean esclasico) {
        this.esclasico = esclasico;
    }
    public SmartWatch(){

    }

    public SmartWatch(String pulsera, String tactic, boolean esclasico) {
        this.pulsera = pulsera;
        this.tactic = tactic;
        this.esclasico = esclasico;
    }

    public SmartWatch(String fabricante, String marca, String modelo, String procesador, String color, String pulsera, String tactic, boolean esclasico) {
        super(fabricante, marca, modelo, procesador, color);
        this.pulsera = pulsera;
        this.tactic = tactic;
        this.esclasico = esclasico;
    }
}
