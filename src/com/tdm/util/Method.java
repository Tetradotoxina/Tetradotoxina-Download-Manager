package com.tdm.util;

import com.tdm.controller.MainController;
import com.tdm.gui.JPanel.JPanelLog;
import javax.swing.ImageIcon;

/**
 *
 * @author tetradotoxina
 */
public class Method {

    public static String getDirectory() {
        return System.getProperty("user.dir");
    }

    public static ImageIcon getIcon(String path) {
        try {
            return new ImageIcon(getDirectory() + "/icons/" + Config.getConfig("config.tdm.theme") + "/"+path);

        } catch (Exception e) {
            MainController.log.showLog("", JPanelLog.ERROR_LOG);
            return null;
        }
    }
}
