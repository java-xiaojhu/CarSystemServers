package com.accp.springboot.pojo;

import java.util.Date;

public class Repair {
    private String repairnumber;

    private Date makedates;

    private String carnumber;

    private String username;

    private String salepeople;

    private String mechanicname;

    private Date repairdate;

    private Date fiushdate;

    private Float repairprice;

    private String reamks;

    public String getRepairnumber() {
        return repairnumber;
    }

    public void setRepairnumber(String repairnumber) {
        this.repairnumber = repairnumber == null ? null : repairnumber.trim();
    }

    public Date getMakedates() {
        return makedates;
    }

    public void setMakedates(Date makedates) {
        this.makedates = makedates;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
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

    public String getMechanicname() {
        return mechanicname;
    }

    public void setMechanicname(String mechanicname) {
        this.mechanicname = mechanicname == null ? null : mechanicname.trim();
    }

    public Date getRepairdate() {
        return repairdate;
    }

    public void setRepairdate(Date repairdate) {
        this.repairdate = repairdate;
    }

    public Date getFiushdate() {
        return fiushdate;
    }

    public void setFiushdate(Date fiushdate) {
        this.fiushdate = fiushdate;
    }

    public Float getRepairprice() {
        return repairprice;
    }

    public void setRepairprice(Float repairprice) {
        this.repairprice = repairprice;
    }

    public String getReamks() {
        return reamks;
    }

    public void setReamks(String reamks) {
        this.reamks = reamks == null ? null : reamks.trim();
    }
}