package com.accp.springboot.pojo;

import java.util.Date;

public class Warehousing {
    private Integer wid;

    private String wnumbers;

    private Date wdate;

    private String wpeople;

    private String purchasenumber;

    private String purchasepeople;

    private Integer wstate;

    private String reamks;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWnumbers() {
        return wnumbers;
    }

    public void setWnumbers(String wnumbers) {
        this.wnumbers = wnumbers == null ? null : wnumbers.trim();
    }

    public Date getWdate() {
        return wdate;
    }

    public void setWdate(Date wdate) {
        this.wdate = wdate;
    }

    public String getWpeople() {
        return wpeople;
    }

    public void setWpeople(String wpeople) {
        this.wpeople = wpeople == null ? null : wpeople.trim();
    }

    public String getPurchasenumber() {
        return purchasenumber;
    }

    public void setPurchasenumber(String purchasenumber) {
        this.purchasenumber = purchasenumber == null ? null : purchasenumber.trim();
    }

    public String getPurchasepeople() {
        return purchasepeople;
    }

    public void setPurchasepeople(String purchasepeople) {
        this.purchasepeople = purchasepeople == null ? null : purchasepeople.trim();
    }

    public Integer getWstate() {
        return wstate;
    }

    public void setWstate(Integer wstate) {
        this.wstate = wstate;
    }

    public String getReamks() {
        return reamks;
    }

    public void setReamks(String reamks) {
        this.reamks = reamks == null ? null : reamks.trim();
    }
}