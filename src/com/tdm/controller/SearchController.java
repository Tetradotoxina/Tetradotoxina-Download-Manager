package com.tdm.controller;

import com.tdm.db.model.SearchModel;
import com.tdm.gui.JFrame.JFrameSearch;

/**
 *
 * @author tetradotoxina
 */
public class SearchController {
    public static JFrameSearch frmDownload;
    
    public SearchController(JFrameSearch frmDownload){
        SearchController.frmDownload=frmDownload;
    }

    public SearchController() {
        
    }
    
    
    public void prepareDownload(String url, String regex) {
        SearchModel model=new SearchModel();
        model.setUrl(url);
        model.setRegex(regex);
    }
    
}
