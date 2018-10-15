package com.itzdgc.webservice.domain;

import java.util.Objects;

public class User {
    private Integer id;
    private String userName;
    private String pass;
    private String address;

    public User()
    {}

    public User(Integer id, String userName, String pass, String address) {

        this.id = id;
        this.userName = userName;
        this.pass = pass;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(pass, user.pass);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userName, pass);
    }
}
