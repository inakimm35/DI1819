/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author inaki
 */
public class Carrera {
    
    private String nombre;
    private Date fecha;
    private String lugar;
    private int numeroMaxCorredores;
    private HashMap<Integer, Corredor> listaCorredores = new HashMap<>();

    public Carrera(String nombre, Date fecha, String lugar, int numeroMaxCorredores) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.numeroMaxCorredores = numeroMaxCorredores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNumeroMaxCorredores() {
        return numeroMaxCorredores;
    }

    public void setNumeroMaxCorredores(int numeroMaxCorredores) {
        this.numeroMaxCorredores = numeroMaxCorredores;
    }

    public HashMap<Integer, Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(HashMap<Integer, Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", fecha=" + fecha + ", lugar=" + lugar + ", numeroMaxCorredores=" + numeroMaxCorredores + ", listaCorredores=" + listaCorredores + '}';
    }
    
    
    
    
}
