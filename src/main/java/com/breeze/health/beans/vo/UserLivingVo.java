package com.breeze.health.beans.vo;

import java.text.DecimalFormat;
import java.util.Date;

public class UserLivingVo {
	private Long id;

    private Long userId;
    
    private Integer meal;

    private Integer breakfast;

    private Integer extraMeal1;

    private Integer lunch;

    private Integer extraMeal2;

    private Integer dinner;
    
    private Integer nightingale;

    private String mealDesc;

    private Integer alizarin;

    private String[] preference;
    
    private String[] special;

    private String specialOther;

    private Integer sweets;

    private Integer fruit;

    private Integer sugaryDrink;
    
    
    private Integer violentMovement;

    private Float violentDaysPerWeek;

    private Integer violentMovementPerDay;

    private Float violentMinutePerDay;

    private Integer moderateMovement;

    private Float moderateDaysPerWeek;

    private Integer moderateMinute;

    private Float moderateMinutePerDay;

    private Integer walkMovement;

    private Float walkDaysPerWeek;

    private Integer walkMovementPerDay;

    private Float walkMinutePerDay;

    private Integer sittingRecent7Days;

    private Float sittingDaysRecent7Days;

    private Integer sittingHours;

    private Float sittingHoursPerDay;
    
    
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getMeal() {
		return meal;
	}
	
	public String getMealStr() {
		if (meal==null)
			return "未填写";
		if (meal==1)
			return "规律";
		if (meal==2)
			return "不规律";
		return "未知";
	}

	public void setMeal(Integer meal) {
		this.meal = meal;
	}

	public Integer getBreakfast() {
		return breakfast;
	}
	
	public String getBreakfastStr() {
		if (breakfast==null)
			return "未填写";
		if (breakfast==1)
			return "每天都吃";
		if (breakfast==2)
			return "经常吃（5-6天/周）";
		if (breakfast==3)
			return "有时吃（3-4天/周）";
		if (breakfast==4)
			return "偶尔吃（1-2天/周）";
		if (breakfast==5)
			return "从不或几乎不";
		return "未知";
	}

	public void setBreakfast(Integer breakfast) {
		this.breakfast = breakfast;
	}
	
	public String getExtraMeal1Str() {
		if (extraMeal1==null)
			return "未填写";
		if (extraMeal1==1)
			return "每天都吃";
		if (extraMeal1==2)
			return "经常吃（5-6天/周）";
		if (extraMeal1==3)
			return "有时吃（3-4天/周）";
		if (extraMeal1==4)
			return "偶尔吃（1-2天/周）";
		if (extraMeal1==5)
			return "从来不吃";
		return "未知";
	}

	public Integer getExtraMeal1() {
		return extraMeal1;
	}

	public void setExtraMeal1(Integer extraMeal1) {
		this.extraMeal1 = extraMeal1;
	}

	public String getLunchStr() {
		if (lunch==null)
			return "未填写";
		if (lunch==1)
			return "每天都吃";
		if (lunch==2)
			return "经常吃（5-6天/周）";
		if (lunch==3)
			return "有时吃（3-4天/周）";
		if (lunch==4)
			return "偶尔吃（1-2天/周）";
		if (lunch==5)
			return "从来不吃";
		return "未知";
	}
	
	public Integer getLunch() {
		return lunch;
	}

	public void setLunch(Integer lunch) {
		this.lunch = lunch;
	}
	
	public String getExtraMeal2Str() {
		if (extraMeal2==null)
			return "未填写";
		if (extraMeal2==1)
			return "每天都吃";
		if (extraMeal2==2)
			return "经常吃（5-6天/周）";
		if (extraMeal2==3)
			return "有时吃（3-4天/周）";
		if (extraMeal2==4)
			return "偶尔吃（1-2天/周）";
		if (extraMeal2==5)
			return "从来不吃";
		return "未知";
	}

	public Integer getExtraMeal2() {
		return extraMeal2;
	}

	public void setExtraMeal2(Integer extraMeal2) {
		this.extraMeal2 = extraMeal2;
	}
	
	public String getDinnerString() {
		if (dinner==null)
			return "未填写";
		if (dinner==1)
			return "每天都吃";
		if (dinner==2)
			return "经常吃（5-6天/周）";
		if (dinner==3)
			return "有时吃（3-4天/周）";
		if (dinner==4)
			return "偶尔吃（1-2天/周）";
		if (dinner==5)
			return "从来不吃";
		return "未知";
	}

	public Integer getDinner() {
		return dinner;
	}

	public void setDinner(Integer dinner) {
		this.dinner = dinner;
	}

	public String getMealDesc() {
		return mealDesc;
	}

	public void setMealDesc(String mealDesc) {
		this.mealDesc = mealDesc;
	}
	
	public String getAlizarinStr() {
		if (alizarin==null)
			return "未填写";
		if (alizarin==1)
			return "荤素各半";
		if (alizarin==2)
			return "以肉食为主";
		if (alizarin==3)
			return "以素食为主";
		return "未知";
	}

	public Integer getAlizarin() {
		return alizarin;
	}

	public void setAlizarin(Integer alizarin) {
		this.alizarin = alizarin;
	}

	public String getSweetsStr() {
		if (sweets==null)
			return "未填写";
		if (sweets==1)
			return "每天";
		if (sweets==2)
			return "5-6天/周";
		if (sweets==3)
			return "3-4天/周";
		if (sweets==4)
			return "1-2天/周";
		if (sweets==5)
			return "从不";
		return "未知";
	}

	public Integer getSweets() {
		return sweets;
	}

	public void setSweets(Integer sweets) {
		this.sweets = sweets;
	}
	
	public String getFruitStr() {
		if (fruit==null)
			return "未填写";
		if (fruit==1)
			return "每天";
		if (fruit==2)
			return "5-6天/周";
		if (fruit==3)
			return "3-4天/周";
		if (fruit==4)
			return "1-2天/周";
		if (fruit==5)
			return "从不";
		return "未知";
	}

	public Integer getFruit() {
		return fruit;
	}

	public void setFruit(Integer fruit) {
		this.fruit = fruit;
	}

	public String getSugaryDrinkStr() {
		if (sugaryDrink==null)
			return "未填写";
		if (sugaryDrink==1)
			return "每天";
		if (sugaryDrink==2)
			return "5-6天/周";
		if (sugaryDrink==3)
			return "3-4天/周";
		if (sugaryDrink==4)
			return "1-2天/周";
		if (sugaryDrink==5)
			return "从不";
		return "未知";
	}
	
	public Integer getSugaryDrink() {
		return sugaryDrink;
	}

	public void setSugaryDrink(Integer sugaryDrink) {
		this.sugaryDrink = sugaryDrink;
	}
	
	public String getViolentMovementStr() {
		if (violentMovement==null)
			return "未填写";
		if (violentMovement==1)
			return "每周运动" + (violentDaysPerWeek==null?"":violentDaysPerWeek)+"天";
		if (violentMovement==2)
			return "无相关活动";
		return "未知";
	}

	public Integer getViolentMovement() {
		return violentMovement;
	}

	public void setViolentMovement(Integer violentMovement) {
		this.violentMovement = violentMovement;
	}

	public String getModerateMovementStr() {
		if (moderateMovement==null)
			return "未填写";
		if (moderateMovement==1)
			return "每周运动" + (moderateDaysPerWeek==null?"":moderateDaysPerWeek)+"天";
		if (moderateMovement==2)
			return "无相关活动";
		return "未知";
	}

	public Integer getModerateMovement() {
		return moderateMovement;
	}

	public void setModerateMovement(Integer moderateMovement) {
		this.moderateMovement = moderateMovement;
	}


	public String getWalkMovementStr() {
		if (walkMovement==null)
			return "未填写";
		if (walkMovement==1)
			return "每周运动" + (walkDaysPerWeek==null?"":walkDaysPerWeek)+"天";
		if (walkMovement==2)
			return "无相关活动";
		return "未知";
	}
	
	public Integer getWalkMovement() {
		return walkMovement;
	}

	public void setWalkMovement(Integer walkMovement) {
		this.walkMovement = walkMovement;
	}


	public String getSittingRecent7DaysStr() {
		if (sittingRecent7Days==null)
			return "未填写";
		if (sittingRecent7Days==1)
			return "有" + (sittingDaysRecent7Days==null?"":sittingDaysRecent7Days)+"天坐着";
		if (sittingRecent7Days==2)
			return "无相关活动";
		return "未知";
	}
	
	public Integer getSittingRecent7Days() {
		return sittingRecent7Days;
	}

	public void setSittingRecent7Days(Integer sittingRecent7Days) {
		this.sittingRecent7Days = sittingRecent7Days;
	}

	public String getSittingHoursStr() {
		if (sittingHours==null)
			return "未填写";
		if (sittingHours==1)
			return "每天静坐" + (sittingHoursPerDay==null?"":sittingHoursPerDay)+"小时";
		if (sittingHours==2)
			return "不知道或不确定";
		return "未知";
	}
	
	public Integer getSittingHours() {
		return sittingHours;
	}

	public void setSittingHours(Integer sittingHours) {
		this.sittingHours = sittingHours;
	}

	public String getSmokingStr() {
		if (smoking==null)
			return "未填写";
		if (smoking==1)
			return "从不吸烟";
		if (smoking==2)
			return "曾经吸烟" + (smokingVal1==null?"":formatYear(smokingVal1)+"年") + ",已经戒烟" + (smokingVal2==null?"":formatYear(smokingVal2)+"年") + (smokingVal3==null?"":",戒烟前每天吸烟"+formatZhi(smokingVal3) +"支");
		if (smoking==3)
			return "有时吸烟" + (smokingVal1==null?"":("，吸烟"+formatYear(smokingVal1)+"年")) + (smokingVal3==null?"":",每周吸烟"+formatZhi(smokingVal3) +"支");
		if (smoking==4)
			return "每天吸烟" + (smokingVal1==null?"":("，吸烟"+formatYear(smokingVal1)+"年")) + (smokingVal3==null?"":",每天吸烟"+formatZhi(smokingVal3) +"支") + (smokingAge==null?"":(","+formatZhi(smokingAge)+"岁开始吸烟"));
		return "未知";
	}
	
	public Integer getSmoking() {
		return smoking;
	}

	public void setSmoking(Integer smoking) {
		this.smoking = smoking;
	}

	public String getPartnerSmokingStr() {
		if (partnerSmoking==null)
			return "未填写";
		if (partnerSmoking==1)
			return "否";
		if (partnerSmoking==2)
			return "是";
		return "未知";
	}
	
	public Integer getPartnerSmoking() {
		return partnerSmoking;
	}

	public void setPartnerSmoking(Integer partnerSmoking) {
		this.partnerSmoking = partnerSmoking;
	}
	
	public String getPassiveSmokingStr() {
		if (passiveSmoking==null)
			return "未填写";
		if (passiveSmoking==1)
			return "0天";
		if (passiveSmoking==2)
			return "平均每周1-2天";
		if (passiveSmoking==3)
			return "平均每周3-5天";
		if (passiveSmoking==4)
			return "几乎每天";
		if (passiveSmoking==5)
			return "不清楚";
		return "未知";
	}

	public Integer getPassiveSmoking() {
		return passiveSmoking;
	}

	public void setPassiveSmoking(Integer passiveSmoking) {
		this.passiveSmoking = passiveSmoking;
	}
	
	public String getDrinkingStr() {
		if (drinking==null)
			return "未填写";
		if (drinking==1)
			return "从不饮酒";
		if (drinking==2)
			return "偶尔饮酒（不超过1次/月）" + (drinkingYears==null?"":(",饮酒"+formatYear(drinkingYears)+"年")) + (noDrinkingYears==null?"":(",戒酒"+formatYear(noDrinkingYears)+"年"));
		if (drinking==3)
			return "有时饮酒（2-4次/月）" + (drinkingYears==null?"":(",饮酒"+formatYear(drinkingYears)+"年")) + (noDrinkingYears==null?"":(",戒酒"+formatYear(noDrinkingYears)+"年"));
		if (drinking==4)
			return "经常饮酒（超过1次/周）" + (drinkingYears==null?"":(",饮酒"+formatYear(drinkingYears)+"年")) + (noDrinkingYears==null?"":(",戒酒"+formatYear(noDrinkingYears)+"年"));
		return "未知";
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
		this.drinkingTypes = drinkingTypes;
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
	
	public String getNightingaleStr() {
		if (nightingale==null)
			return "未填写";
		if (nightingale==1)
			return "每天都吃";
		if (nightingale==2)
			return "经常吃（5-6天/周）";
		if (nightingale==3)
			return "有时吃（3-4天/周）";
		if (nightingale==4)
			return "偶尔吃（1-2天/周）";
		if (nightingale==5)
			return "从来不吃";
		return "未知";
	}

	public Integer getNightingale() {
		return nightingale;
	}

	public void setNightingale(Integer nightingale) {
		this.nightingale = nightingale;
	}


	public String getSpecialOther() {
		return specialOther;
	}

	public void setSpecialOther(String specialOther) {
		this.specialOther = specialOther;
	}
	
	public String getPreferenceStr() {
		if (preference==null ||preference.length==0)
			return "未填写";
		String preferenceStr = "";
		for(String type:preference) {
			if (!"".equals(preferenceStr))
			{
				preferenceStr += ",";
			}
			if ("1".equals(type))
			{
				preferenceStr += "适中";
			}
			if ("2".equals(type))
			{
				preferenceStr += "偏咸" ;
			}
			if ("3".equals(type))
			{
				preferenceStr += "偏油腻" ;
			}
			if ("4".equals(type))
			{
				preferenceStr += "偏辣" ;
			}
			if ("5".equals(type))
			{
				preferenceStr += "偏甜" ;
			}
			if ("6".equals(type))
			{
				preferenceStr += "其他";
			}
		}
		return preferenceStr;
	}

	public String[] getPreference() {
		return preference;
	}

	public void setPreference(String[] preference) {
		this.preference = preference;
	}

	public String getSpecialStr() {
		if (special==null ||special.length==0)
			return "未填写";
		String specialStr = "";
		for(String type:special) {
			if (!"".equals(specialStr))
			{
				specialStr += ",";
			}
			if ("1".equals(type))
			{
				specialStr += "无";
			}
			if ("2".equals(type))
			{
				specialStr += "糖尿病饮食" ;
			}
			if ("3".equals(type))
			{
				specialStr += "低盐饮食" ;
			}
			if ("4".equals(type))
			{
				specialStr += "低脂饮食" ;
			}
			if ("5".equals(type))
			{
				specialStr += "其他特殊饮食："+ (specialOther==null?"":specialOther);
			}
		}
		return specialStr;
	}
	
	public String[] getSpecial() {
		return special;
	}

	public void setSpecial(String[] special) {
		this.special = special;
	}

	public Float getViolentDaysPerWeek() {
		return violentDaysPerWeek;
	}

	public void setViolentDaysPerWeek(Float violentDaysPerWeek) {
		this.violentDaysPerWeek = violentDaysPerWeek;
	}
	
	public String getViolentMovementPerDayStr() {
		if (violentMovementPerDay==null)
			return "未填写";
		if (violentMovementPerDay==1)
			return "每天运动" + (violentMinutePerDay==null?"":violentMinutePerDay)+"分钟";
		if (violentMovementPerDay==2)
			return "不知道或不确定";
		return "未知";
	}

	public Integer getViolentMovementPerDay() {
		return violentMovementPerDay;
	}

	public void setViolentMovementPerDay(Integer violentMovementPerDay) {
		this.violentMovementPerDay = violentMovementPerDay;
	}

	public Float getViolentMinutePerDay() {
		return violentMinutePerDay;
	}

	public void setViolentMinutePerDay(Float violentMinutePerDay) {
		this.violentMinutePerDay = violentMinutePerDay;
	}

	public Float getModerateDaysPerWeek() {
		return moderateDaysPerWeek;
	}

	public void setModerateDaysPerWeek(Float moderateDaysPerWeek) {
		this.moderateDaysPerWeek = moderateDaysPerWeek;
	}
	
	public String getModerateMinuteStr() {
		if (moderateMinute==null)
			return "未填写";
		if (moderateMinute==1)
			return "每天运动" + (moderateMinutePerDay==null?"":moderateMinutePerDay)+"分钟";
		if (moderateMinute==2)
			return "不知道或不确定";
		return "未知";
	}

	public Integer getModerateMinute() {
		return moderateMinute;
	}

	public void setModerateMinute(Integer moderateMinute) {
		this.moderateMinute = moderateMinute;
	}

	public Float getModerateMinutePerDay() {
		return moderateMinutePerDay;
	}

	public void setModerateMinutePerDay(Float moderateMinutePerDay) {
		this.moderateMinutePerDay = moderateMinutePerDay;
	}

	public Float getWalkDaysPerWeek() {
		return walkDaysPerWeek;
	}

	public void setWalkDaysPerWeek(Float walkDaysPerWeek) {
		this.walkDaysPerWeek = walkDaysPerWeek;
	}
	
	public String getWalkMovementPerDayStr() {
		if (walkMovementPerDay==null)
			return "未填写";
		if (walkMovementPerDay==1)
			return "每天运动" + (walkMinutePerDay==null?"":walkMinutePerDay)+"分钟";
		if (walkMovementPerDay==2)
			return "不知道或不确定";
		return "未知";
	}

	public Integer getWalkMovementPerDay() {
		return walkMovementPerDay;
	}

	public void setWalkMovementPerDay(Integer walkMovementPerDay) {
		this.walkMovementPerDay = walkMovementPerDay;
	}

	public Float getWalkMinutePerDay() {
		return walkMinutePerDay;
	}

	public void setWalkMinutePerDay(Float walkMinutePerDay) {
		this.walkMinutePerDay = walkMinutePerDay;
	}

	public Float getSittingDaysRecent7Days() {
		return sittingDaysRecent7Days;
	}

	public void setSittingDaysRecent7Days(Float sittingDaysRecent7Days) {
		this.sittingDaysRecent7Days = sittingDaysRecent7Days;
	}

	public Float getSittingHoursPerDay() {
		return sittingHoursPerDay;
	}

	public void setSittingHoursPerDay(Float sittingHoursPerDay) {
		this.sittingHoursPerDay = sittingHoursPerDay;
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
	private static DecimalFormat year_formatter = new DecimalFormat("##.#");
	private static String formatYear(Float year) {
		if (year == null)
			return "";
		return year_formatter.format(year);
	}
	private static DecimalFormat zhi_formatter = new DecimalFormat("###");
	private static String formatZhi(Float zhi) {
		if (zhi == null)
			return "";
		return zhi_formatter.format(zhi);
	}
}
