package com.wise.elasticsearch.demo.document;

public class ProfileDocument {
    private String id;
    private String name;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
