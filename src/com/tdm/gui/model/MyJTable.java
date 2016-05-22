package com.tdm.gui.model;

import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author tetradotoxina
 */
public class MyJTable extends JTable {

    private DefaultTableModel model;
    //private Object[] columnTitles;
    private Class[] columnTypes;
    private boolean[] columnEditables;
    private boolean[] columnToolTips;
    //private int[] columnRender;

    private boolean progress = false;
    private boolean comboBox = false;

    public MyJTable() {
        model = new DefaultTableModel();
        setModel(model);
    }

    public MyJTable(Object[] columnNames) {
        model = new DefaultTableModel(null, columnNames);
        setModel(model);
    }

    public MyJTable(Object[][] data, Object[] columnNames) {
        model = new DefaultTableModel(data, columnNames);
        setModel(model);
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        if (columnTypes != null) {
            return columnTypes[columnIndex];
        } else {
            return super.getColumnClass(columnIndex);
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if (columnEditables != null) {
            return columnEditables[column];
        } else {
            return super.isCellEditable(row, column);
        }
    }

    @Override
    public String getToolTipText(MouseEvent e) {
        if (columnToolTips != null) {
            String tip = null;
            Point p = e.getPoint();
            int rowIndex = rowAtPoint(p);
            int colIndex = columnAtPoint(p);

            if (columnToolTips[colIndex]) {
                tip = super.getValueAt(rowIndex, colIndex).toString();
            }
            return tip;
        } else {
            return super.getToolTipText(e);
        }
    }

    @Override
    public void setValueAt(Object aValue, int row, int column) {
        model.setValueAt(aValue, row, column);
    }

    @Override
    public Object getValueAt(int row, int column) {
        return model.getValueAt(row, column);
    }

    public void addColumns(Object[] columns) {
        for (int i = 0; i < columns.length; i++) {
            model.addColumn(columns[i]);
        }
    }

    public void addColumnEditables(boolean[] columnEditables) {
        this.columnEditables = columnEditables;
    }

    public void setColumnPreferredWidth(int[][] preferredWidth) {
        for (int[] preferred : preferredWidth) {
            setColumnPreferredWidth(preferred[0], preferred[1]);
        }
    }

    public void setColumnPreferredWidth(int[] preferredWidth) {
        for (int i = 0; i < preferredWidth.length; i++) {
            setColumnPreferredWidth(i, preferredWidth[i]);
        }
    }

    public void setColumnPreferredWidth(int column, int width) {
        getColumnModel().getColumn(column).setPreferredWidth(width);
    }

    public void setColumnTypes(Class[] columnTypes) {
        this.columnTypes = columnTypes;
    }

    public void addRow(Object[] obj) {

        model.addRow(obj);
    }

    public void addRow(Object[] obj, int columnProgress[]) {
        model.addRow(obj);

        if (progress) {
            TableColumn column = getColumnModel().getColumn(1);
            column.setCellRenderer(new ProgressRenderer());
        }
    }

    public void removeAllRows() {
        int rowCount = model.getRowCount();

        while (rowCount > 0) {
            removeRow(rowCount - 1);
            rowCount--;
        }
    }

    public void removeRow(int row) {
        model.removeRow(row);
    }

    public void setJProgressBar(boolean b) {
        progress = b;
    }

    public void setJComboBox(boolean b) {
        comboBox = b;
    }

}
