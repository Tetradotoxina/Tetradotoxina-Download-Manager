package com.tdm.db.controller;

import com.tdm.db.dao.FilterDAO;
import com.tdm.db.dao.HostDAO;
import com.tdm.util.Data;
import java.util.List;

/**
 *
 * @author tetradotoxina
 */
public class FilterController {
    
    private final HostDAO hostDAO;
    private final FilterDAO filterDAO;
    

    public FilterController() {
        filterDAO = new FilterDAO();
        hostDAO = new HostDAO();
    }


    public List<Data> getHost(int idHost) {        
        return hostDAO.getData(idHost);
    }

    public List<Data> getFilter(int idFilter) {
        return filterDAO.getData(idFilter);
    }

}
