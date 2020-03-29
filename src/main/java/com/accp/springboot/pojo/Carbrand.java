package com.accp.springboot.pojo;

public class Carbrand {
    private Integer carbrandid;

    private String carbrandname;

    public Integer getCarbrandid() {
        return carbrandid;
    }

    public void setCarbrandid(Integer carbrandid) {
        this.carbrandid = carbrandid;
    }

    public String getCarbrandname() {
        return carbrandname;
    }

    public void setCarbrandname(String carbrandname) {
        this.carbrandname = carbrandname == null ? null : carbrandname.trim();
    }
}