/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdm.util;

import java.io.Serializable;

/**
 *
 * @author tetradotoxina
 */
public class Data implements Serializable{
    private int Id;
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

    public Data(int Id, String descripcion,String value) {
        this.Id = Id;
        this.value = value;
        this.description = descripcion;
    }
    
    public Data(int Id, String descripcion) {
        this.Id = Id;
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
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    @Override
    public String toString(){
        return description;
    }
}
