package com.breeze.health.beans.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserBaseInfoVo {
	private Long id;

    private Long userId;
    
    @DateTimeFormat(pattern="yyyy/MM/dd")
    @JsonFormat(pattern = "yyyy/MM/dd", locale = "zh" , timezone="GMT+8")
    private Date birthday;

    private Integer gender;

    private Integer education;

    private Integer marriage;

    private Integer sonCount;

    private Integer daughterCount;

    private String familyType;

    private String[] familyDesc;

    private String familyOther;
    
    private String city;

    private String zone;

    private String community;

    private Double communityLon;

    private Double communityLat;

    private Integer job;

    private String religion;
    
    private String religionOther;

    private Integer habitatIncome;

    private String[] medicalPayWay;

    private String medicalPayDesc2;

    private String medicalPayDesc3;

    private String medicalPayDesc4;

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

	public String getFamilyType() {
		return familyType;
	}

	public void setFamilyType(String familyType) {
		this.familyType = familyType;
	}

	public String getFamilyOther() {
		return familyOther;
	}

	public void setFamilyOther(String familyOther) {
		this.familyOther = familyOther;
	}

	public String[] getFamilyDesc() {
		return familyDesc;
	}

	public void setFamilyDesc(String[] familyDesc) {
		this.familyDesc = familyDesc;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
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
		this.religion = religion;
	}

	public Integer getHabitatIncome() {
		return habitatIncome;
	}

	public void setHabitatIncome(Integer habitatIncome) {
		this.habitatIncome = habitatIncome;
	}

	public String[] getMedicalPayWay() {
		return medicalPayWay;
	}

	public void setMedicalPayWay(String[] medicalPayWay) {
		this.medicalPayWay = medicalPayWay;
	}

	public String getMedicalPayDesc2() {
		return medicalPayDesc2;
	}

	public void setMedicalPayDesc2(String medicalPayDesc2) {
		this.medicalPayDesc2 = medicalPayDesc2;
	}

	public String getMedicalPayDesc3() {
		return medicalPayDesc3;
	}

	public void setMedicalPayDesc3(String medicalPayDesc3) {
		this.medicalPayDesc3 = medicalPayDesc3;
	}

	public String getMedicalPayDesc4() {
		return medicalPayDesc4;
	}

	public void setMedicalPayDesc4(String medicalPayDesc4) {
		this.medicalPayDesc4 = medicalPayDesc4;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getReligionOther() {
		return religionOther;
	}

	public void setReligionOther(String religionOther) {
		this.religionOther = religionOther;
	}

	
}
