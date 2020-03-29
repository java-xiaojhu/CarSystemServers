package com.accp.springboot.pojo;

public class Supplers {
    private Integer supplerid;

    private String factoryname;

    private String supplerphone;

    private String supplerlianphone;

    private String spperaddress;

    private String reamks;

    public Integer getSupplerid() {
        return supplerid;
    }

    public void setSupplerid(Integer supplerid) {
        this.supplerid = supplerid;
    }

    public String getFactoryname() {
        return factoryname;
    }

    public void setFactoryname(String factoryname) {
        this.factoryname = factoryname == null ? null : factoryname.trim();
    }

    public String getSupplerphone() {
        return supplerphone;
    }

    public void setSupplerphone(String supplerphone) {
        this.supplerphone = supplerphone == null ? null : supplerphone.trim();
    }

    public String getSupplerlianphone() {
        return supplerlianphone;
    }

    public void setSupplerlianphone(String supplerlianphone) {
        this.supplerlianphone = supplerlianphone == null ? null : supplerlianphone.trim();
    }

    public String getSpperaddress() {
        return spperaddress;
    }

    public void setSpperaddress(String spperaddress) {
        this.spperaddress = spperaddress == null ? null : spperaddress.trim();
    }

    public String getReamks() {
        return reamks;
    }

    public void setReamks(String reamks) {
        this.reamks = reamks == null ? null : reamks.trim();
    }
}