package com.breeze.health.entity;

import java.util.Date;

public class UserTCMQixu {
    private Long id;

    private Long tcmId;

    private Integer qixuQ1;

    private Integer qixuQ2;

    private Integer qixuQ3;

    private Integer qixuQ4;

    private Integer qixuQ5;

    private Integer qixuQ6;

    private Integer qixuQ7;

    private Integer qixuQ8;

    private Integer qixuScore;

    private String qixuResult;

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

    public Integer getQixuQ1() {
        return qixuQ1;
    }

    public void setQixuQ1(Integer qixuQ1) {
        this.qixuQ1 = qixuQ1;
    }

    public Integer getQixuQ2() {
        return qixuQ2;
    }

    public void setQixuQ2(Integer qixuQ2) {
        this.qixuQ2 = qixuQ2;
    }

    public Integer getQixuQ3() {
        return qixuQ3;
    }

    public void setQixuQ3(Integer qixuQ3) {
        this.qixuQ3 = qixuQ3;
    }

    public Integer getQixuQ4() {
        return qixuQ4;
    }

    public void setQixuQ4(Integer qixuQ4) {
        this.qixuQ4 = qixuQ4;
    }

    public Integer getQixuQ5() {
        return qixuQ5;
    }

    public void setQixuQ5(Integer qixuQ5) {
        this.qixuQ5 = qixuQ5;
    }

    public Integer getQixuQ6() {
        return qixuQ6;
    }

    public void setQixuQ6(Integer qixuQ6) {
        this.qixuQ6 = qixuQ6;
    }

    public Integer getQixuQ7() {
        return qixuQ7;
    }

    public void setQixuQ7(Integer qixuQ7) {
        this.qixuQ7 = qixuQ7;
    }

    public Integer getQixuQ8() {
        return qixuQ8;
    }

    public void setQixuQ8(Integer qixuQ8) {
        this.qixuQ8 = qixuQ8;
    }

    public Integer getQixuScore() {
        return qixuScore;
    }

    public void setQixuScore(Integer qixuScore) {
        this.qixuScore = qixuScore;
    }

    public String getQixuResult() {
        return qixuResult;
    }

    public void setQixuResult(String qixuResult) {
        this.qixuResult = qixuResult == null ? null : qixuResult.trim();
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