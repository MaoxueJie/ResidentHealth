package com.breeze.health.beans.vo;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserBaseInfoVo {
	private Long id;

    private Long userId;
    
    @DateTimeFormat(pattern="yyyy/MM/dd")
    @JsonFormat(pattern = "yyyy/MM/dd", locale = "zh" , timezone="GMT+8")
    private Date birthday;
    
    private String idCardNo;

    private Integer gender;

    private Integer education;

    private Integer marriage;

    private Integer sonCount;

    private Integer daughterCount;

    private Integer familyType;

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
    
    private Integer personCount;

    private Integer habitatIncome;

    private String[] medicalPayWay;

    private String medicalPayDesc2;

    private String medicalPayDesc3;

    private String medicalPayDesc4;
    
    private String medicalPayDesc5;

    private String medicalPayDesc6;

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
	
	public String getGenderStr() {
		if (gender==null)
			return "未填写";
		if (gender==1)
			return "男";	
		if (gender==2)
			return "女";
		return "未知";
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getEducation() {
		return education;
	}
	
	public String getEducationStr() {
		if (education==null)
			return "未填写";
		if (education==1)
			return "小学及以下";
		if (education==2)
			return "初中";
		if (education==3)
			return "中专";
		if (education==4)
			return "高中";
		if (education==5)
			return "大专";
		if (education==6)
			return "大学本科";
		if (education==7)
			return "研究生及以上";
		return "未知";
	}

	public void setEducation(Integer education) {
		this.education = education;
	}

	public Integer getMarriage() {
		return marriage;
	}
	
	public String getMarriageStr() {
		if (marriage==null)
			return "未填写";
		if (marriage==1)
			return "未婚";
		if (marriage==2)
			return "已婚";
		if (marriage==3)
			return "丧偶";
		if (marriage==4)
			return "离异";
		return "未知";
	}

	public void setMarriage(Integer marriage) {
		this.marriage = marriage;
	}
	
    public String getSonAndDaughterCountStr() {
    	String sonAndDaughterCountStr = "";
    	if (sonCount!=null)
    	{
    		sonAndDaughterCountStr = "儿子："+ sonCount+"个";
    	}
    	if (daughterCount!=null) {
    		if (!"".equals(sonAndDaughterCountStr))
    			sonAndDaughterCountStr += ",";
    		sonAndDaughterCountStr += "女儿："+ daughterCount+"个";
    	}
    	
    	if (sonCount==null && daughterCount==null)
    	{
    		sonAndDaughterCountStr = "未填写";
    	}
    	
    	return sonAndDaughterCountStr;
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

	public String getFamilyTypeStr() {
		if (familyType==null)
			return "未填写";
		if (familyType==1)
			return "独居";	
		if (familyType==2)
			return "与他人同住";
		return "未知";
	}
	
	public void setFamilyType(Integer familyType) {
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
	
	public String getFamilyDescStr() {
		if (familyDesc==null ||familyDesc.length==0)
			return "未填写";
		return String.join(",", familyDesc);
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
	
	public String getJobStr() {
		if (job==null)
			return "未填写";
		if (job==1)
			return "无业";	
		if (job==2)
			return "在职";
		if (job==3)
			return "离休/退休";
		if (job==4)
			return "学生";
		if (job==5)
			return "农民";
		return "未知";
	}

	public void setJob(Integer job) {
		this.job = job;
	}

	public String getReligion() {
		return religion;
	}
	
	public String getReligionStr() {
		if (religion!=null)
			return religion + (StringUtils.isBlank(religionOther)?"":(","+religionOther));
		else if (StringUtils.isBlank(religionOther))
			return religionOther;
		else 
			return "未填写";
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Integer getHabitatIncome() {
		return habitatIncome;
	}
	
	public String getHabitatIncomeStr() {
		if (habitatIncome==null)
			return "未填写";
		if (habitatIncome==1)
			return "2000以下";	
		if (habitatIncome==2)
			return "2000-5000";
		if (habitatIncome==3)
			return "5000以上";
		return "未知";
	}

	public void setHabitatIncome(Integer habitatIncome) {
		this.habitatIncome = habitatIncome;
	}

	public String[] getMedicalPayWay() {
		return medicalPayWay;
	}
	
	public String getMedicalPayWayStr() {
		if (medicalPayWay==null ||medicalPayWay.length==0)
			return "未填写";
		String medicalPayWayStr = "";
		for(String type:medicalPayWay) {
			if (!"".equals(medicalPayWayStr))
			{
				medicalPayWayStr += ",";
			}
			if ("1".equals(type))
			{
				medicalPayWayStr += "完全自费";
			}
			if ("2".equals(type))
			{
				medicalPayWayStr += "公费医疗" + (medicalPayDesc2==null?"":medicalPayDesc2 + "%");
			}
			if ("3".equals(type))
			{
				medicalPayWayStr += "新农合" + (medicalPayDesc3==null?"":medicalPayDesc3 + "%");
			}
			if ("4".equals(type))
			{
				medicalPayWayStr += "城镇职工医疗保险" + (medicalPayDesc4==null?"":medicalPayDesc4 + "%");
			}
			if ("5".equals(type))
			{
				medicalPayWayStr += "城镇居民医疗保险" + (medicalPayDesc5==null?"":medicalPayDesc5 + "%");
			}
			if ("6".equals(type))
			{
				medicalPayWayStr += "商业保险" + (medicalPayDesc6==null?"":medicalPayDesc6 + "%");
			}
		}
		return medicalPayWayStr;
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

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public Integer getPersonCount() {
		return personCount;
	}
	
	public String getPersonCountStr() {
		if (personCount==null)
			return "未填写";
		else
			return personCount+"人";
	}

	public void setPersonCount(Integer personCount) {
		this.personCount = personCount;
	}

	public String getMedicalPayDesc5() {
		return medicalPayDesc5;
	}

	public void setMedicalPayDesc5(String medicalPayDesc5) {
		this.medicalPayDesc5 = medicalPayDesc5;
	}

	public String getMedicalPayDesc6() {
		return medicalPayDesc6;
	}

	public void setMedicalPayDesc6(String medicalPayDesc6) {
		this.medicalPayDesc6 = medicalPayDesc6;
	}

}
