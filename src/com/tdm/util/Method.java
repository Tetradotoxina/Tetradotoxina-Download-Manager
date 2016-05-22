package com.tdm.util;

import com.tdm.config.Config;
import com.tdm.controller.MainController;
import com.tdm.gui.JDialog.JDialogAddUrl;
import com.tdm.gui.JPanel.Log;
import java.awt.Desktop;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author tetradotoxina
 */
public class Method {

    public static String getDirectory() {
        return System.getProperty("user.dir");
    }

    public static String getOS() {
        return System.getProperty("os.name");
    }

    public static String getOSArch() {
        return System.getProperty("os.arch");
    }

    public static String getOSVersion() {
        return System.getProperty("os.version");
    }

    public static String getUserHome() {
        return System.getProperty("user.home");
    }

    public static void showURL(final String url) {
        MainController.log(Method.getLang("msg.url.open","Open..")+" "+url, Log.INFO_LOG);
    
        if (Desktop.isDesktopSupported()) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Desktop dk = Desktop.getDesktop();
                    try {
                        dk.browse(new URI(url));
                        MainController.log(Method.getLang("msg.url.success","") + " " + url, Log.SUCCESS_LOG);
                    } catch (IOException ex) {
                        MainController.log(Method.getLang("msg.url.error","") + " " + url, Log.ERROR_LOG);
                        Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (URISyntaxException ex) {
                        MainController.log(Method.getLang("msg.url.error","") + " " + url, Log.ERROR_LOG);
                        Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });

        }
    }

    public static void showDirectory(final String url) {
        MainController.log(Config.getLang("msg.directory.open") + " " + url, Log.INFO_LOG);
        if (Desktop.isDesktopSupported()) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Desktop dk = Desktop.getDesktop();
                    try {
                        dk.open(new File(url));
                        MainController.log(Config.getLang("msg.directory.success") + " " + url, Log.SUCCESS_LOG);
                    } catch (IOException ex) {
                        MainController.log(Config.getLang("msg.directory.error") + " " + url, Log.ERROR_LOG);
                        Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            });

        }
    }

    public static String getResource(String path) {
        File file = new File(Toolkit.getDefaultToolkit().getClass().getResource(path).getFile());
        if (file.exists()) {
            return file.getPath();
        } else {
            return null;
        }
    }

    public static ImageIcon getIcon(String path) {

        File file = new File(getDirectory() + "/icons/" + Config.getConfig("config.tdm.theme") + "/" + path);
        if (file.exists()) {
            return new ImageIcon(file.getPath());
        } else {
            return null;
        }
    }

    public static void changeLookAndFeel(JDialog dlg) {
        try {
            String lookAndFeel = Config.getConfig("config.tdm.lookandfeel.class");
            if (lookAndFeel != null) {
                UIManager.setLookAndFeel(lookAndFeel);
                SwingUtilities.updateComponentTreeUI(dlg);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void changeLookAndFeel(JFrame frm) {
        try {
            String lookAndFeel = Config.getConfig("config.tdm.lookandfeel.class");
            if (lookAndFeel != null) {
                UIManager.setLookAndFeel(lookAndFeel);
                SwingUtilities.updateComponentTreeUI(frm);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void setClipboardContents(String aString) {
        StringSelection stringSelection = new StringSelection(aString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    public static String getClipboardContents() {
        String result = "";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        //odd: the Object param of getContents is not currently used
        Transferable contents = clipboard.getContents(null);
        boolean hasTransferableText
                = (contents != null)
                && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
        if (hasTransferableText) {
            try {
                result = (String) contents.getTransferData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException ex) {
                Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
    
    
    public static String getConfig(String key, String def) {
        String config = Config.getConfig(key);
        if(config!=null){
            return config;
        }else{
            return def;
        }
    }
    
    public static String loadLang(String key, String defaultText) {
        String lang = Config.getLang(key);
        if(!lang.equals("")){
            return lang;
        }else{
            return defaultText;
        }
        
    }
    
    public static void loadLang(JMenu component, String key) {
        String lang = Config.getLang(key);
        if (lang != null) {
            component.setText(lang);
        }
    }

    public static void loadLang(MenuItem component, String key) {
        String lang = Config.getLang(key);
        if (lang != null) {
            component.setLabel(lang);
        }
    }

    public static void loadLang(JMenuItem component, String key) {
        String lang = Config.getLang(key);
        if (lang != null) {
            component.setText(lang);
        }
    }

    public static void loadLang(JRadioButtonMenuItem component, String key) {
        String lang = Config.getLang(key);
        if (lang != null) {
            component.setText(lang);
        }
    }

    public static void loadLang(JCheckBoxMenuItem component, String key) {
        String lang = Config.getLang(key);
        if (lang != null) {
            component.setText(lang);
        }
    }

    public static void loadLang(JButton component, String key) {
        String lang = Config.getLang(key);
        if (lang != null) {
            component.setText(lang);
        }
    }

    public static void loadLang(JButton component, String key, boolean tooltip) {
        String lang = Config.getLang(key);
        if (lang != null) {
            if (tooltip == true) {
                component.setToolTipText(lang);
                component.setText("");
            } else {
                component.setToolTipText(lang);
                component.setText(lang);
            }
        }
    }

    public static void loadLang(JCheckBox component, String key) {
        String lang = Config.getLang(key);
        if (lang != null) {
            component.setText(lang);
        }
    }

    public static void loadLang(JLabel component, String key) {
        String lang = Config.getLang(key);
        if (lang != null) {
            component.setText(lang);
        }
    }

    public static void loadLang(JLabel component, String key, boolean tooltip) {
        String lang = Config.getLang(key);
        if (lang != null) {
            if (tooltip == true) {
                component.setToolTipText(lang);
                component.setText("");
            } else {
                component.setText(lang);
                component.setText(lang);
            }
        }
    }

    public static void loadLang(JTextField component, String key, boolean tooltip) {
        String lang = Config.getLang(key);
        if (lang != null) {
            if (tooltip == true) {
                component.setToolTipText(lang);
                component.setText("");
            } else {
                component.setText(lang);
                component.setText(lang);
            }
        }
    }

    public static String getLang(String key, String def) {
        String lang = Config.getLang(key);
        if (lang != null) {
            return lang;
        } else {
            return def;
        }
    }

    public static String getInfo(String key, String def) {
        String lang = Config.getInfo(key);
        if (lang != null) {
            return lang;
        } else {
            return def;
        }
    }

    public static void loadIcon(JButton component, String path) {
        ImageIcon icon = Method.getIcon(path);
        if (icon != null) {
            component.setIcon(icon);
        }
    }

    public static void loadIcon(JButton component, String path, boolean text) {
        ImageIcon icon = Method.getIcon(path);
        if (icon != null) {
            component.setIcon(icon);
            if (text == false) {
                component.setText("");
            }
        }
    }

    public static void loadIcon(JMenuItem component, String path) {
        ImageIcon icon = Method.getIcon(path);
        if (icon != null) {
            component.setIcon(icon);
        }
    }

    public static void loadIcon(JRadioButtonMenuItem component, String path) {
        ImageIcon icon = Method.getIcon(path);
        if (icon != null) {
            component.setIcon(icon);
        }
    }

    public static void loadIcon(JCheckBox component, String path) {
        ImageIcon icon = Method.getIcon(path);
        if (icon != null) {
            component.setIcon(icon);
        }
    }

    public static String getPath(String path) {
        File file = new File(path);
        if(file.exists()){
            return file.getPath();
        }else{
            file.mkdirs();
            return file.getPath();
        }
    }

    

    

}
