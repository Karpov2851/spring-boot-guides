package com.ws.config.generics;

/**
 * Created by vikas on 15-06-2019.
 */
public class Serailization implements java.io.Serializable{
    private String name;
    private String surName;

    public Serailization() {
    }

    public Serailization(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
