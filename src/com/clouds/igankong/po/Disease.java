package com.clouds.igankong.po;

public class Disease {
    private Integer id;

    private String dOpenid;

    private String dName;

    private String dType;

    private String dResult;

    private String dStartTime;

    private String dHospitalNum;

    private String dSign;

    private String dUserid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getdOpenid() {
        return dOpenid;
    }

    public void setdOpenid(String dOpenid) {
        this.dOpenid = dOpenid == null ? null : dOpenid.trim();
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdType() {
        return dType;
    }

    public void setdType(String dType) {
        this.dType = dType == null ? null : dType.trim();
    }

    public String getdResult() {
        return dResult;
    }

    public void setdResult(String dResult) {
        this.dResult = dResult == null ? null : dResult.trim();
    }

    public String getdStartTime() {
        return dStartTime;
    }

    public void setdStartTime(String dStartTime) {
        this.dStartTime = dStartTime == null ? null : dStartTime.trim();
    }

    public String getdHospitalNum() {
        return dHospitalNum;
    }

    public void setdHospitalNum(String dHospitalNum) {
        this.dHospitalNum = dHospitalNum == null ? null : dHospitalNum.trim();
    }

    public String getdSign() {
        return dSign;
    }

    public void setdSign(String dSign) {
        this.dSign = dSign == null ? null : dSign.trim();
    }

    public String getdUserid() {
        return dUserid;
    }

    public void setdUserid(String dUserid) {
        this.dUserid = dUserid == null ? null : dUserid.trim();
    }
}