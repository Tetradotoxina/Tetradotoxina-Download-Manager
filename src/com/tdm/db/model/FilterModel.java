package com.tdm.db.model;

/**
 *
 * @author tetradotoxina
 */
public class FilterModel {
    private int idFilter;
    private String description;
    private HostModel host;

    public int getIdFilter() {
        return idFilter;
    }

    public void setIdFilter(int idFilter) {
        this.idFilter = idFilter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HostModel getIdHost() {
        return host;
    }

    public void setHost(HostModel host) {
        this.host = host;
    } 
    
    public int getIdHost(HostModel host) {
        return host.getIdHost();
    }  
    
}
