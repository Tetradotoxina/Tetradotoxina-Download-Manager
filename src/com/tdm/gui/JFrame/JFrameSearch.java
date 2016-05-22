package com.tdm.gui.JFrame;

import com.tdm.db.controller.FilterController;
import com.tdm.gui.JDialog.JDialogAddUrl;
import com.tdm.gui.JPanel.JPanelSearch;
import com.tdm.util.Data;
import com.tdm.util.Method;
import com.tdm.util.RegEx;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author tetradotoxina
 */
public class JFrameSearch extends javax.swing.JFrame {
    private DefaultComboBoxModel modelHost;
    private JDialogAddUrl dlgAddUrl;
    private FilterController filterController;

    public JFrameSearch() {
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
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemCopy = new javax.swing.JMenuItem();
        itemCut = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnNewFilter = new javax.swing.JButton();
        chFilter = new javax.swing.JCheckBox();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        cboHost = new javax.swing.JComboBox<Data>();
        ;
        jButton6 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        cboType = new javax.swing.JComboBox<Data>();
        ;
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jButton2 = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtUrl = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jToolBar3 = new javax.swing.JToolBar();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jLabel3 = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        tabPane = new javax.swing.JTabbedPane();

        itemPaste.setText("Paste");
        jPopupMenu1.add(itemPaste);
        jPopupMenu1.add(jSeparator2);

        itemCopy.setText("Copy");
        jPopupMenu1.add(itemCopy);

        itemCut.setText("Cut");
        jPopupMenu1.add(itemCut);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tetradotoxina Search");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jButton3.setText("Add Url's");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton3);

        jButton4.setText("Generate Url's");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton4);
        jToolBar2.add(jSeparator1);
        jToolBar2.add(filler5);

        btnNewFilter.setText("New Filter");
        btnNewFilter.setFocusable(false);
        btnNewFilter.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNewFilter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnNewFilter);

        chFilter.setText("Filter");
        chFilter.setFocusable(false);
        chFilter.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chFilter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        chFilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chFilterItemStateChanged(evt);
            }
        });
        jToolBar2.add(chFilter);
        jToolBar2.add(filler7);

        cboHost.setEnabled(false);
        cboHost.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboHostItemStateChanged(evt);
            }
        });
        jToolBar2.add(cboHost);

        jButton6.setText("...");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton6);
        jToolBar2.add(jSeparator3);

        jLabel2.setText("Type");
        jToolBar2.add(jLabel2);
        jToolBar2.add(filler2);

        jToolBar2.add(cboType);

        jPanel1.add(jToolBar2, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(filler1);

        jButton2.setText("Add Url");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        btnSearch.setText("Search");
        btnSearch.setFocusable(false);
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnSearch);

        jPanel2.add(jToolBar1, java.awt.BorderLayout.EAST);

        txtUrl.setComponentPopupMenu(jPopupMenu1);
        txtUrl.setMinimumSize(new java.awt.Dimension(300, 19));
        jPanel2.add(txtUrl, java.awt.BorderLayout.CENTER);
        jPanel2.add(filler3, java.awt.BorderLayout.PAGE_START);

        jToolBar3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);
        jToolBar3.add(filler6);

        jLabel3.setText("Url");
        jToolBar3.add(jLabel3);
        jToolBar3.add(filler4);

        jPanel2.add(jToolBar3, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tabPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabPane.setMinimumSize(new java.awt.Dimension(100, 100));
        getContentPane().add(tabPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chFilterItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            cboHost.setEnabled(true);
            showChangeFilter();
        }else{
            cboHost.setEnabled(false);
            loadDefaultType();
        }
    }//GEN-LAST:event_chFilterItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addUrl();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboHostItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHostItemStateChanged
        if(evt.getStateChange()==ItemEvent.DESELECTED){
            showChangeFilter();
        }
    }//GEN-LAST:event_cboHostItemStateChanged

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
            java.util.logging.Logger.getLogger(JFrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewFilter;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<Data> cboHost;
    private javax.swing.JComboBox<Data> cboType;
    private javax.swing.JCheckBox chFilter;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JMenuItem itemCopy;
    private javax.swing.JMenuItem itemCut;
    private javax.swing.JMenuItem itemPaste;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables

    private void init() {
        modelHost=new DefaultComboBoxModel<Data>();
        filterController = new FilterController();
        
        dlgAddUrl = new JDialogAddUrl(this, true);
        
        loadIcons();
        //loadConfig();
        loadLang();
    }

    

    public void loadFilter() {
        String filter = Method.getConfig("config.tdm.search.filter", "1");
        if (filter.length() == 1 && Integer.parseInt(filter) == 1) {
            chFilter.setSelected(true);
        }
    }

    public void loadLang() {
        Method.loadLang(btnNewFilter, "frm.search.new.filter");
        Method.loadLang(chFilter, "frm.search.filter");
        //Method.loadLang(btnClear, "frm.search.clear");

        Method.loadLang(itemPaste, "edit.paste");
        Method.loadLang(itemCopy, "edit.copy");
        Method.loadLang(itemCut, "edit.cut");

        Method.loadLang(txtUrl, "frm.search.input.url", true);
    }

    public void loadLookAndFeel() {
        Method.changeLookAndFeel(this);
    }

    public void loadIcons() {
        //Method.loadIcon(btnItemUrls, "16x16/add_url.png");
        Method.loadIcon(btnSearch, "16x16/refresh.png",false);
        Method.loadIcon(btnNewFilter, "16x16/filter_add.png");

        Method.loadIcon(itemPaste, "16x16/paste.png");

    }

    private void loadDefaultType() {
        cboType.removeAllItems();
        cboType.addItem(new Data(0, Method.getLang("frm.search.type.document", "Image"),RegEx.IMAGE));
        cboType.addItem(new Data(1, Method.getLang("frm.search.type.video", "Gallery"),RegEx.VIDEO));
        cboType.addItem(new Data(2, Method.getLang("frm.search.type.music", "Video"),RegEx.MUSIC));
        cboType.addItem(new Data(3, Method.getLang("frm.search.type.document", "Transmission"),RegEx.TRANSMISSION));
        cboType.addItem(new Data(4, Method.getLang("frm.search.type.document", "Video"),RegEx.VIDEO));
    }

    private void showAddUrl() {
        dlgAddUrl.setSize(600, 400);
        dlgAddUrl.setLocationRelativeTo(null);
        dlgAddUrl.setVisible(true);
    }

    private void showSearch() {       
        if (chFilter.isSelected()) {
            showSearchFilter();
        } else {
            showSearchDefault();
        }

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
        } else {
            loadDefaultType();
        }
    }

    private boolean showSearchValidate(){
        if(txtUrl.getText().equals("")){
            return true;
        }
        
        if(chFilter.isSelected()){
            if(cboHost.getItemCount()==0){
                return true;
            }
            if(cboType.getItemCount()==0){
                return true;
            }
        }
        
        return false;
    }
  

    private void showSearchFilter() {
        if(showSearchValidate()){
            return;
        }
        
        String url = txtUrl.getText();
        int idHost = ((Data)cboHost.getSelectedItem()).getId();
        int idFilter = ((Data)cboType.getSelectedItem()).getId();
    }

    private void showSearchDefault() {
        String url = txtUrl.getText();
        String regex = ((Data)cboType.getSelectedItem()).getValue();
                
    }

    
    private String showLength(String s,int length){
        if(s.length()>length){
            return s.substring(0,length)+"...";
        }else{
            return s;
        }
    }
    
    private void addUrl() {
        String url = txtUrl.getText();
        //is url
        //if(){}
        
        JPanelSearch pSearch=new JPanelSearch();
        pSearch.addInfo();
        pSearch.addUrl(url);
        tabPane.addTab(showLength(url,10),null, pSearch,url);
        
    }

}
