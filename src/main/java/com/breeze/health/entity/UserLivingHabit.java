package com.breeze.health.entity;

import java.util.Date;

public class UserLivingHabit {
    private Long id;

    private Long livingId;

    private Integer smoking;

    private Float smokingVal1;

    private Float smokingVal2;

    private Float smokingVal3;

    private Float smokingVal4;

    private Float smokingAge;

    private Integer partnerSmoking;

    private Integer passiveSmoking;

    private Integer drinking;

    private String drinkingTypes;

    private Float drinkingVal;

    private Float drinkingYears;

    private Float noDrinkingYears;

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

    public Float getSmokingVal1() {
        return smokingVal1;
    }

    public void setSmokingVal1(Float smokingVal1) {
        this.smokingVal1 = smokingVal1;
    }

    public Float getSmokingVal2() {
        return smokingVal2;
    }

    public void setSmokingVal2(Float smokingVal2) {
        this.smokingVal2 = smokingVal2;
    }

    public Float getSmokingVal3() {
        return smokingVal3;
    }

    public void setSmokingVal3(Float smokingVal3) {
        this.smokingVal3 = smokingVal3;
    }

    public Float getSmokingVal4() {
        return smokingVal4;
    }

    public void setSmokingVal4(Float smokingVal4) {
        this.smokingVal4 = smokingVal4;
    }

    public Float getSmokingAge() {
        return smokingAge;
    }

    public void setSmokingAge(Float smokingAge) {
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

    public Float getDrinkingVal() {
        return drinkingVal;
    }

    public void setDrinkingVal(Float drinkingVal) {
        this.drinkingVal = drinkingVal;
    }

    public Float getDrinkingYears() {
        return drinkingYears;
    }

    public void setDrinkingYears(Float drinkingYears) {
        this.drinkingYears = drinkingYears;
    }

    public Float getNoDrinkingYears() {
        return noDrinkingYears;
    }

    public void setNoDrinkingYears(Float noDrinkingYears) {
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