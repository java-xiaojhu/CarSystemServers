package com.accp.springboot.pojo;

import java.util.Date;

public class Users {
    private Integer userid;

    private String username;

    private String usersex;

    private Date ubirth;

    private Integer ucategory;

    private String ucard;

    private String uphone;

    private String ucontact;

    private String uaddress;

    private Date uputrecord;

    private String uremarks;

    private Float cardmoney;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public Date getUbirth() {
        return ubirth;
    }

    public void setUbirth(Date ubirth) {
        this.ubirth = ubirth;
    }

    public Integer getUcategory() {
        return ucategory;
    }

    public void setUcategory(Integer ucategory) {
        this.ucategory = ucategory;
    }

    public String getUcard() {
        return ucard;
    }

    public void setUcard(String ucard) {
        this.ucard = ucard == null ? null : ucard.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUcontact() {
        return ucontact;
    }

    public void setUcontact(String ucontact) {
        this.ucontact = ucontact == null ? null : ucontact.trim();
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress == null ? null : uaddress.trim();
    }

    public Date getUputrecord() {
        return uputrecord;
    }

    public void setUputrecord(Date uputrecord) {
        this.uputrecord = uputrecord;
    }

    public String getUremarks() {
        return uremarks;
    }

    public void setUremarks(String uremarks) {
        this.uremarks = uremarks == null ? null : uremarks.trim();
    }

    public Float getCardmoney() {
        return cardmoney;
    }

    public void setCardmoney(Float cardmoney) {
        this.cardmoney = cardmoney;
    }
}