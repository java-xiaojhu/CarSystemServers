package com.accp.springboot.pojo;

public class Car {
    private Integer carid;

    private String carnumber;

    private Integer carbrandid;

    private String carspecification;

    private String cardriver;

    private String cardriverphone;

    private String carascription;

    private Float carmileage;

    private String framenumber;

    private String enginemodel;

    private String fueltype;

    private Integer userid;

    private String carsystem;

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public Integer getCarbrandid() {
        return carbrandid;
    }

    public void setCarbrandid(Integer carbrandid) {
        this.carbrandid = carbrandid;
    }

    public String getCarspecification() {
        return carspecification;
    }

    public void setCarspecification(String carspecification) {
        this.carspecification = carspecification == null ? null : carspecification.trim();
    }

    public String getCardriver() {
        return cardriver;
    }

    public void setCardriver(String cardriver) {
        this.cardriver = cardriver == null ? null : cardriver.trim();
    }

    public String getCardriverphone() {
        return cardriverphone;
    }

    public void setCardriverphone(String cardriverphone) {
        this.cardriverphone = cardriverphone == null ? null : cardriverphone.trim();
    }

    public String getCarascription() {
        return carascription;
    }

    public void setCarascription(String carascription) {
        this.carascription = carascription == null ? null : carascription.trim();
    }

    public Float getCarmileage() {
        return carmileage;
    }

    public void setCarmileage(Float carmileage) {
        this.carmileage = carmileage;
    }

    public String getFramenumber() {
        return framenumber;
    }

    public void setFramenumber(String framenumber) {
        this.framenumber = framenumber == null ? null : framenumber.trim();
    }

    public String getEnginemodel() {
        return enginemodel;
    }

    public void setEnginemodel(String enginemodel) {
        this.enginemodel = enginemodel == null ? null : enginemodel.trim();
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype == null ? null : fueltype.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCarsystem() {
        return carsystem;
    }

    public void setCarsystem(String carsystem) {
        this.carsystem = carsystem == null ? null : carsystem.trim();
    }
}