package com.breeze.health.beans.vo;

import java.util.Date;

public class UserPsychologicalVo {
	
	private Long id;
	
	private Long userId;

    private Integer ad8Q1;

    private Integer ad8Q2;

    private Integer ad8Q3;

    private Integer ad8Q4;

    private Integer ad8Q5;

    private Integer ad8Q6;

    private Integer ad8Q7;

    private Integer ad8Q8;

    private Integer ad8Score;


    private Integer gad7Q1;

    private Integer gad7Q2;

    private Integer gad7Q3;

    private Integer gad7Q4;

    private Integer gad7Q5;

    private Integer gad7Q6;

    private Integer gad7Q7;

    private Integer gad7Score;
    
    private Integer phq9Q1;

    private Integer phq9Q2;

    private Integer phq9Q3;

    private Integer phq9Q4;

    private Integer phq9Q5;

    private Integer phq9Q6;

    private Integer phq9Q7;

    private Integer phq9Q8;

    private Integer phq9Q9;

    private Integer phq9Affect;

    private Integer phq9Score;
    
    private String resultTitle;
    
    private String resultMsg;
    
    
    private Date createTime;

    private Date updateTime;
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getGad7Q1Str() {
		if (gad7Q1==null)
			return "未填写";
		if (gad7Q1==0)
			return "完全没有";
		if (gad7Q1==1)
			return "有几天";
		if (gad7Q1==2)
			return "一半以上天数";
		if (gad7Q1==3)
			return "几乎每天";
		return "未知";
	}
	
	public String getGad7Q2Str() {
		if (gad7Q2==null)
			return "未填写";
		if (gad7Q2==0)
			return "完全没有";
		if (gad7Q2==1)
			return "有几天";
		if (gad7Q2==2)
			return "一半以上天数";
		if (gad7Q2==3)
			return "几乎每天";
		return "未知";
	}
	
	public String getGad7Q3Str() {
		if (gad7Q3==null)
			return "未填写";
		if (gad7Q3==0)
			return "完全没有";
		if (gad7Q3==1)
			return "有几天";
		if (gad7Q3==2)
			return "一半以上天数";
		if (gad7Q3==3)
			return "几乎每天";
		return "未知";
	}
	
	public String getGad7Q4Str() {
		if (gad7Q4==null)
			return "未填写";
		if (gad7Q4==0)
			return "完全没有";
		if (gad7Q4==1)
			return "有几天";
		if (gad7Q4==2)
			return "一半以上天数";
		if (gad7Q4==3)
			return "几乎每天";
		return "未知";
	}
	
	public String getGad7Q5Str() {
		if (gad7Q5==null)
			return "未填写";
		if (gad7Q5==0)
			return "完全没有";
		if (gad7Q5==1)
			return "有几天";
		if (gad7Q5==2)
			return "一半以上天数";
		if (gad7Q5==3)
			return "几乎每天";
		return "未知";
	}
	
	public String getGad7Q6Str() {
		if (gad7Q6==null)
			return "未填写";
		if (gad7Q6==0)
			return "完全没有";
		if (gad7Q6==1)
			return "有几天";
		if (gad7Q6==2)
			return "一半以上天数";
		if (gad7Q6==3)
			return "几乎每天";
		return "未知";
	}
	
	public String getGad7Q7Str() {
		if (gad7Q7==null)
			return "未填写";
		if (gad7Q7==0)
			return "完全没有";
		if (gad7Q7==1)
			return "有几天";
		if (gad7Q7==2)
			return "一半以上天数";
		if (gad7Q7==3)
			return "几乎每天";
		return "未知";
	}
	
	public String getPhq9Q1Str() {
		if (phq9Q1==null)
			return "未填写";
		if (phq9Q1==0)
			return "完全没有";
		if (phq9Q1==1)
			return "有几天";
		if (phq9Q1==2)
			return "一半以上天数";
		if (phq9Q1==3)
			return "几乎每天";
		return "未知";
	}
	
	public String getPhq9Q2Str() {
		if (phq9Q2==null)
			return "未填写";
		if (phq9Q2==0)
			return "完全没有";
		if (phq9Q2==1)
			return "有几天";
		if (phq9Q2==2)
			return "一半以上天数";
		if (phq9Q2==3)
			return "几乎每天";
		return "未知";
	}
	
	public String getPhq9Q3Str() {
		if (phq9Q3==null)
			return "未填写";
		if (phq9Q3==0)
			return "完全没有";
		if (phq9Q3==1)
			return "有几天";
		if (phq9Q3==2)
			return "一半以上天数";
		if (phq9Q3==3)
			return "几乎每天";
		return "未知";
	}
	
	public String getPhq9Q4Str() {
		if (phq9Q4==null)
			return "未填写";
		if (phq9Q4==0)
			return "完全没有";
		if (phq9Q4==1)
			return "有几天";
		if (phq9Q4==2)
			return "一半以上天数";
		if (phq9Q4==3)
			return "几乎每天";
		return "未知";
	}
	public String getPhq9Q5Str() {
		if (phq9Q5==null)
			return "未填写";
		if (phq9Q5==0)
			return "完全没有";
		if (phq9Q5==1)
			return "有几天";
		if (phq9Q5==2)
			return "一半以上天数";
		if (phq9Q5==3)
			return "几乎每天";
		return "未知";
	}
	public String getPhq9Q6Str() {
		if (phq9Q6==null)
			return "未填写";
		if (phq9Q6==0)
			return "完全没有";
		if (phq9Q6==1)
			return "有几天";
		if (phq9Q6==2)
			return "一半以上天数";
		if (phq9Q6==3)
			return "几乎每天";
		return "未知";
	}
	public String getPhq9Q7Str() {
		if (phq9Q7==null)
			return "未填写";
		if (phq9Q7==0)
			return "完全没有";
		if (phq9Q7==1)
			return "有几天";
		if (phq9Q7==2)
			return "一半以上天数";
		if (phq9Q7==3)
			return "几乎每天";
		return "未知";
	}
	public String getPhq9Q8Str() {
		if (phq9Q8==null)
			return "未填写";
		if (phq9Q8==0)
			return "完全没有";
		if (phq9Q8==1)
			return "有几天";
		if (phq9Q8==2)
			return "一半以上天数";
		if (phq9Q8==3)
			return "几乎每天";
		return "未知";
	}
	public String getPhq9Q9Str() {
		if (phq9Q9==null)
			return "未填写";
		if (phq9Q9==0)
			return "完全没有";
		if (phq9Q9==1)
			return "有几天";
		if (phq9Q9==2)
			return "一半以上天数";
		if (phq9Q9==3)
			return "几乎每天";
		return "未知";
	}
	
	public String getPhq9AffectStr() {
		if (phq9Affect==null)
			return "未填写";
		if (phq9Affect==1)
			return "沒有困难";
		if (phq9Affect==2)
			return "有一些困难";
		if (phq9Affect==3)
			return "很多困难";
		if (phq9Affect==4)
			return "非常困难";
		return "未知";
	}
	
	
	
	public String getAd8Q1Str() {
		if (ad8Q1==null)
			return "未填写";
		if (ad8Q1==0)
			return "否";
		if (ad8Q1==1)
			return "是";
		return "未知";
	}
	
	public String getAd8Q2Str() {
		if (ad8Q2==null)
			return "未填写";
		if (ad8Q2==0)
			return "否";
		if (ad8Q2==1)
			return "是";
		return "未知";
	}
	
	public String getAd8Q3Str() {
		if (ad8Q3==null)
			return "未填写";
		if (ad8Q3==0)
			return "否";
		if (ad8Q3==1)
			return "是";
		return "未知";
	}
	public String getAd8Q4Str() {
		if (ad8Q4==null)
			return "未填写";
		if (ad8Q4==0)
			return "否";
		if (ad8Q4==1)
			return "是";
		return "未知";
	}
	public String getAd8Q5Str() {
		if (ad8Q5==null)
			return "未填写";
		if (ad8Q5==0)
			return "否";
		if (ad8Q5==1)
			return "是";
		return "未知";
	}
	public String getAd8Q6Str() {
		if (ad8Q6==null)
			return "未填写";
		if (ad8Q6==0)
			return "否";
		if (ad8Q6==1)
			return "是";
		return "未知";
	}
	public String getAd8Q7Str() {
		if (ad8Q7==null)
			return "未填写";
		if (ad8Q7==0)
			return "否";
		if (ad8Q7==1)
			return "是";
		return "未知";
	}
	public String getAd8Q8Str() {
		if (ad8Q8==null)
			return "未填写";
		if (ad8Q8==0)
			return "否";
		if (ad8Q8==1)
			return "是";
		return "未知";
	}

	public Integer getAd8Q1() {
		return ad8Q1;
	}

	public void setAd8Q1(Integer ad8q1) {
		ad8Q1 = ad8q1;
	}

	public Integer getAd8Q2() {
		return ad8Q2;
	}

	public void setAd8Q2(Integer ad8q2) {
		ad8Q2 = ad8q2;
	}

	public Integer getAd8Q3() {
		return ad8Q3;
	}

	public void setAd8Q3(Integer ad8q3) {
		ad8Q3 = ad8q3;
	}

	public Integer getAd8Q4() {
		return ad8Q4;
	}

	public void setAd8Q4(Integer ad8q4) {
		ad8Q4 = ad8q4;
	}

	public Integer getAd8Q5() {
		return ad8Q5;
	}

	public void setAd8Q5(Integer ad8q5) {
		ad8Q5 = ad8q5;
	}

	public Integer getAd8Q6() {
		return ad8Q6;
	}

	public void setAd8Q6(Integer ad8q6) {
		ad8Q6 = ad8q6;
	}

	public Integer getAd8Q7() {
		return ad8Q7;
	}

	public void setAd8Q7(Integer ad8q7) {
		ad8Q7 = ad8q7;
	}

	public Integer getAd8Q8() {
		return ad8Q8;
	}

	public void setAd8Q8(Integer ad8q8) {
		ad8Q8 = ad8q8;
	}

	public Integer getAd8Score() {
		return ad8Score;
	}

	public void setAd8Score(Integer ad8Score) {
		this.ad8Score = ad8Score;
	}

	public Integer getGad7Q1() {
		return gad7Q1;
	}

	public void setGad7Q1(Integer gad7q1) {
		gad7Q1 = gad7q1;
	}

	public Integer getGad7Q2() {
		return gad7Q2;
	}

	public void setGad7Q2(Integer gad7q2) {
		gad7Q2 = gad7q2;
	}

	public Integer getGad7Q3() {
		return gad7Q3;
	}

	public void setGad7Q3(Integer gad7q3) {
		gad7Q3 = gad7q3;
	}

	public Integer getGad7Q4() {
		return gad7Q4;
	}

	public void setGad7Q4(Integer gad7q4) {
		gad7Q4 = gad7q4;
	}

	public Integer getGad7Q5() {
		return gad7Q5;
	}

	public void setGad7Q5(Integer gad7q5) {
		gad7Q5 = gad7q5;
	}

	public Integer getGad7Q6() {
		return gad7Q6;
	}

	public void setGad7Q6(Integer gad7q6) {
		gad7Q6 = gad7q6;
	}

	public Integer getGad7Q7() {
		return gad7Q7;
	}

	public void setGad7Q7(Integer gad7q7) {
		gad7Q7 = gad7q7;
	}

	public Integer getGad7Score() {
		return gad7Score;
	}

	public void setGad7Score(Integer gad7Score) {
		this.gad7Score = gad7Score;
	}

	public Integer getPhq9Q1() {
		return phq9Q1;
	}

	public void setPhq9Q1(Integer phq9q1) {
		phq9Q1 = phq9q1;
	}

	public Integer getPhq9Q2() {
		return phq9Q2;
	}

	public void setPhq9Q2(Integer phq9q2) {
		phq9Q2 = phq9q2;
	}

	public Integer getPhq9Q3() {
		return phq9Q3;
	}

	public void setPhq9Q3(Integer phq9q3) {
		phq9Q3 = phq9q3;
	}

	public Integer getPhq9Q4() {
		return phq9Q4;
	}

	public void setPhq9Q4(Integer phq9q4) {
		phq9Q4 = phq9q4;
	}

	public Integer getPhq9Q5() {
		return phq9Q5;
	}

	public void setPhq9Q5(Integer phq9q5) {
		phq9Q5 = phq9q5;
	}

	public Integer getPhq9Q6() {
		return phq9Q6;
	}

	public void setPhq9Q6(Integer phq9q6) {
		phq9Q6 = phq9q6;
	}

	public Integer getPhq9Q7() {
		return phq9Q7;
	}

	public void setPhq9Q7(Integer phq9q7) {
		phq9Q7 = phq9q7;
	}

	public Integer getPhq9Q8() {
		return phq9Q8;
	}

	public void setPhq9Q8(Integer phq9q8) {
		phq9Q8 = phq9q8;
	}

	public Integer getPhq9Q9() {
		return phq9Q9;
	}

	public void setPhq9Q9(Integer phq9q9) {
		phq9Q9 = phq9q9;
	}

	public Integer getPhq9Affect() {
		return phq9Affect;
	}

	public void setPhq9Affect(Integer phq9Affect) {
		this.phq9Affect = phq9Affect;
	}

	public Integer getPhq9Score() {
		return phq9Score;
	}

	public void setPhq9Score(Integer phq9Score) {
		this.phq9Score = phq9Score;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getResultTitle() {
		return resultTitle;
	}

	public void setResultTitle(String resultTitle) {
		this.resultTitle = resultTitle;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	
}
