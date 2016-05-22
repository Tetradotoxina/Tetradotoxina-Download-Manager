package com.tdm.db.dao;

import com.tdm.db.connection.ConnectionDB;
import com.tdm.db.model.FilterModel;
import com.tdm.db.model.HostModel;
import com.tdm.util.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tetradotoxina
 */
public class HostDAO implements IDataAccessObject{
    private final ConnectionDB connection;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private List<HostModel> listHost;

    private String query;

    public HostDAO() {
        connection = new ConnectionDB();
    }
    
    @Override
    public List<HostModel> getList() {
        query = "select h.idhost,h.name as name_host,h.description as description_host,h.url as url_host,f.idfilter,f.description from tdm_filter as f inner join tdm_host as h on h.idhost=f.idhost";
        con = connection.getConnection();
        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            listHost = new ArrayList<>();
            while (rs.next()) {

                HostModel host = new HostModel();
                host.setIdHost(rs.getInt("idhost"));
                host.setDomain(rs.getString("domain"));
                
                listHost.add(host);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HostDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            showClose();
        }

        return listHost;
    }
    
    @Override
    public List<Data> getData(int idHost) {
        if(idHost==0){
            query = "select idhost,domain from tdm_host";
        }else{
            query = "select idhost,domain from tdm_host where idhost=?";
        }
        

        con = connection.getConnection();
        List<Data> listData = null;
        try {
            pst = con.prepareStatement(query);
            if(idHost>0){
                pst.setInt(1, idHost);
            }
            rs = pst.executeQuery();

            listData = new ArrayList<>();
            while (rs.next()) {

                Data data = new Data();
                data.setId(rs.getInt("idhost"));
                data.setDescripcion(rs.getString("domain"));
                
                listData.add(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HostDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            showClose();
        }

        return listData;
    }

    @Override
    public void showClose() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(HostDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(HostDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(HostDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        connection.close();
    }
}
