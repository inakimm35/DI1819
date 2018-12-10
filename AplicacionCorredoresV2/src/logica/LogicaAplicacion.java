/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.List;
import modelo.Carrera;
import modelo.Corredor;

/**
 *
 * @author Iñaki
 */
public class LogicaAplicacion {
      private List<Carrera> listaCarreras =new ArrayList<>();
        private List<Corredor> listaCorredores =new ArrayList<>();

    public Corredor getCorredorSeleccionado() {
        return corredorSeleccionado;
    }

    public void setCorredorSeleccionado(Corredor corredorSeleccionado) {
        this.corredorSeleccionado = corredorSeleccionado;
    }

    public Carrera getCarreraSeleccionada() {
        return carreraSeleccionada;
    }

    public void setCarreraSeleccionada(Carrera carreraSeleccionada) {
        this.carreraSeleccionada = carreraSeleccionada;
    }
        private Corredor corredorSeleccionado;
        private Carrera carreraSeleccionada;
        

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    public List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(List<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    @Override
    public String toString() {
        return "LogicaAplicacion{" + "listaCarreras=" + listaCarreras + ", listaCorredores=" + listaCorredores + '}';
    }
        
        
}
