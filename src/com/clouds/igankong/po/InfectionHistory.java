package com.clouds.igankong.po;

public class InfectionHistory {
    private Integer id;

    private String infeName;

    private String infeResult;

    private String vaccineStatus;

    private String vaccineNum;

    private String infeOpenid;

    private String infeUserid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfeName() {
        return infeName;
    }

    public void setInfeName(String infeName) {
        this.infeName = infeName == null ? null : infeName.trim();
    }

    public String getInfeResult() {
        return infeResult;
    }

    public void setInfeResult(String infeResult) {
        this.infeResult = infeResult == null ? null : infeResult.trim();
    }

    public String getVaccineStatus() {
        return vaccineStatus;
    }

    public void setVaccineStatus(String vaccineStatus) {
        this.vaccineStatus = vaccineStatus == null ? null : vaccineStatus.trim();
    }

    public String getVaccineNum() {
        return vaccineNum;
    }

    public void setVaccineNum(String vaccineNum) {
        this.vaccineNum = vaccineNum == null ? null : vaccineNum.trim();
    }

    public String getInfeOpenid() {
        return infeOpenid;
    }

    public void setInfeOpenid(String infeOpenid) {
        this.infeOpenid = infeOpenid == null ? null : infeOpenid.trim();
    }

    public String getInfeUserid() {
        return infeUserid;
    }

    public void setInfeUserid(String infeUserid) {
        this.infeUserid = infeUserid == null ? null : infeUserid.trim();
    }
}