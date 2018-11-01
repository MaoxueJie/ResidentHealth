package com.breeze.health.entity;

import java.util.Date;

public class UserTCMPinghe {
    private Long id;

    private Long tcmId;

    private Integer pingheQ1;

    private Integer pingheQ2;

    private Integer pingheQ3;

    private Integer pingheQ4;

    private Integer pingheQ5;

    private Integer pingheQ6;

    private Integer pingheQ7;

    private Integer pingheQ8;

    private Integer pingheScore;

    private String pingheResult;

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

    public Integer getPingheQ1() {
        return pingheQ1;
    }

    public void setPingheQ1(Integer pingheQ1) {
        this.pingheQ1 = pingheQ1;
    }

    public Integer getPingheQ2() {
        return pingheQ2;
    }

    public void setPingheQ2(Integer pingheQ2) {
        this.pingheQ2 = pingheQ2;
    }

    public Integer getPingheQ3() {
        return pingheQ3;
    }

    public void setPingheQ3(Integer pingheQ3) {
        this.pingheQ3 = pingheQ3;
    }

    public Integer getPingheQ4() {
        return pingheQ4;
    }

    public void setPingheQ4(Integer pingheQ4) {
        this.pingheQ4 = pingheQ4;
    }

    public Integer getPingheQ5() {
        return pingheQ5;
    }

    public void setPingheQ5(Integer pingheQ5) {
        this.pingheQ5 = pingheQ5;
    }

    public Integer getPingheQ6() {
        return pingheQ6;
    }

    public void setPingheQ6(Integer pingheQ6) {
        this.pingheQ6 = pingheQ6;
    }

    public Integer getPingheQ7() {
        return pingheQ7;
    }

    public void setPingheQ7(Integer pingheQ7) {
        this.pingheQ7 = pingheQ7;
    }

    public Integer getPingheQ8() {
        return pingheQ8;
    }

    public void setPingheQ8(Integer pingheQ8) {
        this.pingheQ8 = pingheQ8;
    }

    public Integer getPingheScore() {
        return pingheScore;
    }

    public void setPingheScore(Integer pingheScore) {
        this.pingheScore = pingheScore;
    }

    public String getPingheResult() {
        return pingheResult;
    }

    public void setPingheResult(String pingheResult) {
        this.pingheResult = pingheResult == null ? null : pingheResult.trim();
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