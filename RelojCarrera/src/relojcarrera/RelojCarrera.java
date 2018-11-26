/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojcarrera;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author alumnop
 */
public class RelojCarrera extends JLabel implements Serializable {

    private double segundos;
    private double contador;
    private Color colorFondo;
    private boolean decimalSiNo;
    private int tiempoActualizacion;

    private ArrayList<AnadirCorredorListener> listenerCorredor;

    public RelojCarrera() {
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (AnadirCorredorListener listener : listenerCorredor) {
                    listener.ejecutar();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
    
    
    
    public void start() {

        contador = segundos;
        setText(Double.toString(segundos));
        Timer timer = new Timer();

        if (decimalSiNo) {
            tiempoActualizacion = 10;
        } else {
            tiempoActualizacion = 1000;
        }

        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                if (decimalSiNo) {

                    setText(String.format("%.1f", contador += 0.1));

                } else {

                    setText(Integer.toString((int) contador++));
                }
              
            }

        }, 0, tiempoActualizacion);
    }
    
    public boolean addListeners(AnadirCorredorListener... listeners){
        return this.listenerCorredor.addAll(Arrays.asList(listeners));
    }

    public void ejecutarListeners(){
        for (AnadirCorredorListener anadirCorredorListener : listenerCorredor) {
            
        }
    }
    public void finalizar() {
        
     
    }
}
