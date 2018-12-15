package com.breeze.health.entity;

import java.util.Date;

public class UserLivingHabit {
    private Long id;

    private Long livingId;

    private Integer smoking;

    private Integer smokingVal1;

    private Integer smokingVal2;

    private Integer smokingVal3;

    private Integer smokingVal4;

    private Integer smokingAge;

    private Integer partnerSmoking;

    private Integer passiveSmoking;

    private Integer drinking;

    private String drinkingTypes;

    private Integer drinkingVal;

    private Integer drinkingYears;

    private Integer noDrinkingYears;

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

    public String getDrinkingTypes() {
        return drinkingTypes;
    }

    public void setDrinkingTypes(String drinkingTypes) {
        this.drinkingTypes = drinkingTypes == null ? null : drinkingTypes.trim();
    }

    public Integer getDrinkingVal() {
        return drinkingVal;
    }

    public void setDrinkingVal(Integer drinkingVal) {
        this.drinkingVal = drinkingVal;
    }

    public Integer getDrinkingYears() {
        return drinkingYears;
    }

    public void setDrinkingYears(Integer drinkingYears) {
        this.drinkingYears = drinkingYears;
    }

    public Integer getNoDrinkingYears() {
        return noDrinkingYears;
    }

    public void setNoDrinkingYears(Integer noDrinkingYears) {
        this.noDrinkingYears = noDrinkingYears;
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