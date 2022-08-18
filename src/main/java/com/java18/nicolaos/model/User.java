package com.java18.nicolaos.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name="user")
public class User {

    private Integer			id;
    private String			userName;

    public User(){}


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
