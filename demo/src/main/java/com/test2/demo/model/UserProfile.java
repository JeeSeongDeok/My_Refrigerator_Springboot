package com.test2.demo.model;

import java.beans.ConstructorProperties;


public class UserProfile{
    private String id;
    private String name;
    private String pw;
    private String phone;
    private String date;

    @ConstructorProperties({"id", "pw", "name", "phone", "date"})
    public UserProfile(String id,String pw, String name, String phone, String date){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.date = date;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    
}