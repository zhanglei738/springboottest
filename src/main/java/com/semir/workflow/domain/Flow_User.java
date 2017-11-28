package com.semir.workflow.domain;


import javax.persistence.*;

/*
* create by zhanglei 2017.11.27
* entity  for workflow user list detail
* column
*
* id
  username
  password
  is_admin
  active
*
* */
@Entity
@Table(name="flow_user")
public class Flow_User {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="is_admin")
    private String isAdmin;
    @Column(name="active")
    private Integer active;

    public Flow_User(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}
