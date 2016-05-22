package com.tdm.net;


import com.tdm.db.model.SearchModel;
import com.tdm.util.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tetradotoxina
 */
public class Search implements Runnable {
    public static final int TITLE = 0;
    public static final int IMAGE = 1;
    public static final int FILTER = 2;
    
  
    private SearchModel searchModel;
  

    private Thread thread;

  

    public void start() {
        if (thread == null) {
            thread = new Thread();
            thread.start();
        }
    }

    @Override
    public void run() {
        
//        String source = getSource(searchModel.getUrl(), filterModel.getBegin(), filterModel.getEnd());
//        
//        switch (filterModel.getType()) {         
//            
//            case 0:
//                showTitle(source, filterModel.getBegin(), filterModel.getEnd());
//                break;
//            case 1:
//                break;
//        }
    }

    public String getSource(String url,int begin,int end) {
        String source = "";
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader bufferedReader = null;

        try {

            URL urlConsult = new URL(url);
            URLConnection con = urlConsult.openConnection();
            is = con.getInputStream();
            isr = new InputStreamReader(is);

            bufferedReader = new BufferedReader(isr);
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                source += line;
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (is != null) {
                try {
                    is.close();
                } catch (IOException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        
        return source;
    }

    public void showDocuments() {

    }

    public void showImageGallery() {
    }

    public void showImageSecuential() {
    }

    public void showVideo() {
    }

    public void showTitle(String source, int index, int end) {
        String newSource;
        if (index < end) {
            newSource = source.substring(index, end);
        } else {
            newSource = source;
        }
    }

    public Data showFilter(int id) {

        return null;
    }

    public void showRegEx(String source, Pattern regex, int[] groups) {
        Matcher matcher = regex.matcher(source);

        while (matcher.find()) {

            for (int i = 0; i < groups.length; i++) {
                int group = groups[i];

            }
        }
    }

    public void rename(String name) {
        Pattern p = Pattern.compile(".*([0-1])?");

    }

}
