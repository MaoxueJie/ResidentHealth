package com.breeze.health.entity;

import java.util.Date;

public class UserBaseInfo {
    private Long id;

    private Long userId;

    private Date birthday;

    private Integer gender;

    private Integer education;

    private Integer marriage;

    private Integer sonCount;

    private Integer daughterCount;

    private Integer familyType;

    private String familyDesc;

    private String community;

    private Double communityLon;

    private Double communityLat;

    private Integer job;

    private String religion;

    private Integer habitatIncome;

    private Integer medicalPayWay;

    private String medicalPayDesc;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getMarriage() {
        return marriage;
    }

    public void setMarriage(Integer marriage) {
        this.marriage = marriage;
    }

    public Integer getSonCount() {
        return sonCount;
    }

    public void setSonCount(Integer sonCount) {
        this.sonCount = sonCount;
    }

    public Integer getDaughterCount() {
        return daughterCount;
    }

    public void setDaughterCount(Integer daughterCount) {
        this.daughterCount = daughterCount;
    }

    public Integer getFamilyType() {
        return familyType;
    }

    public void setFamilyType(Integer familyType) {
        this.familyType = familyType;
    }

    public String getFamilyDesc() {
        return familyDesc;
    }

    public void setFamilyDesc(String familyDesc) {
        this.familyDesc = familyDesc == null ? null : familyDesc.trim();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community == null ? null : community.trim();
    }

    public Double getCommunityLon() {
        return communityLon;
    }

    public void setCommunityLon(Double communityLon) {
        this.communityLon = communityLon;
    }

    public Double getCommunityLat() {
        return communityLat;
    }

    public void setCommunityLat(Double communityLat) {
        this.communityLat = communityLat;
    }

    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion == null ? null : religion.trim();
    }

    public Integer getHabitatIncome() {
        return habitatIncome;
    }

    public void setHabitatIncome(Integer habitatIncome) {
        this.habitatIncome = habitatIncome;
    }

    public Integer getMedicalPayWay() {
        return medicalPayWay;
    }

    public void setMedicalPayWay(Integer medicalPayWay) {
        this.medicalPayWay = medicalPayWay;
    }

    public String getMedicalPayDesc() {
        return medicalPayDesc;
    }

    public void setMedicalPayDesc(String medicalPayDesc) {
        this.medicalPayDesc = medicalPayDesc == null ? null : medicalPayDesc.trim();
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