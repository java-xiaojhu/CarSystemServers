package com.accp.springboot.pojo;

import java.util.Date;

public class Goodtype {
    private Integer goodtypeid;

    private String goodtypename;

    private Integer goodfid;

    private Date createtime;

    public Integer getGoodtypeid() {
        return goodtypeid;
    }

    public void setGoodtypeid(Integer goodtypeid) {
        this.goodtypeid = goodtypeid;
    }

    public String getGoodtypename() {
        return goodtypename;
    }

    public void setGoodtypename(String goodtypename) {
        this.goodtypename = goodtypename == null ? null : goodtypename.trim();
    }

    public Integer getGoodfid() {
        return goodfid;
    }

    public void setGoodfid(Integer goodfid) {
        this.goodfid = goodfid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}