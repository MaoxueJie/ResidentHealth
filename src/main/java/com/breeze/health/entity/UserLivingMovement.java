package com.breeze.health.entity;

import java.util.Date;
//运动
public class UserLivingMovement {
    private Long id;

    private Long userId;

    private Integer violentMovement;

    private Integer violentDaysPerWeek;

    private Integer violentMinutePerDay;

    private Integer moderateMovement;

    private Integer moderateDaysPerWeek;

    private Integer moderateMinutePerDay;

    private Integer walkMovement;

    private Integer walkDaysPerWeek;

    private Integer walkMinutePerDay;

    private Integer sittingMinutePerDay;

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

    public Integer getWalkMinutePerDay() {
        return walkMinutePerDay;
    }

    public void setWalkMinutePerDay(Integer walkMinutePerDay) {
        this.walkMinutePerDay = walkMinutePerDay;
    }

    public Integer getSittingMinutePerDay() {
        return sittingMinutePerDay;
    }

    public void setSittingMinutePerDay(Integer sittingMinutePerDay) {
        this.sittingMinutePerDay = sittingMinutePerDay;
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