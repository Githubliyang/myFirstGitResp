package com.example.demo.dao;

import java.io.Serializable;

/**
 * Created by li on 2018/10/16.
 */
public class user implements Serializable{
   // private static final long serialVersionUID = 722276787674814227;
    int id;
    String name;
    int age;
    Type type;
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

