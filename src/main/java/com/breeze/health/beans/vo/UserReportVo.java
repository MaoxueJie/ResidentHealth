package com.breeze.health.beans.vo;

import java.util.Date;

public class UserReportVo {
	private Long id;

    private Long userId;

    private Long sickId;

    private Long mealId;

    private Long movementId;

    private Long habitId;

    private Long ad8Id;

    private Long gad7Id;

    private Long phq9Id;

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

	public Long getSickId() {
		return sickId;
	}

	public void setSickId(Long sickId) {
		this.sickId = sickId;
	}

	public Long getMealId() {
		return mealId;
	}

	public void setMealId(Long mealId) {
		this.mealId = mealId;
	}

	public Long getMovementId() {
		return movementId;
	}

	public void setMovementId(Long movementId) {
		this.movementId = movementId;
	}

	public Long getHabitId() {
		return habitId;
	}

	public void setHabitId(Long habitId) {
		this.habitId = habitId;
	}

	public Long getAd8Id() {
		return ad8Id;
	}

	public void setAd8Id(Long ad8Id) {
		this.ad8Id = ad8Id;
	}

	public Long getGad7Id() {
		return gad7Id;
	}

	public void setGad7Id(Long gad7Id) {
		this.gad7Id = gad7Id;
	}

	public Long getPhq9Id() {
		return phq9Id;
	}

	public void setPhq9Id(Long phq9Id) {
		this.phq9Id = phq9Id;
	}

	public String getSickReport() {
		return sickReport;
	}

	public void setSickReport(String sickReport) {
		this.sickReport = sickReport;
	}

	public String getMealReport() {
		return mealReport;
	}

	public void setMealReport(String mealReport) {
		this.mealReport = mealReport;
	}

	public String getMovementReport() {
		return movementReport;
	}

	public void setMovementReport(String movementReport) {
		this.movementReport = movementReport;
	}

	public String getSmokingReport() {
		return smokingReport;
	}

	public void setSmokingReport(String smokingReport) {
		this.smokingReport = smokingReport;
	}

	public String getPsychologicalReport() {
		return psychologicalReport;
	}

	public void setPsychologicalReport(String psychologicalReport) {
		this.psychologicalReport = psychologicalReport;
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
