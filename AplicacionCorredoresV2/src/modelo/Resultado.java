/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alumnop
 */
public class Resultado {
    
    private Corredor c;
    private int dorsal;
    private int posicion;
    private double tiempo;

    public Resultado(Corredor c, int dorsal, int posicion, double tiempo) {
        this.c = c;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.tiempo = tiempo;
    }

    public Corredor getC() {
        return c;
    }

    public void setC(Corredor c) {
        this.c = c;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

   

    @Override
    public String toString() {
        return "Resultado{" + "c=" + c + ", dorsal=" + dorsal + ", posicion=" + posicion + ", tiempo=" + tiempo + '}';
    }

   
    
    
    
}
