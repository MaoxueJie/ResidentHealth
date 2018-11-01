package com.breeze.health.entity;

import java.util.Date;

public class UserTCMTanshi {
    private Long id;

    private Long tcmId;

    private Integer tanshiQ1;

    private Integer tanshiQ2;

    private Integer tanshiQ3;

    private Integer tanshiQ4;

    private Integer tanshiQ5;

    private Integer tanshiQ6;

    private Integer tanshiQ7;

    private Integer tanshiQ8;

    private Integer tanshiScore;

    private String tanshiResult;

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

    public Integer getTanshiQ1() {
        return tanshiQ1;
    }

    public void setTanshiQ1(Integer tanshiQ1) {
        this.tanshiQ1 = tanshiQ1;
    }

    public Integer getTanshiQ2() {
        return tanshiQ2;
    }

    public void setTanshiQ2(Integer tanshiQ2) {
        this.tanshiQ2 = tanshiQ2;
    }

    public Integer getTanshiQ3() {
        return tanshiQ3;
    }

    public void setTanshiQ3(Integer tanshiQ3) {
        this.tanshiQ3 = tanshiQ3;
    }

    public Integer getTanshiQ4() {
        return tanshiQ4;
    }

    public void setTanshiQ4(Integer tanshiQ4) {
        this.tanshiQ4 = tanshiQ4;
    }

    public Integer getTanshiQ5() {
        return tanshiQ5;
    }

    public void setTanshiQ5(Integer tanshiQ5) {
        this.tanshiQ5 = tanshiQ5;
    }

    public Integer getTanshiQ6() {
        return tanshiQ6;
    }

    public void setTanshiQ6(Integer tanshiQ6) {
        this.tanshiQ6 = tanshiQ6;
    }

    public Integer getTanshiQ7() {
        return tanshiQ7;
    }

    public void setTanshiQ7(Integer tanshiQ7) {
        this.tanshiQ7 = tanshiQ7;
    }

    public Integer getTanshiQ8() {
        return tanshiQ8;
    }

    public void setTanshiQ8(Integer tanshiQ8) {
        this.tanshiQ8 = tanshiQ8;
    }

    public Integer getTanshiScore() {
        return tanshiScore;
    }

    public void setTanshiScore(Integer tanshiScore) {
        this.tanshiScore = tanshiScore;
    }

    public String getTanshiResult() {
        return tanshiResult;
    }

    public void setTanshiResult(String tanshiResult) {
        this.tanshiResult = tanshiResult == null ? null : tanshiResult.trim();
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