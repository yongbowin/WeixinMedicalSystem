package com.clouds.igankong.po;

public class Notice {
    private Integer id;

    private String nDepartment;

    private String nScope;

    private String nSendTime;

    private String nSender;

    private String nSenderOpenid;

    private String nContent;

    private String nSenderUserid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getnDepartment() {
        return nDepartment;
    }

    public void setnDepartment(String nDepartment) {
        this.nDepartment = nDepartment == null ? null : nDepartment.trim();
    }

    public String getnScope() {
        return nScope;
    }

    public void setnScope(String nScope) {
        this.nScope = nScope == null ? null : nScope.trim();
    }

    public String getnSendTime() {
        return nSendTime;
    }

    public void setnSendTime(String nSendTime) {
        this.nSendTime = nSendTime == null ? null : nSendTime.trim();
    }

    public String getnSender() {
        return nSender;
    }

    public void setnSender(String nSender) {
        this.nSender = nSender == null ? null : nSender.trim();
    }

    public String getnSenderOpenid() {
        return nSenderOpenid;
    }

    public void setnSenderOpenid(String nSenderOpenid) {
        this.nSenderOpenid = nSenderOpenid == null ? null : nSenderOpenid.trim();
    }

    public String getnContent() {
        return nContent;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent == null ? null : nContent.trim();
    }

    public String getnSenderUserid() {
        return nSenderUserid;
    }

    public void setnSenderUserid(String nSenderUserid) {
        this.nSenderUserid = nSenderUserid == null ? null : nSenderUserid.trim();
    }
}