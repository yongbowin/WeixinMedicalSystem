package com.clouds.igankong.po;

public class Remind {
    private Integer id;

    private String rTime;

    private String rRelatePerson;

    private String rRemark;

    private String rStatus;

    private String rOpenid;

    private String rUserid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getrTime() {
        return rTime;
    }

    public void setrTime(String rTime) {
        this.rTime = rTime == null ? null : rTime.trim();
    }

    public String getrRelatePerson() {
        return rRelatePerson;
    }

    public void setrRelatePerson(String rRelatePerson) {
        this.rRelatePerson = rRelatePerson == null ? null : rRelatePerson.trim();
    }

    public String getrRemark() {
        return rRemark;
    }

    public void setrRemark(String rRemark) {
        this.rRemark = rRemark == null ? null : rRemark.trim();
    }

    public String getrStatus() {
        return rStatus;
    }

    public void setrStatus(String rStatus) {
        this.rStatus = rStatus == null ? null : rStatus.trim();
    }

    public String getrOpenid() {
        return rOpenid;
    }

    public void setrOpenid(String rOpenid) {
        this.rOpenid = rOpenid == null ? null : rOpenid.trim();
    }

    public String getrUserid() {
        return rUserid;
    }

    public void setrUserid(String rUserid) {
        this.rUserid = rUserid == null ? null : rUserid.trim();
    }
}