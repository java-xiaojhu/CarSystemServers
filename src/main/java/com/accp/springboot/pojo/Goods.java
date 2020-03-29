package com.accp.springboot.pojo;

public class Goods {
    private Integer goodsid;

    private String goodsname;

    private Integer goodtypeid;

    private String guige;

    private Integer companyid;

    private Integer supplerid;

    private Integer goodsnum;

    private Float purchaseprice;

    private Float standardprice;

    private Float vipprice;

    private Float address;

    private Integer goodstaue;

    private String reamks;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getGoodtypeid() {
        return goodtypeid;
    }

    public void setGoodtypeid(Integer goodtypeid) {
        this.goodtypeid = goodtypeid;
    }

    public String getGuige() {
        return guige;
    }

    public void setGuige(String guige) {
        this.guige = guige == null ? null : guige.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getSupplerid() {
        return supplerid;
    }

    public void setSupplerid(Integer supplerid) {
        this.supplerid = supplerid;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public Float getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(Float purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Float getStandardprice() {
        return standardprice;
    }

    public void setStandardprice(Float standardprice) {
        this.standardprice = standardprice;
    }

    public Float getVipprice() {
        return vipprice;
    }

    public void setVipprice(Float vipprice) {
        this.vipprice = vipprice;
    }

    public Float getAddress() {
        return address;
    }

    public void setAddress(Float address) {
        this.address = address;
    }

    public Integer getGoodstaue() {
        return goodstaue;
    }

    public void setGoodstaue(Integer goodstaue) {
        this.goodstaue = goodstaue;
    }

    public String getReamks() {
        return reamks;
    }

    public void setReamks(String reamks) {
        this.reamks = reamks == null ? null : reamks.trim();
    }
}