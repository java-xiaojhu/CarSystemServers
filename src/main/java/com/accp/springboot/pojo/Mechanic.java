package com.accp.springboot.pojo;

public class Mechanic {
    private Integer mechanicid;

    private String mechanicname;

    private String mechanicsex;

    private String mechanicphone;

    private String contactphone;

    private String urgentphone;

    private Integer groupleader;

    private Integer teamid;

    private Integer starclassid;

    private String remarks;

    public Integer getMechanicid() {
        return mechanicid;
    }

    public void setMechanicid(Integer mechanicid) {
        this.mechanicid = mechanicid;
    }

    public String getMechanicname() {
        return mechanicname;
    }

    public void setMechanicname(String mechanicname) {
        this.mechanicname = mechanicname == null ? null : mechanicname.trim();
    }

    public String getMechanicsex() {
        return mechanicsex;
    }

    public void setMechanicsex(String mechanicsex) {
        this.mechanicsex = mechanicsex == null ? null : mechanicsex.trim();
    }

    public String getMechanicphone() {
        return mechanicphone;
    }

    public void setMechanicphone(String mechanicphone) {
        this.mechanicphone = mechanicphone == null ? null : mechanicphone.trim();
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public String getUrgentphone() {
        return urgentphone;
    }

    public void setUrgentphone(String urgentphone) {
        this.urgentphone = urgentphone == null ? null : urgentphone.trim();
    }

    public Integer getGroupleader() {
        return groupleader;
    }

    public void setGroupleader(Integer groupleader) {
        this.groupleader = groupleader;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public Integer getStarclassid() {
        return starclassid;
    }

    public void setStarclassid(Integer starclassid) {
        this.starclassid = starclassid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}