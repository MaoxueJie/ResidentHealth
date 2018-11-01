package com.breeze.health.entity;

import java.util.Date;

public class UserTCMShire {
    private Long id;

    private Long tcmId;

    private Integer shireQ1;

    private Integer shireQ2;

    private Integer shireQ3;

    private Integer shireQ4;

    private Integer shireQ5;

    private Integer shireQ6;

    private Integer shireQ7;

    private Integer shireScore;

    private String shireResult;

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

    public Integer getShireQ1() {
        return shireQ1;
    }

    public void setShireQ1(Integer shireQ1) {
        this.shireQ1 = shireQ1;
    }

    public Integer getShireQ2() {
        return shireQ2;
    }

    public void setShireQ2(Integer shireQ2) {
        this.shireQ2 = shireQ2;
    }

    public Integer getShireQ3() {
        return shireQ3;
    }

    public void setShireQ3(Integer shireQ3) {
        this.shireQ3 = shireQ3;
    }

    public Integer getShireQ4() {
        return shireQ4;
    }

    public void setShireQ4(Integer shireQ4) {
        this.shireQ4 = shireQ4;
    }

    public Integer getShireQ5() {
        return shireQ5;
    }

    public void setShireQ5(Integer shireQ5) {
        this.shireQ5 = shireQ5;
    }

    public Integer getShireQ6() {
        return shireQ6;
    }

    public void setShireQ6(Integer shireQ6) {
        this.shireQ6 = shireQ6;
    }

    public Integer getShireQ7() {
        return shireQ7;
    }

    public void setShireQ7(Integer shireQ7) {
        this.shireQ7 = shireQ7;
    }

    public Integer getShireScore() {
        return shireScore;
    }

    public void setShireScore(Integer shireScore) {
        this.shireScore = shireScore;
    }

    public String getShireResult() {
        return shireResult;
    }

    public void setShireResult(String shireResult) {
        this.shireResult = shireResult == null ? null : shireResult.trim();
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