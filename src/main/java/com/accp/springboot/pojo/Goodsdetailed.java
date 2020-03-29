package com.accp.springboot.pojo;

public class Goodsdetailed {
    private Integer detailedid;

    private String oddnumbers;

    private String goodsname;

    private String guige;

    private Integer companyid;

    private Integer supplerid;

    private Integer goodsnum;

    private Float purchaseprice;

    private Float standardprice;

    private Float vipprice;

    private Float address;

    private Integer typeid;

    private String reamks;

    public Integer getDetailedid() {
        return detailedid;
    }

    public void setDetailedid(Integer detailedid) {
        this.detailedid = detailedid;
    }

    public String getOddnumbers() {
        return oddnumbers;
    }

    public void setOddnumbers(String oddnumbers) {
        this.oddnumbers = oddnumbers == null ? null : oddnumbers.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
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

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getReamks() {
        return reamks;
    }

    public void setReamks(String reamks) {
        this.reamks = reamks == null ? null : reamks.trim();
    }
}