package com.accp.springboot.pojo;

import java.util.Date;

public class Purchase {
    private Integer pid;

    private String purchasenumber;

    private Date pdate;

    private Date arrivaldate;

    private Float advancecharge;

    private Float actualpayment;

    private String purchasepeople;

    private Float taxrate;

    private Integer pstaute;

    private String reamks;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPurchasenumber() {
        return purchasenumber;
    }

    public void setPurchasenumber(String purchasenumber) {
        this.purchasenumber = purchasenumber == null ? null : purchasenumber.trim();
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public Date getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(Date arrivaldate) {
        this.arrivaldate = arrivaldate;
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

    public String getPurchasepeople() {
        return purchasepeople;
    }

    public void setPurchasepeople(String purchasepeople) {
        this.purchasepeople = purchasepeople == null ? null : purchasepeople.trim();
    }

    public Float getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Float taxrate) {
        this.taxrate = taxrate;
    }

    public Integer getPstaute() {
        return pstaute;
    }

    public void setPstaute(Integer pstaute) {
        this.pstaute = pstaute;
    }

    public String getReamks() {
        return reamks;
    }

    public void setReamks(String reamks) {
        this.reamks = reamks == null ? null : reamks.trim();
    }
}