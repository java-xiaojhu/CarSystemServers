package com.accp.springboot.pojo;

public class Starclass {
    private Integer starclassid;

    private String starclassname;

    private Float royalty;

    public Integer getStarclassid() {
        return starclassid;
    }

    public void setStarclassid(Integer starclassid) {
        this.starclassid = starclassid;
    }

    public String getStarclassname() {
        return starclassname;
    }

    public void setStarclassname(String starclassname) {
        this.starclassname = starclassname == null ? null : starclassname.trim();
    }

    public Float getRoyalty() {
        return royalty;
    }

    public void setRoyalty(Float royalty) {
        this.royalty = royalty;
    }
}