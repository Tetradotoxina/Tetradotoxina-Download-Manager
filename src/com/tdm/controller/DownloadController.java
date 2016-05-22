package com.tdm.controller;

import com.tdm.gui.JFrame.JFrameDownload;
import com.tdm.model.DownloadModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tetradotoxina
 */
public class DownloadController {
    private static List<List<DownloadModel>> listDownload;

    public DownloadController() {
        listDownload = new ArrayList<>();
    }

    public static void addDownload(List<DownloadModel> model) {
        listDownload.add(model);
        
    }
    
    public static List<DownloadModel> getDownload(int i){
        return listDownload.get(i);
    }

    public void prepareDownload(List<DownloadModel> model) {
        JFrameDownload frmDownload=new JFrameDownload();
        frmDownload.prepareDownload(model);
       
    }
    
    
}
