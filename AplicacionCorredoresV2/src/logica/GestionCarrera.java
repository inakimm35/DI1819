/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.List;
import modelo.Carrera;


/**
 *
 * @author inaki
 */
public class GestionCarrera {
    
    private List<Carrera> listaCarreras =new ArrayList<>();

    public GestionCarrera() {
    }

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    public void anadirCarrera(Carrera e){
        listaCarreras.add(e);
    
    }
    
    @Override
    public String toString() {
        return "GestionCarrera{" + "listaCarreras=" + listaCarreras + '}';
    }

    
    
}
