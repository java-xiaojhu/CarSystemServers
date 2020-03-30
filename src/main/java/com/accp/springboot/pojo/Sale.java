package com.accp.springboot.pojo;

import java.util.Date;

public class Sale {
    private String salenumber;

    private Date makedates;

    private String username;

    private String salepeople;

    private Float advancecharge;

    private Float actualpayment;

    private String setmethod;

    private String reamks;

    public String getSalenumber() {
        return salenumber;
    }

    public void setSalenumber(String salenumber) {
        this.salenumber = salenumber == null ? null : salenumber.trim();
    }

    public Date getMakedates() {
        return makedates;
    }

    public void setMakedates(Date makedates) {
        this.makedates = makedates;
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

    public Float getAdvancecharge() {
        return advancecharge;
    }

    public void setAdvancecharge(Float advancecharge) {
        this.advancecharge = advancecharge;
    }

    public Float getActualpayment() {
        return actualpayment;
    }

    public void setActualpayment(Float actualpayment) {
        this.actualpayment = actualpayment;
    }

    public String getSetmethod() {
        return setmethod;
    }

    public void setSetmethod(String setmethod) {
        this.setmethod = setmethod == null ? null : setmethod.trim();
    }

    public String getReamks() {
        return reamks;
    }

    public void setReamks(String reamks) {
        this.reamks = reamks == null ? null : reamks.trim();
    }
}