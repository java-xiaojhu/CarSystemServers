package com.accp.springboot.pojo;

import java.util.Date;

public class Itemtype {
    private Integer itemid;

    private String itemname;

    private Integer itemfid;

    private Date itemdate;

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public Integer getItemfid() {
        return itemfid;
    }

    public void setItemfid(Integer itemfid) {
        this.itemfid = itemfid;
    }

    public Date getItemdate() {
        return itemdate;
    }

    public void setItemdate(Date itemdate) {
        this.itemdate = itemdate;
    }
}