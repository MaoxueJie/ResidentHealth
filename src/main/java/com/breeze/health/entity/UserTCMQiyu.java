package com.breeze.health.entity;

import java.util.Date;

public class UserTCMQiyu {
    private Long id;

    private Long tcmId;

    private Integer qiyuQ1;

    private Integer qiyuQ2;

    private Integer qiyuQ3;

    private Integer qiyuQ4;

    private Integer qiyuQ5;

    private Integer qiyuQ6;

    private Integer qiyuQ7;

    private Integer qiyuScore;

    private String qiyuResult;

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

    public Integer getQiyuQ1() {
        return qiyuQ1;
    }

    public void setQiyuQ1(Integer qiyuQ1) {
        this.qiyuQ1 = qiyuQ1;
    }

    public Integer getQiyuQ2() {
        return qiyuQ2;
    }

    public void setQiyuQ2(Integer qiyuQ2) {
        this.qiyuQ2 = qiyuQ2;
    }

    public Integer getQiyuQ3() {
        return qiyuQ3;
    }

    public void setQiyuQ3(Integer qiyuQ3) {
        this.qiyuQ3 = qiyuQ3;
    }

    public Integer getQiyuQ4() {
        return qiyuQ4;
    }

    public void setQiyuQ4(Integer qiyuQ4) {
        this.qiyuQ4 = qiyuQ4;
    }

    public Integer getQiyuQ5() {
        return qiyuQ5;
    }

    public void setQiyuQ5(Integer qiyuQ5) {
        this.qiyuQ5 = qiyuQ5;
    }

    public Integer getQiyuQ6() {
        return qiyuQ6;
    }

    public void setQiyuQ6(Integer qiyuQ6) {
        this.qiyuQ6 = qiyuQ6;
    }

    public Integer getQiyuQ7() {
        return qiyuQ7;
    }

    public void setQiyuQ7(Integer qiyuQ7) {
        this.qiyuQ7 = qiyuQ7;
    }

    public Integer getQiyuScore() {
        return qiyuScore;
    }

    public void setQiyuScore(Integer qiyuScore) {
        this.qiyuScore = qiyuScore;
    }

    public String getQiyuResult() {
        return qiyuResult;
    }

    public void setQiyuResult(String qiyuResult) {
        this.qiyuResult = qiyuResult == null ? null : qiyuResult.trim();
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