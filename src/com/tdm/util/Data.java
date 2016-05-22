package com.tdm.util;

import java.io.Serializable;

/**
 *
 * @author tetradotoxina
 */
public class Data implements Serializable{
    private int id;
    private String value;
    private String description;
    
    public Data(){}
    
    public Data(String description){
        this.description=description;
    }

    public Data(String description,String value) {
        this.value = value;
        this.description = description;
    }

    public Data(int id, String descripcion,String value) {
        this.id = id;
        this.value = value;
        this.description = descripcion;
    }
    
    public Data(int Id, String descripcion) {
        this.id = Id;
        this.description = descripcion;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescripcion(String descripcion) {
        this.description = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return description;
    }
}
