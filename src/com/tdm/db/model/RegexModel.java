package com.tdm.db.model;

/**
 *
 * @author tetradotoxina
 */
public class RegexModel {
    private int idRegex;
    private String beginText;
    private String regex;
    private String endText;
    private int beginIndex;
    private int endIndex;
    private int[] groups;
    private FilterModel filter;

    public int getIdRegex() {
        return idRegex;
    }

    public void setIdRegex(int idRegex) {
        this.idRegex = idRegex;
    }

    public String getBeginText() {
        return beginText;
    }

    public void setBeginText(String beginText) {
        this.beginText = beginText;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getEndText() {
        return endText;
    }

    public void setEndText(String endText) {
        this.endText = endText;
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

    public int[] getGroups() {
        return groups;
    }

    public void setGroups(int[] groups) {
        this.groups = groups;
    }

    public FilterModel getFilter() {
        return filter;
    }

    public void setFilter(FilterModel filter) {
        this.filter = filter;
    }
    
    
}
