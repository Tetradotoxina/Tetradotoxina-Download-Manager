package com.tdm.db.model;

/**
 *
 * @author tetradotoxina
 */
public class UrlModel {
    private int idUrl;
    private String urlFilter;
    private int type;
    private FilterModel filter;

    public int getIdUrl() {
        return idUrl;
    }

    public void setIdUrl(int idUrl) {
        this.idUrl = idUrl;
    }

    public String getUrlFilter() {
        return urlFilter;
    }

    public void setUrlFilter(String urlFilter) {
        this.urlFilter = urlFilter;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public FilterModel getFilter() {
        return filter;
    }

    public void setFilter(FilterModel filter) {
        this.filter = filter;
    }   
}
