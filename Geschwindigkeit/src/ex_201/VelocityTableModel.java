/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_201;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ruckenstuhl
 */
public class VelocityTableModel extends AbstractTableModel{
    private static String[] colNames = {"Datum","Uhrzeit","Kennzeichen","Gemessen","Erlaubt","Übertretung"};
    
    private ArrayList<Measurment> measurments = new ArrayList<>();
    
    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }
    
    @Override
    public int getRowCount() {
        return measurments.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Measurment m = measurments.get(rowIndex);
        return m;
    }
    
    public void add(Measurment e)
    {
        measurments.add(e);
        fireTableRowsInserted(measurments.size()-1,measurments.size()-1);
    }
    
    public void delete(Measurment e)
    {
        measurments.remove(e);
        fireTableRowsDeleted(0,measurments.size()-1);
    }
    
    public double average(){
        double i = 0;
        for (Measurment m : measurments) {
            i += m.getGemessen()-m.getErlaubt();
        }
        return i/measurments.size();
    }
}
