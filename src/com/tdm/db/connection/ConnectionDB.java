package com.tdm.db.connection;

import com.tdm.util.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tetradotoxina
 */
public class ConnectionDB extends ConfigDB {

    private Connection con = null;
    private String url;

    public ConnectionDB() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        switch (typeConnection) {
            case "sqlite":
                url = jdbc + ":" +Method.getDirectory()+"/db/"+ file;
                break;
            case "mysql":
                url = jdbc + ":" + host + ":" + port + "/" + dataBase;
                break;
        }
    }

    public Connection getConnection() {
        try {
            switch (typeConnection) {
                case "sqlite":
                    con = DriverManager.getConnection(url);
                    break;
                case "mysql":
                    con = DriverManager.getConnection(url, userDB, passDB);
                    break;
                default:
                    con = DriverManager.getConnection(url, userDB, passDB);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public void close() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
