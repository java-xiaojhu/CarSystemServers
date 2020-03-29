package com.accp.springboot.pojo;

public class Customercategory {
    private Integer customercategoryid;

    private String customercategoryname;

    private Float percentage;

    public Integer getCustomercategoryid() {
        return customercategoryid;
    }

    public void setCustomercategoryid(Integer customercategoryid) {
        this.customercategoryid = customercategoryid;
    }

    public String getCustomercategoryname() {
        return customercategoryname;
    }

    public void setCustomercategoryname(String customercategoryname) {
        this.customercategoryname = customercategoryname == null ? null : customercategoryname.trim();
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}