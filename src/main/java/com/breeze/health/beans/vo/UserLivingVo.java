package com.breeze.health.beans.vo;

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

	public void setMeal(Integer meal) {
		this.meal = meal;
	}

	public Integer getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(Integer breakfast) {
		this.breakfast = breakfast;
	}

	public Integer getExtraMeal1() {
		return extraMeal1;
	}

	public void setExtraMeal1(Integer extraMeal1) {
		this.extraMeal1 = extraMeal1;
	}

	public Integer getLunch() {
		return lunch;
	}

	public void setLunch(Integer lunch) {
		this.lunch = lunch;
	}

	public Integer getExtraMeal2() {
		return extraMeal2;
	}

	public void setExtraMeal2(Integer extraMeal2) {
		this.extraMeal2 = extraMeal2;
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

	public Integer getAlizarin() {
		return alizarin;
	}

	public void setAlizarin(Integer alizarin) {
		this.alizarin = alizarin;
	}


	public Integer getSweets() {
		return sweets;
	}

	public void setSweets(Integer sweets) {
		this.sweets = sweets;
	}

	public Integer getFruit() {
		return fruit;
	}

	public void setFruit(Integer fruit) {
		this.fruit = fruit;
	}

	public Integer getSugaryDrink() {
		return sugaryDrink;
	}

	public void setSugaryDrink(Integer sugaryDrink) {
		this.sugaryDrink = sugaryDrink;
	}

	public Integer getViolentMovement() {
		return violentMovement;
	}

	public void setViolentMovement(Integer violentMovement) {
		this.violentMovement = violentMovement;
	}


	public Integer getModerateMovement() {
		return moderateMovement;
	}

	public void setModerateMovement(Integer moderateMovement) {
		this.moderateMovement = moderateMovement;
	}


	public Integer getWalkMovement() {
		return walkMovement;
	}

	public void setWalkMovement(Integer walkMovement) {
		this.walkMovement = walkMovement;
	}


	public Integer getSittingRecent7Days() {
		return sittingRecent7Days;
	}

	public void setSittingRecent7Days(Integer sittingRecent7Days) {
		this.sittingRecent7Days = sittingRecent7Days;
	}


	public Integer getSittingHours() {
		return sittingHours;
	}

	public void setSittingHours(Integer sittingHours) {
		this.sittingHours = sittingHours;
	}

	public Integer getSmoking() {
		return smoking;
	}

	public void setSmoking(Integer smoking) {
		this.smoking = smoking;
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

	public String[] getPreference() {
		return preference;
	}

	public void setPreference(String[] preference) {
		this.preference = preference;
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
}
