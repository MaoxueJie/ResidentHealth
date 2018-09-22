package com.breeze.health.entity;

import java.util.Date;

public class UserLivingHabit {
    private Long id;

    private Long userId;

    private Integer smoking;

    private Integer smokingVal1;

    private Integer smokingVal2;

    private Integer smokingVal3;

    private Integer smokingVal4;

    private Integer smokingAge;

    private Integer partnerSmoking;

    private Integer passiveSmoking;

    private Integer drinking;

    private Integer drinkingVal1;

    private String drinkingTypes;

    private Integer drinkingVal2;

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

    public Integer getSmoking() {
        return smoking;
    }

    public void setSmoking(Integer smoking) {
        this.smoking = smoking;
    }

    public Integer getSmokingVal1() {
        return smokingVal1;
    }

    public void setSmokingVal1(Integer smokingVal1) {
        this.smokingVal1 = smokingVal1;
    }

    public Integer getSmokingVal2() {
        return smokingVal2;
    }

    public void setSmokingVal2(Integer smokingVal2) {
        this.smokingVal2 = smokingVal2;
    }

    public Integer getSmokingVal3() {
        return smokingVal3;
    }

    public void setSmokingVal3(Integer smokingVal3) {
        this.smokingVal3 = smokingVal3;
    }

    public Integer getSmokingVal4() {
        return smokingVal4;
    }

    public void setSmokingVal4(Integer smokingVal4) {
        this.smokingVal4 = smokingVal4;
    }

    public Integer getSmokingAge() {
        return smokingAge;
    }

    public void setSmokingAge(Integer smokingAge) {
        this.smokingAge = smokingAge;
    }

    public Integer getPartnerSmoking() {
        return partnerSmoking;
    }

    public void setPartnerSmoking(Integer partnerSmoking) {
        this.partnerSmoking = partnerSmoking;
    }

    public Integer getPassiveSmoking() {
        return passiveSmoking;
    }

    public void setPassiveSmoking(Integer passiveSmoking) {
        this.passiveSmoking = passiveSmoking;
    }

    public Integer getDrinking() {
        return drinking;
    }

    public void setDrinking(Integer drinking) {
        this.drinking = drinking;
    }

    public Integer getDrinkingVal1() {
        return drinkingVal1;
    }

    public void setDrinkingVal1(Integer drinkingVal1) {
        this.drinkingVal1 = drinkingVal1;
    }

    public String getDrinkingTypes() {
        return drinkingTypes;
    }

    public void setDrinkingTypes(String drinkingTypes) {
        this.drinkingTypes = drinkingTypes == null ? null : drinkingTypes.trim();
    }

    public Integer getDrinkingVal2() {
        return drinkingVal2;
    }

    public void setDrinkingVal2(Integer drinkingVal2) {
        this.drinkingVal2 = drinkingVal2;
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