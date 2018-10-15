package com.itzdgc.webservice.domain;

public class Cat {
    private Integer id;
    private String catName;
    private String color;

    public Cat(){

    }
    public Cat(Integer id, String catName, String color) {
        this.id = id;
        this.catName = catName;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
