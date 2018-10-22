/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_201;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author ruckenstuhl
 */
public class VelocityTableCellRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int column) {
        Measurment m = (Measurment) o;
        JLabel label = new JLabel();
        label.setOpaque(true);
        double hilfe = m.getGemessen()-m.getErlaubt();
        
        switch(column){
            case 0: label.setText(m.getDate().toString());break;
            case 1: label.setText(m.getTime().toString());break;
            case 2: label.setText(m.getZeichen());break;
            case 3: label.setText(String.valueOf(m.getGemessen()));break;
            case 4: label.setText(String.valueOf(m.getErlaubt()));break;
            case 5: if(hilfe>30){label.setBackground(Color.red);}else if(hilfe>20){label.setBackground(Color.orange);}else if(hilfe>10){label.setBackground(Color.yellow);}else{label.setBackground(Color.blue);}label.setText(String.valueOf(m.getGemessen()-m.getErlaubt()));break;
        }
        
        return label;
    }
        
    
}
