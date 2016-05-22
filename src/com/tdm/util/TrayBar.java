package com.tdm.util;

import com.tdm.config.Config;
import com.tdm.controller.MainController;
import com.tdm.gui.JPanel.Log;
import java.awt.AWTException;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tetradotoxina
 */
public class TrayBar {

    private SystemTray tray;
    private TrayIcon trayIcon;
    private MenuItem showItem;
    private MenuItem itemSearch;
    private MenuItem itemSettings;
    private MenuItem itemAbout;
    private MenuItem itemExit;

    public TrayBar() {
        initComponent();
    }

    private void initComponent() {
        if (!SystemTray.isSupported()) {
            MainController.log(Method.getLang("traybar.msg.warning",""), Log.WARNING_LOG);
            Config.setConfig("config.tdm.traybar", "0");
            return;
        } else {
            Config.setConfig("config.tdm.traybar", "1");
        }

        final PopupMenu popup = new PopupMenu();

        trayIcon = new TrayIcon(Method.getIcon("128x128/tdm.png").getImage());
        tray = SystemTray.getSystemTray();

        // Create a pop-up menu components
        showItem = new MenuItem(Method.getLang("traybar.hide", "Hide"));        
        itemSearch = new MenuItem(Method.getLang("frm.main.item.search", "Search"));
          
        itemSettings = new MenuItem(Method.getLang("frm.main.item.settings", "Settings"));  
        itemAbout = new MenuItem(Method.getLang("frm.main.item.about", "About"));
        itemExit = new MenuItem(Method.getLang("frm.main.item.exit", "Hide"));

        showItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                showMain();
            }
        });

        itemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //Add components to pop-up menu
        popup.add(showItem);
        popup.addSeparator(); 
        popup.add(itemSearch);             
        popup.add(itemSettings);
        popup.addSeparator(); 
        popup.add(itemAbout);
        popup.addSeparator();
        popup.add(itemExit);

        trayIcon.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2){
                    showMain();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip(Config.getInfo("info.product"));
        trayIcon.setPopupMenu(popup);
    }
    
   
    
    public void loadLang(){
        Method.loadLang(showItem,"traybar.hide");
        Method.loadLang(itemSearch, "frm.main.item.search");
        
        Method.loadLang(itemSettings, "frm.main.item.settings");
        Method.loadLang(itemExit, "frm.main.item.exit");
    }

    
    private void showMain() {
        if (MainController.getFrmMain().isVisible() == false) {
            Method.loadLang(showItem, "traybar.hide");
            MainController.getFrmMain().setVisible(true);
        } else {
            Method.loadLang(showItem, "traybar.visible");
            MainController.getFrmMain().setVisible(false);
        }
    }

    public void setVisible(boolean b) {
        if (b == true) {
            try {
                tray.add(trayIcon);
            } catch (AWTException ex) {
                MainController.log("", Log.ERROR_LOG);
                Logger.getLogger(TrayBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            tray.remove(trayIcon);
        }

    }
    
    public void addSearchActionListener(ActionListener[] actionListeners) {
        for (ActionListener actionListener : actionListeners) {
            itemSearch.addActionListener(actionListener);            
        }
        
    }
    
    public void addSettingsActionListener(ActionListener[] actionListeners){
        for (ActionListener actionListener : actionListeners) {
            itemSettings.addActionListener(actionListener);            
        }
    }
    public void addAboutAcctionListener(ActionListener[] actionListeners){
        for (ActionListener actionListener : actionListeners) {
            itemAbout.addActionListener(actionListener);            
        }
    }

}
