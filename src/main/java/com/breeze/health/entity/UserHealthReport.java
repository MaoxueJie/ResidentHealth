package com.breeze.health.entity;

import java.util.Date;

public class UserHealthReport {
    private Long id;

    private Long userId;

    private String sickReport;

    private String mealReport;

    private String movementReport;

    private String smokingReport;

    private String psychologicalReport;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSickReport() {
        return sickReport;
    }

    public void setSickReport(String sickReport) {
        this.sickReport = sickReport == null ? null : sickReport.trim();
    }

    public String getMealReport() {
        return mealReport;
    }

    public void setMealReport(String mealReport) {
        this.mealReport = mealReport == null ? null : mealReport.trim();
    }

    public String getMovementReport() {
        return movementReport;
    }

    public void setMovementReport(String movementReport) {
        this.movementReport = movementReport == null ? null : movementReport.trim();
    }

    public String getSmokingReport() {
        return smokingReport;
    }

    public void setSmokingReport(String smokingReport) {
        this.smokingReport = smokingReport == null ? null : smokingReport.trim();
    }

    public String getPsychologicalReport() {
        return psychologicalReport;
    }

    public void setPsychologicalReport(String psychologicalReport) {
        this.psychologicalReport = psychologicalReport == null ? null : psychologicalReport.trim();
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