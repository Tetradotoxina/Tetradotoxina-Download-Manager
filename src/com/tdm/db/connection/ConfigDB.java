package com.tdm.db.connection;

import com.tdm.util.Method;

/**
 *
 * @author tetradotoxina
 */
public class ConfigDB {
    protected final String typeConnection=Method.getConfig("condig.tdm.db.connection", "sqlite");
    protected final String host=Method.getConfig("config.tdm.db.host","localhost");
    protected final String file=Method.getConfig("config.tdm.db.file","tdm");
    protected final String dataBase=Method.getConfig("config.tdm.db.name","tdm");
    protected final String port=Method.getConfig("config.tdm.db.port", "");
    protected final String userDB=Method.getConfig("config.tdm.db.user", "");
    protected final String passDB=Method.getConfig("config.tdm.db.pass", "");
    protected final String driver=Method.getConfig("config.tdm.db.driver", "org.sqlite.JDBC");
    protected final String jdbc=Method.getConfig("config.tdm.db.jdbc", "jdbc:sqlite");
    
    
}
