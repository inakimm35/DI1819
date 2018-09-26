/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Corredor;

/**
 *
 * @author inaki
 */
public class GestionCorredores {

    private Corredor corredor;
    private HashMap<String, Corredor> listaCorredores = new HashMap<String, Corredor>();
    private Scanner teclado = new Scanner(System.in);
    private int opcion;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
    
    public void menu() throws IOException{

        boolean a = false;

        while (!a) {

            System.out.println('\n' + "////////MENU////////");
            System.out.println("Opción 1 - Cargar CSV anterior");
            System.out.println("Opción 2 - Alta corredor");
            System.out.println("Opción 3 - Baja corredor");
            System.out.println("Opción 4 - Modificar corredor");
            System.out.println("Opción 5 - Guardar CSV modificado");
            System.out.println("Opción 6 - Mostrar corredores ordenados por fecha nacimiento");
            System.out.println("Opción 7 - Salir" + '\n');

            opcion = teclado.nextInt();
            try {
                switch (opcion) {

                    case 1:
                        leerCSV();
                        break;
                    case 2:
                        System.out.println("Introduce nombre:");
                        String asd = teclado.next();
                        System.out.println("Introduce apellido:");
                        String asf = teclado.next();
                        System.out.println("Introduce DNI:");
                        String dni = teclado.next();
                        System.out.println("Introduce fecha nacimiento (dd/mm/aa):");
                        String fecha = teclado.next(); 
                        Date date = null;
                try {
                    date = sdf.parse(fecha);
                } catch (ParseException ex) {
                    Logger.getLogger("formato de fecha erroneo, introduce elemento del tipo (dd/mm/aa)");
                }
                        System.out.println("Introduce dirección:");
                        String direccion = teclado.next();
                        System.out.println("Introduce teléfono:");
                        int tfono = teclado.nextInt();

                        Corredor nuevo = new Corredor(dni, asd, asf, date, direccion, tfono);

                        listaCorredores.put(dni, nuevo);
                        System.out.println(listaCorredores.toString());
                        break;
                    case 3:

                        System.out.println("Introduce DNI del corredor: ");
                        String nP = teclado.next();

                        if (listaCorredores.containsKey(nP)) {
                            listaCorredores.remove(nP);
                        } else {
                            System.out.println("El corredor no está en el sistema, imposible borrar.");
                        }

                        break;
                    case 4:

                        break;
                    case 5:
                        grabarFicheroCSV();
                        break;
                    case 6:

                        break;
                    case 7:
                        System.out.println("Fin del programa");
                        a = true;
                        break;

                    default:
                        System.out.println("Opcion incorrecta.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Formato no válido. Debes insertar un numero entre 1 y 8");
                teclado.next();
            }
        }
    }

public void tokenizar(String linea) throws ParseException{
        StringTokenizer tokens = new StringTokenizer(linea, ",");

        while(tokens.hasMoreTokens()){
            String dni =tokens.nextToken();
            String nom = tokens.nextToken() ;
            String apel = tokens.nextToken();
            String fecha = tokens.nextToken();
                        Date date = sdf.parse(fecha);
            String direccion = tokens.nextToken();
            int   telefono = Integer.parseInt(tokens.nextToken());
            corredor= new Corredor (dni,nom,apel,date,direccion,telefono);
            System.out.println(corredor.toString());
            listaCorredores.put(dni, corredor);
            
        }   
    }
        

public  void leerCSV() {

      
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
           
    }   catch (IOException ex) {
            Logger.getLogger(GestionCorredores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(GestionCorredores.class.getName()).log(Level.SEVERE, null, ex);
        }

}

public void grabarFicheroCSV () throws IOException {

        FileWriter fw = null;
        try {
            fw = new FileWriter("corredores.csv");
            BufferedWriter fsalida = new BufferedWriter(fw);
            //BufferedReader registro = new BufferedReader(new FileReader("c:/ficheros/libros.csv"));
            //leemos el primer registro
            for (Map.Entry e : listaCorredores.entrySet()) {
                fsalida.write(e.getValue().toString());
                fsalida.write("\n");
            }   
        
        
        fsalida.close();
        } catch (IOException ex) {
            Logger.getLogger(GestionCorredores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}



