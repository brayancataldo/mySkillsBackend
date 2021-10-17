package com.neki.mySkills.entities;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "user", schema = "teste_residencia")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    /*
    @OneToMany(mappedBy="user")
    private List<UserSkill> userSkill;
    */
    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "last_login_date")
    private Calendar lastLoginDate;

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

    public Calendar getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Calendar lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
