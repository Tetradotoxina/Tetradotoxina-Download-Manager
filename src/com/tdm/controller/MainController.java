package com.tdm.controller;

import com.tdm.gui.JFrame.JFrameMain;
import com.tdm.gui.JPanel.JPanelLog;
import com.tdm.util.Config;

/**
 *
 * @author tetradotoxina
 */
public class MainController {
    private static JFrameMain frmMain;
    public static JPanelLog log;
    
    public MainController(){
        Config.loadConfig();
        Config.loadLang();
        
        frmMain = new JFrameMain();
        log = frmMain.getLog();    
        
    }
    
    
    public static JFrameMain getFrmMain(){
        return frmMain;
    }

    public void init() {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    
    }
}
