package com.tdm.gui.JDialog;

import com.tdm.db.controller.FilterController;
import com.tdm.gui.model.MyJTable;
import com.tdm.model.DownloadModel;
import com.tdm.util.Data;
import com.tdm.util.Method;
import java.awt.event.ItemEvent;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author tetradotoxina
 */
public class JDialogAddUrl extends javax.swing.JDialog {

    private List<DownloadModel> listDownload;
    private MyJTable tableUrl;
    private FilterController filterController;
    private int urls = 0;
    /**
     * Creates new form JDialogAddUrl
     */
    public JDialogAddUrl(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        itemPaste = new javax.swing.JMenuItem();
        itemCopy = new javax.swing.JMenuItem();
        itemCut = new javax.swing.JMenuItem();
        itemOpenUrl = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemSelected = new javax.swing.JMenuItem();
        itemDeselected = new javax.swing.JMenuItem();
        jToolBar2 = new javax.swing.JToolBar();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        lblUrls = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnAdd = new javax.swing.JButton();
        btnDownload = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnPaste = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnAddUrl = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        chFilter = new javax.swing.JCheckBox();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        cboHost = new javax.swing.JComboBox<Data>();
        ;
        jButton6 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        cboType = new javax.swing.JComboBox<Data>();
        ;
        jScrollPane2 = new javax.swing.JScrollPane();

        itemPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        itemPaste.setText("Paste");
        itemPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPasteActionPerformed(evt);
            }
        });
        jPopupMenu1.add(itemPaste);

        itemCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itemCopy.setText("Copy");
        itemCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCopyActionPerformed(evt);
            }
        });
        jPopupMenu1.add(itemCopy);

        itemCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        itemCut.setText("Cut");
        itemCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCutActionPerformed(evt);
            }
        });
        jPopupMenu1.add(itemCut);

        itemOpenUrl.setText("Open Url");
        itemOpenUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOpenUrlActionPerformed(evt);
            }
        });
        jPopupMenu1.add(itemOpenUrl);
        jPopupMenu1.add(jSeparator2);

        itemSelected.setText("Selected");
        itemSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSelectedActionPerformed(evt);
            }
        });
        jPopupMenu1.add(itemSelected);

        itemDeselected.setText("Deselected");
        itemDeselected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeselectedActionPerformed(evt);
            }
        });
        jPopupMenu1.add(itemDeselected);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.add(filler5);

        lblUrls.setText("Url's (0)");
        jToolBar2.add(lblUrls);
        jToolBar2.add(filler1);

        btnAdd.setText("Add");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAdd);

        btnDownload.setText("Download");
        btnDownload.setFocusable(false);
        btnDownload.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDownload.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });
        jToolBar2.add(btnDownload);

        getContentPane().add(jToolBar2, java.awt.BorderLayout.PAGE_END);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnPaste.setText("Paste");
        btnPaste.setFocusable(false);
        btnPaste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPaste);

        btnCopy.setText("Copy Url's");
        btnCopy.setFocusable(false);
        btnCopy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCopy);
        jToolBar1.add(jSeparator1);

        btnAddUrl.setText("Add Url");
        btnAddUrl.setFocusable(false);
        btnAddUrl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddUrl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUrlActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAddUrl);
        jToolBar1.add(filler2);

        chFilter.setText("Filter");
        chFilter.setFocusable(false);
        chFilter.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chFilter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        chFilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chFilterItemStateChanged(evt);
            }
        });
        jToolBar1.add(chFilter);
        jToolBar1.add(filler4);

        cboHost.setEnabled(false);
        cboHost.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboHostItemStateChanged(evt);
            }
        });
        jToolBar1.add(cboHost);

        jButton6.setText("...");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);
        jToolBar1.add(jSeparator3);

        jLabel2.setText("Type");
        jToolBar1.add(jLabel2);
        jToolBar1.add(filler3);

        cboType.setEnabled(false);
        jToolBar1.add(cboType);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        showAdd(0);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasteActionPerformed
        showPaste();
    }//GEN-LAST:event_btnPasteActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        showCopy();
    }//GEN-LAST:event_btnCopyActionPerformed

    private void itemPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPasteActionPerformed
        showPaste();
    }//GEN-LAST:event_itemPasteActionPerformed

    private void itemCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCopyActionPerformed
        showCopy();
    }//GEN-LAST:event_itemCopyActionPerformed

    private void itemCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCutActionPerformed
        showCut();
    }//GEN-LAST:event_itemCutActionPerformed

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        showAdd(1);
    }//GEN-LAST:event_btnDownloadActionPerformed

    private void chFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chFilterItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cboHost.setEnabled(true);
            cboType.setEnabled(true);
            showChangeFilter();
        } else {
            cboHost.setEnabled(false);
            cboType.setEnabled(false);
        }
    }//GEN-LAST:event_chFilterItemStateChanged

    private void cboHostItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHostItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            showChangeFilter();
        }
    }//GEN-LAST:event_cboHostItemStateChanged

    private void btnAddUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUrlActionPerformed
        showAddUrl();
    }//GEN-LAST:event_btnAddUrlActionPerformed

    private void itemOpenUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpenUrlActionPerformed
        showOpenUrl();
    }//GEN-LAST:event_itemOpenUrlActionPerformed

    private void itemSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSelectedActionPerformed
        showSelected(true);
    }//GEN-LAST:event_itemSelectedActionPerformed

    private void itemDeselectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeselectedActionPerformed
        showSelected(false);
    }//GEN-LAST:event_itemDeselectedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialogAddUrl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogAddUrl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogAddUrl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogAddUrl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogAddUrl dialog = new JDialogAddUrl(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddUrl;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnPaste;
    private javax.swing.JComboBox<Data> cboHost;
    private javax.swing.JComboBox<Data> cboType;
    private javax.swing.JCheckBox chFilter;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JMenuItem itemCopy;
    private javax.swing.JMenuItem itemCut;
    private javax.swing.JMenuItem itemDeselected;
    private javax.swing.JMenuItem itemOpenUrl;
    private javax.swing.JMenuItem itemPaste;
    private javax.swing.JMenuItem itemSelected;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblUrls;
    // End of variables declaration//GEN-END:variables

    private void init() {
        filterController = new FilterController();

        prepareTable();
        loadConfig();
        loadIcons();
        loadLang();
    }

    public void loadConfig() {
        String filter = Method.getConfig("config.tdm.dlg.add.filter", "1");
        if (filter.length() == 1 && Integer.parseInt(filter) == 1) {
            chFilter.setSelected(true);
        }
    }

    public void loadLang() {

        setTitle(Method.getLang("dlg.addurl.title", "About"));

        Method.loadLang(btnCopy, "edit.copy", true);
        Method.loadLang(itemCopy, "edit.copy");
        Method.loadLang(btnPaste, "edit.paste", true);
        Method.loadLang(itemPaste, "edit.paste");
        Method.loadLang(itemCut, "edit.cut");
        
        Method.loadLang(btnAdd, "dlg.addurl.btn.add");
        Method.loadLang(btnDownload, "dlg.addurl.btn.download");
    }

    public void loadIcons() {
        btnPaste.setIcon(Method.getIcon("16x16/paste.png"));
        itemPaste.setIcon(Method.getIcon("16x16/paste.png"));
        btnCopy.setIcon(Method.getIcon("16x16/copy.png"));
        itemCopy.setIcon(Method.getIcon("16x16/copy.png"));
        itemCut.setIcon(Method.getIcon("16x16/cut.png"));
    }

    public void loadLookAndFeel() {
        Method.changeLookAndFeel(this);
    }

    public void loadHost() {
        cboHost.removeAllItems();
        List<Data> list = filterController.getHost(0);
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cboHost.addItem(list.get(i));
            }
        }
    }

    @Override
    public void setVisible(boolean b) {
        if (b == true) {
            tableUrl.removeAllRows();
            listDownload = null;
            loadHost();
            urls=0;
            showInfo(urls);
        }
        super.setVisible(b);
    }

    private void prepareTable() {
        Object[] columns = {"Add", "Name", "Url"};
        Class[] columnTypes = {Boolean.class, String.class, String.class};
        boolean[] columnEditables = {true, true, false};
        int[] preferredWidth = {30, 200, 400};

        tableUrl = new MyJTable();
        tableUrl.addColumns(columns);
        tableUrl.setColumnTypes(columnTypes);
        tableUrl.addColumnEditables(columnEditables);
        tableUrl.setColumnPreferredWidth(preferredWidth);

        tableUrl.getTableHeader().setReorderingAllowed(false);
        tableUrl.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tableUrl);
    }

    private void showAdd(int state) {
        int numRows = tableUrl.getRowCount();

        if (numRows > 0) {

            for (int i = 0; i < numRows; i++) {
                String url = (String) tableUrl.getValueAt(i, 1);
                String name = (String) tableUrl.getValueAt(i, 2);

                DownloadModel model = new DownloadModel();
                model.setUrl(url);

                model.setState(state);
                listDownload.add(model);
            }
        }

        dispose();
    }

    public List<DownloadModel> getListDownload() {
        return listDownload;
    }

    private void showPaste() {
        if (chFilter.isSelected()) {

        } else {
            String paste = Method.getClipboardContents();
            StringTokenizer st = new StringTokenizer(paste, "\n");
            while (st.hasMoreTokens()) {
                String element = (String) st.nextElement();
                //is url
                String name = getName(element);
                tableUrl.addRow(new Object[]{true, name, element});
                urls++;
                showInfo(urls);
            }
        }
    }
    
    private void showInfo(int rows){
        lblUrls.setText("Url's ("+rows+")");
    }

    private void showCopy() {
        int[] selectedRows = tableUrl.getSelectedRows();
        int length=selectedRows.length;
        if (length>0) {            
            String concat="";
            for (int i = 0; i < length; i++) {
                concat+= tableUrl.getValueAt(selectedRows[i],2)+"\n";
            }
            Method.setClipboardContents(concat.trim());
        }
    }

    private void showCut() {

    }

    private void showChangeFilter() {
        if (chFilter.isSelected()) {
            if (cboHost.getItemCount() > 0) {
                int idHost = ((Data) cboHost.getSelectedItem()).getId();

                List<Data> listFilter = filterController.getFilter(idHost);
                cboType.removeAllItems();
                if (listFilter != null) {
                    int size = listFilter.size();
                    for (int i = 0; i < size; i++) {
                        cboType.addItem(listFilter.get(i));
                    }
                }
            }
        }
    }

    private String getName(String element) {
        String name = element.substring(element.lastIndexOf("/") + 1, element.length());

        return name;
    }

    private void showAddUrl() {
        String showInputDialog = null;
        try {
            showInputDialog = JOptionPane.showInputDialog(rootPane, null, "title", JOptionPane.INFORMATION_MESSAGE).trim();

            if (showInputDialog != null || !showInputDialog.equals("")) {
                //is url
                tableUrl.addRow(new Object[]{true, "nombre...", showInputDialog});
            }
        } catch (Exception e) {

        }

        tableUrl.setComponentPopupMenu(jPopupMenu1);
    }

    private void showOpenUrl() {
        int[] selectedRows = tableUrl.getSelectedRows();
        int length = selectedRows.length;
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                int selectedRow = selectedRows[i];
                String url = (String) tableUrl.getValueAt(selectedRow, 2);
                Method.showURL(url);
            }
        }

    }

    private void showSelected(boolean b) {
        int[] selectedRows = tableUrl.getSelectedRows();
        int length = selectedRows.length;
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                int selectedRow = selectedRows[i];
                tableUrl.setValueAt(b, selectedRow, 0);
            }
        }
    }

}
