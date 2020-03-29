package com.accp.springboot.pojo;

import java.util.Date;

public class Historyconsumption {
    private Integer historyconsumptionid;

    private String consumptionno;

    private Integer userid;

    private Date enterfactory;

    private Date settlingtime;

    private Float countmoney;

    private Date finishdate;

    public Integer getHistoryconsumptionid() {
        return historyconsumptionid;
    }

    public void setHistoryconsumptionid(Integer historyconsumptionid) {
        this.historyconsumptionid = historyconsumptionid;
    }

    public String getConsumptionno() {
        return consumptionno;
    }

    public void setConsumptionno(String consumptionno) {
        this.consumptionno = consumptionno == null ? null : consumptionno.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getEnterfactory() {
        return enterfactory;
    }

    public void setEnterfactory(Date enterfactory) {
        this.enterfactory = enterfactory;
    }

    public Date getSettlingtime() {
        return settlingtime;
    }

    public void setSettlingtime(Date settlingtime) {
        this.settlingtime = settlingtime;
    }

    public Float getCountmoney() {
        return countmoney;
    }

    public void setCountmoney(Float countmoney) {
        this.countmoney = countmoney;
    }

    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }
}