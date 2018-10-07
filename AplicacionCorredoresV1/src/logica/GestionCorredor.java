/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.List;
import modelo.Corredor;

/**
 *
 * @author alumnop
 */
public class GestionCorredor {
    
    private List<Corredor> listaCorredores = new ArrayList<>();

    public GestionCorredor() {
    }

    public List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(List<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    public void anadirCorredor(Corredor e){
        listaCorredores.add(e);
    
    }
    
    @Override
    public String toString() {
        return "GestionCorredor{" + "listaCorredores=" + listaCorredores + '}';
    }
    
    
    
    
}
