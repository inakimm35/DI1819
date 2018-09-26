/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author inaki
 */
public class MainGestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {
        // TODO code application logic here
        
        GestionCorredores contro = new GestionCorredores();
        contro.menu();
    }
    
}
