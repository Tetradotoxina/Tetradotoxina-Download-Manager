package com.tdm.gui.model;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author tetradotoxina
 */
public class ProgressRenderer extends DefaultTableCellRenderer{
    private JProgressBar progressBar;

    public ProgressRenderer() {        
        progressBar = new JProgressBar(0,100);        
        setOpaque(true);        
        progressBar.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Integer i = (Integer) value;
        String text = "Completed";
        if (i < 0) {
            text = "Error";
        } else if (i < 100) {
            progressBar.setValue(i);
            return progressBar;
        }
        super.getTableCellRendererComponent(table, text, isSelected, hasFocus, row, column);
        return this;
    }
    
    public JProgressBar progressBar(){
        return progressBar;
    }   
}
