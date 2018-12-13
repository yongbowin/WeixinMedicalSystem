package com.clouds.igankong.po;

public class Plan {
    private Integer id;

    private String pTime;

    private String pRelatePerson;

    private String pContent;

    private String pOpenid;

    private String pUserid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime == null ? null : pTime.trim();
    }

    public String getpRelatePerson() {
        return pRelatePerson;
    }

    public void setpRelatePerson(String pRelatePerson) {
        this.pRelatePerson = pRelatePerson == null ? null : pRelatePerson.trim();
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent == null ? null : pContent.trim();
    }

    public String getpOpenid() {
        return pOpenid;
    }

    public void setpOpenid(String pOpenid) {
        this.pOpenid = pOpenid == null ? null : pOpenid.trim();
    }

    public String getpUserid() {
        return pUserid;
    }

    public void setpUserid(String pUserid) {
        this.pUserid = pUserid == null ? null : pUserid.trim();
    }
}