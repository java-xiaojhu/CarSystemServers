package com.accp.springboot.pojo;

public class Serviceitems {
    private Integer serviceitemid;

    private String servicename;

    private Integer jobid;

    private Integer companyid;

    private Float serviceprice;

    private Integer weektime;

    private String servicremks;

    public Integer getServiceitemid() {
        return serviceitemid;
    }

    public void setServiceitemid(Integer serviceitemid) {
        this.serviceitemid = serviceitemid;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Float getServiceprice() {
        return serviceprice;
    }

    public void setServiceprice(Float serviceprice) {
        this.serviceprice = serviceprice;
    }

    public Integer getWeektime() {
        return weektime;
    }

    public void setWeektime(Integer weektime) {
        this.weektime = weektime;
    }

    public String getServicremks() {
        return servicremks;
    }

    public void setServicremks(String servicremks) {
        this.servicremks = servicremks == null ? null : servicremks.trim();
    }
}