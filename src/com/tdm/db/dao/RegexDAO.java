package com.tdm.db.dao;

import com.tdm.db.connection.ConnectionDB;
import com.tdm.db.model.FilterModel;
import com.tdm.db.model.HostModel;
import com.tdm.util.Data;
import com.tdm.util.Method;
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
public class RegexDAO implements IDataAccessObject{
    
    private final ConnectionDB connection;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private List<FilterModel> listFilter;

    private String query;
    
    public RegexDAO(){
        connection=new ConnectionDB();
    }
    
    @Override
    public List<FilterModel> getList() {
        query = "select h.idhost,h.name as name_host,h.description as description_host,h.url as url_host,f.idfilter,f.description from tdm_filter as f inner join tdm_host as h on h.idhost=f.idhost";
        con = connection.getConnection();
        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            listFilter = new ArrayList<>();
            while (rs.next()) {

                HostModel host = new HostModel();
                host.setIdHost(rs.getInt("idhost"));
                host.setDomain(rs.getString("domain"));
                FilterModel model = new FilterModel();
                model.setIdFilter(rs.getInt("idFilter"));
                model.setDescription("description");
                
                model.setHost(host);

                listFilter.add(model);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegexDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            showClose();
        }

        return listFilter;
    }
    
    @Override
    public List<Data> getData(int idHost) {
        query = "select idfilter,description from tdm_filter where idhost=?";

        con = connection.getConnection();
        List<Data> listData = null;
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1,idHost);
            rs = pst.executeQuery();

            listData = new ArrayList<>();
            while (rs.next()) {

                Data data = new Data();
                data.setId(rs.getInt("idfilter"));
                data.setDescripcion(Method.getLang(rs.getString("description"),rs.getString("description")));
                
                listData.add(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegexDAO.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(RegexDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegexDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegexDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        connection.close();
    }
}
