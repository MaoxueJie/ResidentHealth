package com.breeze.health.entity;

import java.util.Date;

public class UserTCMTebing {
    private Long id;

    private Long tcmId;

    private Integer tebingQ1;

    private Integer tebingQ2;

    private Integer tebingQ3;

    private Integer tebingQ4;

    private Integer tebingQ5;

    private Integer tebingQ6;

    private Integer tebingQ7;

    private Integer tebingScore;

    private String tebingResult;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTcmId() {
        return tcmId;
    }

    public void setTcmId(Long tcmId) {
        this.tcmId = tcmId;
    }

    public Integer getTebingQ1() {
        return tebingQ1;
    }

    public void setTebingQ1(Integer tebingQ1) {
        this.tebingQ1 = tebingQ1;
    }

    public Integer getTebingQ2() {
        return tebingQ2;
    }

    public void setTebingQ2(Integer tebingQ2) {
        this.tebingQ2 = tebingQ2;
    }

    public Integer getTebingQ3() {
        return tebingQ3;
    }

    public void setTebingQ3(Integer tebingQ3) {
        this.tebingQ3 = tebingQ3;
    }

    public Integer getTebingQ4() {
        return tebingQ4;
    }

    public void setTebingQ4(Integer tebingQ4) {
        this.tebingQ4 = tebingQ4;
    }

    public Integer getTebingQ5() {
        return tebingQ5;
    }

    public void setTebingQ5(Integer tebingQ5) {
        this.tebingQ5 = tebingQ5;
    }

    public Integer getTebingQ6() {
        return tebingQ6;
    }

    public void setTebingQ6(Integer tebingQ6) {
        this.tebingQ6 = tebingQ6;
    }

    public Integer getTebingQ7() {
        return tebingQ7;
    }

    public void setTebingQ7(Integer tebingQ7) {
        this.tebingQ7 = tebingQ7;
    }

    public Integer getTebingScore() {
        return tebingScore;
    }

    public void setTebingScore(Integer tebingScore) {
        this.tebingScore = tebingScore;
    }

    public String getTebingResult() {
        return tebingResult;
    }

    public void setTebingResult(String tebingResult) {
        this.tebingResult = tebingResult == null ? null : tebingResult.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}