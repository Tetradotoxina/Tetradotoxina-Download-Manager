package com.tdm.db.model;

import java.io.Serializable;

/**
 *
 * @author tetradotoxina
 */
public class SearchModel implements Serializable{
    private String url;
    private String regex;
    private int[] groups;
    private int beginIndex = 0;
    private int endIndex = 0;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public int[] getGroups() {
        return groups;
    }

    public void setGroups(int[] groups) {
        this.groups = groups;
    }

    public int getBeginIndex() {
        return beginIndex;
    }

    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    
}
