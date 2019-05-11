package com.exemple.sweater.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String login;
    private String password;

    public String myLogin = "test@kindgeek.com";
    public String myPassword = "qwerty";

    public String adminLogin = "admin@kindgeek.com";
    public String adminPassword = "admin";

    public Login(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Login(String login, String password, String myLogin, String myPassword, String adminLogin, String adminPassword) {
        this.login = login;
        this.password = password;
        this.myLogin = myLogin;
        this.myPassword = myPassword;
        this.adminLogin = adminLogin;
        this.adminPassword = adminPassword;
    }
}
