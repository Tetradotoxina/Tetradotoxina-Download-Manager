package com.tdm.net;

import com.tdm.util.Method;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tetradotoxina
 */
public class ServerDownload {
    private ServerSocket serverSocket;
    private Socket socketServer;
    private final String host;
    private final int port;
    
    private ObjectInputStream inpStream;
    private ObjectOutputStream outputStream;

    public ServerDownload(){
        host = Method.getConfig("config.tdm.download.host", "localhost");
        port = Integer.parseInt(Method.getConfig("config.tdm.download.port", "8881"));
       
    }
    
    
    public void prepeareServer() {
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(ServerDownload.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void connect(String url){
        try {
            socketServer=serverSocket.accept();
        } catch (IOException ex) {
            Logger.getLogger(ServerDownload.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void close(){
        URL url;
        if(serverSocket!=null){
            try {
                serverSocket.close();
            } catch (IOException ex) {
                Logger.getLogger(ServerDownload.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
