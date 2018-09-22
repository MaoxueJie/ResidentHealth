package com.breeze.health.entity;

import java.util.Date;

public class UserPhysiological {
    private Long id;

    private Long userId;

    private Float height;

    private Float weight;

    private Float abdominalCircumference;

    private Float hipCircumference;

    private Integer heartRate;

    private Integer breatheRate;

    private Float temperature;

    private Float bloodPressure;

    private Integer measuringFrequency;

    private Integer bloodSugar;

    private Float bloodSugarMinValue;

    private Float bloodSugarMaxValue;

    private Integer bloodLipid;

    private Float bloodLipidValue;

    private Float uricAcid;

    private Float bloodOxygen;

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

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getAbdominalCircumference() {
        return abdominalCircumference;
    }

    public void setAbdominalCircumference(Float abdominalCircumference) {
        this.abdominalCircumference = abdominalCircumference;
    }

    public Float getHipCircumference() {
        return hipCircumference;
    }

    public void setHipCircumference(Float hipCircumference) {
        this.hipCircumference = hipCircumference;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public Integer getBreatheRate() {
        return breatheRate;
    }

    public void setBreatheRate(Integer breatheRate) {
        this.breatheRate = breatheRate;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Integer getMeasuringFrequency() {
        return measuringFrequency;
    }

    public void setMeasuringFrequency(Integer measuringFrequency) {
        this.measuringFrequency = measuringFrequency;
    }

    public Integer getBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(Integer bloodSugar) {
        this.bloodSugar = bloodSugar;
    }

    public Float getBloodSugarMinValue() {
        return bloodSugarMinValue;
    }

    public void setBloodSugarMinValue(Float bloodSugarMinValue) {
        this.bloodSugarMinValue = bloodSugarMinValue;
    }

    public Float getBloodSugarMaxValue() {
        return bloodSugarMaxValue;
    }

    public void setBloodSugarMaxValue(Float bloodSugarMaxValue) {
        this.bloodSugarMaxValue = bloodSugarMaxValue;
    }

    public Integer getBloodLipid() {
        return bloodLipid;
    }

    public void setBloodLipid(Integer bloodLipid) {
        this.bloodLipid = bloodLipid;
    }

    public Float getBloodLipidValue() {
        return bloodLipidValue;
    }

    public void setBloodLipidValue(Float bloodLipidValue) {
        this.bloodLipidValue = bloodLipidValue;
    }

    public Float getUricAcid() {
        return uricAcid;
    }

    public void setUricAcid(Float uricAcid) {
        this.uricAcid = uricAcid;
    }

    public Float getBloodOxygen() {
        return bloodOxygen;
    }

    public void setBloodOxygen(Float bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
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