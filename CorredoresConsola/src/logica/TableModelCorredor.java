/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Corredor;

/**
 *
 * @author alumnop
 */

public class TableModelCorredor extends AbstractTableModel 
{
    private final List<Corredor> listaCorredores;
    private final String[] columnas = {"Nombre","DNI"};
    
    public TableModelCorredor(List<Corredor> listaCorredores)
    {
        this.listaCorredores = listaCorredores;
    }
    
    //Devuelve el número de filas que tendrá nuestra tabla. Depende del
    //tamaño de la lista
    @Override
    public int getRowCount() {
        return listaCorredores.size();
    }

    //Devuelve el número de columnas
    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    //Devuelve la columna correspondiente al índice
    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    //Este método se llamará una vez por cada una de las celdas que tenga la tabla
    //Evidentemente el número de llamadas a este método depende de lo que haya
    //devuelto la clase en getRowCount y getColumnCount.
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex)
        {
            case 0:
                return listaCorredores.get(rowIndex).getNombre();
            case 1:
                return listaCorredores.get(rowIndex).getDni();
        }  
        return null;
    }
    
}

