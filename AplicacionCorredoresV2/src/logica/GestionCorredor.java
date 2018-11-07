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

    public void tokenizar(String linea) throws ParseException {
        StringTokenizer tokens = new StringTokenizer(linea, ",");

        while (tokens.hasMoreTokens()) {
            String dni = tokens.nextToken();
            String nom = tokens.nextToken();
            String apel = tokens.nextToken();
            String fecha = tokens.nextToken();
            Date date = sdf.parse(fecha);
            String direccion = tokens.nextToken();
            int telefono = Integer.parseInt(tokens.nextToken());
            Corredor corredor = new Corredor(dni, nom, apel, date, direccion, telefono);
            System.out.println(corredor.toString());
            listaCorredores.add(corredor);

        }
    }

    public void leerCSV() {

        try {
            FileReader fr = null;
            listaCorredores.clear();
            fr = new FileReader("corredores.csv");
            BufferedReader registro = new BufferedReader(fr);
            //BufferedReader registro = new BufferedReader(new FileReader("c:/ficheros/libros.csv"));
            //leemos el primer registro
            String cadena = registro.readLine();
            while (cadena != null) {
                tokenizar(cadena);
                //leemos el siguiente registro
                cadena = registro.readLine();
            }

        } catch (IOException ex) {
            Logger.getLogger(GestionCorredor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(GestionCorredor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void grabarFicheroCSV() throws IOException {

        FileWriter fw = null;
        try {
            fw = new FileWriter("corredores.csv");
            BufferedWriter fsalida = new BufferedWriter(fw);
            for (Corredor c : listaCorredores) {
                fsalida.write(c.toStringCSV());
                fsalida.write("\n");

            }

            fsalida.close();
        } catch (IOException ex) {
            Logger.getLogger(GestionCorredor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        return "GestionCorredor{" + "listaCorredores=" + listaCorredores + '}';
    }

}
