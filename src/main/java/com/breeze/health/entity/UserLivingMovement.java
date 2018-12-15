package com.breeze.health.entity;

import java.util.Date;

public class UserLivingMovement {
    private Long id;

    private Long livingId;

    private Integer violentMovement;

    private Integer violentDaysPerWeek;

    private Integer violentMinutePerDay;

    private Integer moderateMovement;

    private Integer moderateDaysPerWeek;

    private Integer moderateMinutePerDay;

    private Integer walkMovement;

    private Integer walkDaysPerWeek;

    private Integer walkMovementPerDay;

    private Integer walkMinutePerDay;

    private Integer sittingRecent7Days;

    private Integer sittingDaysRecent7Days;

    private Integer sittingHours;

    private Integer sittingHoursPerDay;

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

    public Integer getViolentDaysPerWeek() {
        return violentDaysPerWeek;
    }

    public void setViolentDaysPerWeek(Integer violentDaysPerWeek) {
        this.violentDaysPerWeek = violentDaysPerWeek;
    }

    public Integer getViolentMinutePerDay() {
        return violentMinutePerDay;
    }

    public void setViolentMinutePerDay(Integer violentMinutePerDay) {
        this.violentMinutePerDay = violentMinutePerDay;
    }

    public Integer getModerateMovement() {
        return moderateMovement;
    }

    public void setModerateMovement(Integer moderateMovement) {
        this.moderateMovement = moderateMovement;
    }

    public Integer getModerateDaysPerWeek() {
        return moderateDaysPerWeek;
    }

    public void setModerateDaysPerWeek(Integer moderateDaysPerWeek) {
        this.moderateDaysPerWeek = moderateDaysPerWeek;
    }

    public Integer getModerateMinutePerDay() {
        return moderateMinutePerDay;
    }

    public void setModerateMinutePerDay(Integer moderateMinutePerDay) {
        this.moderateMinutePerDay = moderateMinutePerDay;
    }

    public Integer getWalkMovement() {
        return walkMovement;
    }

    public void setWalkMovement(Integer walkMovement) {
        this.walkMovement = walkMovement;
    }

    public Integer getWalkDaysPerWeek() {
        return walkDaysPerWeek;
    }

    public void setWalkDaysPerWeek(Integer walkDaysPerWeek) {
        this.walkDaysPerWeek = walkDaysPerWeek;
    }

    public Integer getWalkMovementPerDay() {
        return walkMovementPerDay;
    }

    public void setWalkMovementPerDay(Integer walkMovementPerDay) {
        this.walkMovementPerDay = walkMovementPerDay;
    }

    public Integer getWalkMinutePerDay() {
        return walkMinutePerDay;
    }

    public void setWalkMinutePerDay(Integer walkMinutePerDay) {
        this.walkMinutePerDay = walkMinutePerDay;
    }

    public Integer getSittingRecent7Days() {
        return sittingRecent7Days;
    }

    public void setSittingRecent7Days(Integer sittingRecent7Days) {
        this.sittingRecent7Days = sittingRecent7Days;
    }

    public Integer getSittingDaysRecent7Days() {
        return sittingDaysRecent7Days;
    }

    public void setSittingDaysRecent7Days(Integer sittingDaysRecent7Days) {
        this.sittingDaysRecent7Days = sittingDaysRecent7Days;
    }

    public Integer getSittingHours() {
        return sittingHours;
    }

    public void setSittingHours(Integer sittingHours) {
        this.sittingHours = sittingHours;
    }

    public Integer getSittingHoursPerDay() {
        return sittingHoursPerDay;
    }

    public void setSittingHoursPerDay(Integer sittingHoursPerDay) {
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