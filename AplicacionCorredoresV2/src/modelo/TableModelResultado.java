/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iñaki
 */
public class TableModelResultado extends AbstractTableModel {

    private final List<Resultado> listaResultado;
    private final String[] columnas = {"Nombre", "Apellido", "Dorsal", "Posicion", "Tiempo"};

    public TableModelResultado(List<Resultado> listaResultado) {
        this.listaResultado = listaResultado;
    }

    //Devuelve el número de filas que tendrá nuestra tabla. Depende del
    //tamaño de la lista
    @Override
    public int getRowCount() {
        return listaResultado.size();
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
        switch (columnIndex) {
            case 0:
                return listaResultado.get(rowIndex).getC().getNombre();
            case 1:
                return listaResultado.get(rowIndex).getC().getApellido();
            case 2:
                return listaResultado.get(rowIndex).getDorsal();
            case 3:
                return listaResultado.get(rowIndex).getPosicion();
            case 4:
                return listaResultado.get(rowIndex).getTiempo();

        }
        return null;
    }

}
