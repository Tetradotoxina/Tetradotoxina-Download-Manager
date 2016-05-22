package com.tdm.config;

import com.tdm.util.Method;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tetradotoxina
 */
public class Config {

    private static Properties Config;
    private static Properties Lang;
    private static Properties Info;

    public static Properties getConfig() {
        if (Config == null) {
            loadConfig();
        }
        return Config;
    }

    public static Properties getLang() {
        if (Lang == null) {
            loadLang();
        }
        return Lang;
    }

    public static void loadConfig() {
        Config = new Properties();
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(Method.getDirectory() + "/.config.properties");
            
            Config.load(inputStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void loadLang() {
        Lang = new Properties();
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(Method.getDirectory() + "/lang/" + Method.getConfig("config.tdm.lang","en-EN"));
           
            Lang.load(inputStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static void loadInfo() {
        Info = new Properties();
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(Method.getResource("/com/tdm/config/Info.properties"));
            
            Info.load(inputStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void saveConfig() {
        FileOutputStream os;
        try {
            os = new FileOutputStream(Method.getDirectory() + "/.config.properties");
            Config.store(os, "Configuration file");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String getLang(String key) {
        return Lang.getProperty(key);
    }

    public static void setLang(String key, String value) {
        Lang.setProperty(key, value);
    }

    public static String getConfig(String key) {
        return Config.getProperty(key);
    }

    public static void setConfig(String key, String value) {
        Config.setProperty(key, value);
        saveConfig();
    }

    public static String getInfo(String key) {
       return Info.getProperty(key);
    }
}
