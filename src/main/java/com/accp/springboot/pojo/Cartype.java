package com.accp.springboot.pojo;

public class Cartype {
    private Integer cartypeid;

    private Integer carbrandid;

    private String cartypename;

    public Integer getCartypeid() {
        return cartypeid;
    }

    public void setCartypeid(Integer cartypeid) {
        this.cartypeid = cartypeid;
    }

    public Integer getCarbrandid() {
        return carbrandid;
    }

    public void setCarbrandid(Integer carbrandid) {
        this.carbrandid = carbrandid;
    }

    public String getCartypename() {
        return cartypename;
    }

    public void setCartypename(String cartypename) {
        this.cartypename = cartypename == null ? null : cartypename.trim();
    }
}