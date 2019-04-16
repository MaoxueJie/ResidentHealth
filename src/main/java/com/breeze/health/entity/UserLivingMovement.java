package com.breeze.health.entity;

import java.util.Date;

public class UserLivingMovement {
    private Long id;

    private Long livingId;

    private Integer violentMovement;

    private Float violentDaysPerWeek;

    private Integer violentMovementPerDay;

    private Float violentMinutePerDay;

    private Integer moderateMovement;

    private Float moderateDaysPerWeek;

    private Integer moderateMinute;

    private Float moderateMinutePerDay;

    private Integer walkMovement;

    private Float walkDaysPerWeek;

    private Integer walkMovementPerDay;

    private Float walkMinutePerDay;

    private Integer sittingRecent7Days;

    private Float sittingDaysRecent7Days;

    private Integer sittingHours;

    private Float sittingHoursPerDay;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLivingId() {
        return livingId;
    }

    public void setLivingId(Long livingId) {
        this.livingId = livingId;
    }

    public Integer getViolentMovement() {
        return violentMovement;
    }

    public void setViolentMovement(Integer violentMovement) {
        this.violentMovement = violentMovement;
    }

    public Float getViolentDaysPerWeek() {
        return violentDaysPerWeek;
    }

    public void setViolentDaysPerWeek(Float violentDaysPerWeek) {
        this.violentDaysPerWeek = violentDaysPerWeek;
    }

    public Integer getViolentMovementPerDay() {
        return violentMovementPerDay;
    }

    public void setViolentMovementPerDay(Integer violentMovementPerDay) {
        this.violentMovementPerDay = violentMovementPerDay;
    }

    public Float getViolentMinutePerDay() {
        return violentMinutePerDay;
    }

    public void setViolentMinutePerDay(Float violentMinutePerDay) {
        this.violentMinutePerDay = violentMinutePerDay;
    }

    public Integer getModerateMovement() {
        return moderateMovement;
    }

    public void setModerateMovement(Integer moderateMovement) {
        this.moderateMovement = moderateMovement;
    }

    public Float getModerateDaysPerWeek() {
        return moderateDaysPerWeek;
    }

    public void setModerateDaysPerWeek(Float moderateDaysPerWeek) {
        this.moderateDaysPerWeek = moderateDaysPerWeek;
    }

    public Integer getModerateMinute() {
        return moderateMinute;
    }

    public void setModerateMinute(Integer moderateMinute) {
        this.moderateMinute = moderateMinute;
    }

    public Float getModerateMinutePerDay() {
        return moderateMinutePerDay;
    }

    public void setModerateMinutePerDay(Float moderateMinutePerDay) {
        this.moderateMinutePerDay = moderateMinutePerDay;
    }

    public Integer getWalkMovement() {
        return walkMovement;
    }

    public void setWalkMovement(Integer walkMovement) {
        this.walkMovement = walkMovement;
    }

    public Float getWalkDaysPerWeek() {
        return walkDaysPerWeek;
    }

    public void setWalkDaysPerWeek(Float walkDaysPerWeek) {
        this.walkDaysPerWeek = walkDaysPerWeek;
    }

    public Integer getWalkMovementPerDay() {
        return walkMovementPerDay;
    }

    public void setWalkMovementPerDay(Integer walkMovementPerDay) {
        this.walkMovementPerDay = walkMovementPerDay;
    }

    public Float getWalkMinutePerDay() {
        return walkMinutePerDay;
    }

    public void setWalkMinutePerDay(Float walkMinutePerDay) {
        this.walkMinutePerDay = walkMinutePerDay;
    }

    public Integer getSittingRecent7Days() {
        return sittingRecent7Days;
    }

    public void setSittingRecent7Days(Integer sittingRecent7Days) {
        this.sittingRecent7Days = sittingRecent7Days;
    }

    public Float getSittingDaysRecent7Days() {
        return sittingDaysRecent7Days;
    }

    public void setSittingDaysRecent7Days(Float sittingDaysRecent7Days) {
        this.sittingDaysRecent7Days = sittingDaysRecent7Days;
    }

    public Integer getSittingHours() {
        return sittingHours;
    }

    public void setSittingHours(Integer sittingHours) {
        this.sittingHours = sittingHours;
    }

    public Float getSittingHoursPerDay() {
        return sittingHoursPerDay;
    }

    public void setSittingHoursPerDay(Float sittingHoursPerDay) {
        this.sittingHoursPerDay = sittingHoursPerDay;
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