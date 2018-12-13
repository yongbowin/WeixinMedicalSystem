package com.clouds.igankong.po;

public class Review {
    private Integer id;

    private String reviewTime;

    private String reviewOpenid;

    private String reviewResult;

    private String reviewUserid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime == null ? null : reviewTime.trim();
    }

    public String getReviewOpenid() {
        return reviewOpenid;
    }

    public void setReviewOpenid(String reviewOpenid) {
        this.reviewOpenid = reviewOpenid == null ? null : reviewOpenid.trim();
    }

    public String getReviewResult() {
        return reviewResult;
    }

    public void setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult == null ? null : reviewResult.trim();
    }

    public String getReviewUserid() {
        return reviewUserid;
    }

    public void setReviewUserid(String reviewUserid) {
        this.reviewUserid = reviewUserid == null ? null : reviewUserid.trim();
    }
}