package com.accp.springboot.pojo;

import java.util.Date;

public class Picking {
    private String pickingnumber;

    private Date makedates;

    private String carnumber;

    private String username;

    private String salepeople;

    private String departmentname;

    private Integer frequency;

    private Float picking;

    private String reamks;

    public String getPickingnumber() {
        return pickingnumber;
    }

    public void setPickingnumber(String pickingnumber) {
        this.pickingnumber = pickingnumber == null ? null : pickingnumber.trim();
    }

    public Date getMakedates() {
        return makedates;
    }

    public void setMakedates(Date makedates) {
        this.makedates = makedates;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSalepeople() {
        return salepeople;
    }

    public void setSalepeople(String salepeople) {
        this.salepeople = salepeople == null ? null : salepeople.trim();
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Float getPicking() {
        return picking;
    }

    public void setPicking(Float picking) {
        this.picking = picking;
    }

    public String getReamks() {
        return reamks;
    }

    public void setReamks(String reamks) {
        this.reamks = reamks == null ? null : reamks.trim();
    }
}