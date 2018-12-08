/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import static logica.Utils.sdf;
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

    public void anadirCorredor(Corredor e) {
        listaCorredores.add(e);

    }


    @Override
    public String toString() {
        return "GestionCorredor{" + "listaCorredores=" + listaCorredores + '}';
    }

}
