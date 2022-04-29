package com.crio.jukebox.entities;

public class User extends BaseEntity {
    private String name;

    User(String ID,String uName){
        this.name=uName;
        this.id=ID;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

}