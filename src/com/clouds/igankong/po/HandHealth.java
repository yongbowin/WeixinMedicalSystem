package com.clouds.igankong.po;

public class HandHealth {
    private Integer id;

    private String hOpenid;

    private String hTime;

    private String hDepartment;

    private String hDepartmentSub;

    private String hRole;

    private String hBehavior;

    private String hSign;

    private String hUserid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gethOpenid() {
        return hOpenid;
    }

    public void sethOpenid(String hOpenid) {
        this.hOpenid = hOpenid == null ? null : hOpenid.trim();
    }

    public String gethTime() {
        return hTime;
    }

    public void sethTime(String hTime) {
        this.hTime = hTime == null ? null : hTime.trim();
    }

    public String gethDepartment() {
        return hDepartment;
    }

    public void sethDepartment(String hDepartment) {
        this.hDepartment = hDepartment == null ? null : hDepartment.trim();
    }

    public String gethDepartmentSub() {
        return hDepartmentSub;
    }

    public void sethDepartmentSub(String hDepartmentSub) {
        this.hDepartmentSub = hDepartmentSub == null ? null : hDepartmentSub.trim();
    }

    public String gethRole() {
        return hRole;
    }

    public void sethRole(String hRole) {
        this.hRole = hRole == null ? null : hRole.trim();
    }

    public String gethBehavior() {
        return hBehavior;
    }

    public void sethBehavior(String hBehavior) {
        this.hBehavior = hBehavior == null ? null : hBehavior.trim();
    }

    public String gethSign() {
        return hSign;
    }

    public void sethSign(String hSign) {
        this.hSign = hSign == null ? null : hSign.trim();
    }

    public String gethUserid() {
        return hUserid;
    }

    public void sethUserid(String hUserid) {
        this.hUserid = hUserid == null ? null : hUserid.trim();
    }
}