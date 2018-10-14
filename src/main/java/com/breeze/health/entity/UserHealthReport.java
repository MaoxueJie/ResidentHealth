package com.breeze.health.entity;

import java.util.Date;

public class UserHealthReport {
    private Long id;

    private Long userId;

    private Long sickId;

    private Long phyId;

    private Long livingId;

    private Long psyId;

    private Long tcmId;

    private String sickReport;

    private String mealReport;

    private String movementReport;

    private String smokingReport;

    private String psychologicalReport;

    private String tcmReport;

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

    public Long getSickId() {
        return sickId;
    }

    public void setSickId(Long sickId) {
        this.sickId = sickId;
    }

    public Long getPhyId() {
        return phyId;
    }

    public void setPhyId(Long phyId) {
        this.phyId = phyId;
    }

    public Long getLivingId() {
        return livingId;
    }

    public void setLivingId(Long livingId) {
        this.livingId = livingId;
    }

    public Long getPsyId() {
        return psyId;
    }

    public void setPsyId(Long psyId) {
        this.psyId = psyId;
    }

    public Long getTcmId() {
        return tcmId;
    }

    public void setTcmId(Long tcmId) {
        this.tcmId = tcmId;
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

    public String getTcmReport() {
        return tcmReport;
    }

    public void setTcmReport(String tcmReport) {
        this.tcmReport = tcmReport == null ? null : tcmReport.trim();
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