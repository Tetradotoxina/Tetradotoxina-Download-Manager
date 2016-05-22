package com.tdm.controller;

import com.tdm.gui.JFrame.JFrameMain;
import com.tdm.config.Config;
import java.awt.event.ItemEvent;

/**
 *
 * @author tetradotoxina
 */
public class MainController {
    private static JFrameMain frmMain;
    
    public MainController(){
        Config.loadInfo();
        Config.loadConfig();
        Config.loadLang();
        
        frmMain = new JFrameMain();   
    }
    
    
    public static JFrameMain getFrmMain(){
        return frmMain;
    }
    
    public static void log(String msg,String type){        
        frmMain.log(msg,type);
    }
    
    public static void logItemStateChanged(ItemEvent evt,String config,String lang,String def) {
        frmMain.logItemStateChanged(evt,config,lang,def);
    }
   
    
    public void start(){
        frmMain.setSize(900,600);
        frmMain.setLocationRelativeTo(null);
        //frmMain.setVisible(true);
    }
    
    public static void init() {                    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new MainController().start();
            }
        });
    
    }
}
