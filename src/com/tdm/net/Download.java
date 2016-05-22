package com.tdm.net;

import com.tdm.controller.MainController;
import com.tdm.gui.JPanel.Log;
import com.tdm.model.DownloadModel;
import com.tdm.util.Method;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tetradotoxina
 */
public class Download {

    DownloadModel model;
    private int fileSize = 0;
    int progress = 0;

    public void initDownload(String url, String directory, String filename) {
        model.setState(1);//1= init download
        
        BufferedInputStream in = null;
        FileOutputStream fos = null;

        try {

            in = new BufferedInputStream(new URL(url).openStream());
            fos = new FileOutputStream(directory + "/" + filename);
            fileSize = in.available();

            byte data[] = new byte[fileSize];

            //pBar.setMaximum(fileSize);
            //pBar.setValue(0);
            while (in.read(data, 0, fileSize) != -1) {
                System.out.println(progress);
                fos.write(data, 0, in.read(data, 0, fileSize - 1));
                progress++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Download.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(Download.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Download.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            MainController.log(Method.getLang("log.msg.download.succes", "Complete") + " " + model.getName(), Log.SUCCESS_LOG);
            //pBar.setValue(0);
        }
    }
    
    public void createDirectory(String directory,String name){
        File file = new File(directory);
        if(file.exists()){
            
        }        
    }
    
    public void copyDirectory(String path){
        
    }

}
